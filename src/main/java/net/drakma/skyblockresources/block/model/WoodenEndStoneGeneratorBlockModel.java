package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.WoodenEndStoneGeneratorTileEntity;

public class WoodenEndStoneGeneratorBlockModel extends GeoModel<WoodenEndStoneGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WoodenEndStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodenEndStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodenEndStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/wooden_end_stone.png");
	}
}
