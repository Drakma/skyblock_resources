package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronClayGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.IronClayGeneratorDisplayItem;

public class IronClayGeneratorDisplayItemRenderer extends GeoItemRenderer<IronClayGeneratorDisplayItem> {
	public IronClayGeneratorDisplayItemRenderer() {
		super(new IronClayGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(IronClayGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
