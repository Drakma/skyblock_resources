package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.StoneSoulsandGeneratorTileEntity;

public class StoneSoulsandGeneratorBlockModel extends GeoModel<StoneSoulsandGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StoneSoulsandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneSoulsandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneSoulsandGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_soulsand.png");
	}
}
