package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteBasaltGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.NetheriteBasaltGeneratorDisplayItem;

public class NetheriteBasaltGeneratorDisplayItemRenderer extends GeoItemRenderer<NetheriteBasaltGeneratorDisplayItem> {
	public NetheriteBasaltGeneratorDisplayItemRenderer() {
		super(new NetheriteBasaltGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(NetheriteBasaltGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
