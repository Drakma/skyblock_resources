package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteSandGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.NetheriteSandGeneratorDisplayItem;

public class NetheriteSandGeneratorDisplayItemRenderer extends GeoItemRenderer<NetheriteSandGeneratorDisplayItem> {
	public NetheriteSandGeneratorDisplayItemRenderer() {
		super(new NetheriteSandGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(NetheriteSandGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
