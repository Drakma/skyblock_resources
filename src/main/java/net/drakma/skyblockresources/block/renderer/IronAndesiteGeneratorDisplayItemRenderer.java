package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronAndesiteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.IronAndesiteGeneratorDisplayItem;

public class IronAndesiteGeneratorDisplayItemRenderer extends GeoItemRenderer<IronAndesiteGeneratorDisplayItem> {
	public IronAndesiteGeneratorDisplayItemRenderer() {
		super(new IronAndesiteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(IronAndesiteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
