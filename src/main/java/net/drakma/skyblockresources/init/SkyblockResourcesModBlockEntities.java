
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.drakma.skyblockresources.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.drakma.skyblockresources.block.entity.WoodenTuffGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.WoodenSoulsandGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.WoodenSlimeGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.WoodenSkyStoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.WoodenSandGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.WoodenNetherrackGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.WoodenGravelGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.WoodenGraniteGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.WoodenEndStoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.WoodenEmptyGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.WoodenDustGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.WoodenDripstoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.WoodenDirtGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.WoodenDioriteGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.WoodenDeepslateGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.WoodenCobblestoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.WoodenClayGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.WoodenCalciteGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.WoodenBlackstoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.WoodenBasaltGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.WoodenAndesiteGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.StoneTuffGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.StoneSoulsandGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.StoneSlimeGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.StoneSkyStoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.StoneSandGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.StoneNetherrackGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.StoneGravelGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.StoneGraniteGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.StoneEndStoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.StoneEmptyGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.StoneDustGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.StoneDripstoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.StoneDirtGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.StoneDioriteGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.StoneDeepslateGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.StoneCobblestoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.StoneClayGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.StoneCalciteGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.StoneBlackstoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.StoneBasaltGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.StoneAndesiteGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.NetheriteTuffGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.NetheriteSoulsandGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.NetheriteSlimeGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.NetheriteSkyStoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.NetheriteSandGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.NetheriteNetherrackGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.NetheriteGravelGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.NetheriteGraniteGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.NetheriteEndStoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.NetheriteEmptyGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.NetheriteDustGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.NetheriteDripstoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.NetheriteDirtGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.NetheriteDioriteGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.NetheriteDeepslateGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.NetheriteCobblestoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.NetheriteClayGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.NetheriteCalciteGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.NetheriteBlackstoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.NetheriteBasaltGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.NetheriteAndesiteGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.IronTuffGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.IronSoulsandGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.IronSlimeGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.IronSkyStoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.IronSandGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.IronNetherrackGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.IronGravelGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.IronGraniteGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.IronEndStoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.IronEmptyGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.IronDustGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.IronDripstoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.IronDirtGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.IronDioriteGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.IronDeepslateGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.IronCobblestoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.IronClayGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.IronCalciteGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.IronBlackstoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.IronBasaltGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.IronAndesiteGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.GoldTuffGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.GoldSoulsandGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.GoldSlimeGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.GoldSkyStoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.GoldSandGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.GoldNetherrackGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.GoldGravelGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.GoldGraniteGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.GoldEndStoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.GoldEmptyGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.GoldDustGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.GoldDripstoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.GoldDirtGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.GoldDioriteGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.GoldDeepslateGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.GoldCobblestoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.GoldClayGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.GoldCalciteGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.GoldBlackstoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.GoldBasaltGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.GoldAndesiteGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.DiamondTuffGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.DiamondSoulsandGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.DiamondSlimeGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.DiamondSkyStoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.DiamondSandGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.DiamondNetherrackGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.DiamondGravelGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.DiamondGraniteGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.DiamondEndStoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.DiamondEmptyGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.DiamondDustGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.DiamondDripstoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.DiamondDirtGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.DiamondDioriteGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.DiamondDeepslateGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.DiamondCobblestoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.DiamondClayGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.DiamondCalciteGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.DiamondBlackstoneGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.DiamondBasaltGeneratorTileEntity;
import net.drakma.skyblockresources.block.entity.DiamondAndesiteGeneratorTileEntity;
import net.drakma.skyblockresources.SkyblockResourcesMod;

public class SkyblockResourcesModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, SkyblockResourcesMod.MODID);
	public static final RegistryObject<BlockEntityType<WoodenBasaltGeneratorTileEntity>> WOODEN_BASALT_GENERATOR = REGISTRY.register("wooden_basalt_generator",
			() -> BlockEntityType.Builder.of(WoodenBasaltGeneratorTileEntity::new, SkyblockResourcesModBlocks.WOODEN_BASALT_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenBlackstoneGeneratorTileEntity>> WOODEN_BLACKSTONE_GENERATOR = REGISTRY.register("wooden_blackstone_generator",
			() -> BlockEntityType.Builder.of(WoodenBlackstoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.WOODEN_BLACKSTONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenCobblestoneGeneratorTileEntity>> WOODEN_COBBLESTONE_GENERATOR = REGISTRY.register("wooden_cobblestone_generator",
			() -> BlockEntityType.Builder.of(WoodenCobblestoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.WOODEN_COBBLESTONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenDeepslateGeneratorTileEntity>> WOODEN_DEEPSLATE_GENERATOR = REGISTRY.register("wooden_deepslate_generator",
			() -> BlockEntityType.Builder.of(WoodenDeepslateGeneratorTileEntity::new, SkyblockResourcesModBlocks.WOODEN_DEEPSLATE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenDioriteGeneratorTileEntity>> WOODEN_DIORITE_GENERATOR = REGISTRY.register("wooden_diorite_generator",
			() -> BlockEntityType.Builder.of(WoodenDioriteGeneratorTileEntity::new, SkyblockResourcesModBlocks.WOODEN_DIORITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenDirtGeneratorTileEntity>> WOODEN_DIRT_GENERATOR = REGISTRY.register("wooden_dirt_generator",
			() -> BlockEntityType.Builder.of(WoodenDirtGeneratorTileEntity::new, SkyblockResourcesModBlocks.WOODEN_DIRT_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenGraniteGeneratorTileEntity>> WOODEN_GRANITE_GENERATOR = REGISTRY.register("wooden_granite_generator",
			() -> BlockEntityType.Builder.of(WoodenGraniteGeneratorTileEntity::new, SkyblockResourcesModBlocks.WOODEN_GRANITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenGravelGeneratorTileEntity>> WOODEN_GRAVEL_GENERATOR = REGISTRY.register("wooden_gravel_generator",
			() -> BlockEntityType.Builder.of(WoodenGravelGeneratorTileEntity::new, SkyblockResourcesModBlocks.WOODEN_GRAVEL_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenNetherrackGeneratorTileEntity>> WOODEN_NETHERRACK_GENERATOR = REGISTRY.register("wooden_netherrack_generator",
			() -> BlockEntityType.Builder.of(WoodenNetherrackGeneratorTileEntity::new, SkyblockResourcesModBlocks.WOODEN_NETHERRACK_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenSandGeneratorTileEntity>> WOODEN_SAND_GENERATOR = REGISTRY.register("wooden_sand_generator",
			() -> BlockEntityType.Builder.of(WoodenSandGeneratorTileEntity::new, SkyblockResourcesModBlocks.WOODEN_SAND_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenSoulsandGeneratorTileEntity>> WOODEN_SOULSAND_GENERATOR = REGISTRY.register("wooden_soulsand_generator",
			() -> BlockEntityType.Builder.of(WoodenSoulsandGeneratorTileEntity::new, SkyblockResourcesModBlocks.WOODEN_SOULSAND_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenTuffGeneratorTileEntity>> WOODEN_TUFF_GENERATOR = REGISTRY.register("wooden_tuff_generator",
			() -> BlockEntityType.Builder.of(WoodenTuffGeneratorTileEntity::new, SkyblockResourcesModBlocks.WOODEN_TUFF_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenAndesiteGeneratorTileEntity>> WOODEN_ANDESITE_GENERATOR = REGISTRY.register("wooden_andesite_generator",
			() -> BlockEntityType.Builder.of(WoodenAndesiteGeneratorTileEntity::new, SkyblockResourcesModBlocks.WOODEN_ANDESITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<StoneAndesiteGeneratorTileEntity>> STONE_ANDESITE_GENERATOR = REGISTRY.register("stone_andesite_generator",
			() -> BlockEntityType.Builder.of(StoneAndesiteGeneratorTileEntity::new, SkyblockResourcesModBlocks.STONE_ANDESITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<StoneBasaltGeneratorTileEntity>> STONE_BASALT_GENERATOR = REGISTRY.register("stone_basalt_generator",
			() -> BlockEntityType.Builder.of(StoneBasaltGeneratorTileEntity::new, SkyblockResourcesModBlocks.STONE_BASALT_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<StoneBlackstoneGeneratorTileEntity>> STONE_BLACKSTONE_GENERATOR = REGISTRY.register("stone_blackstone_generator",
			() -> BlockEntityType.Builder.of(StoneBlackstoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.STONE_BLACKSTONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<StoneCobblestoneGeneratorTileEntity>> STONE_COBBLESTONE_GENERATOR = REGISTRY.register("stone_cobblestone_generator",
			() -> BlockEntityType.Builder.of(StoneCobblestoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.STONE_COBBLESTONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<StoneDeepslateGeneratorTileEntity>> STONE_DEEPSLATE_GENERATOR = REGISTRY.register("stone_deepslate_generator",
			() -> BlockEntityType.Builder.of(StoneDeepslateGeneratorTileEntity::new, SkyblockResourcesModBlocks.STONE_DEEPSLATE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<StoneDioriteGeneratorTileEntity>> STONE_DIORITE_GENERATOR = REGISTRY.register("stone_diorite_generator",
			() -> BlockEntityType.Builder.of(StoneDioriteGeneratorTileEntity::new, SkyblockResourcesModBlocks.STONE_DIORITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<StoneDirtGeneratorTileEntity>> STONE_DIRT_GENERATOR = REGISTRY.register("stone_dirt_generator",
			() -> BlockEntityType.Builder.of(StoneDirtGeneratorTileEntity::new, SkyblockResourcesModBlocks.STONE_DIRT_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<StoneGraniteGeneratorTileEntity>> STONE_GRANITE_GENERATOR = REGISTRY.register("stone_granite_generator",
			() -> BlockEntityType.Builder.of(StoneGraniteGeneratorTileEntity::new, SkyblockResourcesModBlocks.STONE_GRANITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<StoneGravelGeneratorTileEntity>> STONE_GRAVEL_GENERATOR = REGISTRY.register("stone_gravel_generator",
			() -> BlockEntityType.Builder.of(StoneGravelGeneratorTileEntity::new, SkyblockResourcesModBlocks.STONE_GRAVEL_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<StoneNetherrackGeneratorTileEntity>> STONE_NETHERRACK_GENERATOR = REGISTRY.register("stone_netherrack_generator",
			() -> BlockEntityType.Builder.of(StoneNetherrackGeneratorTileEntity::new, SkyblockResourcesModBlocks.STONE_NETHERRACK_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<StoneSandGeneratorTileEntity>> STONE_SAND_GENERATOR = REGISTRY.register("stone_sand_generator",
			() -> BlockEntityType.Builder.of(StoneSandGeneratorTileEntity::new, SkyblockResourcesModBlocks.STONE_SAND_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<StoneSoulsandGeneratorTileEntity>> STONE_SOULSAND_GENERATOR = REGISTRY.register("stone_soulsand_generator",
			() -> BlockEntityType.Builder.of(StoneSoulsandGeneratorTileEntity::new, SkyblockResourcesModBlocks.STONE_SOULSAND_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<StoneTuffGeneratorTileEntity>> STONE_TUFF_GENERATOR = REGISTRY.register("stone_tuff_generator",
			() -> BlockEntityType.Builder.of(StoneTuffGeneratorTileEntity::new, SkyblockResourcesModBlocks.STONE_TUFF_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronAndesiteGeneratorTileEntity>> IRON_ANDESITE_GENERATOR = REGISTRY.register("iron_andesite_generator",
			() -> BlockEntityType.Builder.of(IronAndesiteGeneratorTileEntity::new, SkyblockResourcesModBlocks.IRON_ANDESITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronBasaltGeneratorTileEntity>> IRON_BASALT_GENERATOR = REGISTRY.register("iron_basalt_generator",
			() -> BlockEntityType.Builder.of(IronBasaltGeneratorTileEntity::new, SkyblockResourcesModBlocks.IRON_BASALT_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronBlackstoneGeneratorTileEntity>> IRON_BLACKSTONE_GENERATOR = REGISTRY.register("iron_blackstone_generator",
			() -> BlockEntityType.Builder.of(IronBlackstoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.IRON_BLACKSTONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronCobblestoneGeneratorTileEntity>> IRON_COBBLESTONE_GENERATOR = REGISTRY.register("iron_cobblestone_generator",
			() -> BlockEntityType.Builder.of(IronCobblestoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.IRON_COBBLESTONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronDeepslateGeneratorTileEntity>> IRON_DEEPSLATE_GENERATOR = REGISTRY.register("iron_deepslate_generator",
			() -> BlockEntityType.Builder.of(IronDeepslateGeneratorTileEntity::new, SkyblockResourcesModBlocks.IRON_DEEPSLATE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronDioriteGeneratorTileEntity>> IRON_DIORITE_GENERATOR = REGISTRY.register("iron_diorite_generator",
			() -> BlockEntityType.Builder.of(IronDioriteGeneratorTileEntity::new, SkyblockResourcesModBlocks.IRON_DIORITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronDirtGeneratorTileEntity>> IRON_DIRT_GENERATOR = REGISTRY.register("iron_dirt_generator",
			() -> BlockEntityType.Builder.of(IronDirtGeneratorTileEntity::new, SkyblockResourcesModBlocks.IRON_DIRT_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronGraniteGeneratorTileEntity>> IRON_GRANITE_GENERATOR = REGISTRY.register("iron_granite_generator",
			() -> BlockEntityType.Builder.of(IronGraniteGeneratorTileEntity::new, SkyblockResourcesModBlocks.IRON_GRANITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronGravelGeneratorTileEntity>> IRON_GRAVEL_GENERATOR = REGISTRY.register("iron_gravel_generator",
			() -> BlockEntityType.Builder.of(IronGravelGeneratorTileEntity::new, SkyblockResourcesModBlocks.IRON_GRAVEL_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronNetherrackGeneratorTileEntity>> IRON_NETHERRACK_GENERATOR = REGISTRY.register("iron_netherrack_generator",
			() -> BlockEntityType.Builder.of(IronNetherrackGeneratorTileEntity::new, SkyblockResourcesModBlocks.IRON_NETHERRACK_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronSandGeneratorTileEntity>> IRON_SAND_GENERATOR = REGISTRY.register("iron_sand_generator",
			() -> BlockEntityType.Builder.of(IronSandGeneratorTileEntity::new, SkyblockResourcesModBlocks.IRON_SAND_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronSoulsandGeneratorTileEntity>> IRON_SOULSAND_GENERATOR = REGISTRY.register("iron_soulsand_generator",
			() -> BlockEntityType.Builder.of(IronSoulsandGeneratorTileEntity::new, SkyblockResourcesModBlocks.IRON_SOULSAND_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronTuffGeneratorTileEntity>> IRON_TUFF_GENERATOR = REGISTRY.register("iron_tuff_generator",
			() -> BlockEntityType.Builder.of(IronTuffGeneratorTileEntity::new, SkyblockResourcesModBlocks.IRON_TUFF_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldAndesiteGeneratorTileEntity>> GOLD_ANDESITE_GENERATOR = REGISTRY.register("gold_andesite_generator",
			() -> BlockEntityType.Builder.of(GoldAndesiteGeneratorTileEntity::new, SkyblockResourcesModBlocks.GOLD_ANDESITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldBasaltGeneratorTileEntity>> GOLD_BASALT_GENERATOR = REGISTRY.register("gold_basalt_generator",
			() -> BlockEntityType.Builder.of(GoldBasaltGeneratorTileEntity::new, SkyblockResourcesModBlocks.GOLD_BASALT_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldBlackstoneGeneratorTileEntity>> GOLD_BLACKSTONE_GENERATOR = REGISTRY.register("gold_blackstone_generator",
			() -> BlockEntityType.Builder.of(GoldBlackstoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.GOLD_BLACKSTONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldCobblestoneGeneratorTileEntity>> GOLD_COBBLESTONE_GENERATOR = REGISTRY.register("gold_cobblestone_generator",
			() -> BlockEntityType.Builder.of(GoldCobblestoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.GOLD_COBBLESTONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldDeepslateGeneratorTileEntity>> GOLD_DEEPSLATE_GENERATOR = REGISTRY.register("gold_deepslate_generator",
			() -> BlockEntityType.Builder.of(GoldDeepslateGeneratorTileEntity::new, SkyblockResourcesModBlocks.GOLD_DEEPSLATE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldDioriteGeneratorTileEntity>> GOLD_DIORITE_GENERATOR = REGISTRY.register("gold_diorite_generator",
			() -> BlockEntityType.Builder.of(GoldDioriteGeneratorTileEntity::new, SkyblockResourcesModBlocks.GOLD_DIORITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldDirtGeneratorTileEntity>> GOLD_DIRT_GENERATOR = REGISTRY.register("gold_dirt_generator",
			() -> BlockEntityType.Builder.of(GoldDirtGeneratorTileEntity::new, SkyblockResourcesModBlocks.GOLD_DIRT_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldGraniteGeneratorTileEntity>> GOLD_GRANITE_GENERATOR = REGISTRY.register("gold_granite_generator",
			() -> BlockEntityType.Builder.of(GoldGraniteGeneratorTileEntity::new, SkyblockResourcesModBlocks.GOLD_GRANITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldGravelGeneratorTileEntity>> GOLD_GRAVEL_GENERATOR = REGISTRY.register("gold_gravel_generator",
			() -> BlockEntityType.Builder.of(GoldGravelGeneratorTileEntity::new, SkyblockResourcesModBlocks.GOLD_GRAVEL_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldNetherrackGeneratorTileEntity>> GOLD_NETHERRACK_GENERATOR = REGISTRY.register("gold_netherrack_generator",
			() -> BlockEntityType.Builder.of(GoldNetherrackGeneratorTileEntity::new, SkyblockResourcesModBlocks.GOLD_NETHERRACK_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldSandGeneratorTileEntity>> GOLD_SAND_GENERATOR = REGISTRY.register("gold_sand_generator",
			() -> BlockEntityType.Builder.of(GoldSandGeneratorTileEntity::new, SkyblockResourcesModBlocks.GOLD_SAND_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldSoulsandGeneratorTileEntity>> GOLD_SOULSAND_GENERATOR = REGISTRY.register("gold_soulsand_generator",
			() -> BlockEntityType.Builder.of(GoldSoulsandGeneratorTileEntity::new, SkyblockResourcesModBlocks.GOLD_SOULSAND_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldTuffGeneratorTileEntity>> GOLD_TUFF_GENERATOR = REGISTRY.register("gold_tuff_generator",
			() -> BlockEntityType.Builder.of(GoldTuffGeneratorTileEntity::new, SkyblockResourcesModBlocks.GOLD_TUFF_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DiamondAndesiteGeneratorTileEntity>> DIAMOND_ANDESITE_GENERATOR = REGISTRY.register("diamond_andesite_generator",
			() -> BlockEntityType.Builder.of(DiamondAndesiteGeneratorTileEntity::new, SkyblockResourcesModBlocks.DIAMOND_ANDESITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DiamondBasaltGeneratorTileEntity>> DIAMOND_BASALT_GENERATOR = REGISTRY.register("diamond_basalt_generator",
			() -> BlockEntityType.Builder.of(DiamondBasaltGeneratorTileEntity::new, SkyblockResourcesModBlocks.DIAMOND_BASALT_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DiamondBlackstoneGeneratorTileEntity>> DIAMOND_BLACKSTONE_GENERATOR = REGISTRY.register("diamond_blackstone_generator",
			() -> BlockEntityType.Builder.of(DiamondBlackstoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.DIAMOND_BLACKSTONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DiamondCobblestoneGeneratorTileEntity>> DIAMOND_COBBLESTONE_GENERATOR = REGISTRY.register("diamond_cobblestone_generator",
			() -> BlockEntityType.Builder.of(DiamondCobblestoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.DIAMOND_COBBLESTONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DiamondDeepslateGeneratorTileEntity>> DIAMOND_DEEPSLATE_GENERATOR = REGISTRY.register("diamond_deepslate_generator",
			() -> BlockEntityType.Builder.of(DiamondDeepslateGeneratorTileEntity::new, SkyblockResourcesModBlocks.DIAMOND_DEEPSLATE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DiamondDioriteGeneratorTileEntity>> DIAMOND_DIORITE_GENERATOR = REGISTRY.register("diamond_diorite_generator",
			() -> BlockEntityType.Builder.of(DiamondDioriteGeneratorTileEntity::new, SkyblockResourcesModBlocks.DIAMOND_DIORITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DiamondDirtGeneratorTileEntity>> DIAMOND_DIRT_GENERATOR = REGISTRY.register("diamond_dirt_generator",
			() -> BlockEntityType.Builder.of(DiamondDirtGeneratorTileEntity::new, SkyblockResourcesModBlocks.DIAMOND_DIRT_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DiamondGraniteGeneratorTileEntity>> DIAMOND_GRANITE_GENERATOR = REGISTRY.register("diamond_granite_generator",
			() -> BlockEntityType.Builder.of(DiamondGraniteGeneratorTileEntity::new, SkyblockResourcesModBlocks.DIAMOND_GRANITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DiamondGravelGeneratorTileEntity>> DIAMOND_GRAVEL_GENERATOR = REGISTRY.register("diamond_gravel_generator",
			() -> BlockEntityType.Builder.of(DiamondGravelGeneratorTileEntity::new, SkyblockResourcesModBlocks.DIAMOND_GRAVEL_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DiamondNetherrackGeneratorTileEntity>> DIAMOND_NETHERRACK_GENERATOR = REGISTRY.register("diamond_netherrack_generator",
			() -> BlockEntityType.Builder.of(DiamondNetherrackGeneratorTileEntity::new, SkyblockResourcesModBlocks.DIAMOND_NETHERRACK_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DiamondSandGeneratorTileEntity>> DIAMOND_SAND_GENERATOR = REGISTRY.register("diamond_sand_generator",
			() -> BlockEntityType.Builder.of(DiamondSandGeneratorTileEntity::new, SkyblockResourcesModBlocks.DIAMOND_SAND_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DiamondSoulsandGeneratorTileEntity>> DIAMOND_SOULSAND_GENERATOR = REGISTRY.register("diamond_soulsand_generator",
			() -> BlockEntityType.Builder.of(DiamondSoulsandGeneratorTileEntity::new, SkyblockResourcesModBlocks.DIAMOND_SOULSAND_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DiamondTuffGeneratorTileEntity>> DIAMOND_TUFF_GENERATOR = REGISTRY.register("diamond_tuff_generator",
			() -> BlockEntityType.Builder.of(DiamondTuffGeneratorTileEntity::new, SkyblockResourcesModBlocks.DIAMOND_TUFF_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<NetheriteAndesiteGeneratorTileEntity>> NETHERITE_ANDESITE_GENERATOR = REGISTRY.register("netherite_andesite_generator",
			() -> BlockEntityType.Builder.of(NetheriteAndesiteGeneratorTileEntity::new, SkyblockResourcesModBlocks.NETHERITE_ANDESITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<NetheriteBasaltGeneratorTileEntity>> NETHERITE_BASALT_GENERATOR = REGISTRY.register("netherite_basalt_generator",
			() -> BlockEntityType.Builder.of(NetheriteBasaltGeneratorTileEntity::new, SkyblockResourcesModBlocks.NETHERITE_BASALT_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<NetheriteBlackstoneGeneratorTileEntity>> NETHERITE_BLACKSTONE_GENERATOR = REGISTRY.register("netherite_blackstone_generator",
			() -> BlockEntityType.Builder.of(NetheriteBlackstoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.NETHERITE_BLACKSTONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<NetheriteCobblestoneGeneratorTileEntity>> NETHERITE_COBBLESTONE_GENERATOR = REGISTRY.register("netherite_cobblestone_generator",
			() -> BlockEntityType.Builder.of(NetheriteCobblestoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.NETHERITE_COBBLESTONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<NetheriteDeepslateGeneratorTileEntity>> NETHERITE_DEEPSLATE_GENERATOR = REGISTRY.register("netherite_deepslate_generator",
			() -> BlockEntityType.Builder.of(NetheriteDeepslateGeneratorTileEntity::new, SkyblockResourcesModBlocks.NETHERITE_DEEPSLATE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<NetheriteDioriteGeneratorTileEntity>> NETHERITE_DIORITE_GENERATOR = REGISTRY.register("netherite_diorite_generator",
			() -> BlockEntityType.Builder.of(NetheriteDioriteGeneratorTileEntity::new, SkyblockResourcesModBlocks.NETHERITE_DIORITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<NetheriteGravelGeneratorTileEntity>> NETHERITE_GRAVEL_GENERATOR = REGISTRY.register("netherite_gravel_generator",
			() -> BlockEntityType.Builder.of(NetheriteGravelGeneratorTileEntity::new, SkyblockResourcesModBlocks.NETHERITE_GRAVEL_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<NetheriteDirtGeneratorTileEntity>> NETHERITE_DIRT_GENERATOR = REGISTRY.register("netherite_dirt_generator",
			() -> BlockEntityType.Builder.of(NetheriteDirtGeneratorTileEntity::new, SkyblockResourcesModBlocks.NETHERITE_DIRT_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<NetheriteGraniteGeneratorTileEntity>> NETHERITE_GRANITE_GENERATOR = REGISTRY.register("netherite_granite_generator",
			() -> BlockEntityType.Builder.of(NetheriteGraniteGeneratorTileEntity::new, SkyblockResourcesModBlocks.NETHERITE_GRANITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<NetheriteNetherrackGeneratorTileEntity>> NETHERITE_NETHERRACK_GENERATOR = REGISTRY.register("netherite_netherrack_generator",
			() -> BlockEntityType.Builder.of(NetheriteNetherrackGeneratorTileEntity::new, SkyblockResourcesModBlocks.NETHERITE_NETHERRACK_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<NetheriteSandGeneratorTileEntity>> NETHERITE_SAND_GENERATOR = REGISTRY.register("netherite_sand_generator",
			() -> BlockEntityType.Builder.of(NetheriteSandGeneratorTileEntity::new, SkyblockResourcesModBlocks.NETHERITE_SAND_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<NetheriteSoulsandGeneratorTileEntity>> NETHERITE_SOULSAND_GENERATOR = REGISTRY.register("netherite_soulsand_generator",
			() -> BlockEntityType.Builder.of(NetheriteSoulsandGeneratorTileEntity::new, SkyblockResourcesModBlocks.NETHERITE_SOULSAND_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<NetheriteTuffGeneratorTileEntity>> NETHERITE_TUFF_GENERATOR = REGISTRY.register("netherite_tuff_generator",
			() -> BlockEntityType.Builder.of(NetheriteTuffGeneratorTileEntity::new, SkyblockResourcesModBlocks.NETHERITE_TUFF_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenEmptyGeneratorTileEntity>> WOODEN_EMPTY_GENERATOR = REGISTRY.register("wooden_empty_generator",
			() -> BlockEntityType.Builder.of(WoodenEmptyGeneratorTileEntity::new, SkyblockResourcesModBlocks.WOODEN_EMPTY_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenCalciteGeneratorTileEntity>> WOODEN_CALCITE_GENERATOR = REGISTRY.register("wooden_calcite_generator",
			() -> BlockEntityType.Builder.of(WoodenCalciteGeneratorTileEntity::new, SkyblockResourcesModBlocks.WOODEN_CALCITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenDripstoneGeneratorTileEntity>> WOODEN_DRIPSTONE_GENERATOR = REGISTRY.register("wooden_dripstone_generator",
			() -> BlockEntityType.Builder.of(WoodenDripstoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.WOODEN_DRIPSTONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenEndStoneGeneratorTileEntity>> WOODEN_END_STONE_GENERATOR = REGISTRY.register("wooden_end_stone_generator",
			() -> BlockEntityType.Builder.of(WoodenEndStoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.WOODEN_END_STONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenSlimeGeneratorTileEntity>> WOODEN_SLIME_GENERATOR = REGISTRY.register("wooden_slime_generator",
			() -> BlockEntityType.Builder.of(WoodenSlimeGeneratorTileEntity::new, SkyblockResourcesModBlocks.WOODEN_SLIME_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenClayGeneratorTileEntity>> WOODEN_CLAY_GENERATOR = REGISTRY.register("wooden_clay_generator",
			() -> BlockEntityType.Builder.of(WoodenClayGeneratorTileEntity::new, SkyblockResourcesModBlocks.WOODEN_CLAY_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<StoneCalciteGeneratorTileEntity>> STONE_CALCITE_GENERATOR = REGISTRY.register("stone_calcite_generator",
			() -> BlockEntityType.Builder.of(StoneCalciteGeneratorTileEntity::new, SkyblockResourcesModBlocks.STONE_CALCITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<StoneClayGeneratorTileEntity>> STONE_CLAY_GENERATOR = REGISTRY.register("stone_clay_generator",
			() -> BlockEntityType.Builder.of(StoneClayGeneratorTileEntity::new, SkyblockResourcesModBlocks.STONE_CLAY_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<StoneEndStoneGeneratorTileEntity>> STONE_END_STONE_GENERATOR = REGISTRY.register("stone_end_stone_generator",
			() -> BlockEntityType.Builder.of(StoneEndStoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.STONE_END_STONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<StoneDripstoneGeneratorTileEntity>> STONE_DRIPSTONE_GENERATOR = REGISTRY.register("stone_dripstone_generator",
			() -> BlockEntityType.Builder.of(StoneDripstoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.STONE_DRIPSTONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<StoneSlimeGeneratorTileEntity>> STONE_SLIME_GENERATOR = REGISTRY.register("stone_slime_generator",
			() -> BlockEntityType.Builder.of(StoneSlimeGeneratorTileEntity::new, SkyblockResourcesModBlocks.STONE_SLIME_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<StoneEmptyGeneratorTileEntity>> STONE_EMPTY_GENERATOR = REGISTRY.register("stone_empty_generator",
			() -> BlockEntityType.Builder.of(StoneEmptyGeneratorTileEntity::new, SkyblockResourcesModBlocks.STONE_EMPTY_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronCalciteGeneratorTileEntity>> IRON_CALCITE_GENERATOR = REGISTRY.register("iron_calcite_generator",
			() -> BlockEntityType.Builder.of(IronCalciteGeneratorTileEntity::new, SkyblockResourcesModBlocks.IRON_CALCITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronClayGeneratorTileEntity>> IRON_CLAY_GENERATOR = REGISTRY.register("iron_clay_generator",
			() -> BlockEntityType.Builder.of(IronClayGeneratorTileEntity::new, SkyblockResourcesModBlocks.IRON_CLAY_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronDripstoneGeneratorTileEntity>> IRON_DRIPSTONE_GENERATOR = REGISTRY.register("iron_dripstone_generator",
			() -> BlockEntityType.Builder.of(IronDripstoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.IRON_DRIPSTONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronEndStoneGeneratorTileEntity>> IRON_END_STONE_GENERATOR = REGISTRY.register("iron_end_stone_generator",
			() -> BlockEntityType.Builder.of(IronEndStoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.IRON_END_STONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronSlimeGeneratorTileEntity>> IRON_SLIME_GENERATOR = REGISTRY.register("iron_slime_generator",
			() -> BlockEntityType.Builder.of(IronSlimeGeneratorTileEntity::new, SkyblockResourcesModBlocks.IRON_SLIME_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronEmptyGeneratorTileEntity>> IRON_EMPTY_GENERATOR = REGISTRY.register("iron_empty_generator",
			() -> BlockEntityType.Builder.of(IronEmptyGeneratorTileEntity::new, SkyblockResourcesModBlocks.IRON_EMPTY_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldEmptyGeneratorTileEntity>> GOLD_EMPTY_GENERATOR = REGISTRY.register("gold_empty_generator",
			() -> BlockEntityType.Builder.of(GoldEmptyGeneratorTileEntity::new, SkyblockResourcesModBlocks.GOLD_EMPTY_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DiamondEmptyGeneratorTileEntity>> DIAMOND_EMPTY_GENERATOR = REGISTRY.register("diamond_empty_generator",
			() -> BlockEntityType.Builder.of(DiamondEmptyGeneratorTileEntity::new, SkyblockResourcesModBlocks.DIAMOND_EMPTY_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldCalciteGeneratorTileEntity>> GOLD_CALCITE_GENERATOR = REGISTRY.register("gold_calcite_generator",
			() -> BlockEntityType.Builder.of(GoldCalciteGeneratorTileEntity::new, SkyblockResourcesModBlocks.GOLD_CALCITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldClayGeneratorTileEntity>> GOLD_CLAY_GENERATOR = REGISTRY.register("gold_clay_generator",
			() -> BlockEntityType.Builder.of(GoldClayGeneratorTileEntity::new, SkyblockResourcesModBlocks.GOLD_CLAY_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldDripstoneGeneratorTileEntity>> GOLD_DRIPSTONE_GENERATOR = REGISTRY.register("gold_dripstone_generator",
			() -> BlockEntityType.Builder.of(GoldDripstoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.GOLD_DRIPSTONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldEndStoneGeneratorTileEntity>> GOLD_END_STONE_GENERATOR = REGISTRY.register("gold_end_stone_generator",
			() -> BlockEntityType.Builder.of(GoldEndStoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.GOLD_END_STONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldSlimeGeneratorTileEntity>> GOLD_SLIME_GENERATOR = REGISTRY.register("gold_slime_generator",
			() -> BlockEntityType.Builder.of(GoldSlimeGeneratorTileEntity::new, SkyblockResourcesModBlocks.GOLD_SLIME_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<NetheriteEmptyGeneratorTileEntity>> NETHERITE_EMPTY_GENERATOR = REGISTRY.register("netherite_empty_generator",
			() -> BlockEntityType.Builder.of(NetheriteEmptyGeneratorTileEntity::new, SkyblockResourcesModBlocks.NETHERITE_EMPTY_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DiamondCalciteGeneratorTileEntity>> DIAMOND_CALCITE_GENERATOR = REGISTRY.register("diamond_calcite_generator",
			() -> BlockEntityType.Builder.of(DiamondCalciteGeneratorTileEntity::new, SkyblockResourcesModBlocks.DIAMOND_CALCITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DiamondClayGeneratorTileEntity>> DIAMOND_CLAY_GENERATOR = REGISTRY.register("diamond_clay_generator",
			() -> BlockEntityType.Builder.of(DiamondClayGeneratorTileEntity::new, SkyblockResourcesModBlocks.DIAMOND_CLAY_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DiamondDripstoneGeneratorTileEntity>> DIAMOND_DRIPSTONE_GENERATOR = REGISTRY.register("diamond_dripstone_generator",
			() -> BlockEntityType.Builder.of(DiamondDripstoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.DIAMOND_DRIPSTONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DiamondEndStoneGeneratorTileEntity>> DIAMOND_END_STONE_GENERATOR = REGISTRY.register("diamond_end_stone_generator",
			() -> BlockEntityType.Builder.of(DiamondEndStoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.DIAMOND_END_STONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DiamondSlimeGeneratorTileEntity>> DIAMOND_SLIME_GENERATOR = REGISTRY.register("diamond_slime_generator",
			() -> BlockEntityType.Builder.of(DiamondSlimeGeneratorTileEntity::new, SkyblockResourcesModBlocks.DIAMOND_SLIME_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<NetheriteCalciteGeneratorTileEntity>> NETHERITE_CALCITE_GENERATOR = REGISTRY.register("netherite_calcite_generator",
			() -> BlockEntityType.Builder.of(NetheriteCalciteGeneratorTileEntity::new, SkyblockResourcesModBlocks.NETHERITE_CALCITE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<NetheriteClayGeneratorTileEntity>> NETHERITE_CLAY_GENERATOR = REGISTRY.register("netherite_clay_generator",
			() -> BlockEntityType.Builder.of(NetheriteClayGeneratorTileEntity::new, SkyblockResourcesModBlocks.NETHERITE_CLAY_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<NetheriteDripstoneGeneratorTileEntity>> NETHERITE_DRIPSTONE_GENERATOR = REGISTRY.register("netherite_dripstone_generator",
			() -> BlockEntityType.Builder.of(NetheriteDripstoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.NETHERITE_DRIPSTONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<NetheriteEndStoneGeneratorTileEntity>> NETHERITE_END_STONE_GENERATOR = REGISTRY.register("netherite_end_stone_generator",
			() -> BlockEntityType.Builder.of(NetheriteEndStoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.NETHERITE_END_STONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<NetheriteSlimeGeneratorTileEntity>> NETHERITE_SLIME_GENERATOR = REGISTRY.register("netherite_slime_generator",
			() -> BlockEntityType.Builder.of(NetheriteSlimeGeneratorTileEntity::new, SkyblockResourcesModBlocks.NETHERITE_SLIME_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenDustGeneratorTileEntity>> WOODEN_DUST_GENERATOR = REGISTRY.register("wooden_dust_generator",
			() -> BlockEntityType.Builder.of(WoodenDustGeneratorTileEntity::new, SkyblockResourcesModBlocks.WOODEN_DUST_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<StoneDustGeneratorTileEntity>> STONE_DUST_GENERATOR = REGISTRY.register("stone_dust_generator",
			() -> BlockEntityType.Builder.of(StoneDustGeneratorTileEntity::new, SkyblockResourcesModBlocks.STONE_DUST_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronDustGeneratorTileEntity>> IRON_DUST_GENERATOR = REGISTRY.register("iron_dust_generator",
			() -> BlockEntityType.Builder.of(IronDustGeneratorTileEntity::new, SkyblockResourcesModBlocks.IRON_DUST_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldDustGeneratorTileEntity>> GOLD_DUST_GENERATOR = REGISTRY.register("gold_dust_generator",
			() -> BlockEntityType.Builder.of(GoldDustGeneratorTileEntity::new, SkyblockResourcesModBlocks.GOLD_DUST_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DiamondDustGeneratorTileEntity>> DIAMOND_DUST_GENERATOR = REGISTRY.register("diamond_dust_generator",
			() -> BlockEntityType.Builder.of(DiamondDustGeneratorTileEntity::new, SkyblockResourcesModBlocks.DIAMOND_DUST_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<NetheriteDustGeneratorTileEntity>> NETHERITE_DUST_GENERATOR = REGISTRY.register("netherite_dust_generator",
			() -> BlockEntityType.Builder.of(NetheriteDustGeneratorTileEntity::new, SkyblockResourcesModBlocks.NETHERITE_DUST_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenSkyStoneGeneratorTileEntity>> WOODEN_SKY_STONE_GENERATOR = REGISTRY.register("wooden_sky_stone_generator",
			() -> BlockEntityType.Builder.of(WoodenSkyStoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.WOODEN_SKY_STONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<StoneSkyStoneGeneratorTileEntity>> STONE_SKY_STONE_GENERATOR = REGISTRY.register("stone_sky_stone_generator",
			() -> BlockEntityType.Builder.of(StoneSkyStoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.STONE_SKY_STONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronSkyStoneGeneratorTileEntity>> IRON_SKY_STONE_GENERATOR = REGISTRY.register("iron_sky_stone_generator",
			() -> BlockEntityType.Builder.of(IronSkyStoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.IRON_SKY_STONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DiamondSkyStoneGeneratorTileEntity>> DIAMOND_SKY_STONE_GENERATOR = REGISTRY.register("diamond_sky_stone_generator",
			() -> BlockEntityType.Builder.of(DiamondSkyStoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.DIAMOND_SKY_STONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<NetheriteSkyStoneGeneratorTileEntity>> NETHERITE_SKY_STONE_GENERATOR = REGISTRY.register("netherite_sky_stone_generator",
			() -> BlockEntityType.Builder.of(NetheriteSkyStoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.NETHERITE_SKY_STONE_GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldSkyStoneGeneratorTileEntity>> GOLD_SKY_STONE_GENERATOR = REGISTRY.register("gold_sky_stone_generator",
			() -> BlockEntityType.Builder.of(GoldSkyStoneGeneratorTileEntity::new, SkyblockResourcesModBlocks.GOLD_SKY_STONE_GENERATOR.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
