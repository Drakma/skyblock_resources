package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneSoulsandGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.StoneSoulsandGeneratorTileEntity;

public class StoneSoulsandGeneratorTileRenderer extends GeoBlockRenderer<StoneSoulsandGeneratorTileEntity> {
	public StoneSoulsandGeneratorTileRenderer() {
		super(new StoneSoulsandGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(StoneSoulsandGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
