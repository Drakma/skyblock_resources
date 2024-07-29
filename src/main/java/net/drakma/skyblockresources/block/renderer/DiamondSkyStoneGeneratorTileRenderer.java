package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondSkyStoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.DiamondSkyStoneGeneratorTileEntity;

public class DiamondSkyStoneGeneratorTileRenderer extends GeoBlockRenderer<DiamondSkyStoneGeneratorTileEntity> {
	public DiamondSkyStoneGeneratorTileRenderer() {
		super(new DiamondSkyStoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(DiamondSkyStoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
