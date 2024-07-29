package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.IronAndesiteGeneratorTileEntity;

public class IronAndesiteGeneratorBlockModel extends GeoModel<IronAndesiteGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IronAndesiteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronAndesiteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronAndesiteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_andesite.png");
	}
}
