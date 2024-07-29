package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.GoldEmptyGeneratorTileEntity;

public class GoldEmptyGeneratorBlockModel extends GeoModel<GoldEmptyGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldEmptyGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing_empty.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldEmptyGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing_empty.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldEmptyGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_empty.png");
	}
}
