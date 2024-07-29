package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondDirtGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.DiamondDirtGeneratorTileEntity;

public class DiamondDirtGeneratorTileRenderer extends GeoBlockRenderer<DiamondDirtGeneratorTileEntity> {
	public DiamondDirtGeneratorTileRenderer() {
		super(new DiamondDirtGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(DiamondDirtGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
