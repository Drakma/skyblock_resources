package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.StoneClayGeneratorDisplayItem;

public class StoneClayGeneratorDisplayModel extends GeoModel<StoneClayGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StoneClayGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneClayGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneClayGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_clay.png");
	}
}
