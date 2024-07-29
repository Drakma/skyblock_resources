package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldDripstoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.GoldDripstoneGeneratorTileEntity;

public class GoldDripstoneGeneratorTileRenderer extends GeoBlockRenderer<GoldDripstoneGeneratorTileEntity> {
	public GoldDripstoneGeneratorTileRenderer() {
		super(new GoldDripstoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(GoldDripstoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
