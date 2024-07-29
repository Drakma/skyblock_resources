package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondDeepslateGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.DiamondDeepslateGeneratorDisplayItem;

public class DiamondDeepslateGeneratorDisplayItemRenderer extends GeoItemRenderer<DiamondDeepslateGeneratorDisplayItem> {
	public DiamondDeepslateGeneratorDisplayItemRenderer() {
		super(new DiamondDeepslateGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(DiamondDeepslateGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
