package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondDustGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.DiamondDustGeneratorTileEntity;

public class DiamondDustGeneratorTileRenderer extends GeoBlockRenderer<DiamondDustGeneratorTileEntity> {
	public DiamondDustGeneratorTileRenderer() {
		super(new DiamondDustGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(DiamondDustGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
