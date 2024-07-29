package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneDirtGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.StoneDirtGeneratorTileEntity;

public class StoneDirtGeneratorTileRenderer extends GeoBlockRenderer<StoneDirtGeneratorTileEntity> {
	public StoneDirtGeneratorTileRenderer() {
		super(new StoneDirtGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(StoneDirtGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
