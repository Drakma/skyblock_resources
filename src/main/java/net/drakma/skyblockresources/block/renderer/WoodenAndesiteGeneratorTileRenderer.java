package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenAndesiteGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.WoodenAndesiteGeneratorTileEntity;

public class WoodenAndesiteGeneratorTileRenderer extends GeoBlockRenderer<WoodenAndesiteGeneratorTileEntity> {
	public WoodenAndesiteGeneratorTileRenderer() {
		super(new WoodenAndesiteGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(WoodenAndesiteGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
