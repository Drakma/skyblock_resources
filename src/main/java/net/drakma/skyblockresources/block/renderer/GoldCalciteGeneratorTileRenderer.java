package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldCalciteGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.GoldCalciteGeneratorTileEntity;

public class GoldCalciteGeneratorTileRenderer extends GeoBlockRenderer<GoldCalciteGeneratorTileEntity> {
	public GoldCalciteGeneratorTileRenderer() {
		super(new GoldCalciteGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(GoldCalciteGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
