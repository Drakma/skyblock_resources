package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.StoneSkyStoneGeneratorTileEntity;

public class StoneSkyStoneGeneratorBlockModel extends GeoModel<StoneSkyStoneGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StoneSkyStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneSkyStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneSkyStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_sky_stone.png");
	}
}
