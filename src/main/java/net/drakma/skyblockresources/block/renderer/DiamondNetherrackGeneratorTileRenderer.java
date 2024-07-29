package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.DiamondNetherrackGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.DiamondNetherrackGeneratorTileEntity;

public class DiamondNetherrackGeneratorTileRenderer extends GeoBlockRenderer<DiamondNetherrackGeneratorTileEntity> {
	public DiamondNetherrackGeneratorTileRenderer() {
		super(new DiamondNetherrackGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(DiamondNetherrackGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
