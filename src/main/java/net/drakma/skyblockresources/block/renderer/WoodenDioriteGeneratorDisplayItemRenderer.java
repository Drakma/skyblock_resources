package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenDioriteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.WoodenDioriteGeneratorDisplayItem;

public class WoodenDioriteGeneratorDisplayItemRenderer extends GeoItemRenderer<WoodenDioriteGeneratorDisplayItem> {
	public WoodenDioriteGeneratorDisplayItemRenderer() {
		super(new WoodenDioriteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(WoodenDioriteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
