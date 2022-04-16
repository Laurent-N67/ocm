package net.mcreator.ocmd.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;

import net.mcreator.ocmd.entity.CreeperqueenEntity;
import net.mcreator.ocmd.OcmMod;

import java.util.Map;

public class CreeperqueenspawnProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OcmMod.LOGGER.warn("Failed to load dependency world for procedure Creeperqueenspawn!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OcmMod.LOGGER.warn("Failed to load dependency x for procedure Creeperqueenspawn!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OcmMod.LOGGER.warn("Failed to load dependency y for procedure Creeperqueenspawn!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OcmMod.LOGGER.warn("Failed to load dependency z for procedure Creeperqueenspawn!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
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
							_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) x, (int) y, (int) z)));
							_ent.setEffectOnly(false);
							((World) world).addEntity(_ent);
						}
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
									_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) x, (int) y, (int) z)));
									_ent.setEffectOnly(false);
									((World) world).addEntity(_ent);
								}
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
													Entity entityToSpawn = new CreeperEntity(EntityType.CREEPER, (World) world);
													entityToSpawn.setLocationAndAngles(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
													if (entityToSpawn instanceof MobEntity)
														((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
																(ILivingEntityData) null, (CompoundNBT) null);
													world.addEntity(entityToSpawn);
												}
												if (world instanceof ServerWorld) {
													LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
													_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) x, (int) (y + 1), (int) z)));
													_ent.setEffectOnly(false);
													((World) world).addEntity(_ent);
												}
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
														if (world instanceof World && !((World) world).isRemote) {
															((World) world).createExplosion(null, (int) x, (int) (y + 1), (int) z, (float) 5,
																	Explosion.Mode.NONE);
														}
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
																	_ent.moveForced(Vector3d
																			.copyCenteredHorizontally(new BlockPos((int) x, (int) (y + 1), (int) z)));
																	_ent.setEffectOnly(false);
																	((World) world).addEntity(_ent);
																}
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
																					Entity entityToSpawn = new CreeperEntity(EntityType.CREEPER,
																							(World) world);
																					entityToSpawn.setLocationAndAngles(x, (y + 1), z,
																							world.getRandom().nextFloat() * 360F, 0);
																					if (entityToSpawn instanceof MobEntity)
																						((MobEntity) entityToSpawn).onInitialSpawn(
																								(ServerWorld) world,
																								world.getDifficultyForLocation(
																										entityToSpawn.getPosition()),
																								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
																								(CompoundNBT) null);
																					world.addEntity(entityToSpawn);
																				}
																				if (world instanceof ServerWorld) {
																					LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT
																							.create((World) world);
																					_ent.moveForced(Vector3d.copyCenteredHorizontally(
																							new BlockPos((int) x, (int) (y + 1), (int) z)));
																					_ent.setEffectOnly(false);
																					((World) world).addEntity(_ent);
																				}
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
																						if (world instanceof World && !((World) world).isRemote) {
																							((World) world).createExplosion(null, (int) x,
																									(int) (y + 1), (int) z, (float) 5,
																									Explosion.Mode.NONE);
																						}
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
																									LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT
																											.create((World) world);
																									_ent.moveForced(Vector3d.copyCenteredHorizontally(
																											new BlockPos((int) x, (int) (y + 1),
																													(int) z)));
																									_ent.setEffectOnly(false);
																									((World) world).addEntity(_ent);
																								}
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
																									public void tick(
																											TickEvent.ServerTickEvent event) {
																										if (event.phase == TickEvent.Phase.END) {
																											this.ticks += 1;
																											if (this.ticks >= this.waitTicks)
																												run();
																										}
																									}

																									private void run() {
																										new Object() {
																											private int ticks = 0;
																											private float waitTicks;
																											private IWorld world;

																											public void start(IWorld world,
																													int waitTicks) {
																												this.waitTicks = waitTicks;
																												MinecraftForge.EVENT_BUS
																														.register(this);
																												this.world = world;
																											}

																											@SubscribeEvent
																											public void tick(
																													TickEvent.ServerTickEvent event) {
																												if (event.phase == TickEvent.Phase.END) {
																													this.ticks += 1;
																													if (this.ticks >= this.waitTicks)
																														run();
																												}
																											}

																											private void run() {
																												if (world instanceof ServerWorld) {
																													Entity entityToSpawn = new CreeperEntity(
																															EntityType.CREEPER,
																															(World) world);
																													entityToSpawn
																															.setLocationAndAngles(x,
																																	(y + 1), z,
																																	world.getRandom()
																																			.nextFloat()
																																			* 360F,
																																	0);
																													if (entityToSpawn instanceof MobEntity)
																														((MobEntity) entityToSpawn)
																																.onInitialSpawn(
																																		(ServerWorld) world,
																																		world.getDifficultyForLocation(
																																				entityToSpawn
																																						.getPosition()),
																																		SpawnReason.MOB_SUMMONED,
																																		(ILivingEntityData) null,
																																		(CompoundNBT) null);
																													world.addEntity(entityToSpawn);
																												}
																												if (world instanceof ServerWorld) {
																													LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT
																															.create((World) world);
																													_ent.moveForced(Vector3d
																															.copyCenteredHorizontally(
																																	new BlockPos(
																																			(int) x,
																																			(int) (y + 1),
																																			(int) z)));
																													_ent.setEffectOnly(false);
																													((World) world).addEntity(_ent);
																												}
																												new Object() {
																													private int ticks = 0;
																													private float waitTicks;
																													private IWorld world;

																													public void start(IWorld world,
																															int waitTicks) {
																														this.waitTicks = waitTicks;
																														MinecraftForge.EVENT_BUS
																																.register(this);
																														this.world = world;
																													}

																													@SubscribeEvent
																													public void tick(
																															TickEvent.ServerTickEvent event) {
																														if (event.phase == TickEvent.Phase.END) {
																															this.ticks += 1;
																															if (this.ticks >= this.waitTicks)
																																run();
																														}
																													}

																													private void run() {
																														if (world instanceof World
																																&& !((World) world).isRemote) {
																															((World) world)
																																	.createExplosion(
																																			null,
																																			(int) x,
																																			(int) (y + 1),
																																			(int) z,
																																			(float) 5,
																																			Explosion.Mode.NONE);
																														}
																														new Object() {
																															private int ticks = 0;
																															private float waitTicks;
																															private IWorld world;

																															public void start(
																																	IWorld world,
																																	int waitTicks) {
																																this.waitTicks = waitTicks;
																																MinecraftForge.EVENT_BUS
																																		.register(
																																				this);
																																this.world = world;
																															}

																															@SubscribeEvent
																															public void tick(
																																	TickEvent.ServerTickEvent event) {
																																if (event.phase == TickEvent.Phase.END) {
																																	this.ticks += 1;
																																	if (this.ticks >= this.waitTicks)
																																		run();
																																}
																															}

																															private void run() {
																																if (world instanceof World
																																		&& !((World) world).isRemote) {
																																	((World) world)
																																			.createExplosion(
																																					null,
																																					(int) x,
																																					(int) (y + 1),
																																					(int) z,
																																					(float) 5,
																																					Explosion.Mode.NONE);
																																}
																																new Object() {
																																	private int ticks = 0;
																																	private float waitTicks;
																																	private IWorld world;

																																	public void start(
																																			IWorld world,
																																			int waitTicks) {
																																		this.waitTicks = waitTicks;
																																		MinecraftForge.EVENT_BUS
																																				.register(
																																						this);
																																		this.world = world;
																																	}

																																	@SubscribeEvent
																																	public void tick(
																																			TickEvent.ServerTickEvent event) {
																																		if (event.phase == TickEvent.Phase.END) {
																																			this.ticks += 1;
																																			if (this.ticks >= this.waitTicks)
																																				run();
																																		}
																																	}

																																	private void run() {
																																		if (world instanceof World
																																				&& !((World) world).isRemote) {
																																			((World) world)
																																					.createExplosion(
																																							null,
																																							(int) x,
																																							(int) (y + 1),
																																							(int) z,
																																							(float) 5,
																																							Explosion.Mode.NONE);
																																		}
																																		new Object() {
																																			private int ticks = 0;
																																			private float waitTicks;
																																			private IWorld world;

																																			public void start(
																																					IWorld world,
																																					int waitTicks) {
																																				this.waitTicks = waitTicks;
																																				MinecraftForge.EVENT_BUS
																																						.register(
																																								this);
																																				this.world = world;
																																			}

																																			@SubscribeEvent
																																			public void tick(
																																					TickEvent.ServerTickEvent event) {
																																				if (event.phase == TickEvent.Phase.END) {
																																					this.ticks += 1;
																																					if (this.ticks >= this.waitTicks)
																																						run();
																																				}
																																			}

																																			private void run() {
																																				if (world instanceof World
																																						&& !((World) world).isRemote) {
																																					((World) world)
																																							.createExplosion(
																																									null,
																																									(int) x,
																																									(int) (y + 1),
																																									(int) z,
																																									(float) 5,
																																									Explosion.Mode.NONE);
																																				}
																																				new Object() {
																																					private int ticks = 0;
																																					private float waitTicks;
																																					private IWorld world;

																																					public void start(
																																							IWorld world,
																																							int waitTicks) {
																																						this.waitTicks = waitTicks;
																																						MinecraftForge.EVENT_BUS
																																								.register(
																																										this);
																																						this.world = world;
																																					}

																																					@SubscribeEvent
																																					public void tick(
																																							TickEvent.ServerTickEvent event) {
																																						if (event.phase == TickEvent.Phase.END) {
																																							this.ticks += 1;
																																							if (this.ticks >= this.waitTicks)
																																								run();
																																						}
																																					}

																																					private void run() {
																																						if (world instanceof ServerWorld) {
																																							Entity entityToSpawn = new CreeperqueenEntity.CustomEntity(
																																									CreeperqueenEntity.entity,
																																									(World) world);
																																							entityToSpawn
																																									.setLocationAndAngles(
																																											x,
																																											(y + 1),
																																											z,
																																											world.getRandom()
																																													.nextFloat()
																																													* 360F,
																																											0);
																																							if (entityToSpawn instanceof MobEntity)
																																								((MobEntity) entityToSpawn)
																																										.onInitialSpawn(
																																												(ServerWorld) world,
																																												world.getDifficultyForLocation(
																																														entityToSpawn
																																																.getPosition()),
																																												SpawnReason.MOB_SUMMONED,
																																												(ILivingEntityData) null,
																																												(CompoundNBT) null);
																																							world.addEntity(
																																									entityToSpawn);
																																						}
																																						MinecraftForge.EVENT_BUS
																																								.unregister(
																																										this);
																																					}
																																				}.start(world,
																																						(int) 20);
																																				MinecraftForge.EVENT_BUS
																																						.unregister(
																																								this);
																																			}
																																		}.start(world,
																																				(int) 20);
																																		MinecraftForge.EVENT_BUS
																																				.unregister(
																																						this);
																																	}
																																}.start(world,
																																		(int) 20);
																																MinecraftForge.EVENT_BUS
																																		.unregister(
																																				this);
																															}
																														}.start(world, (int) 40);
																														MinecraftForge.EVENT_BUS
																																.unregister(this);
																													}
																												}.start(world, (int) 30);
																												MinecraftForge.EVENT_BUS
																														.unregister(this);
																											}
																										}.start(world, (int) 20);
																										MinecraftForge.EVENT_BUS.unregister(this);
																									}
																								}.start(world, (int) 40);
																								MinecraftForge.EVENT_BUS.unregister(this);
																							}
																						}.start(world, (int) 40);
																						MinecraftForge.EVENT_BUS.unregister(this);
																					}
																				}.start(world, (int) 30);
																				MinecraftForge.EVENT_BUS.unregister(this);
																			}
																		}.start(world, (int) 20);
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 40);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 40);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 30);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 20);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 40);
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 20);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 40);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 40);
	}
}
