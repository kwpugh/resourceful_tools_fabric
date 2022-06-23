package com.kwpugh.resourceful_tools.items;

import com.kwpugh.pugh_lib.api.CustomRecipeRemainder;
import com.kwpugh.resourceful_tools.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

import java.util.List;

public class HookKnife extends Item implements CustomRecipeRemainder
{
	public HookKnife(Settings settings)
	{
		super(settings);
	}

	@Override
	public boolean hasRecipeRemainder()
	{
		return true;
	}

	@Override
	public ItemStack getRecipeRemainder(ItemStack stackIn)
	{
		ItemStack stack = stackIn.copy();
		stack.setDamage(stack.getDamage() + 1);

		if(stack.getDamage() >= stack.getMaxDamage())
		{
			stack.decrement(1);
		}

		return stack;
	}

	@Override
	public ActionResult useOnBlock(ItemUsageContext context)
	{
		World world = context.getWorld();

		if(world.isClient) return ActionResult.SUCCESS;

		PlayerEntity player = context.getPlayer();
		BlockPos pos = context.getBlockPos();
		BlockState state = world.getBlockState(pos);
		Block block = state.getBlock();
		ItemStack stack = context.getStack();
	      
		if(block == Blocks.WHITE_WOOL ||
	    		 block == Blocks.BLACK_WOOL ||
	    		 block == Blocks.BLUE_WOOL ||
	    		 block == Blocks.BROWN_WOOL ||
	    		 block == Blocks.CYAN_WOOL ||
	    		 block == Blocks.GRAY_WOOL ||
	    		 block == Blocks.GREEN_WOOL ||
	    		 block == Blocks.LIGHT_BLUE_WOOL ||
	    		 block == Blocks.LIGHT_GRAY_WOOL ||
	    		 block == Blocks.LIME_WOOL ||
	    		 block == Blocks.MAGENTA_WOOL ||
	    		 block == Blocks.ORANGE_WOOL ||
	    		 block == Blocks.PINK_WOOL ||
	    		 block == Blocks.PURPLE_WOOL ||
	    		 block == Blocks.RED_WOOL ||
	    		 block == Blocks.YELLOW_WOOL
	    		 )
	    {
			world.removeBlock(pos, false);
			world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.STRING, 4))); 
			stack.damage(1, player, (p_220038_0_) -> {
				p_220038_0_.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
		         });
	    }
	     
		return super.useOnBlock(context);
	}
	
	@Override
	public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) 
	{
		World world = user.world;

		if(world.isClient) return ActionResult.SUCCESS;

		if(entity instanceof SheepEntity)
		{
			SheepEntity sheep = (SheepEntity) entity;
			if (stack.isOf(ItemInit.HOOK_KNIFE) ||
					stack.isOf(ItemInit.HOOK_KNIFE_COPPER))
			{
				if (sheep.isShearable())
				{
					sheep.world.playSoundFromEntity(user, sheep, SoundEvents.ENTITY_SHEEP_SHEAR, SoundCategory.PLAYERS, 1.0F, 1.0F);
					sheep.setSheared(true);

					ItemEntity itemEntity = sheep.dropItem(Items.STRING);
					if (itemEntity != null)
					{
						world.spawnEntity(new ItemEntity(world, sheep.getX(), sheep.getY(), sheep.getZ(), new ItemStack(Items.STRING, 3)));
					}

					sheep.emitGameEvent(GameEvent.SHEAR, user);
					stack.damage(1, user, (callback) -> {
						callback.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
					});

					return ActionResult.SUCCESS;
				}
			}
		}
	
		return ActionResult.PASS;
	}
	
	@Override
	public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
	{
		tooltip.add(Text.translatable("item.resourceful_tools.hook_knife.line1").formatted(Formatting.YELLOW));
		tooltip.add(Text.translatable("item.resourceful_tools.hook_knife.line2").formatted(Formatting.YELLOW));
	} 
}




