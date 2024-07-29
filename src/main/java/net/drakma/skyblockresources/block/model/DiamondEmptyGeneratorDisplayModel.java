package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.DiamondEmptyGeneratorDisplayItem;

public class DiamondEmptyGeneratorDisplayModel extends GeoModel<DiamondEmptyGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DiamondEmptyGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing_empty.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DiamondEmptyGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing_empty.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DiamondEmptyGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/diamond_empty.png");
	}
}
