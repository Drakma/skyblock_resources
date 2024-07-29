package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneSkyStoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.StoneSkyStoneGeneratorTileEntity;

public class StoneSkyStoneGeneratorTileRenderer extends GeoBlockRenderer<StoneSkyStoneGeneratorTileEntity> {
	public StoneSkyStoneGeneratorTileRenderer() {
		super(new StoneSkyStoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(StoneSkyStoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
