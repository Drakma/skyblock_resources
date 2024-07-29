package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneGraniteGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.StoneGraniteGeneratorTileEntity;

public class StoneGraniteGeneratorTileRenderer extends GeoBlockRenderer<StoneGraniteGeneratorTileEntity> {
	public StoneGraniteGeneratorTileRenderer() {
		super(new StoneGraniteGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(StoneGraniteGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
