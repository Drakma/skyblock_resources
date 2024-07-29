package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronSoulsandGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.IronSoulsandGeneratorTileEntity;

public class IronSoulsandGeneratorTileRenderer extends GeoBlockRenderer<IronSoulsandGeneratorTileEntity> {
	public IronSoulsandGeneratorTileRenderer() {
		super(new IronSoulsandGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(IronSoulsandGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
