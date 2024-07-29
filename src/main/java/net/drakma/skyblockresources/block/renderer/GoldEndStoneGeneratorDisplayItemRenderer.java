package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldEndStoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.GoldEndStoneGeneratorDisplayItem;

public class GoldEndStoneGeneratorDisplayItemRenderer extends GeoItemRenderer<GoldEndStoneGeneratorDisplayItem> {
	public GoldEndStoneGeneratorDisplayItemRenderer() {
		super(new GoldEndStoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(GoldEndStoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
