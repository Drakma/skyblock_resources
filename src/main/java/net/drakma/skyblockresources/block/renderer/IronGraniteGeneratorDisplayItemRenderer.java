package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronGraniteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.IronGraniteGeneratorDisplayItem;

public class IronGraniteGeneratorDisplayItemRenderer extends GeoItemRenderer<IronGraniteGeneratorDisplayItem> {
	public IronGraniteGeneratorDisplayItemRenderer() {
		super(new IronGraniteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(IronGraniteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
