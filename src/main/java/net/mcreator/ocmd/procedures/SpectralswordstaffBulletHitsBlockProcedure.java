package net.mcreator.ocmd.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.ocmd.block.SpectralblockBlock;
import net.mcreator.ocmd.OcmMod;

import java.util.Map;

public class SpectralswordstaffBulletHitsBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OcmMod.LOGGER.warn("Failed to load dependency world for procedure SpectralswordstaffBulletHitsBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OcmMod.LOGGER.warn("Failed to load dependency x for procedure SpectralswordstaffBulletHitsBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OcmMod.LOGGER.warn("Failed to load dependency y for procedure SpectralswordstaffBulletHitsBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OcmMod.LOGGER.warn("Failed to load dependency z for procedure SpectralswordstaffBulletHitsBlock!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 5), (int) (z + 0)))).getBlock() == Blocks.VOID_AIR) {
			world.setBlockState(new BlockPos((int) (x + 0), (int) (y + 5), (int) (z + 0)), SpectralblockBlock.block.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 5), (int) (z + 1)))).getBlock() == Blocks.VOID_AIR) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 5), (int) (z + 1)), SpectralblockBlock.block.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 5), (int) (z - 1)))).getBlock() == Blocks.VOID_AIR) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 5), (int) (z - 1)), SpectralblockBlock.block.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 5), (int) (z - 1)))).getBlock() == Blocks.VOID_AIR) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 5), (int) (z - 1)), SpectralblockBlock.block.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 5), (int) (z + 1)))).getBlock() == Blocks.VOID_AIR) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 5), (int) (z + 1)), SpectralblockBlock.block.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + 0)))).getBlock() == Blocks.VOID_AIR) {
			world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + 0)), SpectralblockBlock.block.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 5), (int) (z + 0)))).getBlock() == Blocks.VOID_AIR) {
			world.setBlockState(new BlockPos((int) (x - 2), (int) (y + 5), (int) (z + 0)), SpectralblockBlock.block.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 5), (int) (z + 2)))).getBlock() == Blocks.VOID_AIR) {
			world.setBlockState(new BlockPos((int) (x + 0), (int) (y + 5), (int) (z + 2)), SpectralblockBlock.block.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 5), (int) (z - 2)))).getBlock() == Blocks.VOID_AIR) {
			world.setBlockState(new BlockPos((int) (x + 0), (int) (y + 5), (int) (z - 2)), SpectralblockBlock.block.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 5), (int) (z - 2)))).getBlock() == Blocks.VOID_AIR) {
			world.setBlockState(new BlockPos((int) (x - 2), (int) (y + 5), (int) (z - 2)), SpectralblockBlock.block.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 5), (int) (z + 2)))).getBlock() == Blocks.VOID_AIR) {
			world.setBlockState(new BlockPos((int) (x - 2), (int) (y + 5), (int) (z + 2)), SpectralblockBlock.block.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z - 2)))).getBlock() == Blocks.VOID_AIR) {
			world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z - 2)), SpectralblockBlock.block.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + 2)))).getBlock() == Blocks.VOID_AIR) {
			world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + 2)), SpectralblockBlock.block.getDefaultState(), 3);
		}
	}
}
