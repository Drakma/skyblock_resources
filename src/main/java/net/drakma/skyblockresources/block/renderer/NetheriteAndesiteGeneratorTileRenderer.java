package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteAndesiteGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.NetheriteAndesiteGeneratorTileEntity;

public class NetheriteAndesiteGeneratorTileRenderer extends GeoBlockRenderer<NetheriteAndesiteGeneratorTileEntity> {
	public NetheriteAndesiteGeneratorTileRenderer() {
		super(new NetheriteAndesiteGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(NetheriteAndesiteGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
