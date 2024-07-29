package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenGraniteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.WoodenGraniteGeneratorDisplayItem;

public class WoodenGraniteGeneratorDisplayItemRenderer extends GeoItemRenderer<WoodenGraniteGeneratorDisplayItem> {
	public WoodenGraniteGeneratorDisplayItemRenderer() {
		super(new WoodenGraniteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(WoodenGraniteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
