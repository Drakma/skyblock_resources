package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.StoneSandGeneratorTileEntity;

public class StoneSandGeneratorBlockModel extends GeoModel<StoneSandGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StoneSandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneSandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneSandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_sand.png");
	}
}
