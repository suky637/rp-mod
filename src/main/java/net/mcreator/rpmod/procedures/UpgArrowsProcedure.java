package net.mcreator.rpmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.rpmod.network.RpmodModVariables;

public class UpgArrowsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(RpmodModVariables.PLAYER_VARIABLES).points >= entity.getData(RpmodModVariables.PLAYER_VARIABLES).player_arrow_skill + 1) {
			{
				RpmodModVariables.PlayerVariables _vars = entity.getData(RpmodModVariables.PLAYER_VARIABLES);
				_vars.points = entity.getData(RpmodModVariables.PLAYER_VARIABLES).points - (entity.getData(RpmodModVariables.PLAYER_VARIABLES).player_arrow_skill + 1);
				_vars.player_arrow_skill = entity.getData(RpmodModVariables.PLAYER_VARIABLES).player_arrow_skill + 1;
				_vars.markSyncDirty();
			}
		}
	}
}