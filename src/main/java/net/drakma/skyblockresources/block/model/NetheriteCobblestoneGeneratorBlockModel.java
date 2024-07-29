package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.NetheriteCobblestoneGeneratorTileEntity;

public class NetheriteCobblestoneGeneratorBlockModel extends GeoModel<NetheriteCobblestoneGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NetheriteCobblestoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NetheriteCobblestoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NetheriteCobblestoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/netherite_cobblestone.png");
	}
}
