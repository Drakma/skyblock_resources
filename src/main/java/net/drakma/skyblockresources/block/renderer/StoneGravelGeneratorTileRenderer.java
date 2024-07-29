package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneGravelGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.StoneGravelGeneratorTileEntity;

public class StoneGravelGeneratorTileRenderer extends GeoBlockRenderer<StoneGravelGeneratorTileEntity> {
	public StoneGravelGeneratorTileRenderer() {
		super(new StoneGravelGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(StoneGravelGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
