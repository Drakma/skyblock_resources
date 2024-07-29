package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.WoodenSoulsandGeneratorDisplayItem;

public class WoodenSoulsandGeneratorDisplayModel extends GeoModel<WoodenSoulsandGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WoodenSoulsandGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodenSoulsandGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodenSoulsandGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/wooden_soulsand.png");
	}
}
