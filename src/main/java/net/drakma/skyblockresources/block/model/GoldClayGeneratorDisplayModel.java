package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.GoldClayGeneratorDisplayItem;

public class GoldClayGeneratorDisplayModel extends GeoModel<GoldClayGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldClayGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldClayGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldClayGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_clay.png");
	}
}
