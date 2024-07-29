package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.StoneSlimeGeneratorTileEntity;

public class StoneSlimeGeneratorBlockModel extends GeoModel<StoneSlimeGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StoneSlimeGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneSlimeGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneSlimeGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_slime.png");
	}
}
