package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteDripstoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.NetheriteDripstoneGeneratorDisplayItem;

public class NetheriteDripstoneGeneratorDisplayItemRenderer extends GeoItemRenderer<NetheriteDripstoneGeneratorDisplayItem> {
	public NetheriteDripstoneGeneratorDisplayItemRenderer() {
		super(new NetheriteDripstoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(NetheriteDripstoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
