package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneEmptyGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.StoneEmptyGeneratorTileEntity;

public class StoneEmptyGeneratorTileRenderer extends GeoBlockRenderer<StoneEmptyGeneratorTileEntity> {
	public StoneEmptyGeneratorTileRenderer() {
		super(new StoneEmptyGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(StoneEmptyGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
