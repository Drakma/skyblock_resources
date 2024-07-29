package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondCobblestoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.DiamondCobblestoneGeneratorDisplayItem;

public class DiamondCobblestoneGeneratorDisplayItemRenderer extends GeoItemRenderer<DiamondCobblestoneGeneratorDisplayItem> {
	public DiamondCobblestoneGeneratorDisplayItemRenderer() {
		super(new DiamondCobblestoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(DiamondCobblestoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
