package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteBlackstoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.NetheriteBlackstoneGeneratorTileEntity;

public class NetheriteBlackstoneGeneratorTileRenderer extends GeoBlockRenderer<NetheriteBlackstoneGeneratorTileEntity> {
	public NetheriteBlackstoneGeneratorTileRenderer() {
		super(new NetheriteBlackstoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(NetheriteBlackstoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
