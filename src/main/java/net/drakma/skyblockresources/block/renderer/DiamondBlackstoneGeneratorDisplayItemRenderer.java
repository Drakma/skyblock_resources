package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondBlackstoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.DiamondBlackstoneGeneratorDisplayItem;

public class DiamondBlackstoneGeneratorDisplayItemRenderer extends GeoItemRenderer<DiamondBlackstoneGeneratorDisplayItem> {
	public DiamondBlackstoneGeneratorDisplayItemRenderer() {
		super(new DiamondBlackstoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(DiamondBlackstoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
