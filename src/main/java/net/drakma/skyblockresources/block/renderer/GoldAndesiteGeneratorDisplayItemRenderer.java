package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldAndesiteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.GoldAndesiteGeneratorDisplayItem;

public class GoldAndesiteGeneratorDisplayItemRenderer extends GeoItemRenderer<GoldAndesiteGeneratorDisplayItem> {
	public GoldAndesiteGeneratorDisplayItemRenderer() {
		super(new GoldAndesiteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(GoldAndesiteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
