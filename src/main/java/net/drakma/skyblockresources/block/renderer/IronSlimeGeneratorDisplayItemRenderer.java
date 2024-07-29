package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronSlimeGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.IronSlimeGeneratorDisplayItem;

public class IronSlimeGeneratorDisplayItemRenderer extends GeoItemRenderer<IronSlimeGeneratorDisplayItem> {
	public IronSlimeGeneratorDisplayItemRenderer() {
		super(new IronSlimeGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(IronSlimeGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
