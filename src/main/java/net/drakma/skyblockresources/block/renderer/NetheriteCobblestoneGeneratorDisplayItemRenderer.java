package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteCobblestoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.NetheriteCobblestoneGeneratorDisplayItem;

public class NetheriteCobblestoneGeneratorDisplayItemRenderer extends GeoItemRenderer<NetheriteCobblestoneGeneratorDisplayItem> {
	public NetheriteCobblestoneGeneratorDisplayItemRenderer() {
		super(new NetheriteCobblestoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(NetheriteCobblestoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
