package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.IronDripstoneGeneratorTileEntity;

public class IronDripstoneGeneratorBlockModel extends GeoModel<IronDripstoneGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IronDripstoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronDripstoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronDripstoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_dripstone.png");
	}
}
