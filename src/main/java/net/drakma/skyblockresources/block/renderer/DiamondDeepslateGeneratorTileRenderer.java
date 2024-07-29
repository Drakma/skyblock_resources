package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondDeepslateGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.DiamondDeepslateGeneratorTileEntity;

public class DiamondDeepslateGeneratorTileRenderer extends GeoBlockRenderer<DiamondDeepslateGeneratorTileEntity> {
	public DiamondDeepslateGeneratorTileRenderer() {
		super(new DiamondDeepslateGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(DiamondDeepslateGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
