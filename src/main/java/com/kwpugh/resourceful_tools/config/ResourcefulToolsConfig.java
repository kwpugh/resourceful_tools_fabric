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
    			+"******************************"
    			+"\nFurnace Sources"
    			+"\n******************************")
		public boolean laveSpringPowerFurnace = true;
		public boolean campfirePowerFurnace = true;
		public boolean lavasourcePowerFurnace = true;
		
    	@Comment("\n"
    			+"\n"
    			+"******************************"
    			+"\nCRACK HAMMERS"
    			+"\n******************************")
		public int copperHammerDurability = 125;
		public int ironHammerDurability = 250;
    	public int diamondHammerDurability = 516;

		@Comment("\n"
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
		public double deepslateDropChance = .15D;

		@Comment("\n"
				+"\n"
				+"******************************"
				+"\nHAND TILLER"
				+"\n- drop chance value between 0.0-1.0"
				+"\n******************************")
		public double clayDropChance = .20D;
		public double gravelDropChance = .20D;

		@Comment("\n"
				+"\n"
				+"******************************"
				+"\nCLAM DIGGER"
				+"\n- drop chance value between 0.0-1.0"
				+"\n******************************")
		public double clamDropChance = .80D;

		@Comment("\n"
				+"\n"
				+"******************************"
				+"\nTREE TRIMMER"
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
		public double phantomMembraneDropChance = .15D;
		public double acornDropChance = .05D;
		public double acornDarkDropChance = .05D;

		@Comment("\n"
				+"\n"
				+"******************************"
				+ "\nFood Settings"
				+"\n******************************")
		public int jerky_hunger = 4;
		public float jerky_saturation = 0.4F;
		public int cooked_clam_hunger = 5;
		public float cooked_clam_saturation = 0.7F;
		public int acorn_hunger = 6;
		public float acorn_saturation = 0.9F;
		public int acorn_dark_hunger = 6;
		public float acorn_dark_saturation = 0.9F;

		@Comment("\n"
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