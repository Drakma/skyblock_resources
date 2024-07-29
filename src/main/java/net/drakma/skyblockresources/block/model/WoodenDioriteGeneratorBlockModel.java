package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.WoodenDioriteGeneratorTileEntity;

public class WoodenDioriteGeneratorBlockModel extends GeoModel<WoodenDioriteGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WoodenDioriteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodenDioriteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodenDioriteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/wooden_diorite.png");
	}
}
