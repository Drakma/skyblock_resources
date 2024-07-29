package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldDioriteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.GoldDioriteGeneratorDisplayItem;

public class GoldDioriteGeneratorDisplayItemRenderer extends GeoItemRenderer<GoldDioriteGeneratorDisplayItem> {
	public GoldDioriteGeneratorDisplayItemRenderer() {
		super(new GoldDioriteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(GoldDioriteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
