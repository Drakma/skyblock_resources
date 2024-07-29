package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.WoodenEmptyGeneratorDisplayItem;

public class WoodenEmptyGeneratorDisplayModel extends GeoModel<WoodenEmptyGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WoodenEmptyGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing_empty.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodenEmptyGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing_empty.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodenEmptyGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/wooden_empty.png");
	}
}
