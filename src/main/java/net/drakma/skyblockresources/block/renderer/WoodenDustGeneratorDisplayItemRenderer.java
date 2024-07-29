package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenDustGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.WoodenDustGeneratorDisplayItem;

public class WoodenDustGeneratorDisplayItemRenderer extends GeoItemRenderer<WoodenDustGeneratorDisplayItem> {
	public WoodenDustGeneratorDisplayItemRenderer() {
		super(new WoodenDustGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(WoodenDustGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
