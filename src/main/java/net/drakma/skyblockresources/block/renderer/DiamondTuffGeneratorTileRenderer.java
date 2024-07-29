package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondTuffGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.DiamondTuffGeneratorTileEntity;

public class DiamondTuffGeneratorTileRenderer extends GeoBlockRenderer<DiamondTuffGeneratorTileEntity> {
	public DiamondTuffGeneratorTileRenderer() {
		super(new DiamondTuffGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(DiamondTuffGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
