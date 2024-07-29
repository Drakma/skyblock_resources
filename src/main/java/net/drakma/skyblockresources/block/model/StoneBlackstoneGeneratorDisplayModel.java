package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.StoneBlackstoneGeneratorDisplayItem;

public class StoneBlackstoneGeneratorDisplayModel extends GeoModel<StoneBlackstoneGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StoneBlackstoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneBlackstoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneBlackstoneGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_blackstone.png");
	}
}
