package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronSkyStoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.IronSkyStoneGeneratorDisplayItem;

public class IronSkyStoneGeneratorDisplayItemRenderer extends GeoItemRenderer<IronSkyStoneGeneratorDisplayItem> {
	public IronSkyStoneGeneratorDisplayItemRenderer() {
		super(new IronSkyStoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(IronSkyStoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
