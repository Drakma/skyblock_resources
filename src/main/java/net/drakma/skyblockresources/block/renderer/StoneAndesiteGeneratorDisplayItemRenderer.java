package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneAndesiteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.StoneAndesiteGeneratorDisplayItem;

public class StoneAndesiteGeneratorDisplayItemRenderer extends GeoItemRenderer<StoneAndesiteGeneratorDisplayItem> {
	public StoneAndesiteGeneratorDisplayItemRenderer() {
		super(new StoneAndesiteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(StoneAndesiteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
