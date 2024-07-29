package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenSlimeGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.WoodenSlimeGeneratorTileEntity;

public class WoodenSlimeGeneratorTileRenderer extends GeoBlockRenderer<WoodenSlimeGeneratorTileEntity> {
	public WoodenSlimeGeneratorTileRenderer() {
		super(new WoodenSlimeGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(WoodenSlimeGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
