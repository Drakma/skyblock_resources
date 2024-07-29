package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.NetheriteDustGeneratorDisplayItem;

public class NetheriteDustGeneratorDisplayModel extends GeoModel<NetheriteDustGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NetheriteDustGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NetheriteDustGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NetheriteDustGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/netherite_dust.png");
	}
}
