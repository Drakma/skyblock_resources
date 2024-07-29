package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.GoldEndStoneGeneratorDisplayItem;

public class GoldEndStoneGeneratorDisplayModel extends GeoModel<GoldEndStoneGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldEndStoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldEndStoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldEndStoneGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_end_stone.png");
	}
}
