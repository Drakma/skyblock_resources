package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronCobblestoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.IronCobblestoneGeneratorDisplayItem;

public class IronCobblestoneGeneratorDisplayItemRenderer extends GeoItemRenderer<IronCobblestoneGeneratorDisplayItem> {
	public IronCobblestoneGeneratorDisplayItemRenderer() {
		super(new IronCobblestoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(IronCobblestoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
