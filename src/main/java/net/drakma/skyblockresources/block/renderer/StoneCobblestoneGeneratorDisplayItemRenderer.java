package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneCobblestoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.StoneCobblestoneGeneratorDisplayItem;

public class StoneCobblestoneGeneratorDisplayItemRenderer extends GeoItemRenderer<StoneCobblestoneGeneratorDisplayItem> {
	public StoneCobblestoneGeneratorDisplayItemRenderer() {
		super(new StoneCobblestoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(StoneCobblestoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
