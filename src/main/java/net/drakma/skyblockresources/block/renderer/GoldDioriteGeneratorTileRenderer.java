package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldDioriteGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.GoldDioriteGeneratorTileEntity;

public class GoldDioriteGeneratorTileRenderer extends GeoBlockRenderer<GoldDioriteGeneratorTileEntity> {
	public GoldDioriteGeneratorTileRenderer() {
		super(new GoldDioriteGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(GoldDioriteGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
