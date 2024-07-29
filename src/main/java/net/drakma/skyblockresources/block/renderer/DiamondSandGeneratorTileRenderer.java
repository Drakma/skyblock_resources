package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondSandGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.DiamondSandGeneratorTileEntity;

public class DiamondSandGeneratorTileRenderer extends GeoBlockRenderer<DiamondSandGeneratorTileEntity> {
	public DiamondSandGeneratorTileRenderer() {
		super(new DiamondSandGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(DiamondSandGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
