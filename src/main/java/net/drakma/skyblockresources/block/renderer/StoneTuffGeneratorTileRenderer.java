package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneTuffGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.StoneTuffGeneratorTileEntity;

public class StoneTuffGeneratorTileRenderer extends GeoBlockRenderer<StoneTuffGeneratorTileEntity> {
	public StoneTuffGeneratorTileRenderer() {
		super(new StoneTuffGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(StoneTuffGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
