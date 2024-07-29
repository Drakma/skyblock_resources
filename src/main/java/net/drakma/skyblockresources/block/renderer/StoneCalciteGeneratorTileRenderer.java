package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneCalciteGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.StoneCalciteGeneratorTileEntity;

public class StoneCalciteGeneratorTileRenderer extends GeoBlockRenderer<StoneCalciteGeneratorTileEntity> {
	public StoneCalciteGeneratorTileRenderer() {
		super(new StoneCalciteGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(StoneCalciteGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
