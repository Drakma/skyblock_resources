package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.StoneBasaltGeneratorTileEntity;

public class StoneBasaltGeneratorBlockModel extends GeoModel<StoneBasaltGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StoneBasaltGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneBasaltGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneBasaltGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_basalt.png");
	}
}
