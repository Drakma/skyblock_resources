package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondSoulsandGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.DiamondSoulsandGeneratorTileEntity;

public class DiamondSoulsandGeneratorTileRenderer extends GeoBlockRenderer<DiamondSoulsandGeneratorTileEntity> {
	public DiamondSoulsandGeneratorTileRenderer() {
		super(new DiamondSoulsandGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(DiamondSoulsandGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
