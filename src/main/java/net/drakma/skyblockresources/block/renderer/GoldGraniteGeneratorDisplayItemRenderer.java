package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldGraniteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.GoldGraniteGeneratorDisplayItem;

public class GoldGraniteGeneratorDisplayItemRenderer extends GeoItemRenderer<GoldGraniteGeneratorDisplayItem> {
	public GoldGraniteGeneratorDisplayItemRenderer() {
		super(new GoldGraniteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(GoldGraniteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
