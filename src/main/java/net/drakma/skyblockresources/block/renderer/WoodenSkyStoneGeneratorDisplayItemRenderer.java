package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenSkyStoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.WoodenSkyStoneGeneratorDisplayItem;

public class WoodenSkyStoneGeneratorDisplayItemRenderer extends GeoItemRenderer<WoodenSkyStoneGeneratorDisplayItem> {
	public WoodenSkyStoneGeneratorDisplayItemRenderer() {
		super(new WoodenSkyStoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(WoodenSkyStoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
