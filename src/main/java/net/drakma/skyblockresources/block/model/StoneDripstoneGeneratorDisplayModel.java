package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.StoneDripstoneGeneratorDisplayItem;

public class StoneDripstoneGeneratorDisplayModel extends GeoModel<StoneDripstoneGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StoneDripstoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneDripstoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneDripstoneGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_dripstone.png");
	}
}
