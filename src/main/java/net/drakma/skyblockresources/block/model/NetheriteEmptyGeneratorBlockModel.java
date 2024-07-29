package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.NetheriteEmptyGeneratorTileEntity;

public class NetheriteEmptyGeneratorBlockModel extends GeoModel<NetheriteEmptyGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NetheriteEmptyGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing_empty.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NetheriteEmptyGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing_empty.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NetheriteEmptyGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/netherite_empty.png");
	}
}
