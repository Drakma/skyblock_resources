package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronTuffGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.IronTuffGeneratorDisplayItem;

public class IronTuffGeneratorDisplayItemRenderer extends GeoItemRenderer<IronTuffGeneratorDisplayItem> {
	public IronTuffGeneratorDisplayItemRenderer() {
		super(new IronTuffGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(IronTuffGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
