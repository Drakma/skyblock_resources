package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.DiamondEmptyGeneratorTileEntity;

public class DiamondEmptyGeneratorBlockModel extends GeoModel<DiamondEmptyGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DiamondEmptyGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing_empty.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DiamondEmptyGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing_empty.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DiamondEmptyGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/diamond_empty.png");
	}
}
