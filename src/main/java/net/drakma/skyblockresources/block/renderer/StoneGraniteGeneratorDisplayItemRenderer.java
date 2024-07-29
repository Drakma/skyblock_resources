package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneGraniteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.StoneGraniteGeneratorDisplayItem;

public class StoneGraniteGeneratorDisplayItemRenderer extends GeoItemRenderer<StoneGraniteGeneratorDisplayItem> {
	public StoneGraniteGeneratorDisplayItemRenderer() {
		super(new StoneGraniteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(StoneGraniteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
