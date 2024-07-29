package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.StoneDioriteGeneratorDisplayItem;

public class StoneDioriteGeneratorDisplayModel extends GeoModel<StoneDioriteGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StoneDioriteGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneDioriteGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneDioriteGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_diorite.png");
	}
}
