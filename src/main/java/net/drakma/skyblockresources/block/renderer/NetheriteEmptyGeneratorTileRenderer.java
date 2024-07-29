package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteEmptyGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.NetheriteEmptyGeneratorTileEntity;

public class NetheriteEmptyGeneratorTileRenderer extends GeoBlockRenderer<NetheriteEmptyGeneratorTileEntity> {
	public NetheriteEmptyGeneratorTileRenderer() {
		super(new NetheriteEmptyGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(NetheriteEmptyGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
