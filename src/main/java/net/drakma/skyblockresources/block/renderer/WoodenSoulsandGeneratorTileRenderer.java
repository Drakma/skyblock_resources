package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenSoulsandGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.WoodenSoulsandGeneratorTileEntity;

public class WoodenSoulsandGeneratorTileRenderer extends GeoBlockRenderer<WoodenSoulsandGeneratorTileEntity> {
	public WoodenSoulsandGeneratorTileRenderer() {
		super(new WoodenSoulsandGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(WoodenSoulsandGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
