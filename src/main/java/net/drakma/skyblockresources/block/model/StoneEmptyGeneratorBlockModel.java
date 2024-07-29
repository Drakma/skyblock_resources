package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.StoneEmptyGeneratorTileEntity;

public class StoneEmptyGeneratorBlockModel extends GeoModel<StoneEmptyGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StoneEmptyGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing_empty.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneEmptyGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing_empty.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneEmptyGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_empty.png");
	}
}
