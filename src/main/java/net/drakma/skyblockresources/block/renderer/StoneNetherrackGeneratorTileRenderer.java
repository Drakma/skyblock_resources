package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.StoneNetherrackGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.StoneNetherrackGeneratorTileEntity;

public class StoneNetherrackGeneratorTileRenderer extends GeoBlockRenderer<StoneNetherrackGeneratorTileEntity> {
	public StoneNetherrackGeneratorTileRenderer() {
		super(new StoneNetherrackGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(StoneNetherrackGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
