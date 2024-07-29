package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.IronSandGeneratorDisplayItem;

public class IronSandGeneratorDisplayModel extends GeoModel<IronSandGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IronSandGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronSandGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronSandGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_sand.png");
	}
}
