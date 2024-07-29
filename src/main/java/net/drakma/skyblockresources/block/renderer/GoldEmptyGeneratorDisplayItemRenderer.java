package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldEmptyGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.GoldEmptyGeneratorDisplayItem;

public class GoldEmptyGeneratorDisplayItemRenderer extends GeoItemRenderer<GoldEmptyGeneratorDisplayItem> {
	public GoldEmptyGeneratorDisplayItemRenderer() {
		super(new GoldEmptyGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(GoldEmptyGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
