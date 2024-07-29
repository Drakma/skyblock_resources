package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.DiamondCalciteGeneratorTileEntity;

public class DiamondCalciteGeneratorBlockModel extends GeoModel<DiamondCalciteGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DiamondCalciteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DiamondCalciteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DiamondCalciteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/diamond_calcite.png");
	}
}
