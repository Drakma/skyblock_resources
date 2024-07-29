package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.GoldSandGeneratorTileEntity;

public class GoldSandGeneratorBlockModel extends GeoModel<GoldSandGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldSandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldSandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldSandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_sand.png");
	}
}
