package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldDirtGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.GoldDirtGeneratorTileEntity;

public class GoldDirtGeneratorTileRenderer extends GeoBlockRenderer<GoldDirtGeneratorTileEntity> {
	public GoldDirtGeneratorTileRenderer() {
		super(new GoldDirtGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(GoldDirtGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
