package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.GoldEmptyGeneratorDisplayItem;

public class GoldEmptyGeneratorDisplayModel extends GeoModel<GoldEmptyGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldEmptyGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing_empty.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldEmptyGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing_empty.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldEmptyGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_empty.png");
	}
}
