package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.WoodenSkyStoneGeneratorDisplayItem;

public class WoodenSkyStoneGeneratorDisplayModel extends GeoModel<WoodenSkyStoneGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WoodenSkyStoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodenSkyStoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodenSkyStoneGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/wooden_sky_stone.png");
	}
}
