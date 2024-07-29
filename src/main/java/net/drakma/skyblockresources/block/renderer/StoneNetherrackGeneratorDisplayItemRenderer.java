package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneNetherrackGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.StoneNetherrackGeneratorDisplayItem;

public class StoneNetherrackGeneratorDisplayItemRenderer extends GeoItemRenderer<StoneNetherrackGeneratorDisplayItem> {
	public StoneNetherrackGeneratorDisplayItemRenderer() {
		super(new StoneNetherrackGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(StoneNetherrackGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
