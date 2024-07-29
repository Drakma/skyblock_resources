package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenSlimeGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.WoodenSlimeGeneratorDisplayItem;

public class WoodenSlimeGeneratorDisplayItemRenderer extends GeoItemRenderer<WoodenSlimeGeneratorDisplayItem> {
	public WoodenSlimeGeneratorDisplayItemRenderer() {
		super(new WoodenSlimeGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(WoodenSlimeGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
