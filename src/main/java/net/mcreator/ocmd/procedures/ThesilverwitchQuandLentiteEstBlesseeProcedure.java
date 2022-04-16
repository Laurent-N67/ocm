package net.mcreator.ocmd.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;

import net.mcreator.ocmd.OcmMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class ThesilverwitchQuandLentiteEstBlesseeProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OcmMod.LOGGER.warn("Failed to load dependency world for procedure ThesilverwitchQuandLentiteEstBlessee!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OcmMod.LOGGER.warn("Failed to load dependency x for procedure ThesilverwitchQuandLentiteEstBlessee!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OcmMod.LOGGER.warn("Failed to load dependency y for procedure ThesilverwitchQuandLentiteEstBlessee!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OcmMod.LOGGER.warn("Failed to load dependency z for procedure ThesilverwitchQuandLentiteEstBlessee!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure ThesilverwitchQuandLentiteEstBlessee!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private IWorld world;

			public void start(IWorld world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
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
						if (Math.random() < 0.0005) {
							if (!(entityiterator == entity)) {
								if (entityiterator instanceof LivingEntity)
									((LivingEntity) entityiterator)
											.addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 600, (int) 1, (false), (true)));
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
								}
							}
						}
						if (Math.random() < 0.0005) {
							if (!(entityiterator == entity)) {
								if (entityiterator instanceof LivingEntity)
									((LivingEntity) entityiterator)
											.addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 600, (int) 1, (false), (true)));
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
								}
							}
						}
						if (Math.random() < 0.0005) {
							if (!(entityiterator == entity)) {
								if (entityiterator instanceof LivingEntity)
									((LivingEntity) entityiterator)
											.addPotionEffect(new EffectInstance(Effects.HUNGER, (int) 600, (int) 1, (false), (true)));
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
								}
							}
						}
						if (Math.random() < 0.0005) {
							if (!(entityiterator == entity)) {
								if (entityiterator instanceof LivingEntity)
									((LivingEntity) entityiterator)
											.addPotionEffect(new EffectInstance(Effects.WEAKNESS, (int) 600, (int) 1, (false), (true)));
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
								}
							}
						}
						if (Math.random() < 0.0005) {
							if (!(entityiterator == entity)) {
								if (entityiterator instanceof LivingEntity)
									((LivingEntity) entityiterator)
											.addPotionEffect(new EffectInstance(Effects.UNLUCK, (int) 600, (int) 1, (false), (true)));
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
								}
							}
						}
						if (Math.random() < 0.0005) {
							if (!(entityiterator == entity)) {
								if (entityiterator instanceof LivingEntity)
									((LivingEntity) entityiterator)
											.addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 600, (int) 1, (false), (true)));
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
								}
							}
						}
						if (Math.random() < 0.0005) {
							if (!(entityiterator == entity)) {
								if (entityiterator instanceof LivingEntity)
									((LivingEntity) entityiterator)
											.addPotionEffect(new EffectInstance(Effects.POISON, (int) 600, (int) 1, (false), (true)));
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
								}
							}
						}
						if (Math.random() < 0.0005) {
							if (!(entityiterator == entity)) {
								if (world instanceof ServerWorld) {
									LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
									_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) (entityiterator.getPosX()),
											(int) (entityiterator.getPosY()), (int) (entityiterator.getPosZ()))));
									_ent.setEffectOnly(false);
									((World) world).addEntity(_ent);
								}
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
								}
							}
						}
						if (Math.random() < 0.0005) {
							if (!(entityiterator == entity)) {
								entityiterator.setFire((int) 15);
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
								}
							}
						}
					}
				}
				{
					List<Entity> _entfound = world
							.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(x - (10 / 2d), y - (10 / 2d), z - (10 / 2d), x + (10 / 2d), y + (10 / 2d), z + (10 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (Math.random() < 0.0005) {
							if (!(entityiterator == entity)) {
								entityiterator.setFire((int) 5);
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
								}
							}
						}
						if (Math.random() < 0.0005) {
							if (!(entityiterator == entity)) {
								if (world instanceof ServerWorld) {
									LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
									_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) (entityiterator.getPosX()),
											(int) (entityiterator.getPosY()), (int) (entityiterator.getPosZ()))));
									_ent.setEffectOnly(false);
									((World) world).addEntity(_ent);
								}
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
								}
							}
						}
						if (Math.random() < 0.0005) {
							if (!(entityiterator == entity)) {
								if (entityiterator instanceof LivingEntity)
									((LivingEntity) entityiterator)
											.addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 200, (int) 1, (false), (true)));
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
								}
							}
						}
						if (Math.random() < 0.0005) {
							if (!(entityiterator == entity)) {
								if (entityiterator instanceof LivingEntity)
									((LivingEntity) entityiterator)
											.addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 200, (int) 1, (false), (true)));
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
								}
							}
						}
						if (Math.random() < 0.0005) {
							if (!(entityiterator == entity)) {
								if (entityiterator instanceof LivingEntity)
									((LivingEntity) entityiterator)
											.addPotionEffect(new EffectInstance(Effects.HUNGER, (int) 200, (int) 1, (false), (true)));
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
								}
							}
						}
						if (Math.random() < 0.0005) {
							if (!(entityiterator == entity)) {
								if (entityiterator instanceof LivingEntity)
									((LivingEntity) entityiterator)
											.addPotionEffect(new EffectInstance(Effects.WEAKNESS, (int) 200, (int) 1, (false), (true)));
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
								}
							}
						}
						if (Math.random() < 0.0005) {
							if (!(entityiterator == entity)) {
								if (entityiterator instanceof LivingEntity)
									((LivingEntity) entityiterator)
											.addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 200, (int) 1, (false), (true)));
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
								}
							}
						}
						if (Math.random() < 0.0005) {
							if (!(entityiterator == entity)) {
								if (entityiterator instanceof LivingEntity)
									((LivingEntity) entityiterator)
											.addPotionEffect(new EffectInstance(Effects.UNLUCK, (int) 200, (int) 1, (false), (true)));
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
								}
							}
						}
						if (Math.random() < 0.0005) {
							if (!(entityiterator == entity)) {
								if (entityiterator instanceof LivingEntity)
									((LivingEntity) entityiterator)
											.addPotionEffect(new EffectInstance(Effects.POISON, (int) 200, (int) 1, (false), (true)));
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
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
						if (Math.random() < 0.0005) {
							if (!(entityiterator == entity)) {
								if (entityiterator instanceof LivingEntity)
									((LivingEntity) entityiterator)
											.addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 60, (int) 1, (false), (true)));
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
								}
							}
						}
						if (Math.random() < 0.0005) {
							if (!(entityiterator == entity)) {
								if (entityiterator instanceof LivingEntity)
									((LivingEntity) entityiterator)
											.addPotionEffect(new EffectInstance(Effects.UNLUCK, (int) 60, (int) 1, (false), (true)));
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
								}
							}
						}
						if (Math.random() < 0.0005) {
							if (!(entityiterator == entity)) {
								if (entityiterator instanceof LivingEntity)
									((LivingEntity) entityiterator)
											.addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 60, (int) 1, (false), (true)));
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
								}
							}
						}
						if (Math.random() < 0.0005) {
							if (!(entityiterator == entity)) {
								entityiterator.setFire((int) 1);
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 5, 1, 1, 1, 1);
								}
							}
						}
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 20);
	}
}
