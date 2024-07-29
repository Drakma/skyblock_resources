package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondAndesiteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.DiamondAndesiteGeneratorDisplayItem;

public class DiamondAndesiteGeneratorDisplayItemRenderer extends GeoItemRenderer<DiamondAndesiteGeneratorDisplayItem> {
	public DiamondAndesiteGeneratorDisplayItemRenderer() {
		super(new DiamondAndesiteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(DiamondAndesiteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
