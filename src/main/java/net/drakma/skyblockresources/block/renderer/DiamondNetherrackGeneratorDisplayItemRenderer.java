package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondNetherrackGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.DiamondNetherrackGeneratorDisplayItem;

public class DiamondNetherrackGeneratorDisplayItemRenderer extends GeoItemRenderer<DiamondNetherrackGeneratorDisplayItem> {
	public DiamondNetherrackGeneratorDisplayItemRenderer() {
		super(new DiamondNetherrackGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(DiamondNetherrackGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
