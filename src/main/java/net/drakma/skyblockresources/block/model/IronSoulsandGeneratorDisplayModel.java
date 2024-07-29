package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.IronSoulsandGeneratorDisplayItem;

public class IronSoulsandGeneratorDisplayModel extends GeoModel<IronSoulsandGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IronSoulsandGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronSoulsandGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronSoulsandGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_soulsand.png");
	}
}
