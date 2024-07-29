package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondBlackstoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.DiamondBlackstoneGeneratorTileEntity;

public class DiamondBlackstoneGeneratorTileRenderer extends GeoBlockRenderer<DiamondBlackstoneGeneratorTileEntity> {
	public DiamondBlackstoneGeneratorTileRenderer() {
		super(new DiamondBlackstoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(DiamondBlackstoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
