package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenSandGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.WoodenSandGeneratorTileEntity;

public class WoodenSandGeneratorTileRenderer extends GeoBlockRenderer<WoodenSandGeneratorTileEntity> {
	public WoodenSandGeneratorTileRenderer() {
		super(new WoodenSandGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(WoodenSandGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
