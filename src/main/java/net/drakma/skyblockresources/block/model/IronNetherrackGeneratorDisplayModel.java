package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.IronNetherrackGeneratorDisplayItem;

public class IronNetherrackGeneratorDisplayModel extends GeoModel<IronNetherrackGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IronNetherrackGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronNetherrackGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronNetherrackGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_netherrack.png");
	}
}
