package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronDeepslateGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.IronDeepslateGeneratorDisplayItem;

public class IronDeepslateGeneratorDisplayItemRenderer extends GeoItemRenderer<IronDeepslateGeneratorDisplayItem> {
	public IronDeepslateGeneratorDisplayItemRenderer() {
		super(new IronDeepslateGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(IronDeepslateGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
