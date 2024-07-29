package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenDirtGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.WoodenDirtGeneratorTileEntity;

public class WoodenDirtGeneratorTileRenderer extends GeoBlockRenderer<WoodenDirtGeneratorTileEntity> {
	public WoodenDirtGeneratorTileRenderer() {
		super(new WoodenDirtGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(WoodenDirtGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
