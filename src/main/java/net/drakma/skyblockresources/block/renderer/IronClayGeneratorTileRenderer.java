package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronClayGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.IronClayGeneratorTileEntity;

public class IronClayGeneratorTileRenderer extends GeoBlockRenderer<IronClayGeneratorTileEntity> {
	public IronClayGeneratorTileRenderer() {
		super(new IronClayGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(IronClayGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
