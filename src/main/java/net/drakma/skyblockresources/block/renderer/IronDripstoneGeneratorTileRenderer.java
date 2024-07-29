package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronDripstoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.IronDripstoneGeneratorTileEntity;

public class IronDripstoneGeneratorTileRenderer extends GeoBlockRenderer<IronDripstoneGeneratorTileEntity> {
	public IronDripstoneGeneratorTileRenderer() {
		super(new IronDripstoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(IronDripstoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
