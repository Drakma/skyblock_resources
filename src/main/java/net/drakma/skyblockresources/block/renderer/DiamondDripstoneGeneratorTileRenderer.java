package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondDripstoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.DiamondDripstoneGeneratorTileEntity;

public class DiamondDripstoneGeneratorTileRenderer extends GeoBlockRenderer<DiamondDripstoneGeneratorTileEntity> {
	public DiamondDripstoneGeneratorTileRenderer() {
		super(new DiamondDripstoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(DiamondDripstoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
