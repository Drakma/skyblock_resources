package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.GoldTuffGeneratorDisplayItem;

public class GoldTuffGeneratorDisplayModel extends GeoModel<GoldTuffGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldTuffGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldTuffGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldTuffGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_tuff.png");
	}
}
