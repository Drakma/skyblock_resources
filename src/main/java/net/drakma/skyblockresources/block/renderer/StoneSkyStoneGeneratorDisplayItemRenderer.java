package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneSkyStoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.StoneSkyStoneGeneratorDisplayItem;

public class StoneSkyStoneGeneratorDisplayItemRenderer extends GeoItemRenderer<StoneSkyStoneGeneratorDisplayItem> {
	public StoneSkyStoneGeneratorDisplayItemRenderer() {
		super(new StoneSkyStoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(StoneSkyStoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
