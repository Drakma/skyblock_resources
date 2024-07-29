package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.StoneGraniteGeneratorDisplayItem;

public class StoneGraniteGeneratorDisplayModel extends GeoModel<StoneGraniteGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StoneGraniteGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneGraniteGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneGraniteGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_granite.png");
	}
}
