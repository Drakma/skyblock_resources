package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneBasaltGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.StoneBasaltGeneratorDisplayItem;

public class StoneBasaltGeneratorDisplayItemRenderer extends GeoItemRenderer<StoneBasaltGeneratorDisplayItem> {
	public StoneBasaltGeneratorDisplayItemRenderer() {
		super(new StoneBasaltGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(StoneBasaltGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
