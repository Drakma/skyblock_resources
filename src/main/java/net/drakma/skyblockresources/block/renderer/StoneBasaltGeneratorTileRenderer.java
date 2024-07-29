package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneBasaltGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.StoneBasaltGeneratorTileEntity;

public class StoneBasaltGeneratorTileRenderer extends GeoBlockRenderer<StoneBasaltGeneratorTileEntity> {
	public StoneBasaltGeneratorTileRenderer() {
		super(new StoneBasaltGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(StoneBasaltGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
