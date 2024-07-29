package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.IronCobblestoneGeneratorDisplayItem;

public class IronCobblestoneGeneratorDisplayModel extends GeoModel<IronCobblestoneGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IronCobblestoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronCobblestoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronCobblestoneGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_cobblestone.png");
	}
}
