package net.mcreator.rpmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.rpmod.network.RpmodModVariables;

public class GetArrowCostProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Cost: " + (entity.getData(RpmodModVariables.PLAYER_VARIABLES).player_arrow_skill + 1);
	}
}