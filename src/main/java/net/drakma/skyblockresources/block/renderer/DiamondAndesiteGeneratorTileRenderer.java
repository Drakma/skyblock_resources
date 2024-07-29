package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondAndesiteGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.DiamondAndesiteGeneratorTileEntity;

public class DiamondAndesiteGeneratorTileRenderer extends GeoBlockRenderer<DiamondAndesiteGeneratorTileEntity> {
	public DiamondAndesiteGeneratorTileRenderer() {
		super(new DiamondAndesiteGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(DiamondAndesiteGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
