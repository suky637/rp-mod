package net.mcreator.rpmod.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.rpmod.network.RpmodModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class OnProjectileProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getSource(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, damagesource, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity, Entity sourceentity) {
		if (damagesource == null || entity == null || sourceentity == null)
			return;
		if (damagesource.is(DamageTypes.ARROW)) {
			if (sourceentity instanceof Player && !sourceentity.isShiftKeyDown()) {
				if (sourceentity.getData(RpmodModVariables.PLAYER_VARIABLES).player_arrow_skill == 1) {
					entity.igniteForSeconds(3);
				} else if (sourceentity.getData(RpmodModVariables.PLAYER_VARIABLES).player_arrow_skill == 2) {
					entity.igniteForSeconds(7);
				} else if (sourceentity.getData(RpmodModVariables.PLAYER_VARIABLES).player_arrow_skill == 3) {
					entity.igniteForSeconds(15);
				} else if (sourceentity.getData(RpmodModVariables.PLAYER_VARIABLES).player_arrow_skill == 4) {
					entity.igniteForSeconds(15);
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, 1, Level.ExplosionInteraction.TNT);
				}
			}
		}
	}
}