package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteDustGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.NetheriteDustGeneratorDisplayItem;

public class NetheriteDustGeneratorDisplayItemRenderer extends GeoItemRenderer<NetheriteDustGeneratorDisplayItem> {
	public NetheriteDustGeneratorDisplayItemRenderer() {
		super(new NetheriteDustGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(NetheriteDustGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
