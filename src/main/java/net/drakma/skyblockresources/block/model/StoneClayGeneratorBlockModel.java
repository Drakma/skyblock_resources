package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.StoneClayGeneratorTileEntity;

public class StoneClayGeneratorBlockModel extends GeoModel<StoneClayGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StoneClayGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneClayGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneClayGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_clay.png");
	}
}
