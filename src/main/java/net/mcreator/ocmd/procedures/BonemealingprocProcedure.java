package net.mcreator.ocmd.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.BoneMealItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.block.BlockState;

import net.mcreator.ocmd.enchantment.BonemealingEnchantment;
import net.mcreator.ocmd.block.Rice4Block;
import net.mcreator.ocmd.block.Rice3Block;
import net.mcreator.ocmd.block.Rice2Block;
import net.mcreator.ocmd.block.Rice1Block;
import net.mcreator.ocmd.block.Marrow3Block;
import net.mcreator.ocmd.block.Marrow2Block;
import net.mcreator.ocmd.block.Marrow1Block;
import net.mcreator.ocmd.block.Marrow0Block;
import net.mcreator.ocmd.block.Laitue3Block;
import net.mcreator.ocmd.block.Laitue2Block;
import net.mcreator.ocmd.block.Laitue1Block;
import net.mcreator.ocmd.block.Coton4Block;
import net.mcreator.ocmd.block.Coton3Block;
import net.mcreator.ocmd.block.Coton2Block;
import net.mcreator.ocmd.block.Coton1Block;
import net.mcreator.ocmd.OcmMod;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;

public class BonemealingprocProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
			PlayerEntity entity = event.getPlayer();
			if (event.getHand() != entity.getActiveHand()) {
				return;
			}
			double i = event.getPos().getX();
			double j = event.getPos().getY();
			double k = event.getPos().getZ();
			IWorld world = event.getWorld();
			BlockState state = world.getBlockState(event.getPos());
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("direction", event.getFace());
			dependencies.put("blockstate", state);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OcmMod.LOGGER.warn("Failed to load dependency world for procedure Bonemealingproc!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OcmMod.LOGGER.warn("Failed to load dependency x for procedure Bonemealingproc!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OcmMod.LOGGER.warn("Failed to load dependency y for procedure Bonemealingproc!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OcmMod.LOGGER.warn("Failed to load dependency z for procedure Bonemealingproc!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure Bonemealingproc!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (EnchantmentHelper.getEnchantmentLevel(BonemealingEnchantment.enchantment,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) == 1) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.HAPPY_VILLAGER, x, y, z, (int) 5, 1, 1, 1, 1);
			}
			if (world instanceof World) {
				if (BoneMealItem.applyBonemeal(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos((int) x, (int) y, (int) z)) || BoneMealItem
						.growSeagrass(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos((int) x, (int) y, (int) z), (Direction) null)) {
					if (!world.isRemote())
						((World) world).playEvent(2005, new BlockPos((int) x, (int) y, (int) z), 0);
				}
			}
			{
				ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
				if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Rice1Block.block) {
				if (Math.random() < 0.7) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Rice2Block.block.getDefaultState(), 3);
				} else {
					if (Math.random() < 0.01) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Rice3Block.block.getDefaultState(), 3);
					} else {
						if (Math.random() < 0.001) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Rice4Block.block.getDefaultState(), 3);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Rice2Block.block) {
				if (Math.random() < 0.7) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Rice3Block.block.getDefaultState(), 3);
				} else {
					if (Math.random() < 0.01) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Rice4Block.block.getDefaultState(), 3);
					}
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Rice3Block.block) {
				if (Math.random() < 0.7) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Rice4Block.block.getDefaultState(), 3);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Laitue1Block.block) {
				if (Math.random() < 0.7) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Laitue2Block.block.getDefaultState(), 3);
				} else {
					if (Math.random() < 0.01) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Laitue3Block.block.getDefaultState(), 3);
					}
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Laitue2Block.block) {
				if (Math.random() < 0.7) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Laitue3Block.block.getDefaultState(), 3);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Marrow0Block.block) {
				if (Math.random() < 0.7) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Marrow1Block.block.getDefaultState(), 3);
				} else {
					if (Math.random() < 0.01) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Marrow2Block.block.getDefaultState(), 3);
					} else {
						if (Math.random() < 0.001) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Marrow3Block.block.getDefaultState(), 3);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Marrow1Block.block) {
				if (Math.random() < 0.7) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Marrow2Block.block.getDefaultState(), 3);
				} else {
					if (Math.random() < 0.01) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Marrow3Block.block.getDefaultState(), 3);
					}
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Marrow2Block.block) {
				if (Math.random() < 0.7) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Marrow3Block.block.getDefaultState(), 3);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Coton1Block.block) {
				if (Math.random() < 0.7) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Coton2Block.block.getDefaultState(), 3);
				} else {
					if (Math.random() < 0.01) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Coton3Block.block.getDefaultState(), 3);
					} else {
						if (Math.random() < 0.001) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Coton4Block.block.getDefaultState(), 3);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Coton2Block.block) {
				if (Math.random() < 0.7) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Coton3Block.block.getDefaultState(), 3);
				} else {
					if (Math.random() < 0.01) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Coton4Block.block.getDefaultState(), 3);
					}
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Coton3Block.block) {
				if (Math.random() < 0.7) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Coton4Block.block.getDefaultState(), 3);
				}
			}
		}
	}
}
