package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenClayGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.WoodenClayGeneratorTileEntity;

public class WoodenClayGeneratorTileRenderer extends GeoBlockRenderer<WoodenClayGeneratorTileEntity> {
	public WoodenClayGeneratorTileRenderer() {
		super(new WoodenClayGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(WoodenClayGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
