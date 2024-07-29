package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenAndesiteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.WoodenAndesiteGeneratorDisplayItem;

public class WoodenAndesiteGeneratorDisplayItemRenderer extends GeoItemRenderer<WoodenAndesiteGeneratorDisplayItem> {
	public WoodenAndesiteGeneratorDisplayItemRenderer() {
		super(new WoodenAndesiteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(WoodenAndesiteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
