package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.WoodenDirtGeneratorDisplayItem;

public class WoodenDirtGeneratorDisplayModel extends GeoModel<WoodenDirtGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WoodenDirtGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodenDirtGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodenDirtGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/wooden_dirt.png");
	}
}
