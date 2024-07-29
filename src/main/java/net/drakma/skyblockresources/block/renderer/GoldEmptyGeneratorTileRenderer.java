package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldEmptyGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.GoldEmptyGeneratorTileEntity;

public class GoldEmptyGeneratorTileRenderer extends GeoBlockRenderer<GoldEmptyGeneratorTileEntity> {
	public GoldEmptyGeneratorTileRenderer() {
		super(new GoldEmptyGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(GoldEmptyGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
