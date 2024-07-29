package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronSandGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.IronSandGeneratorDisplayItem;

public class IronSandGeneratorDisplayItemRenderer extends GeoItemRenderer<IronSandGeneratorDisplayItem> {
	public IronSandGeneratorDisplayItemRenderer() {
		super(new IronSandGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(IronSandGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
