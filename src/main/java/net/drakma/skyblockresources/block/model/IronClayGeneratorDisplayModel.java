package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.IronClayGeneratorDisplayItem;

public class IronClayGeneratorDisplayModel extends GeoModel<IronClayGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IronClayGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronClayGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronClayGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_clay.png");
	}
}
