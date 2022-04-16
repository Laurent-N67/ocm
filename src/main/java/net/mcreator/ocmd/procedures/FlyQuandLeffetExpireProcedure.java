package net.mcreator.ocmd.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ocmd.OcmMod;

import java.util.Map;

public class FlyQuandLeffetExpireProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure FlyQuandLeffetExpire!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).abilities.allowFlying = (false);
			((PlayerEntity) entity).sendPlayerAbilities();
		}
		if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).abilities.isFlying = (false);
			((PlayerEntity) entity).sendPlayerAbilities();
		}
	}
}
