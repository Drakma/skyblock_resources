package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldGraniteGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.GoldGraniteGeneratorTileEntity;

public class GoldGraniteGeneratorTileRenderer extends GeoBlockRenderer<GoldGraniteGeneratorTileEntity> {
	public GoldGraniteGeneratorTileRenderer() {
		super(new GoldGraniteGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(GoldGraniteGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
