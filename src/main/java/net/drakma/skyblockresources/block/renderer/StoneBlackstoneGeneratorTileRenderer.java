package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneBlackstoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.StoneBlackstoneGeneratorTileEntity;

public class StoneBlackstoneGeneratorTileRenderer extends GeoBlockRenderer<StoneBlackstoneGeneratorTileEntity> {
	public StoneBlackstoneGeneratorTileRenderer() {
		super(new StoneBlackstoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(StoneBlackstoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
