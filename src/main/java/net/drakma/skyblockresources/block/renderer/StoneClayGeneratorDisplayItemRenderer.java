package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneClayGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.StoneClayGeneratorDisplayItem;

public class StoneClayGeneratorDisplayItemRenderer extends GeoItemRenderer<StoneClayGeneratorDisplayItem> {
	public StoneClayGeneratorDisplayItemRenderer() {
		super(new StoneClayGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(StoneClayGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
