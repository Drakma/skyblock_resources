package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.IronGravelGeneratorTileEntity;

public class IronGravelGeneratorBlockModel extends GeoModel<IronGravelGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IronGravelGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronGravelGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronGravelGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_gravel.png");
	}
}
