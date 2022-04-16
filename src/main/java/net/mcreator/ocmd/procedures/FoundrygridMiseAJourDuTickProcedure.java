package net.mcreator.ocmd.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.ocmd.block.TopazOreBlock;
import net.mcreator.ocmd.block.TitaneOreBlock;
import net.mcreator.ocmd.block.SpinelleOreBlock;
import net.mcreator.ocmd.block.SlateOreBlock;
import net.mcreator.ocmd.block.SilverOreBlock;
import net.mcreator.ocmd.block.SaphirOreBlock;
import net.mcreator.ocmd.block.RubyOreBlock;
import net.mcreator.ocmd.block.PurplemanaOreBlock;
import net.mcreator.ocmd.block.PuregoldOreBlock;
import net.mcreator.ocmd.block.PlatiniumOreBlock;
import net.mcreator.ocmd.block.PeridotOreBlock;
import net.mcreator.ocmd.block.OnyxOreBlock;
import net.mcreator.ocmd.block.MythrilOreBlock;
import net.mcreator.ocmd.block.MeltingfluidBlock;
import net.mcreator.ocmd.block.MarbleoreBlock;
import net.mcreator.ocmd.block.KyaniteOreBlock;
import net.mcreator.ocmd.block.JadeOreBlock;
import net.mcreator.ocmd.block.IoliteOreBlock;
import net.mcreator.ocmd.block.CitrineOreBlock;
import net.mcreator.ocmd.block.AventurineOreBlock;
import net.mcreator.ocmd.block.AmberOreBlock;
import net.mcreator.ocmd.OcmMod;

import java.util.Map;

public class FoundrygridMiseAJourDuTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OcmMod.LOGGER.warn("Failed to load dependency world for procedure FoundrygridMiseAJourDuTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OcmMod.LOGGER.warn("Failed to load dependency x for procedure FoundrygridMiseAJourDuTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OcmMod.LOGGER.warn("Failed to load dependency y for procedure FoundrygridMiseAJourDuTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OcmMod.LOGGER.warn("Failed to load dependency z for procedure FoundrygridMiseAJourDuTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (Math.random() < 0.1) {
			if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.LAVA) {
				if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.COBBLESTONE) {
					world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), MeltingfluidBlock.block.getDefaultState(), 3);
				} else {
					if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == MeltingfluidBlock.block) {
						if (Math.random() < 0.7) {
							world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.STONE.getDefaultState(), 3);
						} else {
							if (Math.random() < 0.3) {
								world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.COAL_ORE.getDefaultState(), 3);
							} else {
								if (Math.random() < 0.2) {
									world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.IRON_ORE.getDefaultState(), 3);
								} else {
									if (Math.random() < 0.2) {
										world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.GOLD_ORE.getDefaultState(), 3);
									} else {
										if (Math.random() < 0.2) {
											world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.DIAMOND_ORE.getDefaultState(),
													3);
										} else {
											if (Math.random() < 0.2) {
												world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z),
														Blocks.REDSTONE_ORE.getDefaultState(), 3);
											} else {
												if (Math.random() < 0.2) {
													world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z),
															Blocks.LAPIS_ORE.getDefaultState(), 3);
												} else {
													if (Math.random() < 0.2) {
														world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z),
																SaphirOreBlock.block.getDefaultState(), 3);
													} else {
														if (Math.random() < 0.2) {
															world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z),
																	RubyOreBlock.block.getDefaultState(), 3);
														} else {
															if (Math.random() < 0.2) {
																world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z),
																		Blocks.EMERALD_ORE.getDefaultState(), 3);
															} else {
																if (Math.random() < 0.2) {
																	world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z),
																			CitrineOreBlock.block.getDefaultState(), 3);
																} else {
																	if (Math.random() < 0.2) {
																		world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z),
																				SlateOreBlock.block.getDefaultState(), 3);
																	} else {
																		if (Math.random() < 0.2) {
																			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z),
																					TitaneOreBlock.block.getDefaultState(), 3);
																		} else {
																			if (Math.random() < 0.2) {
																				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z),
																						PlatiniumOreBlock.block.getDefaultState(), 3);
																			} else {
																				if (Math.random() < 0.2) {
																					world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z),
																							AmberOreBlock.block.getDefaultState(), 3);
																				} else {
																					if (Math.random() < 0.2) {
																						world.setBlockState(
																								new BlockPos((int) x, (int) (y + 1), (int) z),
																								PuregoldOreBlock.block.getDefaultState(), 3);
																					} else {
																						if (Math.random() < 0.2) {
																							world.setBlockState(
																									new BlockPos((int) x, (int) (y + 1), (int) z),
																									TopazOreBlock.block.getDefaultState(), 3);
																						} else {
																							if (Math.random() < 0.2) {
																								world.setBlockState(
																										new BlockPos((int) x, (int) (y + 1), (int) z),
																										SilverOreBlock.block.getDefaultState(), 3);
																							} else {
																								if (Math.random() < 0.2) {
																									world.setBlockState(
																											new BlockPos((int) x, (int) (y + 1),
																													(int) z),
																											PurplemanaOreBlock.block
																													.getDefaultState(),
																											3);
																								} else {
																									if (Math.random() < 0.2) {
																										world.setBlockState(
																												new BlockPos((int) x, (int) (y + 1),
																														(int) z),
																												PeridotOreBlock.block
																														.getDefaultState(),
																												3);
																									} else {
																										if (Math.random() < 0.2) {
																											world.setBlockState(
																													new BlockPos((int) x,
																															(int) (y + 1), (int) z),
																													SpinelleOreBlock.block
																															.getDefaultState(),
																													3);
																										} else {
																											if (Math.random() < 0.2) {
																												world.setBlockState(
																														new BlockPos((int) x,
																																(int) (y + 1),
																																(int) z),
																														IoliteOreBlock.block
																																.getDefaultState(),
																														3);
																											} else {
																												if (Math.random() < 0.2) {
																													world.setBlockState(
																															new BlockPos((int) x,
																																	(int) (y + 1),
																																	(int) z),
																															KyaniteOreBlock.block
																																	.getDefaultState(),
																															3);
																												} else {
																													if (Math.random() < 0.2) {
																														world.setBlockState(
																																new BlockPos((int) x,
																																		(int) (y + 1),
																																		(int) z),
																																AventurineOreBlock.block
																																		.getDefaultState(),
																																3);
																													} else {
																														if (Math.random() < 0.2) {
																															world.setBlockState(
																																	new BlockPos(
																																			(int) x,
																																			(int) (y + 1),
																																			(int) z),
																																	JadeOreBlock.block
																																			.getDefaultState(),
																																	3);
																														} else {
																															if (Math.random() < 0.2) {
																																world.setBlockState(
																																		new BlockPos(
																																				(int) x,
																																				(int) (y + 1),
																																				(int) z),
																																		OnyxOreBlock.block
																																				.getDefaultState(),
																																		3);
																															} else {
																																if (Math.random() < 0.2) {
																																	world.setBlockState(
																																			new BlockPos(
																																					(int) x,
																																					(int) (y + 1),
																																					(int) z),
																																			MarbleoreBlock.block
																																					.getDefaultState(),
																																			3);
																																} else {
																																	world.setBlockState(
																																			new BlockPos(
																																					(int) x,
																																					(int) (y + 1),
																																					(int) z),
																																			MythrilOreBlock.block
																																					.getDefaultState(),
																																			3);
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
