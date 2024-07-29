
package net.drakma.skyblockresources.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.drakma.skyblockresources.jei_recipes.SetGeneratorGUIRecipeCategory;
import net.drakma.skyblockresources.jei_recipes.SetGeneratorGUIRecipe;
import net.drakma.skyblockresources.jei_recipes.GeneratorItemsRecipeCategory;
import net.drakma.skyblockresources.jei_recipes.GeneratorItemsRecipe;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

@JeiPlugin
public class SkyblockResourcesModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<SetGeneratorGUIRecipe> SetGeneratorGUI_Type = new mezz.jei.api.recipe.RecipeType<>(SetGeneratorGUIRecipeCategory.UID, SetGeneratorGUIRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<GeneratorItemsRecipe> GeneratorItems_Type = new mezz.jei.api.recipe.RecipeType<>(GeneratorItemsRecipeCategory.UID, GeneratorItemsRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("skyblock_resources:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new SetGeneratorGUIRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new GeneratorItemsRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<SetGeneratorGUIRecipe> SetGeneratorGUIRecipes = recipeManager.getAllRecipesFor(SetGeneratorGUIRecipe.Type.INSTANCE);
		registration.addRecipes(SetGeneratorGUI_Type, SetGeneratorGUIRecipes);
		List<GeneratorItemsRecipe> GeneratorItemsRecipes = recipeManager.getAllRecipesFor(GeneratorItemsRecipe.Type.INSTANCE);
		registration.addRecipes(GeneratorItems_Type, GeneratorItemsRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
	}
}
