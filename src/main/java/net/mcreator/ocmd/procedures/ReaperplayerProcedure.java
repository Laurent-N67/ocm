package net.mcreator.ocmd.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.World;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ocmd.item.YellowsoulItem;
import net.mcreator.ocmd.item.ScythejudgmentItem;
import net.mcreator.ocmd.item.ScytheendItem;
import net.mcreator.ocmd.item.ScythechaoItem;
import net.mcreator.ocmd.item.RedsoulItem;
import net.mcreator.ocmd.item.PurplesoulItem;
import net.mcreator.ocmd.item.PuresoulItem;
import net.mcreator.ocmd.item.OrangesoulItem;
import net.mcreator.ocmd.item.GreensoulItem;
import net.mcreator.ocmd.item.BluesoulItem;
import net.mcreator.ocmd.OcmMod;

import java.util.Map;
import java.util.HashMap;

public class ReaperplayerProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityDeath(LivingDeathEvent event) {
			if (event != null && event.getEntity() != null) {
				Entity entity = event.getEntity();
				Entity sourceentity = event.getSource().getTrueSource();
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				World world = entity.world;
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("sourceentity", sourceentity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure Reaperplayer!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				OcmMod.LOGGER.warn("Failed to load dependency sourceentity for procedure Reaperplayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (entity instanceof PlayerEntity) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == ScythejudgmentItem.block
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == ScytheendItem.block
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == ScythechaoItem.block) {
				if ((sourceentity instanceof PlayerEntity)
						? ((PlayerEntity) sourceentity).inventory.hasItemStack(new ItemStack(Items.GLASS_BOTTLE))
						: false) {
					if (Math.random() < 0.7) {
						if (sourceentity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(Items.GLASS_BOTTLE);
							((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) sourceentity).container.func_234641_j_());
						}
						if (sourceentity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(BluesoulItem.block);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
						}
					} else {
						if (Math.random() < 0.7) {
							if (sourceentity instanceof PlayerEntity) {
								ItemStack _stktoremove = new ItemStack(Items.GLASS_BOTTLE);
								((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
										((PlayerEntity) sourceentity).container.func_234641_j_());
							}
							if (sourceentity instanceof PlayerEntity) {
								ItemStack _setstack = new ItemStack(RedsoulItem.block);
								_setstack.setCount((int) 1);
								ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
							}
						} else {
							if (Math.random() < 0.7) {
								if (sourceentity instanceof PlayerEntity) {
									ItemStack _stktoremove = new ItemStack(Items.GLASS_BOTTLE);
									((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
											((PlayerEntity) sourceentity).container.func_234641_j_());
								}
								if (sourceentity instanceof PlayerEntity) {
									ItemStack _setstack = new ItemStack(GreensoulItem.block);
									_setstack.setCount((int) 1);
									ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
								}
							} else {
								if (Math.random() < 0.7) {
									if (sourceentity instanceof PlayerEntity) {
										ItemStack _stktoremove = new ItemStack(Items.GLASS_BOTTLE);
										((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
												((PlayerEntity) sourceentity).container.func_234641_j_());
									}
									if (sourceentity instanceof PlayerEntity) {
										ItemStack _setstack = new ItemStack(YellowsoulItem.block);
										_setstack.setCount((int) 1);
										ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
									}
								} else {
									if (Math.random() < 0.7) {
										if (sourceentity instanceof PlayerEntity) {
											ItemStack _stktoremove = new ItemStack(Items.GLASS_BOTTLE);
											((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(),
													(int) 1, ((PlayerEntity) sourceentity).container.func_234641_j_());
										}
										if (sourceentity instanceof PlayerEntity) {
											ItemStack _setstack = new ItemStack(PurplesoulItem.block);
											_setstack.setCount((int) 1);
											ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
										}
									} else {
										if (Math.random() < 0.7) {
											if (sourceentity instanceof PlayerEntity) {
												ItemStack _stktoremove = new ItemStack(Items.GLASS_BOTTLE);
												((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(),
														(int) 1, ((PlayerEntity) sourceentity).container.func_234641_j_());
											}
											if (sourceentity instanceof PlayerEntity) {
												ItemStack _setstack = new ItemStack(OrangesoulItem.block);
												_setstack.setCount((int) 1);
												ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
											}
										} else {
											if (sourceentity instanceof PlayerEntity) {
												ItemStack _stktoremove = new ItemStack(Items.GLASS_BOTTLE);
												((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(),
														(int) 1, ((PlayerEntity) sourceentity).container.func_234641_j_());
											}
											if (sourceentity instanceof PlayerEntity) {
												ItemStack _setstack = new ItemStack(PuresoulItem.block);
												_setstack.setCount((int) 1);
												ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
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
