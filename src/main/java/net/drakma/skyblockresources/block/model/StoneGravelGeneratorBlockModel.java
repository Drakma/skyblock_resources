package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.StoneGravelGeneratorTileEntity;

public class StoneGravelGeneratorBlockModel extends GeoModel<StoneGravelGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StoneGravelGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneGravelGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneGravelGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_gravel.png");
	}
}
