package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenBlackstoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.WoodenBlackstoneGeneratorDisplayItem;

public class WoodenBlackstoneGeneratorDisplayItemRenderer extends GeoItemRenderer<WoodenBlackstoneGeneratorDisplayItem> {
	public WoodenBlackstoneGeneratorDisplayItemRenderer() {
		super(new WoodenBlackstoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(WoodenBlackstoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
