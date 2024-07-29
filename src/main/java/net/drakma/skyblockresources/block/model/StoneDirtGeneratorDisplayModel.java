package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.StoneDirtGeneratorDisplayItem;

public class StoneDirtGeneratorDisplayModel extends GeoModel<StoneDirtGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StoneDirtGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneDirtGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneDirtGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_dirt.png");
	}
}