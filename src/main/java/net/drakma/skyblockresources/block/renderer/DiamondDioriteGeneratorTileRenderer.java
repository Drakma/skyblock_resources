package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondDioriteGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.DiamondDioriteGeneratorTileEntity;

public class DiamondDioriteGeneratorTileRenderer extends GeoBlockRenderer<DiamondDioriteGeneratorTileEntity> {
	public DiamondDioriteGeneratorTileRenderer() {
		super(new DiamondDioriteGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(DiamondDioriteGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
