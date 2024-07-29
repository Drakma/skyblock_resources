package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldCalciteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.GoldCalciteGeneratorDisplayItem;

public class GoldCalciteGeneratorDisplayItemRenderer extends GeoItemRenderer<GoldCalciteGeneratorDisplayItem> {
	public GoldCalciteGeneratorDisplayItemRenderer() {
		super(new GoldCalciteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(GoldCalciteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
