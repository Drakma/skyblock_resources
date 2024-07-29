package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenSandGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.WoodenSandGeneratorDisplayItem;

public class WoodenSandGeneratorDisplayItemRenderer extends GeoItemRenderer<WoodenSandGeneratorDisplayItem> {
	public WoodenSandGeneratorDisplayItemRenderer() {
		super(new WoodenSandGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(WoodenSandGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
