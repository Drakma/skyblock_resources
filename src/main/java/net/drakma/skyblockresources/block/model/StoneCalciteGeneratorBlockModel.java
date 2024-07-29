package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.StoneCalciteGeneratorTileEntity;

public class StoneCalciteGeneratorBlockModel extends GeoModel<StoneCalciteGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StoneCalciteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneCalciteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneCalciteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_calcite.png");
	}
}
