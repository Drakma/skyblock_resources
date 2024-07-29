package net.drakma.skyblockresources.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeSerializer;

import net.drakma.skyblockresources.jei_recipes.SetGeneratorGUIRecipe;
import net.drakma.skyblockresources.jei_recipes.GeneratorItemsRecipe;
import net.drakma.skyblockresources.SkyblockResourcesMod;

@Mod.EventBusSubscriber(modid = SkyblockResourcesMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SkyblockResourcesModRecipeTypes {
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, "skyblock_resources");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		event.enqueueWork(() -> {
			SERIALIZERS.register(bus);
			SERIALIZERS.register("set_generator_gui", () -> SetGeneratorGUIRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("generator_items", () -> GeneratorItemsRecipe.Serializer.INSTANCE);
		});
	}
}
