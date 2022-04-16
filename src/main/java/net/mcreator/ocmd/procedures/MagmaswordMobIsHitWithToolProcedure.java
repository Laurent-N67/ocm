package net.mcreator.ocmd.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.ocmd.OcmMod;

import java.util.Map;

public class MagmaswordMobIsHitWithToolProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure MagmaswordMobIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 45);
	}
}
