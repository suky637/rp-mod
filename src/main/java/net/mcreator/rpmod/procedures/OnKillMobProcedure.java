package net.mcreator.rpmod.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import net.mcreator.rpmod.network.RpmodModVariables;

import javax.annotation.Nullable;
import net.minecraft.world.entity.player.Player;

@EventBusSubscriber
public class OnKillMobProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player) {
			{
				Player player = (Player)sourceentity;
				RpmodModVariables.PlayerVariables _vars = player.getData(RpmodModVariables.PLAYER_VARIABLES);
				_vars.player_exp += 1;
				if (_vars.player_exp > _vars.player_level * 20) {
					_vars.player_level += 1;
					_vars.player_exp = 0;
					_vars.points += 1;
				}
				_vars.markSyncDirty();
			}
		}
	}
}