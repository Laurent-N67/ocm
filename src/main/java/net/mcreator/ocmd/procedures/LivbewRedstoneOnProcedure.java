package net.mcreator.ocmd.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.ocmd.block.HardeblockBlock;
import net.mcreator.ocmd.OcmMod;

import java.util.Map;

public class LivbewRedstoneOnProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OcmMod.LOGGER.warn("Failed to load dependency world for procedure LivbewRedstoneOn!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OcmMod.LOGGER.warn("Failed to load dependency x for procedure LivbewRedstoneOn!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OcmMod.LOGGER.warn("Failed to load dependency y for procedure LivbewRedstoneOn!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OcmMod.LOGGER.warn("Failed to load dependency z for procedure LivbewRedstoneOn!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.VOID_AIR) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), HardeblockBlock.block.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == Blocks.VOID_AIR) {
			world.setBlockState(new BlockPos((int) (x + 2), (int) y, (int) z), HardeblockBlock.block.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x + 3), (int) y, (int) z))).getBlock() == Blocks.VOID_AIR) {
			world.setBlockState(new BlockPos((int) (x + 3), (int) y, (int) z), HardeblockBlock.block.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x + 4), (int) y, (int) z))).getBlock() == Blocks.VOID_AIR) {
			world.setBlockState(new BlockPos((int) (x + 4), (int) y, (int) z), HardeblockBlock.block.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x + 5), (int) y, (int) z))).getBlock() == Blocks.VOID_AIR) {
			world.setBlockState(new BlockPos((int) (x + 5), (int) y, (int) z), HardeblockBlock.block.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x + 6), (int) y, (int) z))).getBlock() == Blocks.VOID_AIR) {
			world.setBlockState(new BlockPos((int) (x + 6), (int) y, (int) z), HardeblockBlock.block.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x + 7), (int) y, (int) z))).getBlock() == Blocks.VOID_AIR) {
			world.setBlockState(new BlockPos((int) (x + 7), (int) y, (int) z), HardeblockBlock.block.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x + 8), (int) y, (int) z))).getBlock() == Blocks.VOID_AIR) {
			world.setBlockState(new BlockPos((int) (x + 8), (int) y, (int) z), HardeblockBlock.block.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x + 9), (int) y, (int) z))).getBlock() == Blocks.VOID_AIR) {
			world.setBlockState(new BlockPos((int) (x + 9), (int) y, (int) z), HardeblockBlock.block.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x + 10), (int) y, (int) z))).getBlock() == Blocks.VOID_AIR) {
			world.setBlockState(new BlockPos((int) (x + 10), (int) y, (int) z), HardeblockBlock.block.getDefaultState(), 3);
		}
	}
}
