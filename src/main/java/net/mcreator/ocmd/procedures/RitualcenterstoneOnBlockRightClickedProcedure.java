package net.mcreator.ocmd.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.ocmd.entity.GolemoflightEntity;
import net.mcreator.ocmd.entity.GolemofdarknessEntity;
import net.mcreator.ocmd.block.RitualwhiteBlock;
import net.mcreator.ocmd.block.RitualtotemBlock;
import net.mcreator.ocmd.block.RitualdarkBlock;
import net.mcreator.ocmd.OcmMod;

import java.util.Map;

public class RitualcenterstoneOnBlockRightClickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OcmMod.LOGGER.warn("Failed to load dependency world for procedure RitualcenterstoneOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OcmMod.LOGGER.warn("Failed to load dependency x for procedure RitualcenterstoneOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OcmMod.LOGGER.warn("Failed to load dependency y for procedure RitualcenterstoneOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OcmMod.LOGGER.warn("Failed to load dependency z for procedure RitualcenterstoneOnBlockRightClicked!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 3)))).getBlock() == RitualtotemBlock.block) {
			if ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z - 2)))).getBlock() == RitualtotemBlock.block) {
				if ((world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z - 0)))).getBlock() == RitualtotemBlock.block) {
					if ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z + 2)))).getBlock() == RitualtotemBlock.block) {
						if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 3)))).getBlock() == RitualtotemBlock.block) {
							if ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z + 2))))
									.getBlock() == RitualtotemBlock.block) {
								if ((world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z + 0))))
										.getBlock() == RitualtotemBlock.block) {
									if ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z - 2))))
											.getBlock() == RitualtotemBlock.block) {
										if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z - 3))))
												.getBlock() == RitualwhiteBlock.block) {
											if ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) (z - 2))))
													.getBlock() == RitualwhiteBlock.block) {
												if ((world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 1), (int) (z - 0))))
														.getBlock() == RitualwhiteBlock.block) {
													if ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) (z + 2))))
															.getBlock() == RitualwhiteBlock.block) {
														if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 3))))
																.getBlock() == RitualwhiteBlock.block) {
															if ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) (z + 2))))
																	.getBlock() == RitualwhiteBlock.block) {
																if ((world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 1), (int) (z + 0))))
																		.getBlock() == RitualwhiteBlock.block) {
																	if ((world
																			.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) (z - 2))))
																					.getBlock() == RitualwhiteBlock.block) {
																		world.setBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z - 3)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) (z - 2)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x - 3), (int) (y + 1), (int) (z - 0)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) (z + 2)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 3)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) (z + 2)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x + 3), (int) (y + 1), (int) (z + 0)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) (z - 2)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 3)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z - 2)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z - 0)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z + 2)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z + 3)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z + 2)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z + 0)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z - 2)),
																				Blocks.AIR.getDefaultState(), 3);
																		if (world instanceof ServerWorld) {
																			Entity entityToSpawn = new GolemoflightEntity.CustomEntity(
																					GolemoflightEntity.entity, (World) world);
																			entityToSpawn.setLocationAndAngles(x, y, z,
																					world.getRandom().nextFloat() * 360F, 0);
																			if (entityToSpawn instanceof MobEntity)
																				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																						world.getDifficultyForLocation(entityToSpawn.getPosition()),
																						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
																						(CompoundNBT) null);
																			world.addEntity(entityToSpawn);
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 3)))).getBlock() == RitualtotemBlock.block) {
			if ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z - 2)))).getBlock() == RitualtotemBlock.block) {
				if ((world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z - 0)))).getBlock() == RitualtotemBlock.block) {
					if ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z + 2)))).getBlock() == RitualtotemBlock.block) {
						if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 3)))).getBlock() == RitualtotemBlock.block) {
							if ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z + 2))))
									.getBlock() == RitualtotemBlock.block) {
								if ((world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z + 0))))
										.getBlock() == RitualtotemBlock.block) {
									if ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z - 2))))
											.getBlock() == RitualtotemBlock.block) {
										if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z - 3))))
												.getBlock() == RitualdarkBlock.block) {
											if ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) (z - 2))))
													.getBlock() == RitualdarkBlock.block) {
												if ((world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 1), (int) (z - 0))))
														.getBlock() == RitualdarkBlock.block) {
													if ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) (z + 2))))
															.getBlock() == RitualdarkBlock.block) {
														if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 3))))
																.getBlock() == RitualdarkBlock.block) {
															if ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) (z + 2))))
																	.getBlock() == RitualdarkBlock.block) {
																if ((world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 1), (int) (z + 0))))
																		.getBlock() == RitualdarkBlock.block) {
																	if ((world
																			.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) (z - 2))))
																					.getBlock() == RitualdarkBlock.block) {
																		world.setBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z - 3)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) (z - 2)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x - 3), (int) (y + 1), (int) (z - 0)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) (z + 2)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 3)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) (z + 2)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x + 3), (int) (y + 1), (int) (z + 0)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) (z - 2)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 3)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z - 2)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z - 0)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z + 2)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z + 3)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z + 2)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z + 0)),
																				Blocks.AIR.getDefaultState(), 3);
																		world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z - 2)),
																				Blocks.AIR.getDefaultState(), 3);
																		if (world instanceof ServerWorld) {
																			Entity entityToSpawn = new GolemofdarknessEntity.CustomEntity(
																					GolemofdarknessEntity.entity, (World) world);
																			entityToSpawn.setLocationAndAngles(x, y, z,
																					world.getRandom().nextFloat() * 360F, 0);
																			if (entityToSpawn instanceof MobEntity)
																				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																						world.getDifficultyForLocation(entityToSpawn.getPosition()),
																						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
																						(CompoundNBT) null);
																			world.addEntity(entityToSpawn);
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
