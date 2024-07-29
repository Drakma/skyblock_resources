package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.IronDeepslateGeneratorDisplayItem;

public class IronDeepslateGeneratorDisplayModel extends GeoModel<IronDeepslateGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IronDeepslateGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronDeepslateGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronDeepslateGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_deepslate.png");
	}
}
