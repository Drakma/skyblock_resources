package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.StoneSandGeneratorDisplayItem;

public class StoneSandGeneratorDisplayModel extends GeoModel<StoneSandGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StoneSandGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneSandGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneSandGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_sand.png");
	}
}
