package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldSlimeGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.GoldSlimeGeneratorTileEntity;

public class GoldSlimeGeneratorTileRenderer extends GeoBlockRenderer<GoldSlimeGeneratorTileEntity> {
	public GoldSlimeGeneratorTileRenderer() {
		super(new GoldSlimeGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(GoldSlimeGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
