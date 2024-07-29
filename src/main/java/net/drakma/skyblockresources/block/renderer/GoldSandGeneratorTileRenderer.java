package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldSandGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.GoldSandGeneratorTileEntity;

public class GoldSandGeneratorTileRenderer extends GeoBlockRenderer<GoldSandGeneratorTileEntity> {
	public GoldSandGeneratorTileRenderer() {
		super(new GoldSandGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(GoldSandGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
