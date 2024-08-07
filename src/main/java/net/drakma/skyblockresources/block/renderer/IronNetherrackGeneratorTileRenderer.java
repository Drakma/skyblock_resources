package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronNetherrackGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.IronNetherrackGeneratorTileEntity;

public class IronNetherrackGeneratorTileRenderer extends GeoBlockRenderer<IronNetherrackGeneratorTileEntity> {
	public IronNetherrackGeneratorTileRenderer() {
		super(new IronNetherrackGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(IronNetherrackGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
