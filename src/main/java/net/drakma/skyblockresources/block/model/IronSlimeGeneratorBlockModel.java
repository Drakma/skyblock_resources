package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.IronSlimeGeneratorTileEntity;

public class IronSlimeGeneratorBlockModel extends GeoModel<IronSlimeGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IronSlimeGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronSlimeGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronSlimeGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_slime.png");
	}
}
