package net.mcreator.ocmd.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.horse.HorseEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.passive.RabbitEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.passive.PandaEntity;
import net.minecraft.entity.passive.OcelotEntity;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ocmd.item.SoulbottleItem;
import net.mcreator.ocmd.item.ScythesaphirItem;
import net.mcreator.ocmd.item.ScytherubyItem;
import net.mcreator.ocmd.item.ScytheonyxItem;
import net.mcreator.ocmd.item.ScythejudgmentItem;
import net.mcreator.ocmd.item.ScytheendItem;
import net.mcreator.ocmd.item.ScytheemeraldItem;
import net.mcreator.ocmd.item.ScythecitrineItem;
import net.mcreator.ocmd.item.ScythechaoItem;
import net.mcreator.ocmd.item.AnimalsoulItem;
import net.mcreator.ocmd.OcmMod;

import java.util.Map;
import java.util.HashMap;

public class ReapermobsProcedure {
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
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure Reapermobs!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				OcmMod.LOGGER.warn("Failed to load dependency sourceentity for procedure Reapermobs!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == ScythejudgmentItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == ScytheendItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == ScythechaoItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == ScytheonyxItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == ScythecitrineItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == ScytheemeraldItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == ScythesaphirItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == ScytherubyItem.block) {
			if (entity instanceof WolfEntity) {
				if ((sourceentity instanceof PlayerEntity)
						? ((PlayerEntity) sourceentity).inventory.hasItemStack(new ItemStack(SoulbottleItem.block))
						: false) {
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(SoulbottleItem.block);
						((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) sourceentity).container.func_234641_j_());
					}
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(AnimalsoulItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
					}
				}
			}
			if (entity instanceof SheepEntity) {
				if ((sourceentity instanceof PlayerEntity)
						? ((PlayerEntity) sourceentity).inventory.hasItemStack(new ItemStack(SoulbottleItem.block))
						: false) {
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(SoulbottleItem.block);
						((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) sourceentity).container.func_234641_j_());
					}
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(AnimalsoulItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
					}
				}
			}
			if (entity instanceof RabbitEntity) {
				if ((sourceentity instanceof PlayerEntity)
						? ((PlayerEntity) sourceentity).inventory.hasItemStack(new ItemStack(SoulbottleItem.block))
						: false) {
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(SoulbottleItem.block);
						((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) sourceentity).container.func_234641_j_());
					}
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(AnimalsoulItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
					}
				}
			}
			if (entity instanceof PigEntity) {
				if ((sourceentity instanceof PlayerEntity)
						? ((PlayerEntity) sourceentity).inventory.hasItemStack(new ItemStack(SoulbottleItem.block))
						: false) {
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(SoulbottleItem.block);
						((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) sourceentity).container.func_234641_j_());
					}
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(AnimalsoulItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
					}
				}
			}
			if (entity instanceof PandaEntity) {
				if ((sourceentity instanceof PlayerEntity)
						? ((PlayerEntity) sourceentity).inventory.hasItemStack(new ItemStack(SoulbottleItem.block))
						: false) {
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(SoulbottleItem.block);
						((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) sourceentity).container.func_234641_j_());
					}
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(AnimalsoulItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
					}
				}
			}
			if (entity instanceof OcelotEntity) {
				if ((sourceentity instanceof PlayerEntity)
						? ((PlayerEntity) sourceentity).inventory.hasItemStack(new ItemStack(SoulbottleItem.block))
						: false) {
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(SoulbottleItem.block);
						((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) sourceentity).container.func_234641_j_());
					}
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(AnimalsoulItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
					}
				}
			}
			if (entity instanceof HorseEntity) {
				if ((sourceentity instanceof PlayerEntity)
						? ((PlayerEntity) sourceentity).inventory.hasItemStack(new ItemStack(SoulbottleItem.block))
						: false) {
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(SoulbottleItem.block);
						((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) sourceentity).container.func_234641_j_());
					}
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(AnimalsoulItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
					}
				}
			}
			if (entity instanceof FoxEntity) {
				if ((sourceentity instanceof PlayerEntity)
						? ((PlayerEntity) sourceentity).inventory.hasItemStack(new ItemStack(SoulbottleItem.block))
						: false) {
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(SoulbottleItem.block);
						((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) sourceentity).container.func_234641_j_());
					}
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(AnimalsoulItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
					}
				}
			}
			if (entity instanceof CowEntity) {
				if ((sourceentity instanceof PlayerEntity)
						? ((PlayerEntity) sourceentity).inventory.hasItemStack(new ItemStack(SoulbottleItem.block))
						: false) {
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(SoulbottleItem.block);
						((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) sourceentity).container.func_234641_j_());
					}
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(AnimalsoulItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
					}
				}
			}
			if (entity instanceof ChickenEntity) {
				if ((sourceentity instanceof PlayerEntity)
						? ((PlayerEntity) sourceentity).inventory.hasItemStack(new ItemStack(SoulbottleItem.block))
						: false) {
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(SoulbottleItem.block);
						((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) sourceentity).container.func_234641_j_());
					}
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(AnimalsoulItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
					}
				}
			}
			if (entity instanceof CatEntity) {
				if ((sourceentity instanceof PlayerEntity)
						? ((PlayerEntity) sourceentity).inventory.hasItemStack(new ItemStack(SoulbottleItem.block))
						: false) {
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(SoulbottleItem.block);
						((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) sourceentity).container.func_234641_j_());
					}
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(AnimalsoulItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
					}
				}
			}
		}
	}
}
