package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.StoneEmptyGeneratorDisplayItem;

public class StoneEmptyGeneratorDisplayModel extends GeoModel<StoneEmptyGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StoneEmptyGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing_empty.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneEmptyGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing_empty.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneEmptyGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_empty.png");
	}
}
