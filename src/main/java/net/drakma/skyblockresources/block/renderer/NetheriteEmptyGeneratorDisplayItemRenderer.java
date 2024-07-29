package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteEmptyGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.NetheriteEmptyGeneratorDisplayItem;

public class NetheriteEmptyGeneratorDisplayItemRenderer extends GeoItemRenderer<NetheriteEmptyGeneratorDisplayItem> {
	public NetheriteEmptyGeneratorDisplayItemRenderer() {
		super(new NetheriteEmptyGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(NetheriteEmptyGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
