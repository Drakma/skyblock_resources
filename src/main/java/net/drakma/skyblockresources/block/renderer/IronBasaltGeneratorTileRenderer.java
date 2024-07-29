package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronBasaltGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.IronBasaltGeneratorTileEntity;

public class IronBasaltGeneratorTileRenderer extends GeoBlockRenderer<IronBasaltGeneratorTileEntity> {
	public IronBasaltGeneratorTileRenderer() {
		super(new IronBasaltGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(IronBasaltGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
