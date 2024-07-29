package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.IronCalciteGeneratorTileEntity;

public class IronCalciteGeneratorBlockModel extends GeoModel<IronCalciteGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IronCalciteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronCalciteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronCalciteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_calcite.png");
	}
}
