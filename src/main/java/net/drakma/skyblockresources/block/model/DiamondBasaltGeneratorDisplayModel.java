package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.DiamondBasaltGeneratorDisplayItem;

public class DiamondBasaltGeneratorDisplayModel extends GeoModel<DiamondBasaltGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DiamondBasaltGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DiamondBasaltGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DiamondBasaltGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/diamond_basalt.png");
	}
}
