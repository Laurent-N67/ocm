package net.mcreator.ocmd.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ocmd.item.RedtokenItem;
import net.mcreator.ocmd.item.PurpleTokenItem;
import net.mcreator.ocmd.item.PuregoldDustItem;
import net.mcreator.ocmd.item.PrismItem;
import net.mcreator.ocmd.item.Prgd1Item;
import net.mcreator.ocmd.item.GreentokenItem;
import net.mcreator.ocmd.item.CyantokenItem;
import net.mcreator.ocmd.item.BluetokenItem;
import net.mcreator.ocmd.OcmMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class BosslootProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OcmMod.LOGGER.warn("Failed to load dependency world for procedure Bossloot!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OcmMod.LOGGER.warn("Failed to load dependency x for procedure Bossloot!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OcmMod.LOGGER.warn("Failed to load dependency y for procedure Bossloot!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OcmMod.LOGGER.warn("Failed to load dependency z for procedure Bossloot!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
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
				if (entityiterator instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(PrismItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
				}
				if (Math.random() < 0.8) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(PrismItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.6) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(PrismItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.4) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(PrismItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.2) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(PrismItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.05) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(PrismItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.01) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(PrismItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.5) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(BluetokenItem.block);
						_setstack.setCount((int) 20);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.2) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(BluetokenItem.block);
						_setstack.setCount((int) 8);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.1) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(BluetokenItem.block);
						_setstack.setCount((int) 8);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.05) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(BluetokenItem.block);
						_setstack.setCount((int) 3);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.5) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(GreentokenItem.block);
						_setstack.setCount((int) 20);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.2) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(GreentokenItem.block);
						_setstack.setCount((int) 8);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.1) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(GreentokenItem.block);
						_setstack.setCount((int) 8);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.05) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(GreentokenItem.block);
						_setstack.setCount((int) 3);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.5) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(CyantokenItem.block);
						_setstack.setCount((int) 20);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.2) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(CyantokenItem.block);
						_setstack.setCount((int) 8);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.1) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(CyantokenItem.block);
						_setstack.setCount((int) 8);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.05) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(CyantokenItem.block);
						_setstack.setCount((int) 3);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.5) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(RedtokenItem.block);
						_setstack.setCount((int) 20);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.2) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(RedtokenItem.block);
						_setstack.setCount((int) 8);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.1) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(RedtokenItem.block);
						_setstack.setCount((int) 8);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.05) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(RedtokenItem.block);
						_setstack.setCount((int) 3);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.5) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(PurpleTokenItem.block);
						_setstack.setCount((int) 20);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.2) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(PurpleTokenItem.block);
						_setstack.setCount((int) 8);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.1) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(PurpleTokenItem.block);
						_setstack.setCount((int) 8);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.05) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(PurpleTokenItem.block);
						_setstack.setCount((int) 3);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.1) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(PuregoldDustItem.block);
						_setstack.setCount((int) 20);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.1) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(PuregoldDustItem.block);
						_setstack.setCount((int) 15);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.1) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(PuregoldDustItem.block);
						_setstack.setCount((int) 10);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.1) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(PuregoldDustItem.block);
						_setstack.setCount((int) 5);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.1) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(Prgd1Item.block);
						_setstack.setCount((int) 8);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.1) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(Prgd1Item.block);
						_setstack.setCount((int) 6);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.1) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(Prgd1Item.block);
						_setstack.setCount((int) 4);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
				if (Math.random() < 0.1) {
					if (entityiterator instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(Prgd1Item.block);
						_setstack.setCount((int) 2);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entityiterator), _setstack);
					}
				}
			}
		}
	}
}
