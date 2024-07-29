package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldNetherrackGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.GoldNetherrackGeneratorDisplayItem;

public class GoldNetherrackGeneratorDisplayItemRenderer extends GeoItemRenderer<GoldNetherrackGeneratorDisplayItem> {
	public GoldNetherrackGeneratorDisplayItemRenderer() {
		super(new GoldNetherrackGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(GoldNetherrackGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
