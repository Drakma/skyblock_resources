package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.StoneBlackstoneGeneratorTileEntity;

public class StoneBlackstoneGeneratorBlockModel extends GeoModel<StoneBlackstoneGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StoneBlackstoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneBlackstoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneBlackstoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_blackstone.png");
	}
}
