package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.StoneTuffGeneratorTileEntity;

public class StoneTuffGeneratorBlockModel extends GeoModel<StoneTuffGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StoneTuffGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneTuffGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneTuffGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_tuff.png");
	}
}
