package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldSoulsandGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.GoldSoulsandGeneratorTileEntity;

public class GoldSoulsandGeneratorTileRenderer extends GeoBlockRenderer<GoldSoulsandGeneratorTileEntity> {
	public GoldSoulsandGeneratorTileRenderer() {
		super(new GoldSoulsandGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(GoldSoulsandGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
