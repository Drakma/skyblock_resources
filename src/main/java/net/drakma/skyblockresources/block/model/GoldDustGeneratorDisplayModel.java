package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.GoldDustGeneratorDisplayItem;

public class GoldDustGeneratorDisplayModel extends GeoModel<GoldDustGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldDustGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldDustGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldDustGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_dust.png");
	}
}
