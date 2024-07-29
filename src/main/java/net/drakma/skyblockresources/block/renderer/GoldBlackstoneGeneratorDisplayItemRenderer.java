package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldBlackstoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.GoldBlackstoneGeneratorDisplayItem;

public class GoldBlackstoneGeneratorDisplayItemRenderer extends GeoItemRenderer<GoldBlackstoneGeneratorDisplayItem> {
	public GoldBlackstoneGeneratorDisplayItemRenderer() {
		super(new GoldBlackstoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(GoldBlackstoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
