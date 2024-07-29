package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondGravelGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.DiamondGravelGeneratorTileEntity;

public class DiamondGravelGeneratorTileRenderer extends GeoBlockRenderer<DiamondGravelGeneratorTileEntity> {
	public DiamondGravelGeneratorTileRenderer() {
		super(new DiamondGravelGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(DiamondGravelGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
