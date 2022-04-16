package net.mcreator.ocmd.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ocmd.potion.HealgoldenpoisonPotionEffect;
import net.mcreator.ocmd.potion.GoldenpoisonPotionEffect;
import net.mcreator.ocmd.block.Goldstatue4Block;
import net.mcreator.ocmd.block.Goldstatue3Block;
import net.mcreator.ocmd.block.Goldstatue2Block;
import net.mcreator.ocmd.block.Goldstatue1Block;
import net.mcreator.ocmd.OcmMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import java.util.Collection;

public class GoldenpoisonTickActifSurEffetProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OcmMod.LOGGER.warn("Failed to load dependency world for procedure GoldenpoisonTickActifSurEffet!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OcmMod.LOGGER.warn("Failed to load dependency x for procedure GoldenpoisonTickActifSurEffet!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OcmMod.LOGGER.warn("Failed to load dependency y for procedure GoldenpoisonTickActifSurEffet!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OcmMod.LOGGER.warn("Failed to load dependency z for procedure GoldenpoisonTickActifSurEffet!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure GoldenpoisonTickActifSurEffet!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == HealgoldenpoisonPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(GoldenpoisonPotionEffect.potion);
			}
		} else {
			if (new Object() {
				int check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == GoldenpoisonPotionEffect.potion)
								return effect.getDuration();
						}
					}
					return 0;
				}
			}.check(entity) > 2) {
				if (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == GoldenpoisonPotionEffect.potion)
									return effect.getDuration();
							}
						}
						return 0;
					}
				}.check(entity) < 4) {
					entity.attackEntityFrom(DamageSource.GENERIC, (float) 100);
					if (Math.random() < 0.3) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Goldstatue1Block.block.getDefaultState(), 3);
					} else {
						if (Math.random() < 0.3) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Goldstatue2Block.block.getDefaultState(), 3);
						} else {
							if (Math.random() < 0.3) {
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Goldstatue3Block.block.getDefaultState(), 3);
							} else {
								if (Math.random() < 0.3) {
									world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Goldstatue4Block.block.getDefaultState(), 3);
								}
							}
						}
					}
				}
			}
		}
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (5 / 2d), y - (5 / 2d), z - (5 / 2d), x + (5 / 2d), y + (5 / 2d), z + (5 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (Math.random() < 0.01) {
					if (!(entityiterator == entity)) {
						if (entityiterator instanceof LivingEntity)
							((LivingEntity) entityiterator)
									.addPotionEffect(new EffectInstance(GoldenpoisonPotionEffect.potion, (int) 900, (int) 1, (false), (true)));
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()), (entityiterator.getPosY()),
									(entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
						}
					}
				}
			}
		}
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (15 / 2d), y - (15 / 2d), z - (15 / 2d), x + (15 / 2d), y + (15 / 2d), z + (15 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (Math.random() < 0.0025) {
					if (!(entityiterator == entity)) {
						if (entityiterator instanceof LivingEntity)
							((LivingEntity) entityiterator)
									.addPotionEffect(new EffectInstance(GoldenpoisonPotionEffect.potion, (int) 900, (int) 1, (false), (true)));
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()), (entityiterator.getPosY()),
									(entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
						}
					}
				}
			}
		}
	}
}
