package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.IronTuffGeneratorTileEntity;

public class IronTuffGeneratorBlockModel extends GeoModel<IronTuffGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IronTuffGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronTuffGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronTuffGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_tuff.png");
	}
}
