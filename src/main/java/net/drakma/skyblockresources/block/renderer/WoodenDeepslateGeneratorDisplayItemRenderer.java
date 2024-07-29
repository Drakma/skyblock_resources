package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenDeepslateGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.WoodenDeepslateGeneratorDisplayItem;

public class WoodenDeepslateGeneratorDisplayItemRenderer extends GeoItemRenderer<WoodenDeepslateGeneratorDisplayItem> {
	public WoodenDeepslateGeneratorDisplayItemRenderer() {
		super(new WoodenDeepslateGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(WoodenDeepslateGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
