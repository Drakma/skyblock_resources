package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenCalciteGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.WoodenCalciteGeneratorTileEntity;

public class WoodenCalciteGeneratorTileRenderer extends GeoBlockRenderer<WoodenCalciteGeneratorTileEntity> {
	public WoodenCalciteGeneratorTileRenderer() {
		super(new WoodenCalciteGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(WoodenCalciteGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
