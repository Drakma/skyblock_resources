package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.DiamondCobblestoneGeneratorTileEntity;

public class DiamondCobblestoneGeneratorBlockModel extends GeoModel<DiamondCobblestoneGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DiamondCobblestoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DiamondCobblestoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DiamondCobblestoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/diamond_cobblestone.png");
	}
}
