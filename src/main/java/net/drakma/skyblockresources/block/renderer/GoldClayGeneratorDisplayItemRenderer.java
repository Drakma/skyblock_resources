package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldClayGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.GoldClayGeneratorDisplayItem;

public class GoldClayGeneratorDisplayItemRenderer extends GeoItemRenderer<GoldClayGeneratorDisplayItem> {
	public GoldClayGeneratorDisplayItemRenderer() {
		super(new GoldClayGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(GoldClayGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
