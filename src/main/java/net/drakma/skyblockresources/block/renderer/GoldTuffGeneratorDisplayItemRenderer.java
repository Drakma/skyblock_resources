package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldTuffGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.GoldTuffGeneratorDisplayItem;

public class GoldTuffGeneratorDisplayItemRenderer extends GeoItemRenderer<GoldTuffGeneratorDisplayItem> {
	public GoldTuffGeneratorDisplayItemRenderer() {
		super(new GoldTuffGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(GoldTuffGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
