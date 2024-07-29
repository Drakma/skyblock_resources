package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.GoldSkyStoneGeneratorTileEntity;

public class GoldSkyStoneGeneratorBlockModel extends GeoModel<GoldSkyStoneGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldSkyStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldSkyStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldSkyStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_sky_stone.png");
	}
}
