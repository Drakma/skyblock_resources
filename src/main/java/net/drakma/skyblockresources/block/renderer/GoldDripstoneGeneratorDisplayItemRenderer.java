package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldDripstoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.GoldDripstoneGeneratorDisplayItem;

public class GoldDripstoneGeneratorDisplayItemRenderer extends GeoItemRenderer<GoldDripstoneGeneratorDisplayItem> {
	public GoldDripstoneGeneratorDisplayItemRenderer() {
		super(new GoldDripstoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(GoldDripstoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
