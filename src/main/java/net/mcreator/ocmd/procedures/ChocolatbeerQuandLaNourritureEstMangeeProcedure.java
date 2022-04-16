package net.mcreator.ocmd.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ocmd.OcmMod;

import java.util.Map;

public class ChocolatbeerQuandLaNourritureEstMangeeProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure ChocolatbeerQuandLaNourritureEstMangee!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double randomcrop = 0;
		double randommarrow = 0;
		double randomrice = 0;
		randomcrop = Math.random();
		randommarrow = Math.random();
		randomrice = Math.random();
		if (Math.random() < 0.7) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 1200, (int) 2, (false), (false)));
		}
		if (randomcrop >= 0.8) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 3600, (int) 2, (false), (false)));
		} else if (randommarrow >= 0.8) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 1200, (int) 2, (false), (false)));
		} else if (randomrice >= 0.8) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.UNLUCK, (int) 1200, (int) 1, (false), (false)));
		}
	}
}
