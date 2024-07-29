package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondSkyStoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.DiamondSkyStoneGeneratorDisplayItem;

public class DiamondSkyStoneGeneratorDisplayItemRenderer extends GeoItemRenderer<DiamondSkyStoneGeneratorDisplayItem> {
	public DiamondSkyStoneGeneratorDisplayItemRenderer() {
		super(new DiamondSkyStoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(DiamondSkyStoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
