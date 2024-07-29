package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.NetheriteCalciteGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.NetheriteCalciteGeneratorDisplayItem;

public class NetheriteCalciteGeneratorDisplayItemRenderer extends GeoItemRenderer<NetheriteCalciteGeneratorDisplayItem> {
	public NetheriteCalciteGeneratorDisplayItemRenderer() {
		super(new NetheriteCalciteGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(NetheriteCalciteGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
