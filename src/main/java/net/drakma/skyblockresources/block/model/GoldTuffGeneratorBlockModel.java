package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.GoldTuffGeneratorTileEntity;

public class GoldTuffGeneratorBlockModel extends GeoModel<GoldTuffGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldTuffGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldTuffGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldTuffGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_tuff.png");
	}
}
