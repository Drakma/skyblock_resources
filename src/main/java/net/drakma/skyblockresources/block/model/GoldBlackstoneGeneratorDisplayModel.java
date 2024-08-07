package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.GoldBlackstoneGeneratorDisplayItem;

public class GoldBlackstoneGeneratorDisplayModel extends GeoModel<GoldBlackstoneGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldBlackstoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldBlackstoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldBlackstoneGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_blackstone.png");
	}
}
