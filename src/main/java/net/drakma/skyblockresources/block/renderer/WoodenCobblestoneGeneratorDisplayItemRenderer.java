package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenCobblestoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.WoodenCobblestoneGeneratorDisplayItem;

public class WoodenCobblestoneGeneratorDisplayItemRenderer extends GeoItemRenderer<WoodenCobblestoneGeneratorDisplayItem> {
	public WoodenCobblestoneGeneratorDisplayItemRenderer() {
		super(new WoodenCobblestoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(WoodenCobblestoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
