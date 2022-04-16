package net.mcreator.ocmd.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.ocmd.block.HardeblockBlock;
import net.mcreator.ocmd.OcmMod;

import java.util.Map;

public class LivbsnRedstoneOffProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OcmMod.LOGGER.warn("Failed to load dependency world for procedure LivbsnRedstoneOff!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OcmMod.LOGGER.warn("Failed to load dependency x for procedure LivbsnRedstoneOff!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OcmMod.LOGGER.warn("Failed to load dependency y for procedure LivbsnRedstoneOff!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OcmMod.LOGGER.warn("Failed to load dependency z for procedure LivbsnRedstoneOff!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == HardeblockBlock.block) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), Blocks.VOID_AIR.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getBlock() == HardeblockBlock.block) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)), Blocks.VOID_AIR.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 3)))).getBlock() == HardeblockBlock.block) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 3)), Blocks.VOID_AIR.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 4)))).getBlock() == HardeblockBlock.block) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 4)), Blocks.VOID_AIR.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 5)))).getBlock() == HardeblockBlock.block) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 5)), Blocks.VOID_AIR.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 6)))).getBlock() == HardeblockBlock.block) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 6)), Blocks.VOID_AIR.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 7)))).getBlock() == HardeblockBlock.block) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 7)), Blocks.VOID_AIR.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 8)))).getBlock() == HardeblockBlock.block) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 8)), Blocks.VOID_AIR.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 9)))).getBlock() == HardeblockBlock.block) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 9)), Blocks.VOID_AIR.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 10)))).getBlock() == HardeblockBlock.block) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 10)), Blocks.VOID_AIR.getDefaultState(), 3);
		}
	}
}
