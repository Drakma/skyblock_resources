package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondEndStoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.DiamondEndStoneGeneratorTileEntity;

public class DiamondEndStoneGeneratorTileRenderer extends GeoBlockRenderer<DiamondEndStoneGeneratorTileEntity> {
	public DiamondEndStoneGeneratorTileRenderer() {
		super(new DiamondEndStoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(DiamondEndStoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
