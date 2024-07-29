package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.NetheriteSkyStoneGeneratorTileEntity;

public class NetheriteSkyStoneGeneratorBlockModel extends GeoModel<NetheriteSkyStoneGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NetheriteSkyStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NetheriteSkyStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NetheriteSkyStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/netherite_sky_stone.png");
	}
}
