package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.GoldAndesiteGeneratorDisplayItem;

public class GoldAndesiteGeneratorDisplayModel extends GeoModel<GoldAndesiteGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldAndesiteGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldAndesiteGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldAndesiteGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_andesite.png");
	}
}
