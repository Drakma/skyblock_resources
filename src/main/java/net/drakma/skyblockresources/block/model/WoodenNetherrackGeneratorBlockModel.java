package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.WoodenNetherrackGeneratorTileEntity;

public class WoodenNetherrackGeneratorBlockModel extends GeoModel<WoodenNetherrackGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WoodenNetherrackGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodenNetherrackGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodenNetherrackGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/wooden_netherrack.png");
	}
}
