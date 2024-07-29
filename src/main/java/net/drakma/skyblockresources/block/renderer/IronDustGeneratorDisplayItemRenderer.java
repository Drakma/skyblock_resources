package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronDustGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.IronDustGeneratorDisplayItem;

public class IronDustGeneratorDisplayItemRenderer extends GeoItemRenderer<IronDustGeneratorDisplayItem> {
	public IronDustGeneratorDisplayItemRenderer() {
		super(new IronDustGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(IronDustGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
