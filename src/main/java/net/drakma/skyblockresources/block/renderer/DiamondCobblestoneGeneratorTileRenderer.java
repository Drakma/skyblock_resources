package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondCobblestoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.DiamondCobblestoneGeneratorTileEntity;

public class DiamondCobblestoneGeneratorTileRenderer extends GeoBlockRenderer<DiamondCobblestoneGeneratorTileEntity> {
	public DiamondCobblestoneGeneratorTileRenderer() {
		super(new DiamondCobblestoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(DiamondCobblestoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
