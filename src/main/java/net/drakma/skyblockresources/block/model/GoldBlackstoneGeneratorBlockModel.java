package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.GoldBlackstoneGeneratorTileEntity;

public class GoldBlackstoneGeneratorBlockModel extends GeoModel<GoldBlackstoneGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldBlackstoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldBlackstoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldBlackstoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_blackstone.png");
	}
}
