package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenGraniteGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.WoodenGraniteGeneratorTileEntity;

public class WoodenGraniteGeneratorTileRenderer extends GeoBlockRenderer<WoodenGraniteGeneratorTileEntity> {
	public WoodenGraniteGeneratorTileRenderer() {
		super(new WoodenGraniteGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(WoodenGraniteGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
