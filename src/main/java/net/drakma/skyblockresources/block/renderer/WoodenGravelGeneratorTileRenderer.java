package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenGravelGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.WoodenGravelGeneratorTileEntity;

public class WoodenGravelGeneratorTileRenderer extends GeoBlockRenderer<WoodenGravelGeneratorTileEntity> {
	public WoodenGravelGeneratorTileRenderer() {
		super(new WoodenGravelGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(WoodenGravelGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
