package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteCobblestoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.NetheriteCobblestoneGeneratorTileEntity;

public class NetheriteCobblestoneGeneratorTileRenderer extends GeoBlockRenderer<NetheriteCobblestoneGeneratorTileEntity> {
	public NetheriteCobblestoneGeneratorTileRenderer() {
		super(new NetheriteCobblestoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(NetheriteCobblestoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
