package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronGravelGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.IronGravelGeneratorDisplayItem;

public class IronGravelGeneratorDisplayItemRenderer extends GeoItemRenderer<IronGravelGeneratorDisplayItem> {
	public IronGravelGeneratorDisplayItemRenderer() {
		super(new IronGravelGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(IronGravelGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
