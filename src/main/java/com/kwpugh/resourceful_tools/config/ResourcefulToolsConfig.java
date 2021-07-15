package com.kwpugh.resourceful_tools.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "resourceful_tools")
public class ResourcefulToolsConfig extends PartitioningSerializer.GlobalData 
{
    public General GENERAL = new General();
    	
    @Config(name = "general")
	public static class General implements ConfigData
	{
		@Comment("\n"
				+"\n"
				+"\n"
				+"******************************"
				+"\nENABLE/DISABLE TOOLS"
				+"\n******************************")
		public boolean enableHookKnife = true;
		public boolean enableTreeTrimmer = true;
		public boolean enableHandPick = true;
		public boolean enableHandTiller = true;
		public boolean enableClamDigger = true;
		public boolean enableCrackHammer = true;
		public boolean enableGlassPlacer = true;
		public boolean enableTrashCan = true;

    	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nSPRING BLOCKS"
    			+"\n******************************")
    	public boolean enableLavaSpring = true;
		public boolean enableWellSpring = true;
		
    	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nCRACK HAMMERS"
    			+"\n******************************")
		public int ironHammerDurability = 129;
    	public int diamondHammerDurability = 516;

		@Comment("\n"
				+"\n"
				+"\n"
				+"******************************"
				+"\nHAND PICK"
				+"\n- drop chance value between 0.0-1.0"
				+"\n******************************")
		public double sandstoneDropChance = .20D;
		public double netherrackDropChance = .20D;
		public double magmaDropChance = .10D;
		public double quartzDropChance = .10D;
		public double blackstoneDropChance = .10D;
		public double endstoneDropChance = .10D;

		@Comment("\n"
				+"\n"
				+"\n"
				+"******************************"
				+"\nHAND TILLER"
				+"\n- drop chance value between 0.0-1.0"
				+"\n******************************")
		public double clayDropChance = .20D;
		public double gravelDropChance = .20D;

		@Comment("\n"
				+"\n"
				+"\n"
				+"******************************"
				+"\nClam Digger"
				+"\n- drop chance value between 0.0-1.0"
				+"\n******************************")
		public double clamDropChance = .80D;

		@Comment("\n"
				+"\n"
				+"\n"
				+"******************************"
				+"\nHAND TRIMMER"
				+"\n- drop chance value between 0.0-1.0"
				+"\n******************************")
		public double spruceDropChance = .20D;
		public double birchDropChance = .20D;
		public double oakDropChance = .20D;
		public double acaciaDropChance = .10D;
		public double jungleDropChance = .10D;
		public double darkOakDropChance = .05D;
		public double seagrassDropChance = .05D;
		public double kelpDropChance = .05D;
		public double eggDropChance = .35D;

		@Comment("\n"
				+"\n"
				+"\n"
				+"******************************"
				+"\nIRON TOOL MATERIAL"
				+"\n- Handpick, Hand Tiller, & Hand Trimmer"
				+"\n******************************")
		public int ironDurability = 250;
		public float ironMiningSpeed = 1.0F;
		public float ironAttackDamage = 1.0F;
		public int ironMiningLevel = 2;
		public int ironEnchantability = 8;

		@Comment("\n"
				+"\n"
				+"\n"
				+"******************************"
				+"\nCOPPER TOOL MATERIAL"
				+"\n- Handpick, Hand Tiller, & Hand Trimmer"
				+"\n******************************")
		public int copperDurability = 125;
		public float copperMiningSpeed = 1.0F;
		public float copperAttackDamage = 1.0F;
		public int copperMiningLevel = 2;
		public int copperEnchantability = 8;
	}


}