package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenEmptyGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.WoodenEmptyGeneratorTileEntity;

public class WoodenEmptyGeneratorTileRenderer extends GeoBlockRenderer<WoodenEmptyGeneratorTileEntity> {
	public WoodenEmptyGeneratorTileRenderer() {
		super(new WoodenEmptyGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(WoodenEmptyGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
