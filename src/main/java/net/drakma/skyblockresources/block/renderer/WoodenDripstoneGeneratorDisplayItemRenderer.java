package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenDripstoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.WoodenDripstoneGeneratorDisplayItem;

public class WoodenDripstoneGeneratorDisplayItemRenderer extends GeoItemRenderer<WoodenDripstoneGeneratorDisplayItem> {
	public WoodenDripstoneGeneratorDisplayItemRenderer() {
		super(new WoodenDripstoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(WoodenDripstoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
