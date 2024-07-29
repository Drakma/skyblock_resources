package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronDustGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.IronDustGeneratorTileEntity;

public class IronDustGeneratorTileRenderer extends GeoBlockRenderer<IronDustGeneratorTileEntity> {
	public IronDustGeneratorTileRenderer() {
		super(new IronDustGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(IronDustGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
