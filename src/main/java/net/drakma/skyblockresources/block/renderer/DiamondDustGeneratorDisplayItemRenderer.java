package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondDustGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.DiamondDustGeneratorDisplayItem;

public class DiamondDustGeneratorDisplayItemRenderer extends GeoItemRenderer<DiamondDustGeneratorDisplayItem> {
	public DiamondDustGeneratorDisplayItemRenderer() {
		super(new DiamondDustGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(DiamondDustGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
