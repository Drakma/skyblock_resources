package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.NetheriteNetherrackGeneratorDisplayItem;

public class NetheriteNetherrackGeneratorDisplayModel extends GeoModel<NetheriteNetherrackGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NetheriteNetherrackGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NetheriteNetherrackGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NetheriteNetherrackGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/netherite_netherrack.png");
	}
}
