package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneDeepslateGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.StoneDeepslateGeneratorDisplayItem;

public class StoneDeepslateGeneratorDisplayItemRenderer extends GeoItemRenderer<StoneDeepslateGeneratorDisplayItem> {
	public StoneDeepslateGeneratorDisplayItemRenderer() {
		super(new StoneDeepslateGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(StoneDeepslateGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
