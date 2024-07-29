package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteNetherrackGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.NetheriteNetherrackGeneratorTileEntity;

public class NetheriteNetherrackGeneratorTileRenderer extends GeoBlockRenderer<NetheriteNetherrackGeneratorTileEntity> {
	public NetheriteNetherrackGeneratorTileRenderer() {
		super(new NetheriteNetherrackGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(NetheriteNetherrackGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
