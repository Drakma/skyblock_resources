package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.GoldSoulsandGeneratorDisplayItem;

public class GoldSoulsandGeneratorDisplayModel extends GeoModel<GoldSoulsandGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldSoulsandGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldSoulsandGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldSoulsandGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_soulsand.png");
	}
}
