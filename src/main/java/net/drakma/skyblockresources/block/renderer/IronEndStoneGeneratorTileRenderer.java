package net.drakma.skyblockresources.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.drakma.skyblockresources.block.model.IronEndStoneGeneratorBlockModel;
import net.drakma.skyblockresources.block.entity.IronEndStoneGeneratorTileEntity;

public class IronEndStoneGeneratorTileRenderer extends GeoBlockRenderer<IronEndStoneGeneratorTileEntity> {
	public IronEndStoneGeneratorTileRenderer() {
		super(new IronEndStoneGeneratorBlockModel());
	}

	@Override
	public RenderType getRenderType(IronEndStoneGeneratorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
