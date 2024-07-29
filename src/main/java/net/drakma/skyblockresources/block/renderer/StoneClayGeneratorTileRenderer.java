package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneClayGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.StoneClayGeneratorTileEntity;

public class StoneClayGeneratorTileRenderer extends GeoBlockRenderer<StoneClayGeneratorTileEntity> {
	public StoneClayGeneratorTileRenderer() {
		super(new StoneClayGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(StoneClayGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
