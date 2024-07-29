package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteSkyStoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.NetheriteSkyStoneGeneratorDisplayItem;

public class NetheriteSkyStoneGeneratorDisplayItemRenderer extends GeoItemRenderer<NetheriteSkyStoneGeneratorDisplayItem> {
	public NetheriteSkyStoneGeneratorDisplayItemRenderer() {
		super(new NetheriteSkyStoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(NetheriteSkyStoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
