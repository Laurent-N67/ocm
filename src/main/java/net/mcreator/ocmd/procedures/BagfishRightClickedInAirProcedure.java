package net.mcreator.ocmd.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ocmd.item.YellofishItem;
import net.mcreator.ocmd.item.SquidItem;
import net.mcreator.ocmd.item.RedsquidItem;
import net.mcreator.ocmd.item.RedfishItem;
import net.mcreator.ocmd.item.GreenfishItem;
import net.mcreator.ocmd.item.EelItem;
import net.mcreator.ocmd.item.BluefishItem;
import net.mcreator.ocmd.item.BagfishItem;
import net.mcreator.ocmd.OcmMod;

import java.util.Map;

public class BagfishRightClickedInAirProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure BagfishRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == BagfishItem.block) {
			if (Math.random() < 0.7) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(Items.COD);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
			if (Math.random() < 0.7) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(Items.COD);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
			if (Math.random() < 0.7) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(Items.COD);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
			if (Math.random() < 0.7) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(Items.COD);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
			if (Math.random() < 0.7) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(Items.COD);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
			if (Math.random() < 0.7) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(Items.COD);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
			if (Math.random() < 0.5) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(SquidItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (Math.random() < 0.5) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(SquidItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
				if (Math.random() < 0.5) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(SquidItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
			}
			if (Math.random() < 0.4) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(RedsquidItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (Math.random() < 0.4) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(RedsquidItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
					if (Math.random() < 0.4) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(RedsquidItem.block);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					}
				}
			}
			if (Math.random() < 0.3) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(EelItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (Math.random() < 0.3) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(EelItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
			}
			if (Math.random() < 0.3) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(EelItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (Math.random() < 0.3) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(EelItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
			}
			if (Math.random() < 0.4) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(YellofishItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
			if (Math.random() < 0.4) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(YellofishItem.block);
					_setstack.setCount((int) 2);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
			if (Math.random() < 0.4) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(GreenfishItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
			if (Math.random() < 0.4) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(GreenfishItem.block);
					_setstack.setCount((int) 2);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
			if (Math.random() < 0.3) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(RedfishItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
			if (Math.random() < 0.3) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(RedfishItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
			if (Math.random() < 0.2) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(BluefishItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
			if (Math.random() < 0.2) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(BluefishItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(BagfishItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
		}
	}
}
