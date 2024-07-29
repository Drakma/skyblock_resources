package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenSoulsandGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.WoodenSoulsandGeneratorDisplayItem;

public class WoodenSoulsandGeneratorDisplayItemRenderer extends GeoItemRenderer<WoodenSoulsandGeneratorDisplayItem> {
	public WoodenSoulsandGeneratorDisplayItemRenderer() {
		super(new WoodenSoulsandGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(WoodenSoulsandGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
