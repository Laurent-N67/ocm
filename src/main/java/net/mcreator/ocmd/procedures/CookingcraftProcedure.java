package net.mcreator.ocmd.procedures;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ocmd.item.SandwitchlaituecheeseItem;
import net.mcreator.ocmd.item.SandwitchcheeseItem;
import net.mcreator.ocmd.item.SandwitchbeconcheeseItem;
import net.mcreator.ocmd.item.LaitueItem;
import net.mcreator.ocmd.item.CookingknifItem;
import net.mcreator.ocmd.item.CheeseItem;
import net.mcreator.ocmd.OcmMod;

import java.util.function.Supplier;
import java.util.Random;
import java.util.Map;

public class CookingcraftProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure Cookingcraft!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double nbitemcraftkit = 0;
		boolean settozeron = false;
		if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (6)) == 0) {
			nbitemcraftkit = 0;
		}
		if ((new Object() {
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
		}.getItemStack((int) (3))).getItem() == Items.BREAD) {
			if (new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
								if (stack != null)
									return stack.getCount();
							}
						}
					}
					return 0;
				}
			}.getAmount((int) (3)) >= 1) {
				if ((new Object() {
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
				}.getItemStack((int) (4))).getItem() == CheeseItem.block) {
					if (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
										if (stack != null)
											return stack.getCount();
									}
								}
							}
							return 0;
						}
					}.getAmount((int) (4)) >= 2) {
						if ((new Object() {
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
						}.getItemStack((int) (0))).getItem() == CookingknifItem.block) {
							if (new Object() {
								public int getAmount(int sltid) {
									if (entity instanceof ServerPlayerEntity) {
										Container _current = ((ServerPlayerEntity) entity).openContainer;
										if (_current instanceof Supplier) {
											Object invobj = ((Supplier) _current).get();
											if (invobj instanceof Map) {
												ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
												if (stack != null)
													return stack.getCount();
											}
										}
									}
									return 0;
								}
							}.getAmount((int) (0)) >= 1) {
								nbitemcraftkit = (nbitemcraftkit + 1);
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get((int) (0))).getStack();
											if (stack != null) {
												if (stack.attemptDamageItem((int) 1, new Random(), null)) {
													stack.shrink(1);
													stack.setDamage(0);
												}
												_current.detectAndSendChanges();
											}
										}
									}
								}
								if (entity instanceof PlayerEntity) {
									Container _current = ((PlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack _setstack = new ItemStack(SandwitchcheeseItem.block);
											_setstack.setCount((int) nbitemcraftkit);
											((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
											_current.detectAndSendChanges();
										}
									}
								}
								{
									Entity _ent = entity;
									if (_ent instanceof ServerPlayerEntity) {
										Container _current = ((ServerPlayerEntity) _ent).openContainer;
										if (_current instanceof Supplier) {
											Object invobj = ((Supplier) _current).get();
											if (invobj instanceof Map) {
												((Slot) ((Map) invobj).get((int) (3))).decrStackSize((int) (1));
												_current.detectAndSendChanges();
											}
										}
									}
								}
								{
									Entity _ent = entity;
									if (_ent instanceof ServerPlayerEntity) {
										Container _current = ((ServerPlayerEntity) _ent).openContainer;
										if (_current instanceof Supplier) {
											Object invobj = ((Supplier) _current).get();
											if (invobj instanceof Map) {
												((Slot) ((Map) invobj).get((int) (4))).decrStackSize((int) (2));
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
		if ((new Object() {
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
		}.getItemStack((int) (3))).getItem() == Items.BREAD) {
			if (new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
								if (stack != null)
									return stack.getCount();
							}
						}
					}
					return 0;
				}
			}.getAmount((int) (3)) >= 1) {
				if ((new Object() {
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
				}.getItemStack((int) (4))).getItem() == CheeseItem.block) {
					if (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
										if (stack != null)
											return stack.getCount();
									}
								}
							}
							return 0;
						}
					}.getAmount((int) (4)) >= 2) {
						if ((new Object() {
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
						}.getItemStack((int) (5))).getItem() == Items.PORKCHOP) {
							if (new Object() {
								public int getAmount(int sltid) {
									if (entity instanceof ServerPlayerEntity) {
										Container _current = ((ServerPlayerEntity) entity).openContainer;
										if (_current instanceof Supplier) {
											Object invobj = ((Supplier) _current).get();
											if (invobj instanceof Map) {
												ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
												if (stack != null)
													return stack.getCount();
											}
										}
									}
									return 0;
								}
							}.getAmount((int) (5)) >= 1) {
								if ((new Object() {
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
								}.getItemStack((int) (0))).getItem() == CookingknifItem.block) {
									if (new Object() {
										public int getAmount(int sltid) {
											if (entity instanceof ServerPlayerEntity) {
												Container _current = ((ServerPlayerEntity) entity).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
														if (stack != null)
															return stack.getCount();
													}
												}
											}
											return 0;
										}
									}.getAmount((int) (0)) >= 1) {
										nbitemcraftkit = (nbitemcraftkit + 1);
										if (entity instanceof ServerPlayerEntity) {
											Container _current = ((ServerPlayerEntity) entity).openContainer;
											if (_current instanceof Supplier) {
												Object invobj = ((Supplier) _current).get();
												if (invobj instanceof Map) {
													ItemStack stack = ((Slot) ((Map) invobj).get((int) (0))).getStack();
													if (stack != null) {
														if (stack.attemptDamageItem((int) 1, new Random(), null)) {
															stack.shrink(1);
															stack.setDamage(0);
														}
														_current.detectAndSendChanges();
													}
												}
											}
										}
										if (entity instanceof PlayerEntity) {
											Container _current = ((PlayerEntity) entity).openContainer;
											if (_current instanceof Supplier) {
												Object invobj = ((Supplier) _current).get();
												if (invobj instanceof Map) {
													ItemStack _setstack = new ItemStack(SandwitchbeconcheeseItem.block);
													_setstack.setCount((int) nbitemcraftkit);
													((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
													_current.detectAndSendChanges();
												}
											}
										}
										{
											Entity _ent = entity;
											if (_ent instanceof ServerPlayerEntity) {
												Container _current = ((ServerPlayerEntity) _ent).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														((Slot) ((Map) invobj).get((int) (3))).decrStackSize((int) (1));
														_current.detectAndSendChanges();
													}
												}
											}
										}
										{
											Entity _ent = entity;
											if (_ent instanceof ServerPlayerEntity) {
												Container _current = ((ServerPlayerEntity) _ent).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														((Slot) ((Map) invobj).get((int) (4))).decrStackSize((int) (2));
														_current.detectAndSendChanges();
													}
												}
											}
										}
										{
											Entity _ent = entity;
											if (_ent instanceof ServerPlayerEntity) {
												Container _current = ((ServerPlayerEntity) _ent).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														((Slot) ((Map) invobj).get((int) (5))).decrStackSize((int) (1));
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
		if ((new Object() {
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
		}.getItemStack((int) (3))).getItem() == Items.BREAD) {
			if (new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
								if (stack != null)
									return stack.getCount();
							}
						}
					}
					return 0;
				}
			}.getAmount((int) (3)) >= 1) {
				if ((new Object() {
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
				}.getItemStack((int) (4))).getItem() == CheeseItem.block) {
					if (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
										if (stack != null)
											return stack.getCount();
									}
								}
							}
							return 0;
						}
					}.getAmount((int) (4)) >= 2) {
						if ((new Object() {
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
						}.getItemStack((int) (5))).getItem() == LaitueItem.block) {
							if (new Object() {
								public int getAmount(int sltid) {
									if (entity instanceof ServerPlayerEntity) {
										Container _current = ((ServerPlayerEntity) entity).openContainer;
										if (_current instanceof Supplier) {
											Object invobj = ((Supplier) _current).get();
											if (invobj instanceof Map) {
												ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
												if (stack != null)
													return stack.getCount();
											}
										}
									}
									return 0;
								}
							}.getAmount((int) (5)) >= 1) {
								if ((new Object() {
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
								}.getItemStack((int) (0))).getItem() == CookingknifItem.block) {
									if (new Object() {
										public int getAmount(int sltid) {
											if (entity instanceof ServerPlayerEntity) {
												Container _current = ((ServerPlayerEntity) entity).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
														if (stack != null)
															return stack.getCount();
													}
												}
											}
											return 0;
										}
									}.getAmount((int) (0)) >= 1) {
										nbitemcraftkit = (nbitemcraftkit + 1);
										if (entity instanceof ServerPlayerEntity) {
											Container _current = ((ServerPlayerEntity) entity).openContainer;
											if (_current instanceof Supplier) {
												Object invobj = ((Supplier) _current).get();
												if (invobj instanceof Map) {
													ItemStack stack = ((Slot) ((Map) invobj).get((int) (0))).getStack();
													if (stack != null) {
														if (stack.attemptDamageItem((int) 1, new Random(), null)) {
															stack.shrink(1);
															stack.setDamage(0);
														}
														_current.detectAndSendChanges();
													}
												}
											}
										}
										if (entity instanceof PlayerEntity) {
											Container _current = ((PlayerEntity) entity).openContainer;
											if (_current instanceof Supplier) {
												Object invobj = ((Supplier) _current).get();
												if (invobj instanceof Map) {
													ItemStack _setstack = new ItemStack(SandwitchlaituecheeseItem.block);
													_setstack.setCount((int) nbitemcraftkit);
													((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
													_current.detectAndSendChanges();
												}
											}
										}
										{
											Entity _ent = entity;
											if (_ent instanceof ServerPlayerEntity) {
												Container _current = ((ServerPlayerEntity) _ent).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														((Slot) ((Map) invobj).get((int) (3))).decrStackSize((int) (1));
														_current.detectAndSendChanges();
													}
												}
											}
										}
										{
											Entity _ent = entity;
											if (_ent instanceof ServerPlayerEntity) {
												Container _current = ((ServerPlayerEntity) _ent).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														((Slot) ((Map) invobj).get((int) (4))).decrStackSize((int) (2));
														_current.detectAndSendChanges();
													}
												}
											}
										}
										{
											Entity _ent = entity;
											if (_ent instanceof ServerPlayerEntity) {
												Container _current = ((ServerPlayerEntity) _ent).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														((Slot) ((Map) invobj).get((int) (5))).decrStackSize((int) (1));
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
