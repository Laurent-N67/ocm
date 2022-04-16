package net.mcreator.ocmd.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
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

public class Slot1procedureProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure Slot1procedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			double _setval = 0;
			entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.artefact1 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 0;
			entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.artefact2 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 0;
			entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.artefact3 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 0;
			entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.artefact4 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 0;
			entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.artefact5 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (NeckspeedItem.block == (new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (90))).getItem()) {
			{
				double _setval = 1;
				entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.artefact1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			if (NeckresistanceItem.block == (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (90))).getItem()) {
				{
					double _setval = 2;
					entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.artefact1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				if (NeckofstrengItem.block == (new Object() {
					public ItemStack getItemStack(int sltid) {
						Entity _ent = entity;
						if (_ent instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) _ent).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									return ((Slot) ((Map) invobj).get(sltid)).getStack();
								}
							}
						}
						return ItemStack.EMPTY;
					}
				}.getItemStack((int) (90))).getItem()) {
					{
						double _setval = 3;
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.artefact1 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					if (NeckofhastItem.block == (new Object() {
						public ItemStack getItemStack(int sltid) {
							Entity _ent = entity;
							if (_ent instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) _ent).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (90))).getItem()) {
						{
							double _setval = 4;
							entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.artefact1 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else {
						if (RingioliteItem.block == (new Object() {
							public ItemStack getItemStack(int sltid) {
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											return ((Slot) ((Map) invobj).get(sltid)).getStack();
										}
									}
								}
								return ItemStack.EMPTY;
							}
						}.getItemStack((int) (90))).getItem()) {
							{
								double _setval = 6;
								entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.artefact1 = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							if (NeckoflightningItem.block == (new Object() {
								public ItemStack getItemStack(int sltid) {
									Entity _ent = entity;
									if (_ent instanceof ServerPlayerEntity) {
										Container _current = ((ServerPlayerEntity) _ent).openContainer;
										if (_current instanceof Supplier) {
											Object invobj = ((Supplier) _current).get();
											if (invobj instanceof Map) {
												return ((Slot) ((Map) invobj).get(sltid)).getStack();
											}
										}
									}
									return ItemStack.EMPTY;
								}
							}.getItemStack((int) (90))).getItem()) {
								{
									double _setval = 5;
									entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.artefact1 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else {
								if (AmberringItem.block == (new Object() {
									public ItemStack getItemStack(int sltid) {
										Entity _ent = entity;
										if (_ent instanceof ServerPlayerEntity) {
											Container _current = ((ServerPlayerEntity) _ent).openContainer;
											if (_current instanceof Supplier) {
												Object invobj = ((Supplier) _current).get();
												if (invobj instanceof Map) {
													return ((Slot) ((Map) invobj).get(sltid)).getStack();
												}
											}
										}
										return ItemStack.EMPTY;
									}
								}.getItemStack((int) (90))).getItem()) {
									{
										double _setval = 7;
										entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.artefact1 = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								} else {
									if (SpinelringItem.block == (new Object() {
										public ItemStack getItemStack(int sltid) {
											Entity _ent = entity;
											if (_ent instanceof ServerPlayerEntity) {
												Container _current = ((ServerPlayerEntity) _ent).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														return ((Slot) ((Map) invobj).get(sltid)).getStack();
													}
												}
											}
											return ItemStack.EMPTY;
										}
									}.getItemStack((int) (90))).getItem()) {
										{
											double _setval = 8;
											entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.artefact1 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									} else {
										if (RingametisteItem.block == (new Object() {
											public ItemStack getItemStack(int sltid) {
												Entity _ent = entity;
												if (_ent instanceof ServerPlayerEntity) {
													Container _current = ((ServerPlayerEntity) _ent).openContainer;
													if (_current instanceof Supplier) {
														Object invobj = ((Supplier) _current).get();
														if (invobj instanceof Map) {
															return ((Slot) ((Map) invobj).get(sltid)).getStack();
														}
													}
												}
												return ItemStack.EMPTY;
											}
										}.getItemStack((int) (90))).getItem()) {
											{
												double _setval = 9;
												entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.artefact1 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										} else {
											if (IolitebeltItem.block == (new Object() {
												public ItemStack getItemStack(int sltid) {
													Entity _ent = entity;
													if (_ent instanceof ServerPlayerEntity) {
														Container _current = ((ServerPlayerEntity) _ent).openContainer;
														if (_current instanceof Supplier) {
															Object invobj = ((Supplier) _current).get();
															if (invobj instanceof Map) {
																return ((Slot) ((Map) invobj).get(sltid)).getStack();
															}
														}
													}
													return ItemStack.EMPTY;
												}
											}.getItemStack((int) (90))).getItem()) {
												{
													double _setval = 10;
													entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.artefact1 = _setval;
														capability.syncPlayerVariables(entity);
													});
												}
											} else {
												if (PeridotbeltItem.block == (new Object() {
													public ItemStack getItemStack(int sltid) {
														Entity _ent = entity;
														if (_ent instanceof ServerPlayerEntity) {
															Container _current = ((ServerPlayerEntity) _ent).openContainer;
															if (_current instanceof Supplier) {
																Object invobj = ((Supplier) _current).get();
																if (invobj instanceof Map) {
																	return ((Slot) ((Map) invobj).get(sltid)).getStack();
																}
															}
														}
														return ItemStack.EMPTY;
													}
												}.getItemStack((int) (90))).getItem()) {
													{
														double _setval = 11;
														entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																.ifPresent(capability -> {
																	capability.artefact1 = _setval;
																	capability.syncPlayerVariables(entity);
																});
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
		if (NeckspeedItem.block == (new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (91))).getItem()) {
			{
				double _setval = 1;
				entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.artefact2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			if (NeckresistanceItem.block == (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (91))).getItem()) {
				{
					double _setval = 2;
					entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.artefact2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				if (NeckofstrengItem.block == (new Object() {
					public ItemStack getItemStack(int sltid) {
						Entity _ent = entity;
						if (_ent instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) _ent).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									return ((Slot) ((Map) invobj).get(sltid)).getStack();
								}
							}
						}
						return ItemStack.EMPTY;
					}
				}.getItemStack((int) (91))).getItem()) {
					{
						double _setval = 3;
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.artefact2 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					if (NeckofhastItem.block == (new Object() {
						public ItemStack getItemStack(int sltid) {
							Entity _ent = entity;
							if (_ent instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) _ent).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (91))).getItem()) {
						{
							double _setval = 4;
							entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.artefact2 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else {
						if (NeckoflightningItem.block == (new Object() {
							public ItemStack getItemStack(int sltid) {
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											return ((Slot) ((Map) invobj).get(sltid)).getStack();
										}
									}
								}
								return ItemStack.EMPTY;
							}
						}.getItemStack((int) (91))).getItem()) {
							{
								double _setval = 5;
								entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.artefact2 = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							if (RingioliteItem.block == (new Object() {
								public ItemStack getItemStack(int sltid) {
									Entity _ent = entity;
									if (_ent instanceof ServerPlayerEntity) {
										Container _current = ((ServerPlayerEntity) _ent).openContainer;
										if (_current instanceof Supplier) {
											Object invobj = ((Supplier) _current).get();
											if (invobj instanceof Map) {
												return ((Slot) ((Map) invobj).get(sltid)).getStack();
											}
										}
									}
									return ItemStack.EMPTY;
								}
							}.getItemStack((int) (91))).getItem()) {
								{
									double _setval = 6;
									entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.artefact2 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else {
								if (AmberringItem.block == (new Object() {
									public ItemStack getItemStack(int sltid) {
										Entity _ent = entity;
										if (_ent instanceof ServerPlayerEntity) {
											Container _current = ((ServerPlayerEntity) _ent).openContainer;
											if (_current instanceof Supplier) {
												Object invobj = ((Supplier) _current).get();
												if (invobj instanceof Map) {
													return ((Slot) ((Map) invobj).get(sltid)).getStack();
												}
											}
										}
										return ItemStack.EMPTY;
									}
								}.getItemStack((int) (91))).getItem()) {
									{
										double _setval = 7;
										entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.artefact2 = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								} else {
									if (SpinelringItem.block == (new Object() {
										public ItemStack getItemStack(int sltid) {
											Entity _ent = entity;
											if (_ent instanceof ServerPlayerEntity) {
												Container _current = ((ServerPlayerEntity) _ent).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														return ((Slot) ((Map) invobj).get(sltid)).getStack();
													}
												}
											}
											return ItemStack.EMPTY;
										}
									}.getItemStack((int) (91))).getItem()) {
										{
											double _setval = 8;
											entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.artefact2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									} else {
										if (RingametisteItem.block == (new Object() {
											public ItemStack getItemStack(int sltid) {
												Entity _ent = entity;
												if (_ent instanceof ServerPlayerEntity) {
													Container _current = ((ServerPlayerEntity) _ent).openContainer;
													if (_current instanceof Supplier) {
														Object invobj = ((Supplier) _current).get();
														if (invobj instanceof Map) {
															return ((Slot) ((Map) invobj).get(sltid)).getStack();
														}
													}
												}
												return ItemStack.EMPTY;
											}
										}.getItemStack((int) (91))).getItem()) {
											{
												double _setval = 9;
												entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.artefact2 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										} else {
											if (IolitebeltItem.block == (new Object() {
												public ItemStack getItemStack(int sltid) {
													Entity _ent = entity;
													if (_ent instanceof ServerPlayerEntity) {
														Container _current = ((ServerPlayerEntity) _ent).openContainer;
														if (_current instanceof Supplier) {
															Object invobj = ((Supplier) _current).get();
															if (invobj instanceof Map) {
																return ((Slot) ((Map) invobj).get(sltid)).getStack();
															}
														}
													}
													return ItemStack.EMPTY;
												}
											}.getItemStack((int) (91))).getItem()) {
												{
													double _setval = 10;
													entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.artefact2 = _setval;
														capability.syncPlayerVariables(entity);
													});
												}
											} else {
												if (PeridotbeltItem.block == (new Object() {
													public ItemStack getItemStack(int sltid) {
														Entity _ent = entity;
														if (_ent instanceof ServerPlayerEntity) {
															Container _current = ((ServerPlayerEntity) _ent).openContainer;
															if (_current instanceof Supplier) {
																Object invobj = ((Supplier) _current).get();
																if (invobj instanceof Map) {
																	return ((Slot) ((Map) invobj).get(sltid)).getStack();
																}
															}
														}
														return ItemStack.EMPTY;
													}
												}.getItemStack((int) (91))).getItem()) {
													{
														double _setval = 11;
														entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																.ifPresent(capability -> {
																	capability.artefact2 = _setval;
																	capability.syncPlayerVariables(entity);
																});
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
		if (NeckspeedItem.block == (new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (92))).getItem()) {
			{
				double _setval = 1;
				entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.artefact3 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			if (NeckresistanceItem.block == (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (92))).getItem()) {
				{
					double _setval = 2;
					entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.artefact3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				if (NeckofstrengItem.block == (new Object() {
					public ItemStack getItemStack(int sltid) {
						Entity _ent = entity;
						if (_ent instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) _ent).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									return ((Slot) ((Map) invobj).get(sltid)).getStack();
								}
							}
						}
						return ItemStack.EMPTY;
					}
				}.getItemStack((int) (92))).getItem()) {
					{
						double _setval = 3;
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.artefact3 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					if (NeckofhastItem.block == (new Object() {
						public ItemStack getItemStack(int sltid) {
							Entity _ent = entity;
							if (_ent instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) _ent).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (92))).getItem()) {
						{
							double _setval = 4;
							entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.artefact3 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else {
						if (NeckoflightningItem.block == (new Object() {
							public ItemStack getItemStack(int sltid) {
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											return ((Slot) ((Map) invobj).get(sltid)).getStack();
										}
									}
								}
								return ItemStack.EMPTY;
							}
						}.getItemStack((int) (92))).getItem()) {
							{
								double _setval = 5;
								entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.artefact3 = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							if (RingioliteItem.block == (new Object() {
								public ItemStack getItemStack(int sltid) {
									Entity _ent = entity;
									if (_ent instanceof ServerPlayerEntity) {
										Container _current = ((ServerPlayerEntity) _ent).openContainer;
										if (_current instanceof Supplier) {
											Object invobj = ((Supplier) _current).get();
											if (invobj instanceof Map) {
												return ((Slot) ((Map) invobj).get(sltid)).getStack();
											}
										}
									}
									return ItemStack.EMPTY;
								}
							}.getItemStack((int) (92))).getItem()) {
								{
									double _setval = 6;
									entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.artefact3 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else {
								if (AmberringItem.block == (new Object() {
									public ItemStack getItemStack(int sltid) {
										Entity _ent = entity;
										if (_ent instanceof ServerPlayerEntity) {
											Container _current = ((ServerPlayerEntity) _ent).openContainer;
											if (_current instanceof Supplier) {
												Object invobj = ((Supplier) _current).get();
												if (invobj instanceof Map) {
													return ((Slot) ((Map) invobj).get(sltid)).getStack();
												}
											}
										}
										return ItemStack.EMPTY;
									}
								}.getItemStack((int) (92))).getItem()) {
									{
										double _setval = 7;
										entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.artefact3 = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								} else {
									if (SpinelringItem.block == (new Object() {
										public ItemStack getItemStack(int sltid) {
											Entity _ent = entity;
											if (_ent instanceof ServerPlayerEntity) {
												Container _current = ((ServerPlayerEntity) _ent).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														return ((Slot) ((Map) invobj).get(sltid)).getStack();
													}
												}
											}
											return ItemStack.EMPTY;
										}
									}.getItemStack((int) (92))).getItem()) {
										{
											double _setval = 8;
											entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.artefact3 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									} else {
										if (RingametisteItem.block == (new Object() {
											public ItemStack getItemStack(int sltid) {
												Entity _ent = entity;
												if (_ent instanceof ServerPlayerEntity) {
													Container _current = ((ServerPlayerEntity) _ent).openContainer;
													if (_current instanceof Supplier) {
														Object invobj = ((Supplier) _current).get();
														if (invobj instanceof Map) {
															return ((Slot) ((Map) invobj).get(sltid)).getStack();
														}
													}
												}
												return ItemStack.EMPTY;
											}
										}.getItemStack((int) (92))).getItem()) {
											{
												double _setval = 9;
												entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.artefact3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										} else {
											if (IolitebeltItem.block == (new Object() {
												public ItemStack getItemStack(int sltid) {
													Entity _ent = entity;
													if (_ent instanceof ServerPlayerEntity) {
														Container _current = ((ServerPlayerEntity) _ent).openContainer;
														if (_current instanceof Supplier) {
															Object invobj = ((Supplier) _current).get();
															if (invobj instanceof Map) {
																return ((Slot) ((Map) invobj).get(sltid)).getStack();
															}
														}
													}
													return ItemStack.EMPTY;
												}
											}.getItemStack((int) (92))).getItem()) {
												{
													double _setval = 10;
													entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.artefact3 = _setval;
														capability.syncPlayerVariables(entity);
													});
												}
											} else {
												if (PeridotbeltItem.block == (new Object() {
													public ItemStack getItemStack(int sltid) {
														Entity _ent = entity;
														if (_ent instanceof ServerPlayerEntity) {
															Container _current = ((ServerPlayerEntity) _ent).openContainer;
															if (_current instanceof Supplier) {
																Object invobj = ((Supplier) _current).get();
																if (invobj instanceof Map) {
																	return ((Slot) ((Map) invobj).get(sltid)).getStack();
																}
															}
														}
														return ItemStack.EMPTY;
													}
												}.getItemStack((int) (92))).getItem()) {
													{
														double _setval = 11;
														entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																.ifPresent(capability -> {
																	capability.artefact3 = _setval;
																	capability.syncPlayerVariables(entity);
																});
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
		if (NeckspeedItem.block == (new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (93))).getItem()) {
			{
				double _setval = 1;
				entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.artefact4 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			if (NeckresistanceItem.block == (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (93))).getItem()) {
				{
					double _setval = 2;
					entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.artefact4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				if (NeckofstrengItem.block == (new Object() {
					public ItemStack getItemStack(int sltid) {
						Entity _ent = entity;
						if (_ent instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) _ent).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									return ((Slot) ((Map) invobj).get(sltid)).getStack();
								}
							}
						}
						return ItemStack.EMPTY;
					}
				}.getItemStack((int) (93))).getItem()) {
					{
						double _setval = 3;
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.artefact4 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					if (NeckofhastItem.block == (new Object() {
						public ItemStack getItemStack(int sltid) {
							Entity _ent = entity;
							if (_ent instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) _ent).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (93))).getItem()) {
						{
							double _setval = 4;
							entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.artefact4 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else {
						if (NeckoflightningItem.block == (new Object() {
							public ItemStack getItemStack(int sltid) {
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											return ((Slot) ((Map) invobj).get(sltid)).getStack();
										}
									}
								}
								return ItemStack.EMPTY;
							}
						}.getItemStack((int) (93))).getItem()) {
							{
								double _setval = 5;
								entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.artefact4 = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							if (RingioliteItem.block == (new Object() {
								public ItemStack getItemStack(int sltid) {
									Entity _ent = entity;
									if (_ent instanceof ServerPlayerEntity) {
										Container _current = ((ServerPlayerEntity) _ent).openContainer;
										if (_current instanceof Supplier) {
											Object invobj = ((Supplier) _current).get();
											if (invobj instanceof Map) {
												return ((Slot) ((Map) invobj).get(sltid)).getStack();
											}
										}
									}
									return ItemStack.EMPTY;
								}
							}.getItemStack((int) (93))).getItem()) {
								{
									double _setval = 6;
									entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.artefact4 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else {
								if (AmberringItem.block == (new Object() {
									public ItemStack getItemStack(int sltid) {
										Entity _ent = entity;
										if (_ent instanceof ServerPlayerEntity) {
											Container _current = ((ServerPlayerEntity) _ent).openContainer;
											if (_current instanceof Supplier) {
												Object invobj = ((Supplier) _current).get();
												if (invobj instanceof Map) {
													return ((Slot) ((Map) invobj).get(sltid)).getStack();
												}
											}
										}
										return ItemStack.EMPTY;
									}
								}.getItemStack((int) (93))).getItem()) {
									{
										double _setval = 7;
										entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.artefact4 = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								} else {
									if (SpinelringItem.block == (new Object() {
										public ItemStack getItemStack(int sltid) {
											Entity _ent = entity;
											if (_ent instanceof ServerPlayerEntity) {
												Container _current = ((ServerPlayerEntity) _ent).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														return ((Slot) ((Map) invobj).get(sltid)).getStack();
													}
												}
											}
											return ItemStack.EMPTY;
										}
									}.getItemStack((int) (93))).getItem()) {
										{
											double _setval = 8;
											entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.artefact4 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									} else {
										if (RingametisteItem.block == (new Object() {
											public ItemStack getItemStack(int sltid) {
												Entity _ent = entity;
												if (_ent instanceof ServerPlayerEntity) {
													Container _current = ((ServerPlayerEntity) _ent).openContainer;
													if (_current instanceof Supplier) {
														Object invobj = ((Supplier) _current).get();
														if (invobj instanceof Map) {
															return ((Slot) ((Map) invobj).get(sltid)).getStack();
														}
													}
												}
												return ItemStack.EMPTY;
											}
										}.getItemStack((int) (93))).getItem()) {
											{
												double _setval = 9;
												entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.artefact4 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										} else {
											if (IolitebeltItem.block == (new Object() {
												public ItemStack getItemStack(int sltid) {
													Entity _ent = entity;
													if (_ent instanceof ServerPlayerEntity) {
														Container _current = ((ServerPlayerEntity) _ent).openContainer;
														if (_current instanceof Supplier) {
															Object invobj = ((Supplier) _current).get();
															if (invobj instanceof Map) {
																return ((Slot) ((Map) invobj).get(sltid)).getStack();
															}
														}
													}
													return ItemStack.EMPTY;
												}
											}.getItemStack((int) (93))).getItem()) {
												{
													double _setval = 10;
													entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.artefact4 = _setval;
														capability.syncPlayerVariables(entity);
													});
												}
											} else {
												if (PeridotbeltItem.block == (new Object() {
													public ItemStack getItemStack(int sltid) {
														Entity _ent = entity;
														if (_ent instanceof ServerPlayerEntity) {
															Container _current = ((ServerPlayerEntity) _ent).openContainer;
															if (_current instanceof Supplier) {
																Object invobj = ((Supplier) _current).get();
																if (invobj instanceof Map) {
																	return ((Slot) ((Map) invobj).get(sltid)).getStack();
																}
															}
														}
														return ItemStack.EMPTY;
													}
												}.getItemStack((int) (93))).getItem()) {
													{
														double _setval = 11;
														entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																.ifPresent(capability -> {
																	capability.artefact4 = _setval;
																	capability.syncPlayerVariables(entity);
																});
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
		if (NeckspeedItem.block == (new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (94))).getItem()) {
			{
				double _setval = 1;
				entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.artefact5 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			if (NeckresistanceItem.block == (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (94))).getItem()) {
				{
					double _setval = 2;
					entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.artefact5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				if (NeckofstrengItem.block == (new Object() {
					public ItemStack getItemStack(int sltid) {
						Entity _ent = entity;
						if (_ent instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) _ent).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									return ((Slot) ((Map) invobj).get(sltid)).getStack();
								}
							}
						}
						return ItemStack.EMPTY;
					}
				}.getItemStack((int) (94))).getItem()) {
					{
						double _setval = 3;
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.artefact5 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					if (NeckofhastItem.block == (new Object() {
						public ItemStack getItemStack(int sltid) {
							Entity _ent = entity;
							if (_ent instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) _ent).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (94))).getItem()) {
						{
							double _setval = 4;
							entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.artefact5 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else {
						if (NeckoflightningItem.block == (new Object() {
							public ItemStack getItemStack(int sltid) {
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											return ((Slot) ((Map) invobj).get(sltid)).getStack();
										}
									}
								}
								return ItemStack.EMPTY;
							}
						}.getItemStack((int) (94))).getItem()) {
							{
								double _setval = 5;
								entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.artefact5 = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							if (RingioliteItem.block == (new Object() {
								public ItemStack getItemStack(int sltid) {
									Entity _ent = entity;
									if (_ent instanceof ServerPlayerEntity) {
										Container _current = ((ServerPlayerEntity) _ent).openContainer;
										if (_current instanceof Supplier) {
											Object invobj = ((Supplier) _current).get();
											if (invobj instanceof Map) {
												return ((Slot) ((Map) invobj).get(sltid)).getStack();
											}
										}
									}
									return ItemStack.EMPTY;
								}
							}.getItemStack((int) (94))).getItem()) {
								{
									double _setval = 6;
									entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.artefact5 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else {
								if (AmberringItem.block == (new Object() {
									public ItemStack getItemStack(int sltid) {
										Entity _ent = entity;
										if (_ent instanceof ServerPlayerEntity) {
											Container _current = ((ServerPlayerEntity) _ent).openContainer;
											if (_current instanceof Supplier) {
												Object invobj = ((Supplier) _current).get();
												if (invobj instanceof Map) {
													return ((Slot) ((Map) invobj).get(sltid)).getStack();
												}
											}
										}
										return ItemStack.EMPTY;
									}
								}.getItemStack((int) (94))).getItem()) {
									{
										double _setval = 7;
										entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.artefact5 = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								} else {
									if (SpinelringItem.block == (new Object() {
										public ItemStack getItemStack(int sltid) {
											Entity _ent = entity;
											if (_ent instanceof ServerPlayerEntity) {
												Container _current = ((ServerPlayerEntity) _ent).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														return ((Slot) ((Map) invobj).get(sltid)).getStack();
													}
												}
											}
											return ItemStack.EMPTY;
										}
									}.getItemStack((int) (94))).getItem()) {
										{
											double _setval = 8;
											entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.artefact5 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									} else {
										if (RingametisteItem.block == (new Object() {
											public ItemStack getItemStack(int sltid) {
												Entity _ent = entity;
												if (_ent instanceof ServerPlayerEntity) {
													Container _current = ((ServerPlayerEntity) _ent).openContainer;
													if (_current instanceof Supplier) {
														Object invobj = ((Supplier) _current).get();
														if (invobj instanceof Map) {
															return ((Slot) ((Map) invobj).get(sltid)).getStack();
														}
													}
												}
												return ItemStack.EMPTY;
											}
										}.getItemStack((int) (94))).getItem()) {
											{
												double _setval = 9;
												entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.artefact5 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										} else {
											if (IolitebeltItem.block == (new Object() {
												public ItemStack getItemStack(int sltid) {
													Entity _ent = entity;
													if (_ent instanceof ServerPlayerEntity) {
														Container _current = ((ServerPlayerEntity) _ent).openContainer;
														if (_current instanceof Supplier) {
															Object invobj = ((Supplier) _current).get();
															if (invobj instanceof Map) {
																return ((Slot) ((Map) invobj).get(sltid)).getStack();
															}
														}
													}
													return ItemStack.EMPTY;
												}
											}.getItemStack((int) (94))).getItem()) {
												{
													double _setval = 10;
													entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.artefact5 = _setval;
														capability.syncPlayerVariables(entity);
													});
												}
											} else {
												if (PeridotbeltItem.block == (new Object() {
													public ItemStack getItemStack(int sltid) {
														Entity _ent = entity;
														if (_ent instanceof ServerPlayerEntity) {
															Container _current = ((ServerPlayerEntity) _ent).openContainer;
															if (_current instanceof Supplier) {
																Object invobj = ((Supplier) _current).get();
																if (invobj instanceof Map) {
																	return ((Slot) ((Map) invobj).get(sltid)).getStack();
																}
															}
														}
														return ItemStack.EMPTY;
													}
												}.getItemStack((int) (94))).getItem()) {
													{
														double _setval = 11;
														entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																.ifPresent(capability -> {
																	capability.artefact5 = _setval;
																	capability.syncPlayerVariables(entity);
																});
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
