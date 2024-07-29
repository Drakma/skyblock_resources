package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteGraniteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.NetheriteGraniteGeneratorDisplayItem;

public class NetheriteGraniteGeneratorDisplayItemRenderer extends GeoItemRenderer<NetheriteGraniteGeneratorDisplayItem> {
	public NetheriteGraniteGeneratorDisplayItemRenderer() {
		super(new NetheriteGraniteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(NetheriteGraniteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
