package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.GoldClayGeneratorTileEntity;

public class GoldClayGeneratorBlockModel extends GeoModel<GoldClayGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldClayGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldClayGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldClayGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_clay.png");
	}
}
