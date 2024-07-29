package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.GoldCobblestoneGeneratorTileEntity;

public class GoldCobblestoneGeneratorBlockModel extends GeoModel<GoldCobblestoneGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldCobblestoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldCobblestoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldCobblestoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/gold_cobblestone.png");
	}
}
