package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondCalciteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.DiamondCalciteGeneratorDisplayItem;

public class DiamondCalciteGeneratorDisplayItemRenderer extends GeoItemRenderer<DiamondCalciteGeneratorDisplayItem> {
	public DiamondCalciteGeneratorDisplayItemRenderer() {
		super(new DiamondCalciteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(DiamondCalciteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
