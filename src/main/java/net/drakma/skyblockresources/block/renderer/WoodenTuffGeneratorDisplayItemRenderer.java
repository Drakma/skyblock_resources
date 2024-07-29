package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenTuffGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.WoodenTuffGeneratorDisplayItem;

public class WoodenTuffGeneratorDisplayItemRenderer extends GeoItemRenderer<WoodenTuffGeneratorDisplayItem> {
	public WoodenTuffGeneratorDisplayItemRenderer() {
		super(new WoodenTuffGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(WoodenTuffGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
