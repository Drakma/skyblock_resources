package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronEndStoneGeneratorDisplayModel;
import net.drakma.skyblockresources.block.display.IronEndStoneGeneratorDisplayItem;

public class IronEndStoneGeneratorDisplayItemRenderer extends GeoItemRenderer<IronEndStoneGeneratorDisplayItem> {
	public IronEndStoneGeneratorDisplayItemRenderer() {
		super(new IronEndStoneGeneratorDisplayModel());
	}

	@Override
	public RenderType getRenderType(IronEndStoneGeneratorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
