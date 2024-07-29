package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteSandGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.NetheriteSandGeneratorTileEntity;

public class NetheriteSandGeneratorTileRenderer extends GeoBlockRenderer<NetheriteSandGeneratorTileEntity> {
	public NetheriteSandGeneratorTileRenderer() {
		super(new NetheriteSandGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(NetheriteSandGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
