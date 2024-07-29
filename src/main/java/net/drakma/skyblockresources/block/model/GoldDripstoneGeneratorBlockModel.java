package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.GoldDripstoneGeneratorTileEntity;

public class GoldDripstoneGeneratorBlockModel extends GeoModel<GoldDripstoneGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldDripstoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldDripstoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldDripstoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_dripstone.png");
	}
}
