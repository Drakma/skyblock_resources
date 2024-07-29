package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondEndStoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.DiamondEndStoneGeneratorDisplayItem;

public class DiamondEndStoneGeneratorDisplayItemRenderer extends GeoItemRenderer<DiamondEndStoneGeneratorDisplayItem> {
	public DiamondEndStoneGeneratorDisplayItemRenderer() {
		super(new DiamondEndStoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(DiamondEndStoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
