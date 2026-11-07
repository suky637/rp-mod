package net.mcreator.rpmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.rpmod.network.RpmodModVariables;

public class GetPointsProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Skill points: " + entity.getData(RpmodModVariables.PLAYER_VARIABLES).points + "\n" + "Arrows level: " + entity.getData(RpmodModVariables.PLAYER_VARIABLES).player_arrow_skill;
	}
}