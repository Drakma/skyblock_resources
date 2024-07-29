package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.NetheriteCobblestoneGeneratorDisplayItem;

public class NetheriteCobblestoneGeneratorDisplayModel extends GeoModel<NetheriteCobblestoneGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NetheriteCobblestoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NetheriteCobblestoneGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NetheriteCobblestoneGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/netherite_cobblestone.png");
	}
}
