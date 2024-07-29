package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldSkyStoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.GoldSkyStoneGeneratorTileEntity;

public class GoldSkyStoneGeneratorTileRenderer extends GeoBlockRenderer<GoldSkyStoneGeneratorTileEntity> {
	public GoldSkyStoneGeneratorTileRenderer() {
		super(new GoldSkyStoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(GoldSkyStoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
