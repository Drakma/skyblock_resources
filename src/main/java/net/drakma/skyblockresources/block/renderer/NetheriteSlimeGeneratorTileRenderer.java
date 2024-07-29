package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteSlimeGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.NetheriteSlimeGeneratorTileEntity;

public class NetheriteSlimeGeneratorTileRenderer extends GeoBlockRenderer<NetheriteSlimeGeneratorTileEntity> {
	public NetheriteSlimeGeneratorTileRenderer() {
		super(new NetheriteSlimeGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(NetheriteSlimeGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
