package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronDioriteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.IronDioriteGeneratorDisplayItem;

public class IronDioriteGeneratorDisplayItemRenderer extends GeoItemRenderer<IronDioriteGeneratorDisplayItem> {
	public IronDioriteGeneratorDisplayItemRenderer() {
		super(new IronDioriteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(IronDioriteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
