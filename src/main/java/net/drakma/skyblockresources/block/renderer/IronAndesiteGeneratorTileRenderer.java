package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronAndesiteGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.IronAndesiteGeneratorTileEntity;

public class IronAndesiteGeneratorTileRenderer extends GeoBlockRenderer<IronAndesiteGeneratorTileEntity> {
	public IronAndesiteGeneratorTileRenderer() {
		super(new IronAndesiteGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(IronAndesiteGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
