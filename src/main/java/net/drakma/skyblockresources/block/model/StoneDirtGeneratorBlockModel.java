package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.StoneDirtGeneratorTileEntity;

public class StoneDirtGeneratorBlockModel extends GeoModel<StoneDirtGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StoneDirtGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneDirtGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneDirtGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_dirt.png");
	}
}
