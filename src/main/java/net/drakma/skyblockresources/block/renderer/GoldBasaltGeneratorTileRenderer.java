package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldBasaltGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.GoldBasaltGeneratorTileEntity;

public class GoldBasaltGeneratorTileRenderer extends GeoBlockRenderer<GoldBasaltGeneratorTileEntity> {
	public GoldBasaltGeneratorTileRenderer() {
		super(new GoldBasaltGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(GoldBasaltGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
