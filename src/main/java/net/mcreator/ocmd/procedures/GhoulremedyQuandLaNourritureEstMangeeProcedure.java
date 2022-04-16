package net.mcreator.ocmd.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ocmd.potion.GhoulremedyefPotionEffect;
import net.mcreator.ocmd.OcmMod;

import java.util.Map;

public class GhoulremedyQuandLaNourritureEstMangeeProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure GhoulremedyQuandLaNourritureEstMangee!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(GhoulremedyefPotionEffect.potion, (int) 60, (int) 1, (false), (false)));
	}
}
