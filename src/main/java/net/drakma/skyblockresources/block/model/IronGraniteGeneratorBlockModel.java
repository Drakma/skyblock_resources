package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.IronGraniteGeneratorTileEntity;

public class IronGraniteGeneratorBlockModel extends GeoModel<IronGraniteGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IronGraniteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronGraniteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronGraniteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_granite.png");
	}
}
