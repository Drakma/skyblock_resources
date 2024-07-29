package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneDeepslateGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.StoneDeepslateGeneratorTileEntity;

public class StoneDeepslateGeneratorTileRenderer extends GeoBlockRenderer<StoneDeepslateGeneratorTileEntity> {
	public StoneDeepslateGeneratorTileRenderer() {
		super(new StoneDeepslateGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(StoneDeepslateGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
