package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.DiamondSkyStoneGeneratorDisplayItem;

public class DiamondSkyStoneGeneratorDisplayModel extends GeoModel<DiamondSkyStoneGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DiamondSkyStoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DiamondSkyStoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DiamondSkyStoneGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/diamond_sky_stone.png");
	}
}
