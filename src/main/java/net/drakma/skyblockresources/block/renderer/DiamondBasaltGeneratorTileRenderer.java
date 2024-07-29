package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondBasaltGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.DiamondBasaltGeneratorTileEntity;

public class DiamondBasaltGeneratorTileRenderer extends GeoBlockRenderer<DiamondBasaltGeneratorTileEntity> {
	public DiamondBasaltGeneratorTileRenderer() {
		super(new DiamondBasaltGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(DiamondBasaltGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
