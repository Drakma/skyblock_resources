package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldDeepslateGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.GoldDeepslateGeneratorDisplayItem;

public class GoldDeepslateGeneratorDisplayItemRenderer extends GeoItemRenderer<GoldDeepslateGeneratorDisplayItem> {
	public GoldDeepslateGeneratorDisplayItemRenderer() {
		super(new GoldDeepslateGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(GoldDeepslateGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
