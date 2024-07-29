package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronDripstoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.IronDripstoneGeneratorDisplayItem;

public class IronDripstoneGeneratorDisplayItemRenderer extends GeoItemRenderer<IronDripstoneGeneratorDisplayItem> {
	public IronDripstoneGeneratorDisplayItemRenderer() {
		super(new IronDripstoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(IronDripstoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
