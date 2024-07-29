package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.DiamondSkyStoneGeneratorTileEntity;

public class DiamondSkyStoneGeneratorBlockModel extends GeoModel<DiamondSkyStoneGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DiamondSkyStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DiamondSkyStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DiamondSkyStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/diamond_sky_stone.png");
	}
}
