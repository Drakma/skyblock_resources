package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.GoldGravelGeneratorTileEntity;

public class GoldGravelGeneratorBlockModel extends GeoModel<GoldGravelGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldGravelGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldGravelGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldGravelGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_gravel.png");
	}
}
