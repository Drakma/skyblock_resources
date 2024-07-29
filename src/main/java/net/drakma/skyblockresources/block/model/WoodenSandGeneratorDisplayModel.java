package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.WoodenSandGeneratorDisplayItem;

public class WoodenSandGeneratorDisplayModel extends GeoModel<WoodenSandGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WoodenSandGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodenSandGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodenSandGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/wooden_sand.png");
	}
}
