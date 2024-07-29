package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronBasaltGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.IronBasaltGeneratorDisplayItem;

public class IronBasaltGeneratorDisplayItemRenderer extends GeoItemRenderer<IronBasaltGeneratorDisplayItem> {
	public IronBasaltGeneratorDisplayItemRenderer() {
		super(new IronBasaltGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(IronBasaltGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
