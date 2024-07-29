package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldBasaltGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.GoldBasaltGeneratorDisplayItem;

public class GoldBasaltGeneratorDisplayItemRenderer extends GeoItemRenderer<GoldBasaltGeneratorDisplayItem> {
	public GoldBasaltGeneratorDisplayItemRenderer() {
		super(new GoldBasaltGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(GoldBasaltGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
