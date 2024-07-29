package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteDeepslateGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.NetheriteDeepslateGeneratorDisplayItem;

public class NetheriteDeepslateGeneratorDisplayItemRenderer extends GeoItemRenderer<NetheriteDeepslateGeneratorDisplayItem> {
	public NetheriteDeepslateGeneratorDisplayItemRenderer() {
		super(new NetheriteDeepslateGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(NetheriteDeepslateGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
