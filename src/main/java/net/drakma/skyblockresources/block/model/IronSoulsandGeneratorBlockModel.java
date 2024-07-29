package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.IronSoulsandGeneratorTileEntity;

public class IronSoulsandGeneratorBlockModel extends GeoModel<IronSoulsandGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IronSoulsandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronSoulsandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronSoulsandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_soulsand.png");
	}
}
