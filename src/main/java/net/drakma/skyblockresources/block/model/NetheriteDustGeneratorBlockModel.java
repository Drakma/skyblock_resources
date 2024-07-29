package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.NetheriteDustGeneratorTileEntity;

public class NetheriteDustGeneratorBlockModel extends GeoModel<NetheriteDustGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NetheriteDustGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NetheriteDustGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NetheriteDustGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/netherite_dust.png");
	}
}
