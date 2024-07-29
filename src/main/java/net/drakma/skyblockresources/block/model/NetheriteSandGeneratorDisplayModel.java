package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.NetheriteSandGeneratorDisplayItem;

public class NetheriteSandGeneratorDisplayModel extends GeoModel<NetheriteSandGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NetheriteSandGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NetheriteSandGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NetheriteSandGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/netherite_sand.png");
	}
}
