package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldDustGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.GoldDustGeneratorTileEntity;

public class GoldDustGeneratorTileRenderer extends GeoBlockRenderer<GoldDustGeneratorTileEntity> {
	public GoldDustGeneratorTileRenderer() {
		super(new GoldDustGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(GoldDustGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
