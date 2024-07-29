package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldSandGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.GoldSandGeneratorDisplayItem;

public class GoldSandGeneratorDisplayItemRenderer extends GeoItemRenderer<GoldSandGeneratorDisplayItem> {
	public GoldSandGeneratorDisplayItemRenderer() {
		super(new GoldSandGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(GoldSandGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
