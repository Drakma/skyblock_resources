package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.IronBlackstoneGeneratorDisplayItem;

public class IronBlackstoneGeneratorDisplayModel extends GeoModel<IronBlackstoneGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IronBlackstoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronBlackstoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronBlackstoneGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_blackstone.png");
	}
}
