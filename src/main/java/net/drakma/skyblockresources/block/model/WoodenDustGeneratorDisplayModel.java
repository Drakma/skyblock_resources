package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.WoodenDustGeneratorDisplayItem;

public class WoodenDustGeneratorDisplayModel extends GeoModel<WoodenDustGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WoodenDustGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodenDustGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodenDustGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/wooden_dust.png");
	}
}
