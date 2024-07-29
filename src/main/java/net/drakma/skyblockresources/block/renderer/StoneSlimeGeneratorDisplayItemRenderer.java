package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneSlimeGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.StoneSlimeGeneratorDisplayItem;

public class StoneSlimeGeneratorDisplayItemRenderer extends GeoItemRenderer<StoneSlimeGeneratorDisplayItem> {
	public StoneSlimeGeneratorDisplayItemRenderer() {
		super(new StoneSlimeGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(StoneSlimeGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
