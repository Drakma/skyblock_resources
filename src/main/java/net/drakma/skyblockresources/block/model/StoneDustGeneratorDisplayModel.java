package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.StoneDustGeneratorDisplayItem;

public class StoneDustGeneratorDisplayModel extends GeoModel<StoneDustGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StoneDustGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneDustGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneDustGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_dust.png");
	}
}
