package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondTuffGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.DiamondTuffGeneratorDisplayItem;

public class DiamondTuffGeneratorDisplayItemRenderer extends GeoItemRenderer<DiamondTuffGeneratorDisplayItem> {
	public DiamondTuffGeneratorDisplayItemRenderer() {
		super(new DiamondTuffGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(DiamondTuffGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
