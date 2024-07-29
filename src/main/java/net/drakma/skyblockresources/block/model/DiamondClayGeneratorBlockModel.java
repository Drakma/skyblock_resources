package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.DiamondClayGeneratorTileEntity;

public class DiamondClayGeneratorBlockModel extends GeoModel<DiamondClayGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DiamondClayGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DiamondClayGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DiamondClayGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/diamond_clay.png");
	}
}
