package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenTuffGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.WoodenTuffGeneratorTileEntity;

public class WoodenTuffGeneratorTileRenderer extends GeoBlockRenderer<WoodenTuffGeneratorTileEntity> {
	public WoodenTuffGeneratorTileRenderer() {
		super(new WoodenTuffGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(WoodenTuffGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
