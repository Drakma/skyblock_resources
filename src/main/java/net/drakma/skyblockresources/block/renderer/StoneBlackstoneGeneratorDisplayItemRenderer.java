package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneBlackstoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.StoneBlackstoneGeneratorDisplayItem;

public class StoneBlackstoneGeneratorDisplayItemRenderer extends GeoItemRenderer<StoneBlackstoneGeneratorDisplayItem> {
	public StoneBlackstoneGeneratorDisplayItemRenderer() {
		super(new StoneBlackstoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(StoneBlackstoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
