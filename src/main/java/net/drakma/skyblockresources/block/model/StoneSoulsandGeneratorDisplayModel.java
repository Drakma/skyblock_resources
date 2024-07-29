package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.StoneSoulsandGeneratorDisplayItem;

public class StoneSoulsandGeneratorDisplayModel extends GeoModel<StoneSoulsandGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StoneSoulsandGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneSoulsandGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneSoulsandGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_soulsand.png");
	}
}
