package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenGravelGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.WoodenGravelGeneratorDisplayItem;

public class WoodenGravelGeneratorDisplayItemRenderer extends GeoItemRenderer<WoodenGravelGeneratorDisplayItem> {
	public WoodenGravelGeneratorDisplayItemRenderer() {
		super(new WoodenGravelGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(WoodenGravelGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
