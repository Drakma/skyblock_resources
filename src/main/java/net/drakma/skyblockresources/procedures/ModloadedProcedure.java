package net.drakma.skyblockresources.procedures;

import net.minecraftforge.fml.ModList;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

public class ModloadedProcedure {
	public static void execute(LevelAccessor world) {
		if (ModList.get().isLoaded("forge")) {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Message"), false);
		}
	}
}
