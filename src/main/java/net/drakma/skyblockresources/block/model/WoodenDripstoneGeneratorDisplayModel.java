package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.WoodenDripstoneGeneratorDisplayItem;

public class WoodenDripstoneGeneratorDisplayModel extends GeoModel<WoodenDripstoneGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WoodenDripstoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodenDripstoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodenDripstoneGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/wooden_dripstone.png");
	}
}
