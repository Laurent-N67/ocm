package net.mcreator.ocmd.procedures;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ocmd.OcmMod;

import java.util.Map;
import java.util.Collections;

public class EctoplasmblockEntityWalksOnTheBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure EctoplasmblockEntityWalksOnTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = 0;
		double y = 0;
		double z = 0;
		x = (entity.getPosX());
		y = (entity.getPosY());
		z = (entity.getPosZ());
		for (int index0 = 0; index0 < (int) (10); index0++) {
			if (Math.random() < 0.5) {
				if (Math.random() < 0.5) {
					x = (x + 1);
				}
			} else if (Math.random() > 0.5) {
				if (Math.random() < 0.5) {
					x = (x - 1);
				}
			}
			if (Math.random() < 0.5) {
				if (Math.random() < 0.5) {
					y = (x + 1);
				}
			} else if (Math.random() > 0.5) {
				if (Math.random() < 0.5) {
					y = (x - 1);
				}
			}
			if (Math.random() < 0.5) {
				if (Math.random() < 0.5) {
					z = (x + 1);
				}
			} else if (Math.random() > 0.5) {
				if (Math.random() < 0.5) {
					z = (x - 1);
				}
			}
		}
		{
			Entity _ent = entity;
			_ent.setPositionAndUpdate(x, y, z);
			if (_ent instanceof ServerPlayerEntity) {
				((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
			}
		}
	}
}
