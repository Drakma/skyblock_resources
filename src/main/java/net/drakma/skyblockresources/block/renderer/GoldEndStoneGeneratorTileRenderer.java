package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldEndStoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.GoldEndStoneGeneratorTileEntity;

public class GoldEndStoneGeneratorTileRenderer extends GeoBlockRenderer<GoldEndStoneGeneratorTileEntity> {
	public GoldEndStoneGeneratorTileRenderer() {
		super(new GoldEndStoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(GoldEndStoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
