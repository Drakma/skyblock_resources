package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.GoldSoulsandGeneratorTileEntity;

public class GoldSoulsandGeneratorBlockModel extends GeoModel<GoldSoulsandGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldSoulsandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldSoulsandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldSoulsandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_soulsand.png");
	}
}
