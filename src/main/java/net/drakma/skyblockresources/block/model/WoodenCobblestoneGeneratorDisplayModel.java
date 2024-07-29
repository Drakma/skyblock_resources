package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.WoodenCobblestoneGeneratorDisplayItem;

public class WoodenCobblestoneGeneratorDisplayModel extends GeoModel<WoodenCobblestoneGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WoodenCobblestoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodenCobblestoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodenCobblestoneGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/wooden_cobblestone.png");
	}
}
