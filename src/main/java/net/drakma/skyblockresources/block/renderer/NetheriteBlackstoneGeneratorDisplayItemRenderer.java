package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteBlackstoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.NetheriteBlackstoneGeneratorDisplayItem;

public class NetheriteBlackstoneGeneratorDisplayItemRenderer extends GeoItemRenderer<NetheriteBlackstoneGeneratorDisplayItem> {
	public NetheriteBlackstoneGeneratorDisplayItemRenderer() {
		super(new NetheriteBlackstoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(NetheriteBlackstoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
