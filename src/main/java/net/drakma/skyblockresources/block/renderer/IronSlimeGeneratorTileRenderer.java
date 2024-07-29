package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronSlimeGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.IronSlimeGeneratorTileEntity;

public class IronSlimeGeneratorTileRenderer extends GeoBlockRenderer<IronSlimeGeneratorTileEntity> {
	public IronSlimeGeneratorTileRenderer() {
		super(new IronSlimeGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(IronSlimeGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
