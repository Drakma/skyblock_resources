
package net.drakma.skyblockresources.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.drakma.skyblockresources.init.SkyblockResourcesModJeiPlugin;
import net.drakma.skyblockresources.init.SkyblockResourcesModBlocks;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class SetGeneratorGUIRecipeCategory implements IRecipeCategory<SetGeneratorGUIRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("skyblock_resources", "set_generator_gui");
	public final static ResourceLocation TEXTURE = new ResourceLocation("skyblock_resources", "textures/screens/stone_hammer_gui.png");
	private final IDrawable background;
	private final IDrawable icon;

	public SetGeneratorGUIRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 169, 38);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(SkyblockResourcesModBlocks.WOODEN_EMPTY_GENERATOR.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<SetGeneratorGUIRecipe> getRecipeType() {
		return SkyblockResourcesModJeiPlugin.SetGeneratorGUI_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Set Generator");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, SetGeneratorGUIRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 30, 12).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 63, 12).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 125, 12).addItemStack(recipe.getResultItem(null));
	}
}
