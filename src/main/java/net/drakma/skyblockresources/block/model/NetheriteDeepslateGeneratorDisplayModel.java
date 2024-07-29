package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.display.NetheriteDeepslateGeneratorDisplayItem;

public class NetheriteDeepslateGeneratorDisplayModel extends GeoModel<NetheriteDeepslateGeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NetheriteDeepslateGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NetheriteDeepslateGeneratorDisplayItem animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NetheriteDeepslateGeneratorDisplayItem entity) {
		return new ResourceLocation("skyblock_resources", "textures/block/netherite_deepslate.png");
	}
}
