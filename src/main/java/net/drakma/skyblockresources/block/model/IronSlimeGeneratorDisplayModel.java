package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.IronSlimeGeneratorDisplayItem;

public class IronSlimeGeneratorDisplayModel extends GeoModel<IronSlimeGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IronSlimeGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronSlimeGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronSlimeGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_slime.png");
	}
}
