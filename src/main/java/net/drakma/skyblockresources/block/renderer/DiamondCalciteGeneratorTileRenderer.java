package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondCalciteGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.DiamondCalciteGeneratorTileEntity;

public class DiamondCalciteGeneratorTileRenderer extends GeoBlockRenderer<DiamondCalciteGeneratorTileEntity> {
	public DiamondCalciteGeneratorTileRenderer() {
		super(new DiamondCalciteGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(DiamondCalciteGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
