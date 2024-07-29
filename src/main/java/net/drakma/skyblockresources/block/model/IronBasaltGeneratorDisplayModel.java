package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.IronBasaltGeneratorDisplayItem;

public class IronBasaltGeneratorDisplayModel extends GeoModel<IronBasaltGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IronBasaltGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronBasaltGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronBasaltGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_basalt.png");
	}
}
