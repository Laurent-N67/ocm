package net.mcreator.ocmd.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ocmd.potion.HealgoldenpoisonPotionEffect;
import net.mcreator.ocmd.OcmMod;

import java.util.Map;

public class ThegreedyfoxgoddessChaqueMiseAJourDeTickDeLentiteProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure ThegreedyfoxgoddessChaqueMiseAJourDeTickDeLentite!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(HealgoldenpoisonPotionEffect.potion, (int) 60, (int) 1, (false), (false)));
	}
}
