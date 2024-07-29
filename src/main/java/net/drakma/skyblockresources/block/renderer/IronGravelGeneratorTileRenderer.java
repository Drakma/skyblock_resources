package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronGravelGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.IronGravelGeneratorTileEntity;

public class IronGravelGeneratorTileRenderer extends GeoBlockRenderer<IronGravelGeneratorTileEntity> {
	public IronGravelGeneratorTileRenderer() {
		super(new IronGravelGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(IronGravelGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
