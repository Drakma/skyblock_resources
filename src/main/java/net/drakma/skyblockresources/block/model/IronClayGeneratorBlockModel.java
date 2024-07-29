package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.IronClayGeneratorTileEntity;

public class IronClayGeneratorBlockModel extends GeoModel<IronClayGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IronClayGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronClayGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronClayGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_clay.png");
	}
}
