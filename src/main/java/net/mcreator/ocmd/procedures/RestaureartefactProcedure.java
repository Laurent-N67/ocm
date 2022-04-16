package net.mcreator.ocmd.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ocmd.item.SpinelringItem;
import net.mcreator.ocmd.item.RingioliteItem;
import net.mcreator.ocmd.item.RingametisteItem;
import net.mcreator.ocmd.item.PeridotbeltItem;
import net.mcreator.ocmd.item.NeckspeedItem;
import net.mcreator.ocmd.item.NeckresistanceItem;
import net.mcreator.ocmd.item.NeckofstrengItem;
import net.mcreator.ocmd.item.NeckoflightningItem;
import net.mcreator.ocmd.item.NeckofhastItem;
import net.mcreator.ocmd.item.IolitebeltItem;
import net.mcreator.ocmd.item.AmberringItem;
import net.mcreator.ocmd.OcmModVariables;
import net.mcreator.ocmd.OcmMod;

import java.util.function.Supplier;
import java.util.Map;

public class RestaureartefactProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OcmMod.LOGGER.warn("Failed to load dependency world for procedure Restaureartefact!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure Restaureartefact!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
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
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(NeckspeedItem.block);
								_setstack.setCount((int) 1);
								((Slot) ((Map) invobj).get((int) (90))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else {
					if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new OcmModVariables.PlayerVariables())).artefact1 == 2) {
						if (entity instanceof PlayerEntity) {
							Container _current = ((PlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack _setstack = new ItemStack(NeckresistanceItem.block);
									_setstack.setCount((int) 1);
									((Slot) ((Map) invobj).get((int) (90))).putStack(_setstack);
									_current.detectAndSendChanges();
								}
							}
						}
					} else {
						if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new OcmModVariables.PlayerVariables())).artefact1 == 3) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(NeckofstrengItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (90))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						} else {
							if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new OcmModVariables.PlayerVariables())).artefact1 == 4) {
								if (entity instanceof PlayerEntity) {
									Container _current = ((PlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack _setstack = new ItemStack(NeckofhastItem.block);
											_setstack.setCount((int) 1);
											((Slot) ((Map) invobj).get((int) (90))).putStack(_setstack);
											_current.detectAndSendChanges();
										}
									}
								}
							} else {
								if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new OcmModVariables.PlayerVariables())).artefact1 == 5) {
									if (entity instanceof PlayerEntity) {
										Container _current = ((PlayerEntity) entity).openContainer;
										if (_current instanceof Supplier) {
											Object invobj = ((Supplier) _current).get();
											if (invobj instanceof Map) {
												ItemStack _setstack = new ItemStack(NeckoflightningItem.block);
												_setstack.setCount((int) 1);
												((Slot) ((Map) invobj).get((int) (90))).putStack(_setstack);
												_current.detectAndSendChanges();
											}
										}
									}
								} else {
									if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new OcmModVariables.PlayerVariables())).artefact1 == 6) {
										if (entity instanceof PlayerEntity) {
											Container _current = ((PlayerEntity) entity).openContainer;
											if (_current instanceof Supplier) {
												Object invobj = ((Supplier) _current).get();
												if (invobj instanceof Map) {
													ItemStack _setstack = new ItemStack(RingioliteItem.block);
													_setstack.setCount((int) 1);
													((Slot) ((Map) invobj).get((int) (90))).putStack(_setstack);
													_current.detectAndSendChanges();
												}
											}
										}
									} else {
										if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new OcmModVariables.PlayerVariables())).artefact1 == 7) {
											if (entity instanceof PlayerEntity) {
												Container _current = ((PlayerEntity) entity).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														ItemStack _setstack = new ItemStack(AmberringItem.block);
														_setstack.setCount((int) 1);
														((Slot) ((Map) invobj).get((int) (90))).putStack(_setstack);
														_current.detectAndSendChanges();
													}
												}
											}
										} else {
											if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new OcmModVariables.PlayerVariables())).artefact1 == 8) {
												if (entity instanceof PlayerEntity) {
													Container _current = ((PlayerEntity) entity).openContainer;
													if (_current instanceof Supplier) {
														Object invobj = ((Supplier) _current).get();
														if (invobj instanceof Map) {
															ItemStack _setstack = new ItemStack(SpinelringItem.block);
															_setstack.setCount((int) 1);
															((Slot) ((Map) invobj).get((int) (90))).putStack(_setstack);
															_current.detectAndSendChanges();
														}
													}
												}
											} else {
												if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
														.orElse(new OcmModVariables.PlayerVariables())).artefact1 == 9) {
													if (entity instanceof PlayerEntity) {
														Container _current = ((PlayerEntity) entity).openContainer;
														if (_current instanceof Supplier) {
															Object invobj = ((Supplier) _current).get();
															if (invobj instanceof Map) {
																ItemStack _setstack = new ItemStack(RingametisteItem.block);
																_setstack.setCount((int) 1);
																((Slot) ((Map) invobj).get((int) (90))).putStack(_setstack);
																_current.detectAndSendChanges();
															}
														}
													}
												} else {
													if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
															.orElse(new OcmModVariables.PlayerVariables())).artefact1 == 10) {
														if (entity instanceof PlayerEntity) {
															Container _current = ((PlayerEntity) entity).openContainer;
															if (_current instanceof Supplier) {
																Object invobj = ((Supplier) _current).get();
																if (invobj instanceof Map) {
																	ItemStack _setstack = new ItemStack(IolitebeltItem.block);
																	_setstack.setCount((int) 1);
																	((Slot) ((Map) invobj).get((int) (90))).putStack(_setstack);
																	_current.detectAndSendChanges();
																}
															}
														}
													} else {
														if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																.orElse(new OcmModVariables.PlayerVariables())).artefact1 == 11) {
															if (entity instanceof PlayerEntity) {
																Container _current = ((PlayerEntity) entity).openContainer;
																if (_current instanceof Supplier) {
																	Object invobj = ((Supplier) _current).get();
																	if (invobj instanceof Map) {
																		ItemStack _setstack = new ItemStack(PeridotbeltItem.block);
																		_setstack.setCount((int) 1);
																		((Slot) ((Map) invobj).get((int) (90))).putStack(_setstack);
																		_current.detectAndSendChanges();
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).artefact2 == 1) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(NeckspeedItem.block);
								_setstack.setCount((int) 1);
								((Slot) ((Map) invobj).get((int) (91))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else {
					if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new OcmModVariables.PlayerVariables())).artefact2 == 2) {
						if (entity instanceof PlayerEntity) {
							Container _current = ((PlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack _setstack = new ItemStack(NeckresistanceItem.block);
									_setstack.setCount((int) 1);
									((Slot) ((Map) invobj).get((int) (91))).putStack(_setstack);
									_current.detectAndSendChanges();
								}
							}
						}
					} else {
						if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new OcmModVariables.PlayerVariables())).artefact2 == 3) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(NeckofstrengItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (91))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						} else {
							if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new OcmModVariables.PlayerVariables())).artefact2 == 4) {
								if (entity instanceof PlayerEntity) {
									Container _current = ((PlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack _setstack = new ItemStack(NeckofhastItem.block);
											_setstack.setCount((int) 1);
											((Slot) ((Map) invobj).get((int) (91))).putStack(_setstack);
											_current.detectAndSendChanges();
										}
									}
								}
							} else {
								if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new OcmModVariables.PlayerVariables())).artefact2 == 5) {
									if (entity instanceof PlayerEntity) {
										Container _current = ((PlayerEntity) entity).openContainer;
										if (_current instanceof Supplier) {
											Object invobj = ((Supplier) _current).get();
											if (invobj instanceof Map) {
												ItemStack _setstack = new ItemStack(NeckoflightningItem.block);
												_setstack.setCount((int) 1);
												((Slot) ((Map) invobj).get((int) (91))).putStack(_setstack);
												_current.detectAndSendChanges();
											}
										}
									}
								} else {
									if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new OcmModVariables.PlayerVariables())).artefact2 == 6) {
										if (entity instanceof PlayerEntity) {
											Container _current = ((PlayerEntity) entity).openContainer;
											if (_current instanceof Supplier) {
												Object invobj = ((Supplier) _current).get();
												if (invobj instanceof Map) {
													ItemStack _setstack = new ItemStack(RingioliteItem.block);
													_setstack.setCount((int) 1);
													((Slot) ((Map) invobj).get((int) (91))).putStack(_setstack);
													_current.detectAndSendChanges();
												}
											}
										}
									} else {
										if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new OcmModVariables.PlayerVariables())).artefact2 == 7) {
											if (entity instanceof PlayerEntity) {
												Container _current = ((PlayerEntity) entity).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														ItemStack _setstack = new ItemStack(AmberringItem.block);
														_setstack.setCount((int) 1);
														((Slot) ((Map) invobj).get((int) (91))).putStack(_setstack);
														_current.detectAndSendChanges();
													}
												}
											}
										} else {
											if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new OcmModVariables.PlayerVariables())).artefact2 == 8) {
												if (entity instanceof PlayerEntity) {
													Container _current = ((PlayerEntity) entity).openContainer;
													if (_current instanceof Supplier) {
														Object invobj = ((Supplier) _current).get();
														if (invobj instanceof Map) {
															ItemStack _setstack = new ItemStack(SpinelringItem.block);
															_setstack.setCount((int) 1);
															((Slot) ((Map) invobj).get((int) (91))).putStack(_setstack);
															_current.detectAndSendChanges();
														}
													}
												}
											} else {
												if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
														.orElse(new OcmModVariables.PlayerVariables())).artefact2 == 9) {
													if (entity instanceof PlayerEntity) {
														Container _current = ((PlayerEntity) entity).openContainer;
														if (_current instanceof Supplier) {
															Object invobj = ((Supplier) _current).get();
															if (invobj instanceof Map) {
																ItemStack _setstack = new ItemStack(RingametisteItem.block);
																_setstack.setCount((int) 1);
																((Slot) ((Map) invobj).get((int) (91))).putStack(_setstack);
																_current.detectAndSendChanges();
															}
														}
													}
												} else {
													if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
															.orElse(new OcmModVariables.PlayerVariables())).artefact2 == 10) {
														if (entity instanceof PlayerEntity) {
															Container _current = ((PlayerEntity) entity).openContainer;
															if (_current instanceof Supplier) {
																Object invobj = ((Supplier) _current).get();
																if (invobj instanceof Map) {
																	ItemStack _setstack = new ItemStack(IolitebeltItem.block);
																	_setstack.setCount((int) 1);
																	((Slot) ((Map) invobj).get((int) (91))).putStack(_setstack);
																	_current.detectAndSendChanges();
																}
															}
														}
													} else {
														if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																.orElse(new OcmModVariables.PlayerVariables())).artefact2 == 11) {
															if (entity instanceof PlayerEntity) {
																Container _current = ((PlayerEntity) entity).openContainer;
																if (_current instanceof Supplier) {
																	Object invobj = ((Supplier) _current).get();
																	if (invobj instanceof Map) {
																		ItemStack _setstack = new ItemStack(PeridotbeltItem.block);
																		_setstack.setCount((int) 1);
																		((Slot) ((Map) invobj).get((int) (91))).putStack(_setstack);
																		_current.detectAndSendChanges();
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).artefact3 == 1) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(NeckspeedItem.block);
								_setstack.setCount((int) 1);
								((Slot) ((Map) invobj).get((int) (92))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else {
					if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new OcmModVariables.PlayerVariables())).artefact3 == 2) {
						if (entity instanceof PlayerEntity) {
							Container _current = ((PlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack _setstack = new ItemStack(NeckresistanceItem.block);
									_setstack.setCount((int) 1);
									((Slot) ((Map) invobj).get((int) (92))).putStack(_setstack);
									_current.detectAndSendChanges();
								}
							}
						}
					} else {
						if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new OcmModVariables.PlayerVariables())).artefact3 == 3) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(NeckofstrengItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (92))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						} else {
							if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new OcmModVariables.PlayerVariables())).artefact3 == 4) {
								if (entity instanceof PlayerEntity) {
									Container _current = ((PlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack _setstack = new ItemStack(NeckofhastItem.block);
											_setstack.setCount((int) 1);
											((Slot) ((Map) invobj).get((int) (92))).putStack(_setstack);
											_current.detectAndSendChanges();
										}
									}
								}
							} else {
								if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new OcmModVariables.PlayerVariables())).artefact3 == 5) {
									if (entity instanceof PlayerEntity) {
										Container _current = ((PlayerEntity) entity).openContainer;
										if (_current instanceof Supplier) {
											Object invobj = ((Supplier) _current).get();
											if (invobj instanceof Map) {
												ItemStack _setstack = new ItemStack(NeckoflightningItem.block);
												_setstack.setCount((int) 1);
												((Slot) ((Map) invobj).get((int) (92))).putStack(_setstack);
												_current.detectAndSendChanges();
											}
										}
									}
								} else {
									if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new OcmModVariables.PlayerVariables())).artefact3 == 6) {
										if (entity instanceof PlayerEntity) {
											Container _current = ((PlayerEntity) entity).openContainer;
											if (_current instanceof Supplier) {
												Object invobj = ((Supplier) _current).get();
												if (invobj instanceof Map) {
													ItemStack _setstack = new ItemStack(RingioliteItem.block);
													_setstack.setCount((int) 1);
													((Slot) ((Map) invobj).get((int) (92))).putStack(_setstack);
													_current.detectAndSendChanges();
												}
											}
										}
									} else {
										if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new OcmModVariables.PlayerVariables())).artefact3 == 7) {
											if (entity instanceof PlayerEntity) {
												Container _current = ((PlayerEntity) entity).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														ItemStack _setstack = new ItemStack(AmberringItem.block);
														_setstack.setCount((int) 1);
														((Slot) ((Map) invobj).get((int) (92))).putStack(_setstack);
														_current.detectAndSendChanges();
													}
												}
											}
										} else {
											if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new OcmModVariables.PlayerVariables())).artefact3 == 8) {
												if (entity instanceof PlayerEntity) {
													Container _current = ((PlayerEntity) entity).openContainer;
													if (_current instanceof Supplier) {
														Object invobj = ((Supplier) _current).get();
														if (invobj instanceof Map) {
															ItemStack _setstack = new ItemStack(SpinelringItem.block);
															_setstack.setCount((int) 1);
															((Slot) ((Map) invobj).get((int) (92))).putStack(_setstack);
															_current.detectAndSendChanges();
														}
													}
												}
											} else {
												if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
														.orElse(new OcmModVariables.PlayerVariables())).artefact3 == 9) {
													if (entity instanceof PlayerEntity) {
														Container _current = ((PlayerEntity) entity).openContainer;
														if (_current instanceof Supplier) {
															Object invobj = ((Supplier) _current).get();
															if (invobj instanceof Map) {
																ItemStack _setstack = new ItemStack(RingametisteItem.block);
																_setstack.setCount((int) 1);
																((Slot) ((Map) invobj).get((int) (92))).putStack(_setstack);
																_current.detectAndSendChanges();
															}
														}
													}
												} else {
													if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
															.orElse(new OcmModVariables.PlayerVariables())).artefact3 == 10) {
														if (entity instanceof PlayerEntity) {
															Container _current = ((PlayerEntity) entity).openContainer;
															if (_current instanceof Supplier) {
																Object invobj = ((Supplier) _current).get();
																if (invobj instanceof Map) {
																	ItemStack _setstack = new ItemStack(IolitebeltItem.block);
																	_setstack.setCount((int) 1);
																	((Slot) ((Map) invobj).get((int) (92))).putStack(_setstack);
																	_current.detectAndSendChanges();
																}
															}
														}
													} else {
														if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																.orElse(new OcmModVariables.PlayerVariables())).artefact3 == 11) {
															if (entity instanceof PlayerEntity) {
																Container _current = ((PlayerEntity) entity).openContainer;
																if (_current instanceof Supplier) {
																	Object invobj = ((Supplier) _current).get();
																	if (invobj instanceof Map) {
																		ItemStack _setstack = new ItemStack(PeridotbeltItem.block);
																		_setstack.setCount((int) 1);
																		((Slot) ((Map) invobj).get((int) (92))).putStack(_setstack);
																		_current.detectAndSendChanges();
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).artefact4 == 1) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(NeckspeedItem.block);
								_setstack.setCount((int) 1);
								((Slot) ((Map) invobj).get((int) (93))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else {
					if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new OcmModVariables.PlayerVariables())).artefact4 == 2) {
						if (entity instanceof PlayerEntity) {
							Container _current = ((PlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack _setstack = new ItemStack(NeckresistanceItem.block);
									_setstack.setCount((int) 1);
									((Slot) ((Map) invobj).get((int) (93))).putStack(_setstack);
									_current.detectAndSendChanges();
								}
							}
						}
					} else {
						if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new OcmModVariables.PlayerVariables())).artefact4 == 3) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(NeckofstrengItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (93))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						} else {
							if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new OcmModVariables.PlayerVariables())).artefact4 == 4) {
								if (entity instanceof PlayerEntity) {
									Container _current = ((PlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack _setstack = new ItemStack(NeckofhastItem.block);
											_setstack.setCount((int) 1);
											((Slot) ((Map) invobj).get((int) (93))).putStack(_setstack);
											_current.detectAndSendChanges();
										}
									}
								}
							} else {
								if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new OcmModVariables.PlayerVariables())).artefact4 == 5) {
									if (entity instanceof PlayerEntity) {
										Container _current = ((PlayerEntity) entity).openContainer;
										if (_current instanceof Supplier) {
											Object invobj = ((Supplier) _current).get();
											if (invobj instanceof Map) {
												ItemStack _setstack = new ItemStack(NeckoflightningItem.block);
												_setstack.setCount((int) 1);
												((Slot) ((Map) invobj).get((int) (93))).putStack(_setstack);
												_current.detectAndSendChanges();
											}
										}
									}
								} else {
									if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new OcmModVariables.PlayerVariables())).artefact4 == 6) {
										if (entity instanceof PlayerEntity) {
											Container _current = ((PlayerEntity) entity).openContainer;
											if (_current instanceof Supplier) {
												Object invobj = ((Supplier) _current).get();
												if (invobj instanceof Map) {
													ItemStack _setstack = new ItemStack(RingioliteItem.block);
													_setstack.setCount((int) 1);
													((Slot) ((Map) invobj).get((int) (93))).putStack(_setstack);
													_current.detectAndSendChanges();
												}
											}
										}
									} else {
										if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new OcmModVariables.PlayerVariables())).artefact4 == 7) {
											if (entity instanceof PlayerEntity) {
												Container _current = ((PlayerEntity) entity).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														ItemStack _setstack = new ItemStack(AmberringItem.block);
														_setstack.setCount((int) 1);
														((Slot) ((Map) invobj).get((int) (93))).putStack(_setstack);
														_current.detectAndSendChanges();
													}
												}
											}
										} else {
											if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new OcmModVariables.PlayerVariables())).artefact4 == 8) {
												if (entity instanceof PlayerEntity) {
													Container _current = ((PlayerEntity) entity).openContainer;
													if (_current instanceof Supplier) {
														Object invobj = ((Supplier) _current).get();
														if (invobj instanceof Map) {
															ItemStack _setstack = new ItemStack(SpinelringItem.block);
															_setstack.setCount((int) 1);
															((Slot) ((Map) invobj).get((int) (93))).putStack(_setstack);
															_current.detectAndSendChanges();
														}
													}
												}
											} else {
												if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
														.orElse(new OcmModVariables.PlayerVariables())).artefact4 == 9) {
													if (entity instanceof PlayerEntity) {
														Container _current = ((PlayerEntity) entity).openContainer;
														if (_current instanceof Supplier) {
															Object invobj = ((Supplier) _current).get();
															if (invobj instanceof Map) {
																ItemStack _setstack = new ItemStack(RingametisteItem.block);
																_setstack.setCount((int) 1);
																((Slot) ((Map) invobj).get((int) (93))).putStack(_setstack);
																_current.detectAndSendChanges();
															}
														}
													}
												} else {
													if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
															.orElse(new OcmModVariables.PlayerVariables())).artefact4 == 10) {
														if (entity instanceof PlayerEntity) {
															Container _current = ((PlayerEntity) entity).openContainer;
															if (_current instanceof Supplier) {
																Object invobj = ((Supplier) _current).get();
																if (invobj instanceof Map) {
																	ItemStack _setstack = new ItemStack(IolitebeltItem.block);
																	_setstack.setCount((int) 1);
																	((Slot) ((Map) invobj).get((int) (93))).putStack(_setstack);
																	_current.detectAndSendChanges();
																}
															}
														}
													} else {
														if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																.orElse(new OcmModVariables.PlayerVariables())).artefact4 == 11) {
															if (entity instanceof PlayerEntity) {
																Container _current = ((PlayerEntity) entity).openContainer;
																if (_current instanceof Supplier) {
																	Object invobj = ((Supplier) _current).get();
																	if (invobj instanceof Map) {
																		ItemStack _setstack = new ItemStack(PeridotbeltItem.block);
																		_setstack.setCount((int) 1);
																		((Slot) ((Map) invobj).get((int) (93))).putStack(_setstack);
																		_current.detectAndSendChanges();
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).artefact5 == 1) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(NeckspeedItem.block);
								_setstack.setCount((int) 1);
								((Slot) ((Map) invobj).get((int) (94))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else {
					if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new OcmModVariables.PlayerVariables())).artefact5 == 2) {
						if (entity instanceof PlayerEntity) {
							Container _current = ((PlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack _setstack = new ItemStack(NeckresistanceItem.block);
									_setstack.setCount((int) 1);
									((Slot) ((Map) invobj).get((int) (94))).putStack(_setstack);
									_current.detectAndSendChanges();
								}
							}
						}
					} else {
						if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new OcmModVariables.PlayerVariables())).artefact5 == 3) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(NeckofstrengItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (94))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						} else {
							if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new OcmModVariables.PlayerVariables())).artefact5 == 4) {
								if (entity instanceof PlayerEntity) {
									Container _current = ((PlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack _setstack = new ItemStack(NeckofhastItem.block);
											_setstack.setCount((int) 1);
											((Slot) ((Map) invobj).get((int) (94))).putStack(_setstack);
											_current.detectAndSendChanges();
										}
									}
								}
							} else {
								if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new OcmModVariables.PlayerVariables())).artefact5 == 5) {
									if (entity instanceof PlayerEntity) {
										Container _current = ((PlayerEntity) entity).openContainer;
										if (_current instanceof Supplier) {
											Object invobj = ((Supplier) _current).get();
											if (invobj instanceof Map) {
												ItemStack _setstack = new ItemStack(NeckoflightningItem.block);
												_setstack.setCount((int) 1);
												((Slot) ((Map) invobj).get((int) (94))).putStack(_setstack);
												_current.detectAndSendChanges();
											}
										}
									}
								} else {
									if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new OcmModVariables.PlayerVariables())).artefact5 == 6) {
										if (entity instanceof PlayerEntity) {
											Container _current = ((PlayerEntity) entity).openContainer;
											if (_current instanceof Supplier) {
												Object invobj = ((Supplier) _current).get();
												if (invobj instanceof Map) {
													ItemStack _setstack = new ItemStack(RingioliteItem.block);
													_setstack.setCount((int) 1);
													((Slot) ((Map) invobj).get((int) (94))).putStack(_setstack);
													_current.detectAndSendChanges();
												}
											}
										}
									} else {
										if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new OcmModVariables.PlayerVariables())).artefact5 == 7) {
											if (entity instanceof PlayerEntity) {
												Container _current = ((PlayerEntity) entity).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														ItemStack _setstack = new ItemStack(AmberringItem.block);
														_setstack.setCount((int) 1);
														((Slot) ((Map) invobj).get((int) (94))).putStack(_setstack);
														_current.detectAndSendChanges();
													}
												}
											}
										} else {
											if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new OcmModVariables.PlayerVariables())).artefact5 == 8) {
												if (entity instanceof PlayerEntity) {
													Container _current = ((PlayerEntity) entity).openContainer;
													if (_current instanceof Supplier) {
														Object invobj = ((Supplier) _current).get();
														if (invobj instanceof Map) {
															ItemStack _setstack = new ItemStack(SpinelringItem.block);
															_setstack.setCount((int) 1);
															((Slot) ((Map) invobj).get((int) (94))).putStack(_setstack);
															_current.detectAndSendChanges();
														}
													}
												}
											} else {
												if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
														.orElse(new OcmModVariables.PlayerVariables())).artefact5 == 9) {
													if (entity instanceof PlayerEntity) {
														Container _current = ((PlayerEntity) entity).openContainer;
														if (_current instanceof Supplier) {
															Object invobj = ((Supplier) _current).get();
															if (invobj instanceof Map) {
																ItemStack _setstack = new ItemStack(RingametisteItem.block);
																_setstack.setCount((int) 1);
																((Slot) ((Map) invobj).get((int) (94))).putStack(_setstack);
																_current.detectAndSendChanges();
															}
														}
													}
												} else {
													if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
															.orElse(new OcmModVariables.PlayerVariables())).artefact5 == 10) {
														if (entity instanceof PlayerEntity) {
															Container _current = ((PlayerEntity) entity).openContainer;
															if (_current instanceof Supplier) {
																Object invobj = ((Supplier) _current).get();
																if (invobj instanceof Map) {
																	ItemStack _setstack = new ItemStack(IolitebeltItem.block);
																	_setstack.setCount((int) 1);
																	((Slot) ((Map) invobj).get((int) (94))).putStack(_setstack);
																	_current.detectAndSendChanges();
																}
															}
														}
													} else {
														if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																.orElse(new OcmModVariables.PlayerVariables())).artefact5 == 11) {
															if (entity instanceof PlayerEntity) {
																Container _current = ((PlayerEntity) entity).openContainer;
																if (_current instanceof Supplier) {
																	Object invobj = ((Supplier) _current).get();
																	if (invobj instanceof Map) {
																		ItemStack _setstack = new ItemStack(PeridotbeltItem.block);
																		_setstack.setCount((int) 1);
																		((Slot) ((Map) invobj).get((int) (94))).putStack(_setstack);
																		_current.detectAndSendChanges();
																	}
																}
															}
														}
													}
												}
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
		}.start(world, (int) 1);
	}
}
