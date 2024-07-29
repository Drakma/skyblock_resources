package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronNetherrackGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.IronNetherrackGeneratorDisplayItem;

public class IronNetherrackGeneratorDisplayItemRenderer extends GeoItemRenderer<IronNetherrackGeneratorDisplayItem> {
	public IronNetherrackGeneratorDisplayItemRenderer() {
		super(new IronNetherrackGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(IronNetherrackGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
