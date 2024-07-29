package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenDustGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.WoodenDustGeneratorTileEntity;

public class WoodenDustGeneratorTileRenderer extends GeoBlockRenderer<WoodenDustGeneratorTileEntity> {
	public WoodenDustGeneratorTileRenderer() {
		super(new WoodenDustGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(WoodenDustGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
