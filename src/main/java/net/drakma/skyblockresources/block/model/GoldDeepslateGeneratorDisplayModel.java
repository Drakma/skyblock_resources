package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.GoldDeepslateGeneratorDisplayItem;

public class GoldDeepslateGeneratorDisplayModel extends GeoModel<GoldDeepslateGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldDeepslateGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldDeepslateGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldDeepslateGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_deepslate.png");
	}
}
