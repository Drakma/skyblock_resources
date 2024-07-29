package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenBlackstoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.WoodenBlackstoneGeneratorTileEntity;

public class WoodenBlackstoneGeneratorTileRenderer extends GeoBlockRenderer<WoodenBlackstoneGeneratorTileEntity> {
	public WoodenBlackstoneGeneratorTileRenderer() {
		super(new WoodenBlackstoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(WoodenBlackstoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
