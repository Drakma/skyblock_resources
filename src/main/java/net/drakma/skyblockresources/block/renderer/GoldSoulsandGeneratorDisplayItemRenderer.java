package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldSoulsandGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.GoldSoulsandGeneratorDisplayItem;

public class GoldSoulsandGeneratorDisplayItemRenderer extends GeoItemRenderer<GoldSoulsandGeneratorDisplayItem> {
	public GoldSoulsandGeneratorDisplayItemRenderer() {
		super(new GoldSoulsandGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(GoldSoulsandGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
