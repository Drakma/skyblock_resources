package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronCalciteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.IronCalciteGeneratorDisplayItem;

public class IronCalciteGeneratorDisplayItemRenderer extends GeoItemRenderer<IronCalciteGeneratorDisplayItem> {
	public IronCalciteGeneratorDisplayItemRenderer() {
		super(new IronCalciteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(IronCalciteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
