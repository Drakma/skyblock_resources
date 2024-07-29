package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneCalciteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.StoneCalciteGeneratorDisplayItem;

public class StoneCalciteGeneratorDisplayItemRenderer extends GeoItemRenderer<StoneCalciteGeneratorDisplayItem> {
	public StoneCalciteGeneratorDisplayItemRenderer() {
		super(new StoneCalciteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(StoneCalciteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
