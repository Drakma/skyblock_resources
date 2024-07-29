package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronCalciteGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.IronCalciteGeneratorTileEntity;

public class IronCalciteGeneratorTileRenderer extends GeoBlockRenderer<IronCalciteGeneratorTileEntity> {
	public IronCalciteGeneratorTileRenderer() {
		super(new IronCalciteGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(IronCalciteGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
