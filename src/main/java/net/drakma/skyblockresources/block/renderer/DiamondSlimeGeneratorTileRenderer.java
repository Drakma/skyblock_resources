package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondSlimeGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.DiamondSlimeGeneratorTileEntity;

public class DiamondSlimeGeneratorTileRenderer extends GeoBlockRenderer<DiamondSlimeGeneratorTileEntity> {
	public DiamondSlimeGeneratorTileRenderer() {
		super(new DiamondSlimeGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(DiamondSlimeGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
