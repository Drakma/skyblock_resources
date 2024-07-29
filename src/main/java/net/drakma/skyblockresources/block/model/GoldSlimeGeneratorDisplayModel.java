package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.GoldSlimeGeneratorDisplayItem;

public class GoldSlimeGeneratorDisplayModel extends GeoModel<GoldSlimeGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldSlimeGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldSlimeGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldSlimeGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_slime.png");
	}
}
