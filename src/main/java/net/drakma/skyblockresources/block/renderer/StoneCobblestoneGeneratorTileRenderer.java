package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneCobblestoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.StoneCobblestoneGeneratorTileEntity;

public class StoneCobblestoneGeneratorTileRenderer extends GeoBlockRenderer<StoneCobblestoneGeneratorTileEntity> {
	public StoneCobblestoneGeneratorTileRenderer() {
		super(new StoneCobblestoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(StoneCobblestoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
