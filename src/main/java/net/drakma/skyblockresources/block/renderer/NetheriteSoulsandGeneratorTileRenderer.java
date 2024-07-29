package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteSoulsandGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.NetheriteSoulsandGeneratorTileEntity;

public class NetheriteSoulsandGeneratorTileRenderer extends GeoBlockRenderer<NetheriteSoulsandGeneratorTileEntity> {
	public NetheriteSoulsandGeneratorTileRenderer() {
		super(new NetheriteSoulsandGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(NetheriteSoulsandGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
