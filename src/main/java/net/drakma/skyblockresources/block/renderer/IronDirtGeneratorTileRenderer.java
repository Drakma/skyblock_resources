package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronDirtGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.IronDirtGeneratorTileEntity;

public class IronDirtGeneratorTileRenderer extends GeoBlockRenderer<IronDirtGeneratorTileEntity> {
	public IronDirtGeneratorTileRenderer() {
		super(new IronDirtGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(IronDirtGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
