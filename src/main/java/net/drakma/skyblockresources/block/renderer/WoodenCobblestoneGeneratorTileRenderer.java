package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenCobblestoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.WoodenCobblestoneGeneratorTileEntity;

public class WoodenCobblestoneGeneratorTileRenderer extends GeoBlockRenderer<WoodenCobblestoneGeneratorTileEntity> {
	public WoodenCobblestoneGeneratorTileRenderer() {
		super(new WoodenCobblestoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(WoodenCobblestoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
