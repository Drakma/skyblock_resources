package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenDeepslateGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.WoodenDeepslateGeneratorTileEntity;

public class WoodenDeepslateGeneratorTileRenderer extends GeoBlockRenderer<WoodenDeepslateGeneratorTileEntity> {
	public WoodenDeepslateGeneratorTileRenderer() {
		super(new WoodenDeepslateGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(WoodenDeepslateGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
