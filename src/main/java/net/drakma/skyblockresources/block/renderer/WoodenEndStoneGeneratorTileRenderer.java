package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenEndStoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.WoodenEndStoneGeneratorTileEntity;

public class WoodenEndStoneGeneratorTileRenderer extends GeoBlockRenderer<WoodenEndStoneGeneratorTileEntity> {
	public WoodenEndStoneGeneratorTileRenderer() {
		super(new WoodenEndStoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(WoodenEndStoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
