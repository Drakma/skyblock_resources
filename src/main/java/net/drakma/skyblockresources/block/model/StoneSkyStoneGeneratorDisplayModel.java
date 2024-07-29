package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.StoneSkyStoneGeneratorDisplayItem;

public class StoneSkyStoneGeneratorDisplayModel extends GeoModel<StoneSkyStoneGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StoneSkyStoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneSkyStoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneSkyStoneGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_sky_stone.png");
	}
}
