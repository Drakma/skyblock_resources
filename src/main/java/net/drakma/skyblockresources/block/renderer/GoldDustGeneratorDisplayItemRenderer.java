package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldDustGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.GoldDustGeneratorDisplayItem;

public class GoldDustGeneratorDisplayItemRenderer extends GeoItemRenderer<GoldDustGeneratorDisplayItem> {
	public GoldDustGeneratorDisplayItemRenderer() {
		super(new GoldDustGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(GoldDustGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
