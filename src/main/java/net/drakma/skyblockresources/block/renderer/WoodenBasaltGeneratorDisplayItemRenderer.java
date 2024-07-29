package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenBasaltGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.WoodenBasaltGeneratorDisplayItem;

public class WoodenBasaltGeneratorDisplayItemRenderer extends GeoItemRenderer<WoodenBasaltGeneratorDisplayItem> {
	public WoodenBasaltGeneratorDisplayItemRenderer() {
		super(new WoodenBasaltGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(WoodenBasaltGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
