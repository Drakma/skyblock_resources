package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.StoneTuffGeneratorDisplayItem;

public class StoneTuffGeneratorDisplayModel extends GeoModel<StoneTuffGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StoneTuffGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneTuffGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneTuffGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_tuff.png");
	}
}
