package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.IronEndStoneGeneratorDisplayItem;

public class IronEndStoneGeneratorDisplayModel extends GeoModel<IronEndStoneGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IronEndStoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronEndStoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronEndStoneGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_end_stone.png");
	}
}
