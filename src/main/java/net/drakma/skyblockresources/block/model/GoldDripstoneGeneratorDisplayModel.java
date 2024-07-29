package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.GoldDripstoneGeneratorDisplayItem;

public class GoldDripstoneGeneratorDisplayModel extends GeoModel<GoldDripstoneGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldDripstoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldDripstoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldDripstoneGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_dripstone.png");
	}
}
