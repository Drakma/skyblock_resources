package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.StoneDioriteGeneratorTileEntity;

public class StoneDioriteGeneratorBlockModel extends GeoModel<StoneDioriteGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StoneDioriteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneDioriteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneDioriteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_diorite.png");
	}
}
