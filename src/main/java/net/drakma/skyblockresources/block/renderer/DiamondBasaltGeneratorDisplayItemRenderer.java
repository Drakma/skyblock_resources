package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondBasaltGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.DiamondBasaltGeneratorDisplayItem;

public class DiamondBasaltGeneratorDisplayItemRenderer extends GeoItemRenderer<DiamondBasaltGeneratorDisplayItem> {
	public DiamondBasaltGeneratorDisplayItemRenderer() {
		super(new DiamondBasaltGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(DiamondBasaltGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
