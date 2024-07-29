package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteDioriteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.NetheriteDioriteGeneratorDisplayItem;

public class NetheriteDioriteGeneratorDisplayItemRenderer extends GeoItemRenderer<NetheriteDioriteGeneratorDisplayItem> {
	public NetheriteDioriteGeneratorDisplayItemRenderer() {
		super(new NetheriteDioriteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(NetheriteDioriteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
