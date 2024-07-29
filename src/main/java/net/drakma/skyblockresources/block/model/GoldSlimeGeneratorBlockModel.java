package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.GoldSlimeGeneratorTileEntity;

public class GoldSlimeGeneratorBlockModel extends GeoModel<GoldSlimeGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldSlimeGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldSlimeGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldSlimeGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_slime.png");
	}
}
