package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneDripstoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.StoneDripstoneGeneratorDisplayItem;

public class StoneDripstoneGeneratorDisplayItemRenderer extends GeoItemRenderer<StoneDripstoneGeneratorDisplayItem> {
	public StoneDripstoneGeneratorDisplayItemRenderer() {
		super(new StoneDripstoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(StoneDripstoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
