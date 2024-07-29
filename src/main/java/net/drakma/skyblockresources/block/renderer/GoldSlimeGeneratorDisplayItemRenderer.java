package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldSlimeGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.GoldSlimeGeneratorDisplayItem;

public class GoldSlimeGeneratorDisplayItemRenderer extends GeoItemRenderer<GoldSlimeGeneratorDisplayItem> {
	public GoldSlimeGeneratorDisplayItemRenderer() {
		super(new GoldSlimeGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(GoldSlimeGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
