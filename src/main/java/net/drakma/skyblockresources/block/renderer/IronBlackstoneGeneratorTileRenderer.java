package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronBlackstoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.IronBlackstoneGeneratorTileEntity;

public class IronBlackstoneGeneratorTileRenderer extends GeoBlockRenderer<IronBlackstoneGeneratorTileEntity> {
	public IronBlackstoneGeneratorTileRenderer() {
		super(new IronBlackstoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(IronBlackstoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
