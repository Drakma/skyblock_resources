package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.NetheriteSkyStoneGeneratorDisplayItem;

public class NetheriteSkyStoneGeneratorDisplayModel extends GeoModel<NetheriteSkyStoneGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NetheriteSkyStoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NetheriteSkyStoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NetheriteSkyStoneGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/netherite_sky_stone.png");
	}
}
