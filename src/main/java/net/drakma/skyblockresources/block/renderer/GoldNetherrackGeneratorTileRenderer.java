package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.GoldNetherrackGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.GoldNetherrackGeneratorTileEntity;

public class GoldNetherrackGeneratorTileRenderer extends GeoBlockRenderer<GoldNetherrackGeneratorTileEntity> {
	public GoldNetherrackGeneratorTileRenderer() {
		super(new GoldNetherrackGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(GoldNetherrackGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
