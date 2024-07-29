package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneDustGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.StoneDustGeneratorTileEntity;

public class StoneDustGeneratorTileRenderer extends GeoBlockRenderer<StoneDustGeneratorTileEntity> {
	public StoneDustGeneratorTileRenderer() {
		super(new StoneDustGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(StoneDustGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
