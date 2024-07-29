package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.IronNetherrackGeneratorTileEntity;

public class IronNetherrackGeneratorBlockModel extends GeoModel<IronNetherrackGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IronNetherrackGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronNetherrackGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronNetherrackGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_netherrack.png");
	}
}
