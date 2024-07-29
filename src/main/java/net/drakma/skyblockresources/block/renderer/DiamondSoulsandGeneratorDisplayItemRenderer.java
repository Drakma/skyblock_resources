package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondSoulsandGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.DiamondSoulsandGeneratorDisplayItem;

public class DiamondSoulsandGeneratorDisplayItemRenderer extends GeoItemRenderer<DiamondSoulsandGeneratorDisplayItem> {
	public DiamondSoulsandGeneratorDisplayItemRenderer() {
		super(new DiamondSoulsandGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(DiamondSoulsandGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
