package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteAndesiteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.NetheriteAndesiteGeneratorDisplayItem;

public class NetheriteAndesiteGeneratorDisplayItemRenderer extends GeoItemRenderer<NetheriteAndesiteGeneratorDisplayItem> {
	public NetheriteAndesiteGeneratorDisplayItemRenderer() {
		super(new NetheriteAndesiteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(NetheriteAndesiteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
