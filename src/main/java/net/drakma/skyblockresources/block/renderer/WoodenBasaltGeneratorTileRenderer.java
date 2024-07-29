package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenBasaltGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.WoodenBasaltGeneratorTileEntity;

public class WoodenBasaltGeneratorTileRenderer extends GeoBlockRenderer<WoodenBasaltGeneratorTileEntity> {
	public WoodenBasaltGeneratorTileRenderer() {
		super(new WoodenBasaltGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(WoodenBasaltGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
