package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronTuffGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.IronTuffGeneratorTileEntity;

public class IronTuffGeneratorTileRenderer extends GeoBlockRenderer<IronTuffGeneratorTileEntity> {
	public IronTuffGeneratorTileRenderer() {
		super(new IronTuffGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(IronTuffGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
