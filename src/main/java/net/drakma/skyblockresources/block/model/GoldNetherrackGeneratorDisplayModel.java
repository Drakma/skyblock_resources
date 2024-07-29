package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.GoldNetherrackGeneratorDisplayItem;

public class GoldNetherrackGeneratorDisplayModel extends GeoModel<GoldNetherrackGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldNetherrackGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldNetherrackGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldNetherrackGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_netherrack.png");
	}
}
