package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteEndStoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.NetheriteEndStoneGeneratorTileEntity;

public class NetheriteEndStoneGeneratorTileRenderer extends GeoBlockRenderer<NetheriteEndStoneGeneratorTileEntity> {
	public NetheriteEndStoneGeneratorTileRenderer() {
		super(new NetheriteEndStoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(NetheriteEndStoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
