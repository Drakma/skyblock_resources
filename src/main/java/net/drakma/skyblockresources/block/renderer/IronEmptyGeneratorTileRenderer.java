package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronEmptyGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.IronEmptyGeneratorTileEntity;

public class IronEmptyGeneratorTileRenderer extends GeoBlockRenderer<IronEmptyGeneratorTileEntity> {
	public IronEmptyGeneratorTileRenderer() {
		super(new IronEmptyGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(IronEmptyGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
