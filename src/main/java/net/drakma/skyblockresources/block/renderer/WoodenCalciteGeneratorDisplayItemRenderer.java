package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenCalciteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.WoodenCalciteGeneratorDisplayItem;

public class WoodenCalciteGeneratorDisplayItemRenderer extends GeoItemRenderer<WoodenCalciteGeneratorDisplayItem> {
	public WoodenCalciteGeneratorDisplayItemRenderer() {
		super(new WoodenCalciteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(WoodenCalciteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
