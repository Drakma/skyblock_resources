package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneGravelGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.StoneGravelGeneratorDisplayItem;

public class StoneGravelGeneratorDisplayItemRenderer extends GeoItemRenderer<StoneGravelGeneratorDisplayItem> {
	public StoneGravelGeneratorDisplayItemRenderer() {
		super(new StoneGravelGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(StoneGravelGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
