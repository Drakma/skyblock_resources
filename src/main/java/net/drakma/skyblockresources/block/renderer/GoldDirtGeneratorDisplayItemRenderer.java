package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldDirtGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.GoldDirtGeneratorDisplayItem;

public class GoldDirtGeneratorDisplayItemRenderer extends GeoItemRenderer<GoldDirtGeneratorDisplayItem> {
	public GoldDirtGeneratorDisplayItemRenderer() {
		super(new GoldDirtGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(GoldDirtGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
