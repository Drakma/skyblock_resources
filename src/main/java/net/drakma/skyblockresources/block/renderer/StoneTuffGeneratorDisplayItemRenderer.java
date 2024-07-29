package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneTuffGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.StoneTuffGeneratorDisplayItem;

public class StoneTuffGeneratorDisplayItemRenderer extends GeoItemRenderer<StoneTuffGeneratorDisplayItem> {
	public StoneTuffGeneratorDisplayItemRenderer() {
		super(new StoneTuffGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(StoneTuffGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
