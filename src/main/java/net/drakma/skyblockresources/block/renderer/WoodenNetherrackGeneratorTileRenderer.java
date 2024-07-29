package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.WoodenNetherrackGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.WoodenNetherrackGeneratorTileEntity;

public class WoodenNetherrackGeneratorTileRenderer extends GeoBlockRenderer<WoodenNetherrackGeneratorTileEntity> {
	public WoodenNetherrackGeneratorTileRenderer() {
		super(new WoodenNetherrackGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(WoodenNetherrackGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
