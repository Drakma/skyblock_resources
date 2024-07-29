package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteDirtGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.NetheriteDirtGeneratorTileEntity;

public class NetheriteDirtGeneratorTileRenderer extends GeoBlockRenderer<NetheriteDirtGeneratorTileEntity> {
	public NetheriteDirtGeneratorTileRenderer() {
		super(new NetheriteDirtGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(NetheriteDirtGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
