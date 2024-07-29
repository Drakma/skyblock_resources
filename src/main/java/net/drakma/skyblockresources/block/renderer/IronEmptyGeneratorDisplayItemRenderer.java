package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronEmptyGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.IronEmptyGeneratorDisplayItem;

public class IronEmptyGeneratorDisplayItemRenderer extends GeoItemRenderer<IronEmptyGeneratorDisplayItem> {
	public IronEmptyGeneratorDisplayItemRenderer() {
		super(new IronEmptyGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(IronEmptyGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
