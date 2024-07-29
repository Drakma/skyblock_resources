package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondEmptyGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.DiamondEmptyGeneratorTileEntity;

public class DiamondEmptyGeneratorTileRenderer extends GeoBlockRenderer<DiamondEmptyGeneratorTileEntity> {
	public DiamondEmptyGeneratorTileRenderer() {
		super(new DiamondEmptyGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(DiamondEmptyGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
