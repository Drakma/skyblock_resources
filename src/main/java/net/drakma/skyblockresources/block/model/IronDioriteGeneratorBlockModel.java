package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.IronDioriteGeneratorTileEntity;

public class IronDioriteGeneratorBlockModel extends GeoModel<IronDioriteGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IronDioriteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronDioriteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronDioriteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_diorite.png");
	}
}
