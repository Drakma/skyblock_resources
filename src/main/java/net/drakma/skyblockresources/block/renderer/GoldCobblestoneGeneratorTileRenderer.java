package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldCobblestoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.GoldCobblestoneGeneratorTileEntity;

public class GoldCobblestoneGeneratorTileRenderer extends GeoBlockRenderer<GoldCobblestoneGeneratorTileEntity> {
	public GoldCobblestoneGeneratorTileRenderer() {
		super(new GoldCobblestoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(GoldCobblestoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
