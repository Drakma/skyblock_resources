package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteClayGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.NetheriteClayGeneratorDisplayItem;

public class NetheriteClayGeneratorDisplayItemRenderer extends GeoItemRenderer<NetheriteClayGeneratorDisplayItem> {
	public NetheriteClayGeneratorDisplayItemRenderer() {
		super(new NetheriteClayGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(NetheriteClayGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
