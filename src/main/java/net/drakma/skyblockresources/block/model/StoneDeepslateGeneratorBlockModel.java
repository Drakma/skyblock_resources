package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.StoneDeepslateGeneratorTileEntity;

public class StoneDeepslateGeneratorBlockModel extends GeoModel<StoneDeepslateGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StoneDeepslateGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneDeepslateGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneDeepslateGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/stone_deepslate.png");
	}
}
