package net.mcreator.ocmd.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.ocmd.block.GridewBlock;
import net.mcreator.ocmd.OcmMod;

import java.util.Map;

public class Hersu5ewRedstoneOffProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OcmMod.LOGGER.warn("Failed to load dependency world for procedure Hersu5ewRedstoneOff!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OcmMod.LOGGER.warn("Failed to load dependency x for procedure Hersu5ewRedstoneOff!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OcmMod.LOGGER.warn("Failed to load dependency y for procedure Hersu5ewRedstoneOff!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OcmMod.LOGGER.warn("Failed to load dependency z for procedure Hersu5ewRedstoneOff!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == GridewBlock.block) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.VOID_AIR.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock() == GridewBlock.block) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), Blocks.VOID_AIR.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) z))).getBlock() == GridewBlock.block) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 3), (int) z), Blocks.VOID_AIR.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) (y + 4), (int) z))).getBlock() == GridewBlock.block) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 4), (int) z), Blocks.VOID_AIR.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) (y + 5), (int) z))).getBlock() == GridewBlock.block) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 5), (int) z), Blocks.VOID_AIR.getDefaultState(), 3);
		}
	}
}
