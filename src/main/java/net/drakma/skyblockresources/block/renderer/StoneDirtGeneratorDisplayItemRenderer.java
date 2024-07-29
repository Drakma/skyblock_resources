package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneDirtGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.StoneDirtGeneratorDisplayItem;

public class StoneDirtGeneratorDisplayItemRenderer extends GeoItemRenderer<StoneDirtGeneratorDisplayItem> {
	public StoneDirtGeneratorDisplayItemRenderer() {
		super(new StoneDirtGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(StoneDirtGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
