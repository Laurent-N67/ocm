package net.mcreator.ocmd.procedures;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ocmd.item.BosskeythesilverwitchItem;
import net.mcreator.ocmd.item.BosskeysalamanderItem;
import net.mcreator.ocmd.item.BosskeygreedyfoxgoddessItem;
import net.mcreator.ocmd.item.BosskeycreeperqueenItem;
import net.mcreator.ocmd.item.BosskeyItem;
import net.mcreator.ocmd.OcmMod;

import java.util.function.Supplier;
import java.util.Map;

public class AssemblykeyprocedureProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure Assemblykeyprocedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
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
		}.getItemStack((int) (0))).getItem() == BosskeyItem.block) {
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
			}.getItemStack((int) (2))).getItem() == Items.NETHER_STAR) {
				if (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).experienceLevel : 0) >= 50) {
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).addExperienceLevel(-((int) 50));
					{
						Entity _ent = entity;
						if (_ent instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) _ent).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
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
									((Slot) ((Map) invobj).get((int) (2))).decrStackSize((int) (1));
									_current.detectAndSendChanges();
								}
							}
						}
					}
					if (Math.random() < 0.25) {
						if (entity instanceof PlayerEntity) {
							Container _current = ((PlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack _setstack = new ItemStack(BosskeythesilverwitchItem.block);
									_setstack.setCount((int) 1);
									((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
									_current.detectAndSendChanges();
								}
							}
						}
					} else {
						if (Math.random() < 0.25) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(BosskeygreedyfoxgoddessItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						} else {
							if (Math.random() < 0.25) {
								if (entity instanceof PlayerEntity) {
									Container _current = ((PlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack _setstack = new ItemStack(BosskeycreeperqueenItem.block);
											_setstack.setCount((int) 1);
											((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
											_current.detectAndSendChanges();
										}
									}
								}
							} else {
								if (entity instanceof PlayerEntity) {
									Container _current = ((PlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack _setstack = new ItemStack(BosskeysalamanderItem.block);
											_setstack.setCount((int) 1);
											((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
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
