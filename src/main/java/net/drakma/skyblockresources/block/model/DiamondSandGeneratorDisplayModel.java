package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.DiamondSandGeneratorDisplayItem;

public class DiamondSandGeneratorDisplayModel extends GeoModel<DiamondSandGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DiamondSandGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DiamondSandGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DiamondSandGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/diamond_sand.png");
	}
}
