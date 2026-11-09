package net.mcreator.rpmod.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.rpmod.network.RpmodModVariables;

public class LVBatteryBlockDestroyedByExplosionProcedure {
	public static void execute(LevelAccessor world) {
		RpmodModVariables.MapVariables.get(world).lv_max_energy = RpmodModVariables.MapVariables.get(world).lv_max_energy - 100;
		RpmodModVariables.MapVariables.get(world).markSyncDirty();
	}
}