package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronSoulsandGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.IronSoulsandGeneratorDisplayItem;

public class IronSoulsandGeneratorDisplayItemRenderer extends GeoItemRenderer<IronSoulsandGeneratorDisplayItem> {
	public IronSoulsandGeneratorDisplayItemRenderer() {
		super(new IronSoulsandGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(IronSoulsandGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
