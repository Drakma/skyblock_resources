package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteGraniteGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.NetheriteGraniteGeneratorTileEntity;

public class NetheriteGraniteGeneratorTileRenderer extends GeoBlockRenderer<NetheriteGraniteGeneratorTileEntity> {
	public NetheriteGraniteGeneratorTileRenderer() {
		super(new NetheriteGraniteGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(NetheriteGraniteGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
