package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldSkyStoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.GoldSkyStoneGeneratorDisplayItem;

public class GoldSkyStoneGeneratorDisplayItemRenderer extends GeoItemRenderer<GoldSkyStoneGeneratorDisplayItem> {
	public GoldSkyStoneGeneratorDisplayItemRenderer() {
		super(new GoldSkyStoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(GoldSkyStoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
