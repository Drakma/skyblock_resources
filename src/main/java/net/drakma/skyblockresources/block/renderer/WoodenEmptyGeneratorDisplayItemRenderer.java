package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenEmptyGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.WoodenEmptyGeneratorDisplayItem;

public class WoodenEmptyGeneratorDisplayItemRenderer extends GeoItemRenderer<WoodenEmptyGeneratorDisplayItem> {
	public WoodenEmptyGeneratorDisplayItemRenderer() {
		super(new WoodenEmptyGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(WoodenEmptyGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
