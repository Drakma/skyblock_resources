package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteTuffGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.NetheriteTuffGeneratorTileEntity;

public class NetheriteTuffGeneratorTileRenderer extends GeoBlockRenderer<NetheriteTuffGeneratorTileEntity> {
	public NetheriteTuffGeneratorTileRenderer() {
		super(new NetheriteTuffGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(NetheriteTuffGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
