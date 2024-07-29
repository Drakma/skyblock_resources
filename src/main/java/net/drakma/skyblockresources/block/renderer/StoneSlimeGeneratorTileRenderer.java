package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneSlimeGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.StoneSlimeGeneratorTileEntity;

public class StoneSlimeGeneratorTileRenderer extends GeoBlockRenderer<StoneSlimeGeneratorTileEntity> {
	public StoneSlimeGeneratorTileRenderer() {
		super(new StoneSlimeGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(StoneSlimeGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
