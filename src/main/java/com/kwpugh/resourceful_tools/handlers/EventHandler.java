package com.kwpugh.resourceful_tools.handlers;

import com.kwpugh.resourceful_tools.init.EnchantmentInit;
import com.kwpugh.resourceful_tools.init.ItemInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EventHandler
{
    // Drop tests performed as a result of the break block event
    public static boolean onBlockBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, BlockEntity entity)
    {
        boolean hasPickaxe;
        boolean hasShovel;
        boolean hasHoe;
        boolean isResourceful;

        if(player.isCreative() || player.isSpectator()) return false;

        if(!world.isClient)
        {
            ItemStack tool = player.getMainHandStack();
            hasPickaxe = tool.getItem() instanceof PickaxeItem;
            hasShovel = tool.getItem() instanceof ShovelItem;
            hasHoe = tool.getItem() instanceof HoeItem;
            isResourceful = hasResourcefulness(player);

            if(tool.getItem() == ItemInit.HAND_PICK ||
                    tool.getItem() == ItemInit.HAND_PICK_COPPER ||
                    (hasPickaxe && isResourceful))
            {
                HandPickDrops.testForDrops(world, player, pos, state, entity, tool);
            }
            else if(tool.getItem() == ItemInit.HAND_TILLER ||
                    tool.getItem() == ItemInit.HAND_TILLER_COPPER ||
                    (hasShovel && isResourceful))
            {
                HandTillerDrops.testForDrops(world, player, pos, state, entity, tool);
            }
            else if(tool.getItem() == ItemInit.TREE_TRIMMER ||
                    tool.getItem() == ItemInit.TREE_TRIMMER_COPPER ||
                    (hasHoe && isResourceful))
            {
                TreeTrimmerDrops.testForDrops(world, player, pos, state, entity, tool);
            }
            else if(tool.getItem() == ItemInit.CLAM_DIGGER ||
                    tool.getItem() == ItemInit.CLAM_DIGGER_COPPER)
            {
                ClamDiggerDrops.testForDrops(world, player, pos, state, entity, tool);
            }
        }

        return true;
    }

    public static boolean hasResourcefulness(LivingEntity entity)
    {
        return EnchantmentHelper.getEquipmentLevel(EnchantmentInit.RESOURCEFULNESS, entity) > 0;
    }
}