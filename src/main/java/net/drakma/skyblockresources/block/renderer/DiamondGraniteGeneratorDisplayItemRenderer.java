package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondGraniteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.DiamondGraniteGeneratorDisplayItem;

public class DiamondGraniteGeneratorDisplayItemRenderer extends GeoItemRenderer<DiamondGraniteGeneratorDisplayItem> {
	public DiamondGraniteGeneratorDisplayItemRenderer() {
		super(new DiamondGraniteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(DiamondGraniteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
