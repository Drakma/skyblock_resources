package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.NetheriteAndesiteGeneratorTileEntity;

public class NetheriteAndesiteGeneratorBlockModel extends GeoModel<NetheriteAndesiteGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NetheriteAndesiteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NetheriteAndesiteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NetheriteAndesiteGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/netherite_andesite.png");
	}
}
