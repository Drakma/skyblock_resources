package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneSandGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.StoneSandGeneratorTileEntity;

public class StoneSandGeneratorTileRenderer extends GeoBlockRenderer<StoneSandGeneratorTileEntity> {
	public StoneSandGeneratorTileRenderer() {
		super(new StoneSandGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(StoneSandGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
