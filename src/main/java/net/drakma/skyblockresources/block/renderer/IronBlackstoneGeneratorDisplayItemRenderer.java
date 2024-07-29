package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronBlackstoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.IronBlackstoneGeneratorDisplayItem;

public class IronBlackstoneGeneratorDisplayItemRenderer extends GeoItemRenderer<IronBlackstoneGeneratorDisplayItem> {
	public IronBlackstoneGeneratorDisplayItemRenderer() {
		super(new IronBlackstoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(IronBlackstoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
