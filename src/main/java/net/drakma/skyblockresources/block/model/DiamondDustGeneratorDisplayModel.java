package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.DiamondDustGeneratorDisplayItem;

public class DiamondDustGeneratorDisplayModel extends GeoModel<DiamondDustGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DiamondDustGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DiamondDustGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DiamondDustGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/diamond_dust.png");
	}
}
