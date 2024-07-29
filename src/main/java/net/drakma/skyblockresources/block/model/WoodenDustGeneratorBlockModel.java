package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.WoodenDustGeneratorTileEntity;

public class WoodenDustGeneratorBlockModel extends GeoModel<WoodenDustGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WoodenDustGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodenDustGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodenDustGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/wooden_dust.png");
	}
}
