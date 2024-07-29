package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.NetheriteGraniteGeneratorDisplayItem;

public class NetheriteGraniteGeneratorDisplayModel extends GeoModel<NetheriteGraniteGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NetheriteGraniteGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NetheriteGraniteGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NetheriteGraniteGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/netherite_granite.png");
	}
}
