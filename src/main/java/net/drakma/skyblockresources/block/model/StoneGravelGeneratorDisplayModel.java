package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.StoneGravelGeneratorDisplayItem;

public class StoneGravelGeneratorDisplayModel extends GeoModel<StoneGravelGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StoneGravelGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneGravelGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneGravelGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_gravel.png");
	}
}
