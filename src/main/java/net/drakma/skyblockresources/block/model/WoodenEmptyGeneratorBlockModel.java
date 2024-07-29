package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.WoodenEmptyGeneratorTileEntity;

public class WoodenEmptyGeneratorBlockModel extends GeoModel<WoodenEmptyGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WoodenEmptyGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing_empty.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodenEmptyGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing_empty.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodenEmptyGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/wooden_empty.png");
	}
}
