package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.StoneAndesiteGeneratorDisplayItem;

public class StoneAndesiteGeneratorDisplayModel extends GeoModel<StoneAndesiteGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StoneAndesiteGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneAndesiteGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneAndesiteGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_andesite.png");
	}
}
