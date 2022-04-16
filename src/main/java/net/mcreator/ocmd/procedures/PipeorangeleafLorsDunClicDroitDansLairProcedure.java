package net.mcreator.ocmd.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ocmd.item.PipeorangeleafItem;
import net.mcreator.ocmd.item.PipeItem;
import net.mcreator.ocmd.OcmMod;

import java.util.Map;

public class PipeorangeleafLorsDunClicDroitDansLairProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OcmMod.LOGGER.warn("Failed to load dependency world for procedure PipeorangeleafLorsDunClicDroitDansLair!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OcmMod.LOGGER.warn("Failed to load dependency x for procedure PipeorangeleafLorsDunClicDroitDansLair!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OcmMod.LOGGER.warn("Failed to load dependency y for procedure PipeorangeleafLorsDunClicDroitDansLair!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OcmMod.LOGGER.warn("Failed to load dependency z for procedure PipeorangeleafLorsDunClicDroitDansLair!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure PipeorangeleafLorsDunClicDroitDansLair!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == PipeorangeleafItem.block) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(PipeorangeleafItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(PipeItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.SMOKE, x, y, z, (int) 5, 3, 3, 3, 1);
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HASTE, (int) 900, (int) 5, (false), (false)));
		}
	}
}
