package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronGraniteGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.IronGraniteGeneratorTileEntity;

public class IronGraniteGeneratorTileRenderer extends GeoBlockRenderer<IronGraniteGeneratorTileEntity> {
	public IronGraniteGeneratorTileRenderer() {
		super(new IronGraniteGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(IronGraniteGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
