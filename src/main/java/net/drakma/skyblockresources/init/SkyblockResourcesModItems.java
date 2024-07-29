
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.drakma.skyblockresources.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.drakma.skyblockresources.item.StoneUpgradeCardItem;
import net.drakma.skyblockresources.item.NetheriteUpgradeCardItem;
import net.drakma.skyblockresources.item.IronUpgradeCardItem;
import net.drakma.skyblockresources.item.GoldUpgradeCardItem;
import net.drakma.skyblockresources.item.DiamondUpgradeCardItem;
import net.drakma.skyblockresources.block.display.WoodenTuffGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.WoodenSoulsandGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.WoodenSlimeGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.WoodenSandGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.WoodenNetherrackGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.WoodenGravelGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.WoodenGraniteGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.WoodenEndStoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.WoodenEmptyGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.WoodenDripstoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.WoodenDirtGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.WoodenDioriteGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.WoodenDeepslateGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.WoodenCobblestoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.WoodenClayGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.WoodenCalciteGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.WoodenBlackstoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.WoodenBasaltGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.WoodenAndesiteGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.StoneTuffGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.StoneSoulsandGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.StoneSlimeGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.StoneSandGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.StoneNetherrackGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.StoneGravelGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.StoneGraniteGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.StoneEndStoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.StoneEmptyGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.StoneDripstoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.StoneDirtGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.StoneDioriteGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.StoneDeepslateGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.StoneCobblestoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.StoneClayGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.StoneCalciteGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.StoneBlackstoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.StoneBasaltGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.StoneAndesiteGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.NetheriteTuffGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.NetheriteSoulsandGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.NetheriteSlimeGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.NetheriteSandGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.NetheriteNetherrackGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.NetheriteGravelGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.NetheriteGraniteGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.NetheriteEndStoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.NetheriteEmptyGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.NetheriteDripstoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.NetheriteDirtGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.NetheriteDioriteGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.NetheriteDeepslateGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.NetheriteCobblestoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.NetheriteClayGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.NetheriteCalciteGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.NetheriteBlackstoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.NetheriteBasaltGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.NetheriteAndesiteGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.IronTuffGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.IronSoulsandGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.IronSlimeGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.IronSandGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.IronNetherrackGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.IronGravelGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.IronGraniteGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.IronEndStoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.IronEmptyGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.IronDripstoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.IronDirtGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.IronDioriteGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.IronDeepslateGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.IronCobblestoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.IronClayGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.IronCalciteGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.IronBlackstoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.IronBasaltGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.IronAndesiteGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.GoldTuffGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.GoldSoulsandGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.GoldSlimeGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.GoldSandGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.GoldNetherrackGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.GoldGravelGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.GoldGraniteGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.GoldEndStoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.GoldEmptyGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.GoldDripstoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.GoldDirtGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.GoldDioriteGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.GoldDeepslateGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.GoldCobblestoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.GoldClayGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.GoldCalciteGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.GoldBlackstoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.GoldBasaltGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.GoldAndesiteGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.DiamondTuffGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.DiamondSoulsandGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.DiamondSlimeGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.DiamondSandGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.DiamondNetherrackGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.DiamondGravelGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.DiamondGraniteGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.DiamondEndStoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.DiamondEmptyGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.DiamondDripstoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.DiamondDirtGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.DiamondDioriteGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.DiamondDeepslateGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.DiamondCobblestoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.DiamondClayGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.DiamondCalciteGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.DiamondBlackstoneGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.DiamondBasaltGeneratorDisplayItem;
import net.drakma.skyblockresources.block.display.DiamondAndesiteGeneratorDisplayItem;
import net.drakma.skyblockresources.SkyblockResourcesMod;

public class SkyblockResourcesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SkyblockResourcesMod.MODID);
	public static final RegistryObject<Item> WOODEN_BASALT_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.WOODEN_BASALT_GENERATOR.getId().getPath(),
			() -> new WoodenBasaltGeneratorDisplayItem(SkyblockResourcesModBlocks.WOODEN_BASALT_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WOODEN_BLACKSTONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.WOODEN_BLACKSTONE_GENERATOR.getId().getPath(),
			() -> new WoodenBlackstoneGeneratorDisplayItem(SkyblockResourcesModBlocks.WOODEN_BLACKSTONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WOODEN_COBBLESTONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.WOODEN_COBBLESTONE_GENERATOR.getId().getPath(),
			() -> new WoodenCobblestoneGeneratorDisplayItem(SkyblockResourcesModBlocks.WOODEN_COBBLESTONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WOODEN_DEEPSLATE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.WOODEN_DEEPSLATE_GENERATOR.getId().getPath(),
			() -> new WoodenDeepslateGeneratorDisplayItem(SkyblockResourcesModBlocks.WOODEN_DEEPSLATE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WOODEN_DIORITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.WOODEN_DIORITE_GENERATOR.getId().getPath(),
			() -> new WoodenDioriteGeneratorDisplayItem(SkyblockResourcesModBlocks.WOODEN_DIORITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WOODEN_DIRT_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.WOODEN_DIRT_GENERATOR.getId().getPath(),
			() -> new WoodenDirtGeneratorDisplayItem(SkyblockResourcesModBlocks.WOODEN_DIRT_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WOODEN_GRANITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.WOODEN_GRANITE_GENERATOR.getId().getPath(),
			() -> new WoodenGraniteGeneratorDisplayItem(SkyblockResourcesModBlocks.WOODEN_GRANITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WOODEN_GRAVEL_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.WOODEN_GRAVEL_GENERATOR.getId().getPath(),
			() -> new WoodenGravelGeneratorDisplayItem(SkyblockResourcesModBlocks.WOODEN_GRAVEL_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WOODEN_NETHERRACK_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.WOODEN_NETHERRACK_GENERATOR.getId().getPath(),
			() -> new WoodenNetherrackGeneratorDisplayItem(SkyblockResourcesModBlocks.WOODEN_NETHERRACK_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WOODEN_SAND_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.WOODEN_SAND_GENERATOR.getId().getPath(),
			() -> new WoodenSandGeneratorDisplayItem(SkyblockResourcesModBlocks.WOODEN_SAND_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WOODEN_SOULSAND_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.WOODEN_SOULSAND_GENERATOR.getId().getPath(),
			() -> new WoodenSoulsandGeneratorDisplayItem(SkyblockResourcesModBlocks.WOODEN_SOULSAND_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WOODEN_TUFF_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.WOODEN_TUFF_GENERATOR.getId().getPath(),
			() -> new WoodenTuffGeneratorDisplayItem(SkyblockResourcesModBlocks.WOODEN_TUFF_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WOODEN_ANDESITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.WOODEN_ANDESITE_GENERATOR.getId().getPath(),
			() -> new WoodenAndesiteGeneratorDisplayItem(SkyblockResourcesModBlocks.WOODEN_ANDESITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_ANDESITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.STONE_ANDESITE_GENERATOR.getId().getPath(),
			() -> new StoneAndesiteGeneratorDisplayItem(SkyblockResourcesModBlocks.STONE_ANDESITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_BASALT_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.STONE_BASALT_GENERATOR.getId().getPath(),
			() -> new StoneBasaltGeneratorDisplayItem(SkyblockResourcesModBlocks.STONE_BASALT_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_BLACKSTONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.STONE_BLACKSTONE_GENERATOR.getId().getPath(),
			() -> new StoneBlackstoneGeneratorDisplayItem(SkyblockResourcesModBlocks.STONE_BLACKSTONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_COBBLESTONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.STONE_COBBLESTONE_GENERATOR.getId().getPath(),
			() -> new StoneCobblestoneGeneratorDisplayItem(SkyblockResourcesModBlocks.STONE_COBBLESTONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_DEEPSLATE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.STONE_DEEPSLATE_GENERATOR.getId().getPath(),
			() -> new StoneDeepslateGeneratorDisplayItem(SkyblockResourcesModBlocks.STONE_DEEPSLATE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_DIORITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.STONE_DIORITE_GENERATOR.getId().getPath(),
			() -> new StoneDioriteGeneratorDisplayItem(SkyblockResourcesModBlocks.STONE_DIORITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_DIRT_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.STONE_DIRT_GENERATOR.getId().getPath(),
			() -> new StoneDirtGeneratorDisplayItem(SkyblockResourcesModBlocks.STONE_DIRT_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_GRANITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.STONE_GRANITE_GENERATOR.getId().getPath(),
			() -> new StoneGraniteGeneratorDisplayItem(SkyblockResourcesModBlocks.STONE_GRANITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_GRAVEL_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.STONE_GRAVEL_GENERATOR.getId().getPath(),
			() -> new StoneGravelGeneratorDisplayItem(SkyblockResourcesModBlocks.STONE_GRAVEL_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_NETHERRACK_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.STONE_NETHERRACK_GENERATOR.getId().getPath(),
			() -> new StoneNetherrackGeneratorDisplayItem(SkyblockResourcesModBlocks.STONE_NETHERRACK_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_SAND_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.STONE_SAND_GENERATOR.getId().getPath(),
			() -> new StoneSandGeneratorDisplayItem(SkyblockResourcesModBlocks.STONE_SAND_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_SOULSAND_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.STONE_SOULSAND_GENERATOR.getId().getPath(),
			() -> new StoneSoulsandGeneratorDisplayItem(SkyblockResourcesModBlocks.STONE_SOULSAND_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_TUFF_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.STONE_TUFF_GENERATOR.getId().getPath(),
			() -> new StoneTuffGeneratorDisplayItem(SkyblockResourcesModBlocks.STONE_TUFF_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> IRON_ANDESITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.IRON_ANDESITE_GENERATOR.getId().getPath(),
			() -> new IronAndesiteGeneratorDisplayItem(SkyblockResourcesModBlocks.IRON_ANDESITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> IRON_BASALT_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.IRON_BASALT_GENERATOR.getId().getPath(),
			() -> new IronBasaltGeneratorDisplayItem(SkyblockResourcesModBlocks.IRON_BASALT_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> IRON_BLACKSTONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.IRON_BLACKSTONE_GENERATOR.getId().getPath(),
			() -> new IronBlackstoneGeneratorDisplayItem(SkyblockResourcesModBlocks.IRON_BLACKSTONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> IRON_COBBLESTONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.IRON_COBBLESTONE_GENERATOR.getId().getPath(),
			() -> new IronCobblestoneGeneratorDisplayItem(SkyblockResourcesModBlocks.IRON_COBBLESTONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> IRON_DEEPSLATE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.IRON_DEEPSLATE_GENERATOR.getId().getPath(),
			() -> new IronDeepslateGeneratorDisplayItem(SkyblockResourcesModBlocks.IRON_DEEPSLATE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> IRON_DIORITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.IRON_DIORITE_GENERATOR.getId().getPath(),
			() -> new IronDioriteGeneratorDisplayItem(SkyblockResourcesModBlocks.IRON_DIORITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> IRON_DIRT_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.IRON_DIRT_GENERATOR.getId().getPath(),
			() -> new IronDirtGeneratorDisplayItem(SkyblockResourcesModBlocks.IRON_DIRT_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> IRON_GRANITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.IRON_GRANITE_GENERATOR.getId().getPath(),
			() -> new IronGraniteGeneratorDisplayItem(SkyblockResourcesModBlocks.IRON_GRANITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> IRON_GRAVEL_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.IRON_GRAVEL_GENERATOR.getId().getPath(),
			() -> new IronGravelGeneratorDisplayItem(SkyblockResourcesModBlocks.IRON_GRAVEL_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> IRON_NETHERRACK_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.IRON_NETHERRACK_GENERATOR.getId().getPath(),
			() -> new IronNetherrackGeneratorDisplayItem(SkyblockResourcesModBlocks.IRON_NETHERRACK_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> IRON_SAND_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.IRON_SAND_GENERATOR.getId().getPath(),
			() -> new IronSandGeneratorDisplayItem(SkyblockResourcesModBlocks.IRON_SAND_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> IRON_SOULSAND_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.IRON_SOULSAND_GENERATOR.getId().getPath(),
			() -> new IronSoulsandGeneratorDisplayItem(SkyblockResourcesModBlocks.IRON_SOULSAND_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> IRON_TUFF_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.IRON_TUFF_GENERATOR.getId().getPath(),
			() -> new IronTuffGeneratorDisplayItem(SkyblockResourcesModBlocks.IRON_TUFF_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> GOLD_ANDESITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.GOLD_ANDESITE_GENERATOR.getId().getPath(),
			() -> new GoldAndesiteGeneratorDisplayItem(SkyblockResourcesModBlocks.GOLD_ANDESITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> GOLD_BASALT_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.GOLD_BASALT_GENERATOR.getId().getPath(),
			() -> new GoldBasaltGeneratorDisplayItem(SkyblockResourcesModBlocks.GOLD_BASALT_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> GOLD_BLACKSTONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.GOLD_BLACKSTONE_GENERATOR.getId().getPath(),
			() -> new GoldBlackstoneGeneratorDisplayItem(SkyblockResourcesModBlocks.GOLD_BLACKSTONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> GOLD_COBBLESTONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.GOLD_COBBLESTONE_GENERATOR.getId().getPath(),
			() -> new GoldCobblestoneGeneratorDisplayItem(SkyblockResourcesModBlocks.GOLD_COBBLESTONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> GOLD_DEEPSLATE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.GOLD_DEEPSLATE_GENERATOR.getId().getPath(),
			() -> new GoldDeepslateGeneratorDisplayItem(SkyblockResourcesModBlocks.GOLD_DEEPSLATE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> GOLD_DIORITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.GOLD_DIORITE_GENERATOR.getId().getPath(),
			() -> new GoldDioriteGeneratorDisplayItem(SkyblockResourcesModBlocks.GOLD_DIORITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> GOLD_DIRT_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.GOLD_DIRT_GENERATOR.getId().getPath(),
			() -> new GoldDirtGeneratorDisplayItem(SkyblockResourcesModBlocks.GOLD_DIRT_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> GOLD_GRANITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.GOLD_GRANITE_GENERATOR.getId().getPath(),
			() -> new GoldGraniteGeneratorDisplayItem(SkyblockResourcesModBlocks.GOLD_GRANITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> GOLD_GRAVEL_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.GOLD_GRAVEL_GENERATOR.getId().getPath(),
			() -> new GoldGravelGeneratorDisplayItem(SkyblockResourcesModBlocks.GOLD_GRAVEL_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> GOLD_NETHERRACK_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.GOLD_NETHERRACK_GENERATOR.getId().getPath(),
			() -> new GoldNetherrackGeneratorDisplayItem(SkyblockResourcesModBlocks.GOLD_NETHERRACK_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> GOLD_SAND_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.GOLD_SAND_GENERATOR.getId().getPath(),
			() -> new GoldSandGeneratorDisplayItem(SkyblockResourcesModBlocks.GOLD_SAND_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> GOLD_SOULSAND_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.GOLD_SOULSAND_GENERATOR.getId().getPath(),
			() -> new GoldSoulsandGeneratorDisplayItem(SkyblockResourcesModBlocks.GOLD_SOULSAND_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> GOLD_TUFF_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.GOLD_TUFF_GENERATOR.getId().getPath(),
			() -> new GoldTuffGeneratorDisplayItem(SkyblockResourcesModBlocks.GOLD_TUFF_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIAMOND_ANDESITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.DIAMOND_ANDESITE_GENERATOR.getId().getPath(),
			() -> new DiamondAndesiteGeneratorDisplayItem(SkyblockResourcesModBlocks.DIAMOND_ANDESITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIAMOND_BASALT_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.DIAMOND_BASALT_GENERATOR.getId().getPath(),
			() -> new DiamondBasaltGeneratorDisplayItem(SkyblockResourcesModBlocks.DIAMOND_BASALT_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIAMOND_BLACKSTONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.DIAMOND_BLACKSTONE_GENERATOR.getId().getPath(),
			() -> new DiamondBlackstoneGeneratorDisplayItem(SkyblockResourcesModBlocks.DIAMOND_BLACKSTONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIAMOND_COBBLESTONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.DIAMOND_COBBLESTONE_GENERATOR.getId().getPath(),
			() -> new DiamondCobblestoneGeneratorDisplayItem(SkyblockResourcesModBlocks.DIAMOND_COBBLESTONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIAMOND_DEEPSLATE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.DIAMOND_DEEPSLATE_GENERATOR.getId().getPath(),
			() -> new DiamondDeepslateGeneratorDisplayItem(SkyblockResourcesModBlocks.DIAMOND_DEEPSLATE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIAMOND_DIORITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.DIAMOND_DIORITE_GENERATOR.getId().getPath(),
			() -> new DiamondDioriteGeneratorDisplayItem(SkyblockResourcesModBlocks.DIAMOND_DIORITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIAMOND_DIRT_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.DIAMOND_DIRT_GENERATOR.getId().getPath(),
			() -> new DiamondDirtGeneratorDisplayItem(SkyblockResourcesModBlocks.DIAMOND_DIRT_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIAMOND_GRANITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.DIAMOND_GRANITE_GENERATOR.getId().getPath(),
			() -> new DiamondGraniteGeneratorDisplayItem(SkyblockResourcesModBlocks.DIAMOND_GRANITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIAMOND_GRAVEL_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.DIAMOND_GRAVEL_GENERATOR.getId().getPath(),
			() -> new DiamondGravelGeneratorDisplayItem(SkyblockResourcesModBlocks.DIAMOND_GRAVEL_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIAMOND_NETHERRACK_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.DIAMOND_NETHERRACK_GENERATOR.getId().getPath(),
			() -> new DiamondNetherrackGeneratorDisplayItem(SkyblockResourcesModBlocks.DIAMOND_NETHERRACK_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIAMOND_SAND_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.DIAMOND_SAND_GENERATOR.getId().getPath(),
			() -> new DiamondSandGeneratorDisplayItem(SkyblockResourcesModBlocks.DIAMOND_SAND_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIAMOND_SOULSAND_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.DIAMOND_SOULSAND_GENERATOR.getId().getPath(),
			() -> new DiamondSoulsandGeneratorDisplayItem(SkyblockResourcesModBlocks.DIAMOND_SOULSAND_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIAMOND_TUFF_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.DIAMOND_TUFF_GENERATOR.getId().getPath(),
			() -> new DiamondTuffGeneratorDisplayItem(SkyblockResourcesModBlocks.DIAMOND_TUFF_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHERITE_ANDESITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.NETHERITE_ANDESITE_GENERATOR.getId().getPath(),
			() -> new NetheriteAndesiteGeneratorDisplayItem(SkyblockResourcesModBlocks.NETHERITE_ANDESITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHERITE_BASALT_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.NETHERITE_BASALT_GENERATOR.getId().getPath(),
			() -> new NetheriteBasaltGeneratorDisplayItem(SkyblockResourcesModBlocks.NETHERITE_BASALT_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHERITE_BLACKSTONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.NETHERITE_BLACKSTONE_GENERATOR.getId().getPath(),
			() -> new NetheriteBlackstoneGeneratorDisplayItem(SkyblockResourcesModBlocks.NETHERITE_BLACKSTONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHERITE_COBBLESTONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.NETHERITE_COBBLESTONE_GENERATOR.getId().getPath(),
			() -> new NetheriteCobblestoneGeneratorDisplayItem(SkyblockResourcesModBlocks.NETHERITE_COBBLESTONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHERITE_DEEPSLATE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.NETHERITE_DEEPSLATE_GENERATOR.getId().getPath(),
			() -> new NetheriteDeepslateGeneratorDisplayItem(SkyblockResourcesModBlocks.NETHERITE_DEEPSLATE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHERITE_DIORITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.NETHERITE_DIORITE_GENERATOR.getId().getPath(),
			() -> new NetheriteDioriteGeneratorDisplayItem(SkyblockResourcesModBlocks.NETHERITE_DIORITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHERITE_GRAVEL_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.NETHERITE_GRAVEL_GENERATOR.getId().getPath(),
			() -> new NetheriteGravelGeneratorDisplayItem(SkyblockResourcesModBlocks.NETHERITE_GRAVEL_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHERITE_DIRT_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.NETHERITE_DIRT_GENERATOR.getId().getPath(),
			() -> new NetheriteDirtGeneratorDisplayItem(SkyblockResourcesModBlocks.NETHERITE_DIRT_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHERITE_GRANITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.NETHERITE_GRANITE_GENERATOR.getId().getPath(),
			() -> new NetheriteGraniteGeneratorDisplayItem(SkyblockResourcesModBlocks.NETHERITE_GRANITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHERITE_NETHERRACK_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.NETHERITE_NETHERRACK_GENERATOR.getId().getPath(),
			() -> new NetheriteNetherrackGeneratorDisplayItem(SkyblockResourcesModBlocks.NETHERITE_NETHERRACK_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHERITE_SAND_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.NETHERITE_SAND_GENERATOR.getId().getPath(),
			() -> new NetheriteSandGeneratorDisplayItem(SkyblockResourcesModBlocks.NETHERITE_SAND_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHERITE_SOULSAND_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.NETHERITE_SOULSAND_GENERATOR.getId().getPath(),
			() -> new NetheriteSoulsandGeneratorDisplayItem(SkyblockResourcesModBlocks.NETHERITE_SOULSAND_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHERITE_TUFF_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.NETHERITE_TUFF_GENERATOR.getId().getPath(),
			() -> new NetheriteTuffGeneratorDisplayItem(SkyblockResourcesModBlocks.NETHERITE_TUFF_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WOODEN_EMPTY_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.WOODEN_EMPTY_GENERATOR.getId().getPath(),
			() -> new WoodenEmptyGeneratorDisplayItem(SkyblockResourcesModBlocks.WOODEN_EMPTY_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WOODEN_CALCITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.WOODEN_CALCITE_GENERATOR.getId().getPath(),
			() -> new WoodenCalciteGeneratorDisplayItem(SkyblockResourcesModBlocks.WOODEN_CALCITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WOODEN_DRIPSTONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.WOODEN_DRIPSTONE_GENERATOR.getId().getPath(),
			() -> new WoodenDripstoneGeneratorDisplayItem(SkyblockResourcesModBlocks.WOODEN_DRIPSTONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WOODEN_END_STONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.WOODEN_END_STONE_GENERATOR.getId().getPath(),
			() -> new WoodenEndStoneGeneratorDisplayItem(SkyblockResourcesModBlocks.WOODEN_END_STONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WOODEN_SLIME_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.WOODEN_SLIME_GENERATOR.getId().getPath(),
			() -> new WoodenSlimeGeneratorDisplayItem(SkyblockResourcesModBlocks.WOODEN_SLIME_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WOODEN_CLAY_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.WOODEN_CLAY_GENERATOR.getId().getPath(),
			() -> new WoodenClayGeneratorDisplayItem(SkyblockResourcesModBlocks.WOODEN_CLAY_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_CALCITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.STONE_CALCITE_GENERATOR.getId().getPath(),
			() -> new StoneCalciteGeneratorDisplayItem(SkyblockResourcesModBlocks.STONE_CALCITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_CLAY_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.STONE_CLAY_GENERATOR.getId().getPath(),
			() -> new StoneClayGeneratorDisplayItem(SkyblockResourcesModBlocks.STONE_CLAY_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_END_STONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.STONE_END_STONE_GENERATOR.getId().getPath(),
			() -> new StoneEndStoneGeneratorDisplayItem(SkyblockResourcesModBlocks.STONE_END_STONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_DRIPSTONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.STONE_DRIPSTONE_GENERATOR.getId().getPath(),
			() -> new StoneDripstoneGeneratorDisplayItem(SkyblockResourcesModBlocks.STONE_DRIPSTONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_SLIME_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.STONE_SLIME_GENERATOR.getId().getPath(),
			() -> new StoneSlimeGeneratorDisplayItem(SkyblockResourcesModBlocks.STONE_SLIME_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_EMPTY_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.STONE_EMPTY_GENERATOR.getId().getPath(),
			() -> new StoneEmptyGeneratorDisplayItem(SkyblockResourcesModBlocks.STONE_EMPTY_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> IRON_CALCITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.IRON_CALCITE_GENERATOR.getId().getPath(),
			() -> new IronCalciteGeneratorDisplayItem(SkyblockResourcesModBlocks.IRON_CALCITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> IRON_CLAY_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.IRON_CLAY_GENERATOR.getId().getPath(),
			() -> new IronClayGeneratorDisplayItem(SkyblockResourcesModBlocks.IRON_CLAY_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> IRON_DRIPSTONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.IRON_DRIPSTONE_GENERATOR.getId().getPath(),
			() -> new IronDripstoneGeneratorDisplayItem(SkyblockResourcesModBlocks.IRON_DRIPSTONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> IRON_END_STONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.IRON_END_STONE_GENERATOR.getId().getPath(),
			() -> new IronEndStoneGeneratorDisplayItem(SkyblockResourcesModBlocks.IRON_END_STONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> IRON_SLIME_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.IRON_SLIME_GENERATOR.getId().getPath(),
			() -> new IronSlimeGeneratorDisplayItem(SkyblockResourcesModBlocks.IRON_SLIME_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> IRON_EMPTY_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.IRON_EMPTY_GENERATOR.getId().getPath(),
			() -> new IronEmptyGeneratorDisplayItem(SkyblockResourcesModBlocks.IRON_EMPTY_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> GOLD_EMPTY_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.GOLD_EMPTY_GENERATOR.getId().getPath(),
			() -> new GoldEmptyGeneratorDisplayItem(SkyblockResourcesModBlocks.GOLD_EMPTY_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIAMOND_EMPTY_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.DIAMOND_EMPTY_GENERATOR.getId().getPath(),
			() -> new DiamondEmptyGeneratorDisplayItem(SkyblockResourcesModBlocks.DIAMOND_EMPTY_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> GOLD_CALCITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.GOLD_CALCITE_GENERATOR.getId().getPath(),
			() -> new GoldCalciteGeneratorDisplayItem(SkyblockResourcesModBlocks.GOLD_CALCITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> GOLD_CLAY_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.GOLD_CLAY_GENERATOR.getId().getPath(),
			() -> new GoldClayGeneratorDisplayItem(SkyblockResourcesModBlocks.GOLD_CLAY_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> GOLD_DRIPSTONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.GOLD_DRIPSTONE_GENERATOR.getId().getPath(),
			() -> new GoldDripstoneGeneratorDisplayItem(SkyblockResourcesModBlocks.GOLD_DRIPSTONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> GOLD_END_STONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.GOLD_END_STONE_GENERATOR.getId().getPath(),
			() -> new GoldEndStoneGeneratorDisplayItem(SkyblockResourcesModBlocks.GOLD_END_STONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> GOLD_SLIME_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.GOLD_SLIME_GENERATOR.getId().getPath(),
			() -> new GoldSlimeGeneratorDisplayItem(SkyblockResourcesModBlocks.GOLD_SLIME_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHERITE_EMPTY_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.NETHERITE_EMPTY_GENERATOR.getId().getPath(),
			() -> new NetheriteEmptyGeneratorDisplayItem(SkyblockResourcesModBlocks.NETHERITE_EMPTY_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIAMOND_CALCITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.DIAMOND_CALCITE_GENERATOR.getId().getPath(),
			() -> new DiamondCalciteGeneratorDisplayItem(SkyblockResourcesModBlocks.DIAMOND_CALCITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIAMOND_CLAY_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.DIAMOND_CLAY_GENERATOR.getId().getPath(),
			() -> new DiamondClayGeneratorDisplayItem(SkyblockResourcesModBlocks.DIAMOND_CLAY_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIAMOND_DRIPSTONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.DIAMOND_DRIPSTONE_GENERATOR.getId().getPath(),
			() -> new DiamondDripstoneGeneratorDisplayItem(SkyblockResourcesModBlocks.DIAMOND_DRIPSTONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIAMOND_END_STONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.DIAMOND_END_STONE_GENERATOR.getId().getPath(),
			() -> new DiamondEndStoneGeneratorDisplayItem(SkyblockResourcesModBlocks.DIAMOND_END_STONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIAMOND_SLIME_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.DIAMOND_SLIME_GENERATOR.getId().getPath(),
			() -> new DiamondSlimeGeneratorDisplayItem(SkyblockResourcesModBlocks.DIAMOND_SLIME_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHERITE_CALCITE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.NETHERITE_CALCITE_GENERATOR.getId().getPath(),
			() -> new NetheriteCalciteGeneratorDisplayItem(SkyblockResourcesModBlocks.NETHERITE_CALCITE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHERITE_CLAY_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.NETHERITE_CLAY_GENERATOR.getId().getPath(),
			() -> new NetheriteClayGeneratorDisplayItem(SkyblockResourcesModBlocks.NETHERITE_CLAY_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHERITE_DRIPSTONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.NETHERITE_DRIPSTONE_GENERATOR.getId().getPath(),
			() -> new NetheriteDripstoneGeneratorDisplayItem(SkyblockResourcesModBlocks.NETHERITE_DRIPSTONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHERITE_END_STONE_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.NETHERITE_END_STONE_GENERATOR.getId().getPath(),
			() -> new NetheriteEndStoneGeneratorDisplayItem(SkyblockResourcesModBlocks.NETHERITE_END_STONE_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHERITE_SLIME_GENERATOR = REGISTRY.register(SkyblockResourcesModBlocks.NETHERITE_SLIME_GENERATOR.getId().getPath(),
			() -> new NetheriteSlimeGeneratorDisplayItem(SkyblockResourcesModBlocks.NETHERITE_SLIME_GENERATOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_UPGRADE_CARD = REGISTRY.register("stone_upgrade_card", () -> new StoneUpgradeCardItem());
	public static final RegistryObject<Item> IRON_UPGRADE_CARD = REGISTRY.register("iron_upgrade_card", () -> new IronUpgradeCardItem());
	public static final RegistryObject<Item> GOLD_UPGRADE_CARD = REGISTRY.register("gold_upgrade_card", () -> new GoldUpgradeCardItem());
	public static final RegistryObject<Item> DIAMOND_UPGRADE_CARD = REGISTRY.register("diamond_upgrade_card", () -> new DiamondUpgradeCardItem());
	public static final RegistryObject<Item> NETHERITE_UPGRADE_CARD = REGISTRY.register("netherite_upgrade_card", () -> new NetheriteUpgradeCardItem());
	// Start of user code block custom items
	// End of user code block custom items
}
