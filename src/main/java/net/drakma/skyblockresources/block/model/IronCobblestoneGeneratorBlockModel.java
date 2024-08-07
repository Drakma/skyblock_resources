package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.IronCobblestoneGeneratorTileEntity;

public class IronCobblestoneGeneratorBlockModel extends GeoModel<IronCobblestoneGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IronCobblestoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronCobblestoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronCobblestoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_cobblestone.png");
	}
}
