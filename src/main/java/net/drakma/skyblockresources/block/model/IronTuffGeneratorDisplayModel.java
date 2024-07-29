package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.IronTuffGeneratorDisplayItem;

public class IronTuffGeneratorDisplayModel extends GeoModel<IronTuffGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IronTuffGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronTuffGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronTuffGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_tuff.png");
	}
}
