package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondEmptyGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.DiamondEmptyGeneratorDisplayItem;

public class DiamondEmptyGeneratorDisplayItemRenderer extends GeoItemRenderer<DiamondEmptyGeneratorDisplayItem> {
	public DiamondEmptyGeneratorDisplayItemRenderer() {
		super(new DiamondEmptyGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(DiamondEmptyGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
