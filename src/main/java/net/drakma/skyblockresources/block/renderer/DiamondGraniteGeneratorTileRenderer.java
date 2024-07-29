package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondGraniteGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.DiamondGraniteGeneratorTileEntity;

public class DiamondGraniteGeneratorTileRenderer extends GeoBlockRenderer<DiamondGraniteGeneratorTileEntity> {
	public DiamondGraniteGeneratorTileRenderer() {
		super(new DiamondGraniteGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(DiamondGraniteGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
