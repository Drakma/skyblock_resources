package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneEmptyGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.StoneEmptyGeneratorDisplayItem;

public class StoneEmptyGeneratorDisplayItemRenderer extends GeoItemRenderer<StoneEmptyGeneratorDisplayItem> {
	public StoneEmptyGeneratorDisplayItemRenderer() {
		super(new StoneEmptyGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(StoneEmptyGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
