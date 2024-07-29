package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldClayGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.GoldClayGeneratorTileEntity;

public class GoldClayGeneratorTileRenderer extends GeoBlockRenderer<GoldClayGeneratorTileEntity> {
	public GoldClayGeneratorTileRenderer() {
		super(new GoldClayGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(GoldClayGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
