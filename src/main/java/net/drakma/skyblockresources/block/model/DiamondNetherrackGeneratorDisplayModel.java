package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.DiamondNetherrackGeneratorDisplayItem;

public class DiamondNetherrackGeneratorDisplayModel extends GeoModel<DiamondNetherrackGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DiamondNetherrackGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DiamondNetherrackGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DiamondNetherrackGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/diamond_netherrack.png");
	}
}
