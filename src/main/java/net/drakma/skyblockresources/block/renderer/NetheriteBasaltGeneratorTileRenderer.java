package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteBasaltGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.NetheriteBasaltGeneratorTileEntity;

public class NetheriteBasaltGeneratorTileRenderer extends GeoBlockRenderer<NetheriteBasaltGeneratorTileEntity> {
	public NetheriteBasaltGeneratorTileRenderer() {
		super(new NetheriteBasaltGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(NetheriteBasaltGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
