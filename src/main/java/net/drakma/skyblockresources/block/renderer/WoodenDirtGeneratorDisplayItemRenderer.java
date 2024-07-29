package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenDirtGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.WoodenDirtGeneratorDisplayItem;

public class WoodenDirtGeneratorDisplayItemRenderer extends GeoItemRenderer<WoodenDirtGeneratorDisplayItem> {
	public WoodenDirtGeneratorDisplayItemRenderer() {
		super(new WoodenDirtGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(WoodenDirtGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
