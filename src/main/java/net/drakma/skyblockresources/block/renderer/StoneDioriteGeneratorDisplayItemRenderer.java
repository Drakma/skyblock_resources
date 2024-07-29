package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneDioriteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.StoneDioriteGeneratorDisplayItem;

public class StoneDioriteGeneratorDisplayItemRenderer extends GeoItemRenderer<StoneDioriteGeneratorDisplayItem> {
	public StoneDioriteGeneratorDisplayItemRenderer() {
		super(new StoneDioriteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(StoneDioriteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
