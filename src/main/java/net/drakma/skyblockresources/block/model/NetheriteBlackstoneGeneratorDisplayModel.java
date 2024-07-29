package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.NetheriteBlackstoneGeneratorDisplayItem;

public class NetheriteBlackstoneGeneratorDisplayModel extends GeoModel<NetheriteBlackstoneGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NetheriteBlackstoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NetheriteBlackstoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NetheriteBlackstoneGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/netherite_blackstone.png");
	}
}
