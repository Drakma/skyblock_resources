package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.StoneCalciteGeneratorDisplayItem;

public class StoneCalciteGeneratorDisplayModel extends GeoModel<StoneCalciteGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StoneCalciteGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneCalciteGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneCalciteGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_calcite.png");
	}
}
