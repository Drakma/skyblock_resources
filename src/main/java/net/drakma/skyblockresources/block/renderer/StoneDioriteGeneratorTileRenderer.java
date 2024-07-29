package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneDioriteGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.StoneDioriteGeneratorTileEntity;

public class StoneDioriteGeneratorTileRenderer extends GeoBlockRenderer<StoneDioriteGeneratorTileEntity> {
	public StoneDioriteGeneratorTileRenderer() {
		super(new StoneDioriteGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(StoneDioriteGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
