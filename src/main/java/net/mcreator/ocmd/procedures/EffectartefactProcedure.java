package net.mcreator.ocmd.procedures;

import net.minecraftforge.fml.common.Mod;
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
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;

import net.mcreator.ocmd.OcmModVariables;
import net.mcreator.ocmd.OcmMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Comparator;

public class EffectartefactProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				Entity entity = event.player;
				World world = entity.world;
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OcmMod.LOGGER.warn("Failed to load dependency world for procedure Effectartefact!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OcmMod.LOGGER.warn("Failed to load dependency x for procedure Effectartefact!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OcmMod.LOGGER.warn("Failed to load dependency y for procedure Effectartefact!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OcmMod.LOGGER.warn("Failed to load dependency z for procedure Effectartefact!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure Effectartefact!");
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
				if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).artefact1 == 1) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 60, (int) 1, (false), (false)));
				} else {
					if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new OcmModVariables.PlayerVariables())).artefact2 == 1) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 60, (int) 1, (false), (false)));
					} else {
						if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new OcmModVariables.PlayerVariables())).artefact3 == 1) {
							if (entity instanceof LivingEntity)
								((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 60, (int) 1, (false), (false)));
						} else {
							if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new OcmModVariables.PlayerVariables())).artefact4 == 1) {
								if (entity instanceof LivingEntity)
									((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 60, (int) 1, (false), (false)));
							} else {
								if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new OcmModVariables.PlayerVariables())).artefact5 == 1) {
									if (entity instanceof LivingEntity)
										((LivingEntity) entity)
												.addPotionEffect(new EffectInstance(Effects.SPEED, (int) 60, (int) 1, (false), (false)));
								}
							}
						}
					}
				}
				if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).artefact1 == 2) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 60, (int) 1, (false), (false)));
				} else {
					if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new OcmModVariables.PlayerVariables())).artefact2 == 2) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 60, (int) 1, (false), (false)));
					} else {
						if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new OcmModVariables.PlayerVariables())).artefact3 == 2) {
							if (entity instanceof LivingEntity)
								((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 60, (int) 1, (false), (false)));
						} else {
							if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new OcmModVariables.PlayerVariables())).artefact4 == 2) {
								if (entity instanceof LivingEntity)
									((LivingEntity) entity)
											.addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 60, (int) 1, (false), (false)));
							} else {
								if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new OcmModVariables.PlayerVariables())).artefact5 == 2) {
									if (entity instanceof LivingEntity)
										((LivingEntity) entity)
												.addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 60, (int) 1, (false), (false)));
								}
							}
						}
					}
				}
				if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).artefact1 == 3) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 60, (int) 1, (false), (false)));
				} else {
					if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new OcmModVariables.PlayerVariables())).artefact2 == 3) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 60, (int) 1, (false), (false)));
					} else {
						if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new OcmModVariables.PlayerVariables())).artefact3 == 3) {
							if (entity instanceof LivingEntity)
								((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 60, (int) 1, (false), (false)));
						} else {
							if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new OcmModVariables.PlayerVariables())).artefact4 == 3) {
								if (entity instanceof LivingEntity)
									((LivingEntity) entity)
											.addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 60, (int) 1, (false), (false)));
							} else {
								if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new OcmModVariables.PlayerVariables())).artefact5 == 3) {
									if (entity instanceof LivingEntity)
										((LivingEntity) entity)
												.addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 60, (int) 1, (false), (false)));
								}
							}
						}
					}
				}
				if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).artefact1 == 4) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HASTE, (int) 60, (int) 1, (false), (false)));
				} else {
					if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new OcmModVariables.PlayerVariables())).artefact2 == 4) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HASTE, (int) 60, (int) 1, (false), (false)));
					} else {
						if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new OcmModVariables.PlayerVariables())).artefact3 == 4) {
							if (entity instanceof LivingEntity)
								((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HASTE, (int) 60, (int) 1, (false), (false)));
						} else {
							if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new OcmModVariables.PlayerVariables())).artefact4 == 4) {
								if (entity instanceof LivingEntity)
									((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HASTE, (int) 60, (int) 1, (false), (false)));
							} else {
								if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new OcmModVariables.PlayerVariables())).artefact5 == 4) {
									if (entity instanceof LivingEntity)
										((LivingEntity) entity)
												.addPotionEffect(new EffectInstance(Effects.HASTE, (int) 60, (int) 1, (false), (false)));
								}
							}
						}
					}
				}
				if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).artefact1 == 8) {
					if (Math.random() < 0.0005) {
						{
							List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(x - (15 / 2d), y - (15 / 2d), z - (15 / 2d), x + (15 / 2d), y + (15 / 2d), z + (15 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(x, y, z)).collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity)) {
									if (!(entityiterator instanceof PlayerEntity)) {
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
												if (world instanceof ServerWorld) {
													LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
													_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) (entityiterator.getPosX()),
															(int) (entityiterator.getPosY()), (int) (entityiterator.getPosZ()))));
													_ent.setEffectOnly(false);
													((World) world).addEntity(_ent);
												}
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 20);
									}
								}
							}
						}
					}
				} else {
					if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new OcmModVariables.PlayerVariables())).artefact2 == 8) {
						if (Math.random() < 0.0005) {
							{
								List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
										new AxisAlignedBB(x - (15 / 2d), y - (15 / 2d), z - (15 / 2d), x + (15 / 2d), y + (15 / 2d), z + (15 / 2d)),
										null).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator
														.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
											}
										}.compareDistOf(x, y, z)).collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (!(entityiterator == entity)) {
										if (!(entityiterator instanceof PlayerEntity)) {
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
													if (world instanceof ServerWorld) {
														LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
														_ent.moveForced(
																Vector3d.copyCenteredHorizontally(new BlockPos((int) (entityiterator.getPosX()),
																		(int) (entityiterator.getPosY()), (int) (entityiterator.getPosZ()))));
														_ent.setEffectOnly(false);
														((World) world).addEntity(_ent);
													}
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, (int) 20);
										}
									}
								}
							}
						}
					} else {
						if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new OcmModVariables.PlayerVariables())).artefact3 == 8) {
							if (Math.random() < 0.0005) {
								{
									List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(x - (15 / 2d), y - (15 / 2d),
											z - (15 / 2d), x + (15 / 2d), y + (15 / 2d), z + (15 / 2d)), null).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator
															.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
												}
											}.compareDistOf(x, y, z)).collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (!(entityiterator == entity)) {
											if (!(entityiterator instanceof PlayerEntity)) {
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
														if (world instanceof ServerWorld) {
															LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
															_ent.moveForced(
																	Vector3d.copyCenteredHorizontally(new BlockPos((int) (entityiterator.getPosX()),
																			(int) (entityiterator.getPosY()), (int) (entityiterator.getPosZ()))));
															_ent.setEffectOnly(false);
															((World) world).addEntity(_ent);
														}
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 20);
											}
										}
									}
								}
							}
						} else {
							if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new OcmModVariables.PlayerVariables())).artefact4 == 8) {
								{
									List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(x - (15 / 2d), y - (15 / 2d),
											z - (15 / 2d), x + (15 / 2d), y + (15 / 2d), z + (15 / 2d)), null).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator
															.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
												}
											}.compareDistOf(x, y, z)).collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (!(entityiterator == entity)) {
											if (!(entityiterator instanceof PlayerEntity)) {
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
														if (world instanceof ServerWorld) {
															LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
															_ent.moveForced(
																	Vector3d.copyCenteredHorizontally(new BlockPos((int) (entityiterator.getPosX()),
																			(int) (entityiterator.getPosY()), (int) (entityiterator.getPosZ()))));
															_ent.setEffectOnly(false);
															((World) world).addEntity(_ent);
														}
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 20);
											}
										}
									}
								}
							}
						}
					}
				}
				if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).artefact1 == 7) {
					if (Math.random() < 0.0005) {
						{
							List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(x - (15 / 2d), y - (15 / 2d), z - (15 / 2d), x + (15 / 2d), y + (15 / 2d), z + (15 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(x, y, z)).collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity)) {
									if (!(entityiterator instanceof PlayerEntity)) {
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
												entityiterator.setFire((int) 8);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 20);
									}
								}
							}
						}
					}
				} else {
					if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new OcmModVariables.PlayerVariables())).artefact2 == 7) {
						if (Math.random() < 0.0005) {
							{
								List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
										new AxisAlignedBB(x - (15 / 2d), y - (15 / 2d), z - (15 / 2d), x + (15 / 2d), y + (15 / 2d), z + (15 / 2d)),
										null).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator
														.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
											}
										}.compareDistOf(x, y, z)).collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (!(entityiterator == entity)) {
										if (!(entityiterator instanceof PlayerEntity)) {
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
													entityiterator.setFire((int) 8);
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, (int) 20);
										}
									}
								}
							}
						}
					} else {
						if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new OcmModVariables.PlayerVariables())).artefact3 == 7) {
							if (Math.random() < 0.0005) {
								{
									List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(x - (15 / 2d), y - (15 / 2d),
											z - (15 / 2d), x + (15 / 2d), y + (15 / 2d), z + (15 / 2d)), null).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator
															.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
												}
											}.compareDistOf(x, y, z)).collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (!(entityiterator == entity)) {
											if (!(entityiterator instanceof PlayerEntity)) {
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
														entityiterator.setFire((int) 8);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 20);
											}
										}
									}
								}
							}
						} else {
							if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new OcmModVariables.PlayerVariables())).artefact4 == 7) {
								{
									List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(x - (15 / 2d), y - (15 / 2d),
											z - (15 / 2d), x + (15 / 2d), y + (15 / 2d), z + (15 / 2d)), null).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator
															.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
												}
											}.compareDistOf(x, y, z)).collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (!(entityiterator == entity)) {
											if (!(entityiterator instanceof PlayerEntity)) {
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
														entityiterator.setFire((int) 8);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 20);
											}
										}
									}
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
