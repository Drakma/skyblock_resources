package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronSkyStoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.IronSkyStoneGeneratorTileEntity;

public class IronSkyStoneGeneratorTileRenderer extends GeoBlockRenderer<IronSkyStoneGeneratorTileEntity> {
	public IronSkyStoneGeneratorTileRenderer() {
		super(new IronSkyStoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(IronSkyStoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
