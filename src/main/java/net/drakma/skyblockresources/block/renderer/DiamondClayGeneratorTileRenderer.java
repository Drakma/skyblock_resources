package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondClayGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.DiamondClayGeneratorTileEntity;

public class DiamondClayGeneratorTileRenderer extends GeoBlockRenderer<DiamondClayGeneratorTileEntity> {
	public DiamondClayGeneratorTileRenderer() {
		super(new DiamondClayGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(DiamondClayGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
