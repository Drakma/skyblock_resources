package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteNetherrackGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.NetheriteNetherrackGeneratorDisplayItem;

public class NetheriteNetherrackGeneratorDisplayItemRenderer extends GeoItemRenderer<NetheriteNetherrackGeneratorDisplayItem> {
	public NetheriteNetherrackGeneratorDisplayItemRenderer() {
		super(new NetheriteNetherrackGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(NetheriteNetherrackGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
