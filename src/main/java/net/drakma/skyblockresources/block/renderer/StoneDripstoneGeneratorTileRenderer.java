package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneDripstoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.StoneDripstoneGeneratorTileEntity;

public class StoneDripstoneGeneratorTileRenderer extends GeoBlockRenderer<StoneDripstoneGeneratorTileEntity> {
	public StoneDripstoneGeneratorTileRenderer() {
		super(new StoneDripstoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(StoneDripstoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
