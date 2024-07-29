package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneAndesiteGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.StoneAndesiteGeneratorTileEntity;

public class StoneAndesiteGeneratorTileRenderer extends GeoBlockRenderer<StoneAndesiteGeneratorTileEntity> {
	public StoneAndesiteGeneratorTileRenderer() {
		super(new StoneAndesiteGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(StoneAndesiteGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
