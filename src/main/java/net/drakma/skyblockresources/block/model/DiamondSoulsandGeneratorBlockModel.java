package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.DiamondSoulsandGeneratorTileEntity;

public class DiamondSoulsandGeneratorBlockModel extends GeoModel<DiamondSoulsandGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DiamondSoulsandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DiamondSoulsandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DiamondSoulsandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/diamond_soulsand.png");
	}
}
