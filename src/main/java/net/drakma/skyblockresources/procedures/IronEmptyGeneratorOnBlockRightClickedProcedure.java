package net.drakma.skyblockresources.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.NonNullList;
import net.minecraft.core.BlockPos;

import net.drakma.skyblockresources.jei_recipes.SetGeneratorGUIRecipe;
import net.drakma.skyblockresources.init.SkyblockResourcesModBlocks;

import java.util.List;

public class IronEmptyGeneratorOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((new Object() {
			public ItemStack getResult() {
				if (world instanceof Level _lvl) {
					net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
					List<SetGeneratorGUIRecipe> recipes = rm.getAllRecipesFor(SetGeneratorGUIRecipe.Type.INSTANCE);
					for (SetGeneratorGUIRecipe recipe : recipes) {
						NonNullList<Ingredient> ingredients = recipe.getIngredients();
						if (!ingredients.get(0).test((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)))
							continue;
						if (!ingredients.get(1).test(new ItemStack(SkyblockResourcesModBlocks.IRON_EMPTY_GENERATOR.get())))
							continue;
						return recipe.getResultItem(null);
					}
				}
				return ItemStack.EMPTY;
			}
		}.getResult()).getCount() > 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.place")), SoundSource.NEUTRAL, 1, (float) 0.5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.place")), SoundSource.NEUTRAL, 1, (float) 0.5, false);
				}
			}
			world.setBlock(BlockPos.containing(x, y, z), ((new Object() {
				public ItemStack getResult() {
					if (world instanceof Level _lvl) {
						net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
						List<SetGeneratorGUIRecipe> recipes = rm.getAllRecipesFor(SetGeneratorGUIRecipe.Type.INSTANCE);
						for (SetGeneratorGUIRecipe recipe : recipes) {
							NonNullList<Ingredient> ingredients = recipe.getIngredients();
							if (!ingredients.get(0).test((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)))
								continue;
							if (!ingredients.get(1).test(new ItemStack(SkyblockResourcesModBlocks.IRON_EMPTY_GENERATOR.get())))
								continue;
							return recipe.getResultItem(null);
						}
					}
					return ItemStack.EMPTY;
				}
			}.getResult()).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()), 3);
		}
	}
}
