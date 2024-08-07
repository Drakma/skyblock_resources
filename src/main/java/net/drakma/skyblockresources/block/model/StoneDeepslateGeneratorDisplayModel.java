package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.StoneDeepslateGeneratorDisplayItem;

public class StoneDeepslateGeneratorDisplayModel extends GeoModel<StoneDeepslateGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StoneDeepslateGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneDeepslateGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneDeepslateGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_deepslate.png");
	}
}
