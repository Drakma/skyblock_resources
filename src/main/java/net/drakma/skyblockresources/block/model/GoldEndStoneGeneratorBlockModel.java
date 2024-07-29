package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.GoldEndStoneGeneratorTileEntity;

public class GoldEndStoneGeneratorBlockModel extends GeoModel<GoldEndStoneGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldEndStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldEndStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldEndStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_end_stone.png");
	}
}
