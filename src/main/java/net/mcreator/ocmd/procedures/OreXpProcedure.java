package net.mcreator.ocmd.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.block.Blocks;

import net.mcreator.ocmd.block.TopazOreBlock;
import net.mcreator.ocmd.block.SpinelleOreBlock;
import net.mcreator.ocmd.block.SlateOreBlock;
import net.mcreator.ocmd.block.SaphirOreBlock;
import net.mcreator.ocmd.block.RubyOreBlock;
import net.mcreator.ocmd.block.PurplemanaOreBlock;
import net.mcreator.ocmd.block.PuregoldOreBlock;
import net.mcreator.ocmd.block.PeridotOreBlock;
import net.mcreator.ocmd.block.OnyxOreBlock;
import net.mcreator.ocmd.block.NacreOreBlock;
import net.mcreator.ocmd.block.KyaniteOreBlock;
import net.mcreator.ocmd.block.JadeOreBlock;
import net.mcreator.ocmd.block.IoliteOreBlock;
import net.mcreator.ocmd.block.CitrineOreBlock;
import net.mcreator.ocmd.block.CardinalredmanaOreBlock;
import net.mcreator.ocmd.block.AventurineOreBlock;
import net.mcreator.ocmd.block.AmethystOreBlock;
import net.mcreator.ocmd.block.AmberOreBlock;
import net.mcreator.ocmd.OcmMod;

import java.util.Map;
import java.util.HashMap;

public class OreXpProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onBlockBreak(BlockEvent.BreakEvent event) {
			Entity entity = event.getPlayer();
			IWorld world = event.getWorld();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("xpAmount", event.getExpToDrop());
			dependencies.put("x", event.getPos().getX());
			dependencies.put("y", event.getPos().getY());
			dependencies.put("z", event.getPos().getZ());
			dependencies.put("px", entity.getPosX());
			dependencies.put("py", entity.getPosY());
			dependencies.put("pz", entity.getPosZ());
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("blockstate", event.getState());
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OcmMod.LOGGER.warn("Failed to load dependency world for procedure OreXp!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OcmMod.LOGGER.warn("Failed to load dependency x for procedure OreXp!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OcmMod.LOGGER.warn("Failed to load dependency y for procedure OreXp!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OcmMod.LOGGER.warn("Failed to load dependency z for procedure OreXp!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure OreXp!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) == 1) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BEDROCK) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 0));
				}
			}
		} else {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SaphirOreBlock.block) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 4));
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RubyOreBlock.block) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 4));
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == CitrineOreBlock.block) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 4));
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SlateOreBlock.block) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 4));
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == AmberOreBlock.block) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 4));
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == PuregoldOreBlock.block) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 4));
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == TopazOreBlock.block) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 4));
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == AmethystOreBlock.block) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 4));
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == PurplemanaOreBlock.block) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 4));
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == CardinalredmanaOreBlock.block) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 4));
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == AventurineOreBlock.block) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 4));
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == JadeOreBlock.block) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 4));
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == OnyxOreBlock.block) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 4));
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == PeridotOreBlock.block) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 4));
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SpinelleOreBlock.block) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 4));
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == NacreOreBlock.block) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 4));
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == IoliteOreBlock.block) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 4));
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == KyaniteOreBlock.block) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 4));
				}
			}
		}
	}
}
