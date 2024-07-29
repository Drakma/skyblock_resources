package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldDeepslateGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.GoldDeepslateGeneratorTileEntity;

public class GoldDeepslateGeneratorTileRenderer extends GeoBlockRenderer<GoldDeepslateGeneratorTileEntity> {
	public GoldDeepslateGeneratorTileRenderer() {
		super(new GoldDeepslateGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(GoldDeepslateGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
