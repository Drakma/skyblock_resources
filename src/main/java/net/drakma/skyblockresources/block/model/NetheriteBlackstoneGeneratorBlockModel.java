package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.NetheriteBlackstoneGeneratorTileEntity;

public class NetheriteBlackstoneGeneratorBlockModel extends GeoModel<NetheriteBlackstoneGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NetheriteBlackstoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NetheriteBlackstoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NetheriteBlackstoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/netherite_blackstone.png");
	}
}
