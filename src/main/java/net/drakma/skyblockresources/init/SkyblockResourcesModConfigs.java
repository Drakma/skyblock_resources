package net.drakma.skyblockresources.init;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.drakma.skyblockresources.configuration.SkyblockResourcesConfigConfiguration;
import net.drakma.skyblockresources.SkyblockResourcesMod;

@Mod.EventBusSubscriber(modid = SkyblockResourcesMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SkyblockResourcesModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, SkyblockResourcesConfigConfiguration.SPEC, "skyblock_resources.toml");
		});
	}
}
