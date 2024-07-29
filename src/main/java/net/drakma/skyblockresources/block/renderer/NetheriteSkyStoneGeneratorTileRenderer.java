package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteSkyStoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.NetheriteSkyStoneGeneratorTileEntity;

public class NetheriteSkyStoneGeneratorTileRenderer extends GeoBlockRenderer<NetheriteSkyStoneGeneratorTileEntity> {
	public NetheriteSkyStoneGeneratorTileRenderer() {
		super(new NetheriteSkyStoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(NetheriteSkyStoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
