package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.NetheriteNetherrackGeneratorTileEntity;

public class NetheriteNetherrackGeneratorBlockModel extends GeoModel<NetheriteNetherrackGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NetheriteNetherrackGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NetheriteNetherrackGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NetheriteNetherrackGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/netherite_netherrack.png");
	}
}
