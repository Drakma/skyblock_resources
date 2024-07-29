package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.IronSandGeneratorTileEntity;

public class IronSandGeneratorBlockModel extends GeoModel<IronSandGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IronSandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronSandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronSandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_sand.png");
	}
}
