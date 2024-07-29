package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldBlackstoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.GoldBlackstoneGeneratorTileEntity;

public class GoldBlackstoneGeneratorTileRenderer extends GeoBlockRenderer<GoldBlackstoneGeneratorTileEntity> {
	public GoldBlackstoneGeneratorTileRenderer() {
		super(new GoldBlackstoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(GoldBlackstoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
