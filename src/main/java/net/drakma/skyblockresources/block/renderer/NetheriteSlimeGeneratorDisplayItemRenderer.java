package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteSlimeGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.NetheriteSlimeGeneratorDisplayItem;

public class NetheriteSlimeGeneratorDisplayItemRenderer extends GeoItemRenderer<NetheriteSlimeGeneratorDisplayItem> {
	public NetheriteSlimeGeneratorDisplayItemRenderer() {
		super(new NetheriteSlimeGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(NetheriteSlimeGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
