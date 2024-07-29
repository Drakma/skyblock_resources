
package net.drakma.skyblockresources.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.List;

@JeiPlugin
public class SkyblockResourcesModJeiInformation implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("skyblock_resources:information");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		registration.addIngredientInfo(List.of(new ItemStack(SkyblockResourcesModItems.STONE_UPGRADE_CARD.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.skyblock_resources.stone_upgrade_jei"));
		registration.addIngredientInfo(List.of(new ItemStack(SkyblockResourcesModItems.IRON_UPGRADE_CARD.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.skyblock_resources.iron_upgrade_jei"));
		registration.addIngredientInfo(List.of(new ItemStack(SkyblockResourcesModItems.GOLD_UPGRADE_CARD.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.skyblock_resources.gold_upgrade_jei"));
		registration.addIngredientInfo(List.of(new ItemStack(SkyblockResourcesModItems.DIAMOND_UPGRADE_CARD.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.skyblock_resources.diamond_upgrade_jei"));
		registration.addIngredientInfo(List.of(new ItemStack(SkyblockResourcesModItems.NETHERITE_UPGRADE_CARD.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.skyblock_resources.netherite_upgrade_jei"));
	}
}
