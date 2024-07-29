package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldTuffGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.GoldTuffGeneratorTileEntity;

public class GoldTuffGeneratorTileRenderer extends GeoBlockRenderer<GoldTuffGeneratorTileEntity> {
	public GoldTuffGeneratorTileRenderer() {
		super(new GoldTuffGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(GoldTuffGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
