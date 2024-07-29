package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondClayGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.DiamondClayGeneratorDisplayItem;

public class DiamondClayGeneratorDisplayItemRenderer extends GeoItemRenderer<DiamondClayGeneratorDisplayItem> {
	public DiamondClayGeneratorDisplayItemRenderer() {
		super(new DiamondClayGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(DiamondClayGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
