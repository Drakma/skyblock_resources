package net.drakma.skyblockresources.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.NonNullList;
import net.minecraft.core.BlockPos;

import net.drakma.skyblockresources.jei_recipes.GeneratorItemsRecipe;
import net.drakma.skyblockresources.configuration.SkyblockResourcesConfigConfiguration;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;

public class NetheriteGeneratorOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CurrentSlot = 0;
		if ((new Object() {
			public ItemStack getResult() {
				if (world instanceof Level _lvl) {
					net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
					List<GeneratorItemsRecipe> recipes = rm.getAllRecipesFor(GeneratorItemsRecipe.Type.INSTANCE);
					for (GeneratorItemsRecipe recipe : recipes) {
						NonNullList<Ingredient> ingredients = recipe.getIngredients();
						if (!ingredients.get(0).test((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()))))
							continue;
						return recipe.getResultItem(null);
					}
				}
				return ItemStack.EMPTY;
			}
		}.getResult()).getCount() > 0) {
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "ticks_remaining") > 0) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("ticks_remaining", ((new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, BlockPos.containing(x, y, z), "ticks_remaining")) - 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else {
				if (new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
						return _retval.get();
					}
				}.getAmount(world, BlockPos.containing(x, y, z), 0) < (double) SkyblockResourcesConfigConfiguration.NETHERITE_MAX_ITEMS.get() && new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "ticks_remaining") == 0) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = (new Object() {
								public ItemStack getResult() {
									if (world instanceof Level _lvl) {
										net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
										List<GeneratorItemsRecipe> recipes = rm.getAllRecipesFor(GeneratorItemsRecipe.Type.INSTANCE);
										for (GeneratorItemsRecipe recipe : recipes) {
											NonNullList<Ingredient> ingredients = recipe.getIngredients();
											if (!ingredients.get(0).test((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()))))
												continue;
											return recipe.getResultItem(null);
										}
									}
									return ItemStack.EMPTY;
								}
							}.getResult()).copy();
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 0) + (new Object() {
								public ItemStack getResult() {
									if (world instanceof Level _lvl) {
										net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
										List<GeneratorItemsRecipe> recipes = rm.getAllRecipesFor(GeneratorItemsRecipe.Type.INSTANCE);
										for (GeneratorItemsRecipe recipe : recipes) {
											NonNullList<Ingredient> ingredients = recipe.getIngredients();
											if (!ingredients.get(0).test((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()))))
												continue;
											return recipe.getResultItem(null);
										}
									}
									return ItemStack.EMPTY;
								}
							}.getResult()).getCount()));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("ticks_remaining", ((double) SkyblockResourcesConfigConfiguration.NETHERITE_TICKS_BETWEEN_CYCLES.get()));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (new Object() {
						public int getContainerSize(LevelAccessor world, BlockPos pos) {
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								if (_ent instanceof BaseContainerBlockEntity _block) {
									return _block.getContainerSize();
								}
							}
							return 0;
						}

						public int getAmount(LevelAccessor world, BlockPos pos) {
							Block block = world.getBlockState(pos).getBlock();
							if (block == Blocks.CHEST || block == Blocks.TRAPPED_CHEST) {
								boolean isSingle = block.getStateDefinition().getProperty("type") instanceof EnumProperty _getep5 && world.getBlockState(pos).getValue(_getep5).toString().equals("SINGLE");
								if (!isSingle) {
									return getContainerSize(world, pos) * 2;
								}
							}
							return getContainerSize(world, pos);
						}
					}.getAmount(world, new BlockPos((int) x, (int) (y - 1), (int) z)) >= 1 && !(world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("skyblock_resources:generators")))) {
						CurrentSlot = 0;
						while (CurrentSlot < new Object() {
							public int getContainerSize(LevelAccessor world, BlockPos pos) {
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null) {
									if (_ent instanceof BaseContainerBlockEntity _block) {
										return _block.getContainerSize();
									}
								}
								return 0;
							}

							public int getAmount(LevelAccessor world, BlockPos pos) {
								Block block = world.getBlockState(pos).getBlock();
								if (block == Blocks.CHEST || block == Blocks.TRAPPED_CHEST) {
									boolean isSingle = block.getStateDefinition().getProperty("type") instanceof EnumProperty _getep5 && world.getBlockState(pos).getValue(_getep5).toString().equals("SINGLE");
									if (!isSingle) {
										return getContainerSize(world, pos) * 2;
									}
								}
								return getContainerSize(world, pos);
							}
						}.getAmount(world, new BlockPos((int) x, (int) (y - 1), (int) z))) {
							if ((new Object() {
								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
									return _retval.get();
								}
							}.getItemStack(world, BlockPos.containing(x, y - 1, z), (int) CurrentSlot)).getItem() == (new Object() {
								public ItemStack getResult() {
									if (world instanceof Level _lvl) {
										net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
										List<GeneratorItemsRecipe> recipes = rm.getAllRecipesFor(GeneratorItemsRecipe.Type.INSTANCE);
										for (GeneratorItemsRecipe recipe : recipes) {
											NonNullList<Ingredient> ingredients = recipe.getIngredients();
											if (!ingredients.get(0).test((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()))))
												continue;
											return recipe.getResultItem(null);
										}
									}
									return ItemStack.EMPTY;
								}
							}.getResult()).getItem() && (new Object() {
								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
									return _retval.get();
								}
							}.getItemStack(world, BlockPos.containing(x, y - 1, z), (int) CurrentSlot)).getMaxStackSize() - new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y - 1, z), (int) CurrentSlot) >= (new Object() {
								public ItemStack getResult() {
									if (world instanceof Level _lvl) {
										net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
										List<GeneratorItemsRecipe> recipes = rm.getAllRecipesFor(GeneratorItemsRecipe.Type.INSTANCE);
										for (GeneratorItemsRecipe recipe : recipes) {
											NonNullList<Ingredient> ingredients = recipe.getIngredients();
											if (!ingredients.get(0).test((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()))))
												continue;
											return recipe.getResultItem(null);
										}
									}
									return ItemStack.EMPTY;
								}
							}.getResult()).getCount() || (new Object() {
								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
									return _retval.get();
								}
							}.getItemStack(world, BlockPos.containing(x, y - 1, z), (int) CurrentSlot)).getItem() == Blocks.AIR.asItem()) {
								{
									BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 1, z));
									if (_ent != null) {
										final int _slotid = (int) CurrentSlot;
										final ItemStack _setstack = (new Object() {
											public ItemStack getResult() {
												if (world instanceof Level _lvl) {
													net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
													List<GeneratorItemsRecipe> recipes = rm.getAllRecipesFor(GeneratorItemsRecipe.Type.INSTANCE);
													for (GeneratorItemsRecipe recipe : recipes) {
														NonNullList<Ingredient> ingredients = recipe.getIngredients();
														if (!ingredients.get(0).test((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()))))
															continue;
														return recipe.getResultItem(null);
													}
												}
												return ItemStack.EMPTY;
											}
										}.getResult()).copy();
										_setstack.setCount((int) (new Object() {
											public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicInteger _retval = new AtomicInteger(0);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
												return _retval.get();
											}
										}.getAmount(world, BlockPos.containing(x, y - 1, z), (int) CurrentSlot) + (new Object() {
											public ItemStack getResult() {
												if (world instanceof Level _lvl) {
													net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
													List<GeneratorItemsRecipe> recipes = rm.getAllRecipesFor(GeneratorItemsRecipe.Type.INSTANCE);
													for (GeneratorItemsRecipe recipe : recipes) {
														NonNullList<Ingredient> ingredients = recipe.getIngredients();
														if (!ingredients.get(0).test((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()))))
															continue;
														return recipe.getResultItem(null);
													}
												}
												return ItemStack.EMPTY;
											}
										}.getResult()).getCount()));
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable)
												((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
										});
									}
								}
								{
									BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
									if (_ent != null) {
										final int _slotid = 0;
										final int _amount = (new Object() {
											public ItemStack getResult() {
												if (world instanceof Level _lvl) {
													net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
													List<GeneratorItemsRecipe> recipes = rm.getAllRecipesFor(GeneratorItemsRecipe.Type.INSTANCE);
													for (GeneratorItemsRecipe recipe : recipes) {
														NonNullList<Ingredient> ingredients = recipe.getIngredients();
														if (!ingredients.get(0).test((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()))))
															continue;
														return recipe.getResultItem(null);
													}
												}
												return ItemStack.EMPTY;
											}
										}.getResult()).getCount();
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable) {
												ItemStack _stk = capability.getStackInSlot(_slotid).copy();
												_stk.shrink(_amount);
												((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
											}
										});
									}
								}
								break;
							}
							CurrentSlot = CurrentSlot + 1;
						}
					}
				}
			}
		}
	}
}
