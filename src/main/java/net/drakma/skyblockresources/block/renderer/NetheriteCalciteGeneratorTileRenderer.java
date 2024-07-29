package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteCalciteGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.NetheriteCalciteGeneratorTileEntity;

public class NetheriteCalciteGeneratorTileRenderer extends GeoBlockRenderer<NetheriteCalciteGeneratorTileEntity> {
	public NetheriteCalciteGeneratorTileRenderer() {
		super(new NetheriteCalciteGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(NetheriteCalciteGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
