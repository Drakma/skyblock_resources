package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.StoneCobblestoneGeneratorDisplayItem;

public class StoneCobblestoneGeneratorDisplayModel extends GeoModel<StoneCobblestoneGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StoneCobblestoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneCobblestoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneCobblestoneGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_cobblestone.png");
	}
}
