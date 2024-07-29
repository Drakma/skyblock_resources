package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneEndStoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.StoneEndStoneGeneratorDisplayItem;

public class StoneEndStoneGeneratorDisplayItemRenderer extends GeoItemRenderer<StoneEndStoneGeneratorDisplayItem> {
	public StoneEndStoneGeneratorDisplayItemRenderer() {
		super(new StoneEndStoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(StoneEndStoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
