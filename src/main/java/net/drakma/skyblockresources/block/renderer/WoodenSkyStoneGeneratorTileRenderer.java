package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenSkyStoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.WoodenSkyStoneGeneratorTileEntity;

public class WoodenSkyStoneGeneratorTileRenderer extends GeoBlockRenderer<WoodenSkyStoneGeneratorTileEntity> {
	public WoodenSkyStoneGeneratorTileRenderer() {
		super(new WoodenSkyStoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(WoodenSkyStoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
