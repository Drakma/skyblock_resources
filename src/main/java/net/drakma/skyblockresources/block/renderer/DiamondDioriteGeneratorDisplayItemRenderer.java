package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondDioriteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.DiamondDioriteGeneratorDisplayItem;

public class DiamondDioriteGeneratorDisplayItemRenderer extends GeoItemRenderer<DiamondDioriteGeneratorDisplayItem> {
	public DiamondDioriteGeneratorDisplayItemRenderer() {
		super(new DiamondDioriteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(DiamondDioriteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
