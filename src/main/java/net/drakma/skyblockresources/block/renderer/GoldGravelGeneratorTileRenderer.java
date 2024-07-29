package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldGravelGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.GoldGravelGeneratorTileEntity;

public class GoldGravelGeneratorTileRenderer extends GeoBlockRenderer<GoldGravelGeneratorTileEntity> {
	public GoldGravelGeneratorTileRenderer() {
		super(new GoldGravelGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(GoldGravelGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
