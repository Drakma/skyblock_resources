package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteClayGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.NetheriteClayGeneratorTileEntity;

public class NetheriteClayGeneratorTileRenderer extends GeoBlockRenderer<NetheriteClayGeneratorTileEntity> {
	public NetheriteClayGeneratorTileRenderer() {
		super(new NetheriteClayGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(NetheriteClayGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
