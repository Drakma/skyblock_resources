package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondDripstoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.DiamondDripstoneGeneratorDisplayItem;

public class DiamondDripstoneGeneratorDisplayItemRenderer extends GeoItemRenderer<DiamondDripstoneGeneratorDisplayItem> {
	public DiamondDripstoneGeneratorDisplayItemRenderer() {
		super(new DiamondDripstoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(DiamondDripstoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
