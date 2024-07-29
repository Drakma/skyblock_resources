package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteDustGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.NetheriteDustGeneratorTileEntity;

public class NetheriteDustGeneratorTileRenderer extends GeoBlockRenderer<NetheriteDustGeneratorTileEntity> {
	public NetheriteDustGeneratorTileRenderer() {
		super(new NetheriteDustGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(NetheriteDustGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
