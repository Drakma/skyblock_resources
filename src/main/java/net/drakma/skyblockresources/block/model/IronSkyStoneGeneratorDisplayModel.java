package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.IronSkyStoneGeneratorDisplayItem;

public class IronSkyStoneGeneratorDisplayModel extends GeoModel<IronSkyStoneGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IronSkyStoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronSkyStoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronSkyStoneGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_sky_stone.png");
	}
}
