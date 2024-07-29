package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.IronBasaltGeneratorTileEntity;

public class IronBasaltGeneratorBlockModel extends GeoModel<IronBasaltGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IronBasaltGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronBasaltGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronBasaltGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_basalt.png");
	}
}
