package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteGravelGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.NetheriteGravelGeneratorTileEntity;

public class NetheriteGravelGeneratorTileRenderer extends GeoBlockRenderer<NetheriteGravelGeneratorTileEntity> {
	public NetheriteGravelGeneratorTileRenderer() {
		super(new NetheriteGravelGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(NetheriteGravelGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
