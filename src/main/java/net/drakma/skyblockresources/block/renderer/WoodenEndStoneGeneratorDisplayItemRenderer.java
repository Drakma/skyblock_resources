package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenEndStoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.WoodenEndStoneGeneratorDisplayItem;

public class WoodenEndStoneGeneratorDisplayItemRenderer extends GeoItemRenderer<WoodenEndStoneGeneratorDisplayItem> {
	public WoodenEndStoneGeneratorDisplayItemRenderer() {
		super(new WoodenEndStoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(WoodenEndStoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
