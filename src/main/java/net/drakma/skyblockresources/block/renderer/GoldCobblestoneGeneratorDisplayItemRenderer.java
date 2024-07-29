package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldCobblestoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.GoldCobblestoneGeneratorDisplayItem;

public class GoldCobblestoneGeneratorDisplayItemRenderer extends GeoItemRenderer<GoldCobblestoneGeneratorDisplayItem> {
	public GoldCobblestoneGeneratorDisplayItemRenderer() {
		super(new GoldCobblestoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(GoldCobblestoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
