package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenDripstoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.WoodenDripstoneGeneratorTileEntity;

public class WoodenDripstoneGeneratorTileRenderer extends GeoBlockRenderer<WoodenDripstoneGeneratorTileEntity> {
	public WoodenDripstoneGeneratorTileRenderer() {
		super(new WoodenDripstoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(WoodenDripstoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
