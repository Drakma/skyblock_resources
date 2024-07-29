package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondDirtGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.DiamondDirtGeneratorDisplayItem;

public class DiamondDirtGeneratorDisplayItemRenderer extends GeoItemRenderer<DiamondDirtGeneratorDisplayItem> {
	public DiamondDirtGeneratorDisplayItemRenderer() {
		super(new DiamondDirtGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(DiamondDirtGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
