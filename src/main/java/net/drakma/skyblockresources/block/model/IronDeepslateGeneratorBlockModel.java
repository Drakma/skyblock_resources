package net.drakma.skyblockresources.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.drakma.skyblockresources.block.entity.IronDeepslateGeneratorTileEntity;

public class IronDeepslateGeneratorBlockModel extends GeoModel<IronDeepslateGeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IronDeepslateGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "animations/resource_casing.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IronDeepslateGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "geo/resource_casing.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IronDeepslateGeneratorTileEntity animatable) {
		return new ResourceLocation("skyblock_resources", "textures/block/iron_deepslate.png");
	}
}
