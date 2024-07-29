package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.GoldGraniteGeneratorDisplayItem;

public class GoldGraniteGeneratorDisplayModel extends GeoModel<GoldGraniteGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldGraniteGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldGraniteGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldGraniteGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_granite.png");
	}
}
