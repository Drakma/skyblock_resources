package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronDirtGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.IronDirtGeneratorDisplayItem;

public class IronDirtGeneratorDisplayItemRenderer extends GeoItemRenderer<IronDirtGeneratorDisplayItem> {
	public IronDirtGeneratorDisplayItemRenderer() {
		super(new IronDirtGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(IronDirtGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
