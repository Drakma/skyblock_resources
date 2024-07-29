package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteDeepslateGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.NetheriteDeepslateGeneratorTileEntity;

public class NetheriteDeepslateGeneratorTileRenderer extends GeoBlockRenderer<NetheriteDeepslateGeneratorTileEntity> {
	public NetheriteDeepslateGeneratorTileRenderer() {
		super(new NetheriteDeepslateGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(NetheriteDeepslateGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
