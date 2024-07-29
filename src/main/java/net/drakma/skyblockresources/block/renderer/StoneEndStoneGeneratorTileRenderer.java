package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneEndStoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.StoneEndStoneGeneratorTileEntity;

public class StoneEndStoneGeneratorTileRenderer extends GeoBlockRenderer<StoneEndStoneGeneratorTileEntity> {
	public StoneEndStoneGeneratorTileRenderer() {
		super(new StoneEndStoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(StoneEndStoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
