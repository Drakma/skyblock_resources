package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.GoldDioriteGeneratorTileEntity;

public class GoldDioriteGeneratorBlockModel extends GeoModel<GoldDioriteGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldDioriteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldDioriteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldDioriteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_diorite.png");
	}
}
