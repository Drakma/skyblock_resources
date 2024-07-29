package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteDripstoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.NetheriteDripstoneGeneratorTileEntity;

public class NetheriteDripstoneGeneratorTileRenderer extends GeoBlockRenderer<NetheriteDripstoneGeneratorTileEntity> {
	public NetheriteDripstoneGeneratorTileRenderer() {
		super(new NetheriteDripstoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(NetheriteDripstoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
