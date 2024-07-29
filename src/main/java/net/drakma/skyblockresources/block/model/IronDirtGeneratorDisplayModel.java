package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.IronDirtGeneratorDisplayItem;

public class IronDirtGeneratorDisplayModel extends GeoModel<IronDirtGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IronDirtGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronDirtGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronDirtGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_dirt.png");
	}
}
