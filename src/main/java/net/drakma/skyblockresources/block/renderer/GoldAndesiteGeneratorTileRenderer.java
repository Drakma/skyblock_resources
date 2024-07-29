package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldAndesiteGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.GoldAndesiteGeneratorTileEntity;

public class GoldAndesiteGeneratorTileRenderer extends GeoBlockRenderer<GoldAndesiteGeneratorTileEntity> {
	public GoldAndesiteGeneratorTileRenderer() {
		super(new GoldAndesiteGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(GoldAndesiteGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
