package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronSandGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.IronSandGeneratorTileEntity;

public class IronSandGeneratorTileRenderer extends GeoBlockRenderer<IronSandGeneratorTileEntity> {
	public IronSandGeneratorTileRenderer() {
		super(new IronSandGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(IronSandGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
