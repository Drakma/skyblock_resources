package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.StoneNetherrackGeneratorDisplayItem;

public class StoneNetherrackGeneratorDisplayModel extends GeoModel<StoneNetherrackGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StoneNetherrackGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneNetherrackGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneNetherrackGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_netherrack.png");
	}
}
