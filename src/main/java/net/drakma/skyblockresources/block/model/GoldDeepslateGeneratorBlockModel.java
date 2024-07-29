package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.GoldDeepslateGeneratorTileEntity;

public class GoldDeepslateGeneratorBlockModel extends GeoModel<GoldDeepslateGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldDeepslateGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldDeepslateGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldDeepslateGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_deepslate.png");
	}
}
