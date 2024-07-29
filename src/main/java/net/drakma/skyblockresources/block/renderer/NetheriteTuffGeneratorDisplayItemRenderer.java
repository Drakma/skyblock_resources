package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteTuffGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.NetheriteTuffGeneratorDisplayItem;

public class NetheriteTuffGeneratorDisplayItemRenderer extends GeoItemRenderer<NetheriteTuffGeneratorDisplayItem> {
	public NetheriteTuffGeneratorDisplayItemRenderer() {
		super(new NetheriteTuffGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(NetheriteTuffGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
