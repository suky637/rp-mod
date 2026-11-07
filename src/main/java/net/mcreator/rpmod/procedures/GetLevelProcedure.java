package net.mcreator.rpmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.rpmod.network.RpmodModVariables;

public class GetLevelProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Level " + entity.getData(RpmodModVariables.PLAYER_VARIABLES).player_level;
	}
}