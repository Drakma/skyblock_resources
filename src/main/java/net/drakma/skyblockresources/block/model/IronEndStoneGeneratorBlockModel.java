package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.IronEndStoneGeneratorTileEntity;

public class IronEndStoneGeneratorBlockModel extends GeoModel<IronEndStoneGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IronEndStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronEndStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronEndStoneGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_end_stone.png");
	}
}
