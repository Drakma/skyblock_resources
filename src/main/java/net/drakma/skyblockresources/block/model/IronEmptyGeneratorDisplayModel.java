package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.IronEmptyGeneratorDisplayItem;

public class IronEmptyGeneratorDisplayModel extends GeoModel<IronEmptyGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IronEmptyGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing_empty.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronEmptyGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing_empty.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronEmptyGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_empty.png");
	}
}
