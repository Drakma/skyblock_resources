package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldGravelGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.GoldGravelGeneratorDisplayItem;

public class GoldGravelGeneratorDisplayItemRenderer extends GeoItemRenderer<GoldGravelGeneratorDisplayItem> {
	public GoldGravelGeneratorDisplayItemRenderer() {
		super(new GoldGravelGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(GoldGravelGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
