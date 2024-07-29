package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.StoneDustGeneratorTileEntity;

public class StoneDustGeneratorBlockModel extends GeoModel<StoneDustGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StoneDustGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneDustGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneDustGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_dust.png");
	}
}
