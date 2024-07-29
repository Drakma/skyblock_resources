package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.IronCalciteGeneratorDisplayItem;

public class IronCalciteGeneratorDisplayModel extends GeoModel<IronCalciteGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IronCalciteGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronCalciteGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronCalciteGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_calcite.png");
	}
}
