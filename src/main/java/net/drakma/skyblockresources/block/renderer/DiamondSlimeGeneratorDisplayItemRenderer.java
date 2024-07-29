package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondSlimeGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.DiamondSlimeGeneratorDisplayItem;

public class DiamondSlimeGeneratorDisplayItemRenderer extends GeoItemRenderer<DiamondSlimeGeneratorDisplayItem> {
	public DiamondSlimeGeneratorDisplayItemRenderer() {
		super(new DiamondSlimeGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(DiamondSlimeGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
