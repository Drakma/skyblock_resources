package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.GoldGravelGeneratorDisplayItem;

public class GoldGravelGeneratorDisplayModel extends GeoModel<GoldGravelGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldGravelGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldGravelGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldGravelGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_gravel.png");
	}
}
