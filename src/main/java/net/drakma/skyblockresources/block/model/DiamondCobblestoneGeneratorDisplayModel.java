package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.DiamondCobblestoneGeneratorDisplayItem;

public class DiamondCobblestoneGeneratorDisplayModel extends GeoModel<DiamondCobblestoneGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DiamondCobblestoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DiamondCobblestoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DiamondCobblestoneGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/diamond_cobblestone.png");
	}
}
