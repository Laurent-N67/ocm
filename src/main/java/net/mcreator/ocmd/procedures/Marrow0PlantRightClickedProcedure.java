package net.mcreator.ocmd.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ocmd.block.Marrow3Block;
import net.mcreator.ocmd.block.Marrow2Block;
import net.mcreator.ocmd.block.Marrow1Block;
import net.mcreator.ocmd.OcmMod;

import java.util.Map;

public class Marrow0PlantRightClickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OcmMod.LOGGER.warn("Failed to load dependency world for procedure Marrow0PlantRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OcmMod.LOGGER.warn("Failed to load dependency x for procedure Marrow0PlantRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OcmMod.LOGGER.warn("Failed to load dependency y for procedure Marrow0PlantRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OcmMod.LOGGER.warn("Failed to load dependency z for procedure Marrow0PlantRightClicked!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure Marrow0PlantRightClicked!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(Items.BONE_MEAL);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.HAPPY_VILLAGER, x, y, z, (int) 25, 1, 1, 1, 1);
			}
			if (Math.random() < 0.7) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Marrow1Block.block.getDefaultState(), 3);
			}
			if (Math.random() < 0.1) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Marrow2Block.block.getDefaultState(), 3);
			}
			if (Math.random() < 0.05) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Marrow3Block.block.getDefaultState(), 3);
			}
		}
	}
}
