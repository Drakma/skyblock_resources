package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenDioriteGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.WoodenDioriteGeneratorTileEntity;

public class WoodenDioriteGeneratorTileRenderer extends GeoBlockRenderer<WoodenDioriteGeneratorTileEntity> {
	public WoodenDioriteGeneratorTileRenderer() {
		super(new WoodenDioriteGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(WoodenDioriteGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
