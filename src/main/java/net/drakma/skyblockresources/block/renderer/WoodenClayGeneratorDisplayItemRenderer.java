package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenClayGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.WoodenClayGeneratorDisplayItem;

public class WoodenClayGeneratorDisplayItemRenderer extends GeoItemRenderer<WoodenClayGeneratorDisplayItem> {
	public WoodenClayGeneratorDisplayItemRenderer() {
		super(new WoodenClayGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(WoodenClayGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
