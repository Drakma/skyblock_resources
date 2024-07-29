package net.drakma.skyblockresources.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class SkyblockResourcesConfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Double> WOODEN_TICKS_BETWEEN_CYCLES;
	public static final ForgeConfigSpec.ConfigValue<Double> WOODEN_MAX_ITEMS;
	public static final ForgeConfigSpec.ConfigValue<Double> STONE_TICKS_BETWEEN_CYCLES;
	public static final ForgeConfigSpec.ConfigValue<Double> STONE_MAX_ITEMS;
	public static final ForgeConfigSpec.ConfigValue<Double> IRON_TICKS_BETWEEN_CYCLES;
	public static final ForgeConfigSpec.ConfigValue<Double> IRON_MAX_ITEMS;
	public static final ForgeConfigSpec.ConfigValue<Double> GOLD_TICKS_BETWEEN_CYCLES;
	public static final ForgeConfigSpec.ConfigValue<Double> GOLD_MAX_ITEMS;
	public static final ForgeConfigSpec.ConfigValue<Double> DIAMOND_TICKS_BETWEEN_CYCLES;
	public static final ForgeConfigSpec.ConfigValue<Double> DIAMOND_MAX_ITEMS;
	public static final ForgeConfigSpec.ConfigValue<Double> NETHERITE_TICKS_BETWEEN_CYCLES;
	public static final ForgeConfigSpec.ConfigValue<Double> NETHERITE_MAX_ITEMS;
	static {
		BUILDER.push("Wooden Generators");
		WOODEN_TICKS_BETWEEN_CYCLES = BUILDER.comment("Number of ticks between cycles").define("WoodenTicksBetweenCycle", (double) 40);
		WOODEN_MAX_ITEMS = BUILDER.define("WoodenMaxItems", (double) 128);
		BUILDER.pop();
		BUILDER.push("Stone Generators");
		STONE_TICKS_BETWEEN_CYCLES = BUILDER.define("StoneTicksBetweenCycles", (double) 40);
		STONE_MAX_ITEMS = BUILDER.define("StoneMaxItems", (double) 256);
		BUILDER.pop();
		BUILDER.push("Iron Generators");
		IRON_TICKS_BETWEEN_CYCLES = BUILDER.define("IronTicksBetweenCycles", (double) 40);
		IRON_MAX_ITEMS = BUILDER.define("IronMaxItems", (double) 512);
		BUILDER.pop();
		BUILDER.push("Gold Generators");
		GOLD_TICKS_BETWEEN_CYCLES = BUILDER.define("GoldTicksBetweenCycles", (double) 40);
		GOLD_MAX_ITEMS = BUILDER.define("GoldMaxItems", (double) 1024);
		BUILDER.pop();
		BUILDER.push("Diamond Generators");
		DIAMOND_TICKS_BETWEEN_CYCLES = BUILDER.define("DiamondTicksBetweenCycles", (double) 40);
		DIAMOND_MAX_ITEMS = BUILDER.define("DiamondMaxItems", (double) 2048);
		BUILDER.pop();
		BUILDER.push("Netherite Generators");
		NETHERITE_TICKS_BETWEEN_CYCLES = BUILDER.define("NetheriteTicksBetweenCycles", (double) 40);
		NETHERITE_MAX_ITEMS = BUILDER.define("NetheriteMaxItems", (double) 4096);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
