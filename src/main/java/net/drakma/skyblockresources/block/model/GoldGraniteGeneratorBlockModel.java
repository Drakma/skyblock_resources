package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.GoldGraniteGeneratorTileEntity;

public class GoldGraniteGeneratorBlockModel extends GeoModel<GoldGraniteGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldGraniteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldGraniteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldGraniteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_granite.png");
	}
}
