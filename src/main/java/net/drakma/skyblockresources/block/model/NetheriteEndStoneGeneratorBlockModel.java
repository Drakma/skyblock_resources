package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.NetheriteEndStoneGeneratorTileEntity;

public class NetheriteEndStoneGeneratorBlockModel extends GeoModel<NetheriteEndStoneGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NetheriteEndStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NetheriteEndStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NetheriteEndStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/netherite_end_stone.png");
	}
}
