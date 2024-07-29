package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteDioriteGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.NetheriteDioriteGeneratorTileEntity;

public class NetheriteDioriteGeneratorTileRenderer extends GeoBlockRenderer<NetheriteDioriteGeneratorTileEntity> {
	public NetheriteDioriteGeneratorTileRenderer() {
		super(new NetheriteDioriteGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(NetheriteDioriteGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
