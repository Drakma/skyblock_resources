package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.WoodenSandGeneratorTileEntity;

public class WoodenSandGeneratorBlockModel extends GeoModel<WoodenSandGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WoodenSandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodenSandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodenSandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/wooden_sand.png");
	}
}
