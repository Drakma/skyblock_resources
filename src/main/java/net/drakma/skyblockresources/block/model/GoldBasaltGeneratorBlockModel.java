package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.GoldBasaltGeneratorTileEntity;

public class GoldBasaltGeneratorBlockModel extends GeoModel<GoldBasaltGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldBasaltGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldBasaltGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldBasaltGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_basalt.png");
	}
}
