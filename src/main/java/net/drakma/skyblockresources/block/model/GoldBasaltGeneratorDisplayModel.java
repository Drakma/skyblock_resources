package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.GoldBasaltGeneratorDisplayItem;

public class GoldBasaltGeneratorDisplayModel extends GeoModel<GoldBasaltGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldBasaltGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldBasaltGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldBasaltGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_basalt.png");
	}
}
