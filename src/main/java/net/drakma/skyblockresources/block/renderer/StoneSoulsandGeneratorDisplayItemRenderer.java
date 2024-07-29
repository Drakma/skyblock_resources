package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneSoulsandGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.StoneSoulsandGeneratorDisplayItem;

public class StoneSoulsandGeneratorDisplayItemRenderer extends GeoItemRenderer<StoneSoulsandGeneratorDisplayItem> {
	public StoneSoulsandGeneratorDisplayItemRenderer() {
		super(new StoneSoulsandGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(StoneSoulsandGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
