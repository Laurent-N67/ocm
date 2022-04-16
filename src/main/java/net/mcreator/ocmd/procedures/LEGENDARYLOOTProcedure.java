package net.mcreator.ocmd.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.ocmd.item.TntdiscItem;
import net.mcreator.ocmd.item.StarswordItem;
import net.mcreator.ocmd.item.SpectralswordstaffItem;
import net.mcreator.ocmd.item.SandwarriorarmorItem;
import net.mcreator.ocmd.item.SalamanderstaffItem;
import net.mcreator.ocmd.item.RunicswordItem;
import net.mcreator.ocmd.item.RingametisteItem;
import net.mcreator.ocmd.item.RevengediscItem;
import net.mcreator.ocmd.item.RarehammerItem;
import net.mcreator.ocmd.item.NetherswordItem;
import net.mcreator.ocmd.item.NeckspeedItem;
import net.mcreator.ocmd.item.NeckresistanceItem;
import net.mcreator.ocmd.item.NeckofstrengItem;
import net.mcreator.ocmd.item.NeckofhastItem;
import net.mcreator.ocmd.item.MythrilIngotItem;
import net.mcreator.ocmd.item.MagmaswordItem;
import net.mcreator.ocmd.item.Legendarysword1Item;
import net.mcreator.ocmd.item.LegendaryhammerItem;
import net.mcreator.ocmd.item.Legendarydag1Item;
import net.mcreator.ocmd.item.GoldencursestaffItem;
import net.mcreator.ocmd.item.Epicdague2Item;
import net.mcreator.ocmd.item.Epicdague1Item;
import net.mcreator.ocmd.item.DurandilswordItem;
import net.mcreator.ocmd.item.CreeperstaffItem;
import net.mcreator.ocmd.item.BookofknowledgeItem;
import net.mcreator.ocmd.item.Bagpacklv5Item;
import net.mcreator.ocmd.item.Bagpacklv4Item;
import net.mcreator.ocmd.OcmMod;

import java.util.Map;

public class LEGENDARYLOOTProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OcmMod.LOGGER.warn("Failed to load dependency world for procedure LEGENDARYLOOT!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OcmMod.LOGGER.warn("Failed to load dependency x for procedure LEGENDARYLOOT!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OcmMod.LOGGER.warn("Failed to load dependency y for procedure LEGENDARYLOOT!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OcmMod.LOGGER.warn("Failed to load dependency z for procedure LEGENDARYLOOT!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure LEGENDARYLOOT!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (Math.random() < 0.001) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(RevengediscItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			if (world instanceof ServerWorld) {
				((World) world).getServer().getCommandManager().handleCommand(
						new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
								new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
						"say @p \u00E0 obtenue un disque : Revenge (Chance de l'obtenir \"0.1%\" de chance) Bravo \u00E0 @p !");
			}
		} else {
			if (Math.random() < 0.001) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(TntdiscItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (world instanceof ServerWorld) {
					((World) world).getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
							"say @p \u00E0 obtenue un disque : Tnt (Chance de l'obtenir \"0.1%\" de chance) Bravo \u00E0 @p !");
				}
			} else {
				if (Math.random() < 0.02) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(Legendarysword1Item.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
								"say @p \u00E0 obtenue une \u00E9p\u00E9e l\u00E9gendaire dans le coffre l\u00E9gendaire !");
					}
				} else {
					if (Math.random() < 0.02) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(SalamanderstaffItem.block);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									"say @p \u00E0 obtenue le b\u00E2ton de la salamandre !");
						}
					} else {
						if (Math.random() < 0.02) {
							if (entity instanceof PlayerEntity) {
								ItemStack _setstack = new ItemStack(CreeperstaffItem.block);
								_setstack.setCount((int) 1);
								ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
							}
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
												new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"say @p \u00E0 obtenue le b\u00E2ton de la reine creeper !");
							}
						} else {
							if (Math.random() < 0.02) {
								if (entity instanceof PlayerEntity) {
									ItemStack _setstack = new ItemStack(GoldencursestaffItem.block);
									_setstack.setCount((int) 1);
									ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
								}
								if (world instanceof ServerWorld) {
									((World) world).getServer().getCommandManager().handleCommand(
											new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
													new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
											"say @p \u00E0 obtenue le b\u00E2ton de la d\u00E9esse cupide !");
								}
							} else {
								if (Math.random() < 0.02) {
									if (entity instanceof PlayerEntity) {
										ItemStack _setstack = new ItemStack(BookofknowledgeItem.block);
										_setstack.setCount((int) 1);
										ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
									}
									if (world instanceof ServerWorld) {
										((World) world).getServer().getCommandManager().handleCommand(
												new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4,
														"", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
												"say @p \u00E0 obtenue un livre de craft l\u00E9gendaire ! elle sert a faire une table de fabrication sp\u00E9cial !");
									}
								} else {
									if (Math.random() < 0.02) {
										if (entity instanceof PlayerEntity) {
											ItemStack _setstack = new ItemStack(StarswordItem.block);
											_setstack.setCount((int) 1);
											ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
										}
										if (world instanceof ServerWorld) {
											((World) world).getServer().getCommandManager()
													.handleCommand(
															new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO,
																	(ServerWorld) world, 4, "", new StringTextComponent(""),
																	((World) world).getServer(), null).withFeedbackDisabled(),
															"say @p \u00E0 obtenue une starsword !");
										}
									} else {
										if (Math.random() < 0.02) {
											if (entity instanceof PlayerEntity) {
												ItemStack _setstack = new ItemStack(RunicswordItem.block);
												_setstack.setCount((int) 1);
												ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
											}
											if (world instanceof ServerWorld) {
												((World) world).getServer().getCommandManager().handleCommand(
														new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO,
																(ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(),
																null).withFeedbackDisabled(),
														"say @p \u00E0 obtenue une \u00E9p\u00E9e runique l\u00E9gendaire !");
											}
										} else {
											if (Math.random() < 0.04) {
												if (entity instanceof PlayerEntity) {
													ItemStack _setstack = new ItemStack(SpectralswordstaffItem.block);
													_setstack.setCount((int) 1);
													ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
												}
												if (world instanceof ServerWorld) {
													((World) world).getServer().getCommandManager().handleCommand(
															new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO,
																	(ServerWorld) world, 4, "", new StringTextComponent(""),
																	((World) world).getServer(), null).withFeedbackDisabled(),
															"@p \u00E0 obtenue le b\u00E2ton des \u00E9p\u00E9es sp\u00E9ctrales !");
												}
											} else {
												if (Math.random() < 0.04) {
													if (entity instanceof PlayerEntity) {
														ItemStack _setstack = new ItemStack(NeckspeedItem.block);
														_setstack.setCount((int) 1);
														ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
													}
													if (world instanceof ServerWorld) {
														((World) world).getServer().getCommandManager().handleCommand(
																new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO,
																		(ServerWorld) world, 4, "", new StringTextComponent(""),
																		((World) world).getServer(), null).withFeedbackDisabled(),
																"@p \u00E0 obtenue un art\u00E9facte !");
													}
												} else {
													if (Math.random() < 0.04) {
														if (entity instanceof PlayerEntity) {
															ItemStack _setstack = new ItemStack(NeckresistanceItem.block);
															_setstack.setCount((int) 1);
															ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
														}
														if (world instanceof ServerWorld) {
															((World) world).getServer().getCommandManager().handleCommand(
																	new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO,
																			(ServerWorld) world, 4, "", new StringTextComponent(""),
																			((World) world).getServer(), null).withFeedbackDisabled(),
																	"@p \u00E0 obtenue un art\u00E9facte !");
														}
													} else {
														if (Math.random() < 0.04) {
															if (entity instanceof PlayerEntity) {
																ItemStack _setstack = new ItemStack(NeckofstrengItem.block);
																_setstack.setCount((int) 1);
																ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
															}
															if (world instanceof ServerWorld) {
																((World) world).getServer().getCommandManager().handleCommand(
																		new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO,
																				(ServerWorld) world, 4, "", new StringTextComponent(""),
																				((World) world).getServer(), null).withFeedbackDisabled(),
																		"@p \u00E0 obtenue un art\u00E9facte !");
															}
														} else {
															if (Math.random() < 0.04) {
																if (entity instanceof PlayerEntity) {
																	ItemStack _setstack = new ItemStack(NeckofhastItem.block);
																	_setstack.setCount((int) 1);
																	ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
																}
																if (world instanceof ServerWorld) {
																	((World) world).getServer().getCommandManager().handleCommand(
																			new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z),
																					Vector2f.ZERO, (ServerWorld) world, 4, "",
																					new StringTextComponent(""), ((World) world).getServer(), null)
																							.withFeedbackDisabled(),
																			"@p \u00E0 obtenue un art\u00E9facte !");
																}
															} else {
																if (Math.random() < 0.04) {
																	if (entity instanceof PlayerEntity) {
																		ItemStack _setstack = new ItemStack(RingametisteItem.block);
																		_setstack.setCount((int) 1);
																		ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
																	}
																	if (world instanceof ServerWorld) {
																		((World) world).getServer().getCommandManager().handleCommand(
																				new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z),
																						Vector2f.ZERO, (ServerWorld) world, 4, "",
																						new StringTextComponent(""), ((World) world).getServer(),
																						null).withFeedbackDisabled(),
																				"@p \u00E0 obtenue un art\u00E9facte !");
																	}
																} else {
																	if (Math.random() < 0.04) {
																		if (entity instanceof PlayerEntity) {
																			ItemStack _setstack = new ItemStack(Bagpacklv4Item.block);
																			_setstack.setCount((int) 1);
																			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
																		}
																		if (world instanceof ServerWorld) {
																			((World) world).getServer().getCommandManager()
																					.handleCommand(new CommandSource(ICommandSource.DUMMY,
																							new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world,
																							4, "", new StringTextComponent(""),
																							((World) world).getServer(), null).withFeedbackDisabled(),
																							"@p \u00E0 obtenue un sac niveau 4 !");
																		}
																	} else {
																		if (Math.random() < 0.04) {
																			if (entity instanceof PlayerEntity) {
																				ItemStack _setstack = new ItemStack(Bagpacklv5Item.block);
																				_setstack.setCount((int) 1);
																				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity),
																						_setstack);
																			}
																			if (world instanceof ServerWorld) {
																				((World) world).getServer().getCommandManager().handleCommand(
																						new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z),
																								Vector2f.ZERO, (ServerWorld) world, 4, "",
																								new StringTextComponent(""),
																								((World) world).getServer(), null)
																										.withFeedbackDisabled(),
																						"@p \u00E0 obtenue le sac l\u00E9gendaire !");
																			}
																		} else {
																			if (Math.random() < 0.04) {
																				if (entity instanceof PlayerEntity) {
																					ItemStack _setstack = new ItemStack(Epicdague1Item.block);
																					_setstack.setCount((int) 1);
																					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity),
																							_setstack);
																				}
																				if (world instanceof ServerWorld) {
																					((World) world).getServer().getCommandManager().handleCommand(
																							new CommandSource(ICommandSource.DUMMY,
																									new Vector3d(x, y, z), Vector2f.ZERO,
																									(ServerWorld) world, 4, "",
																									new StringTextComponent(""),
																									((World) world).getServer(), null)
																											.withFeedbackDisabled(),
																							"say @p \u00E0 obtenue une dague rare !");
																				}
																			} else {
																				if (Math.random() < 0.05) {
																					if (entity instanceof PlayerEntity) {
																						ItemStack _setstack = new ItemStack(NetherswordItem.block);
																						_setstack.setCount((int) 1);
																						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity),
																								_setstack);
																					}
																					if (world instanceof ServerWorld) {
																						((World) world).getServer().getCommandManager().handleCommand(
																								new CommandSource(ICommandSource.DUMMY,
																										new Vector3d(x, y, z), Vector2f.ZERO,
																										(ServerWorld) world, 4, "",
																										new StringTextComponent(""),
																										((World) world).getServer(), null)
																												.withFeedbackDisabled(),
																								"say @p \u00E0 obtenue une nethersword !");
																					}
																				} else {
																					if (Math.random() < 0.05) {
																						if (entity instanceof PlayerEntity) {
																							ItemStack _setstack = new ItemStack(
																									DurandilswordItem.block);
																							_setstack.setCount((int) 1);
																							ItemHandlerHelper.giveItemToPlayer(
																									((PlayerEntity) entity), _setstack);
																						}
																						if (world instanceof ServerWorld) {
																							((World) world).getServer().getCommandManager()
																									.handleCommand(
																											new CommandSource(ICommandSource.DUMMY,
																													new Vector3d(x, y, z),
																													Vector2f.ZERO,
																													(ServerWorld) world, 4, "",
																													new StringTextComponent(""),
																													((World) world).getServer(), null)
																															.withFeedbackDisabled(),
																											"say @p \u00E0 obtenue une \u00E9p\u00E9e durandil dans le coffre l\u00E9gendaire !");
																						}
																					} else {
																						if (Math.random() < 0.06) {
																							if (entity instanceof PlayerEntity) {
																								ItemStack _setstack = new ItemStack(
																										Legendarydag1Item.block);
																								_setstack.setCount((int) 1);
																								ItemHandlerHelper.giveItemToPlayer(
																										((PlayerEntity) entity), _setstack);
																							}
																							if (world instanceof ServerWorld) {
																								((World) world).getServer().getCommandManager()
																										.handleCommand(new CommandSource(
																												ICommandSource.DUMMY,
																												new Vector3d(x, y, z), Vector2f.ZERO,
																												(ServerWorld) world, 4, "",
																												new StringTextComponent(""),
																												((World) world).getServer(), null)
																														.withFeedbackDisabled(),
																												"say @p \u00E0 obtenue une dague l\u00E9gendaire !");
																							}
																						} else {
																							if (Math.random() < 0.07) {
																								if (entity instanceof PlayerEntity) {
																									ItemStack _setstack = new ItemStack(
																											LegendaryhammerItem.block);
																									_setstack.setCount((int) 1);
																									ItemHandlerHelper.giveItemToPlayer(
																											((PlayerEntity) entity), _setstack);
																								}
																								if (world instanceof ServerWorld) {
																									((World) world).getServer().getCommandManager()
																											.handleCommand(new CommandSource(
																													ICommandSource.DUMMY,
																													new Vector3d(x, y, z),
																													Vector2f.ZERO,
																													(ServerWorld) world, 4, "",
																													new StringTextComponent(""),
																													((World) world).getServer(), null)
																															.withFeedbackDisabled(),
																													"say @p \u00E0 obtenue un marteau l\u00E9gendaire !");
																								}
																							} else {
																								if (Math.random() < 0.08) {
																									if (entity instanceof PlayerEntity) {
																										ItemStack _setstack = new ItemStack(
																												Epicdague2Item.block);
																										_setstack.setCount((int) 1);
																										ItemHandlerHelper.giveItemToPlayer(
																												((PlayerEntity) entity), _setstack);
																									}
																									if (world instanceof ServerWorld) {
																										((World) world).getServer()
																												.getCommandManager()
																												.handleCommand(new CommandSource(
																														ICommandSource.DUMMY,
																														new Vector3d(x, y, z),
																														Vector2f.ZERO,
																														(ServerWorld) world, 4, "",
																														new StringTextComponent(""),
																														((World) world).getServer(),
																														null).withFeedbackDisabled(),
																														"say @p \u00E0 obtenue une dague rare !");
																									}
																								} else {
																									if (Math.random() < 0.09) {
																										if (entity instanceof PlayerEntity) {
																											ItemStack _setstack = new ItemStack(
																													RarehammerItem.block);
																											_setstack.setCount((int) 1);
																											ItemHandlerHelper.giveItemToPlayer(
																													((PlayerEntity) entity),
																													_setstack);
																										}
																										if (world instanceof ServerWorld) {
																											((World) world).getServer()
																													.getCommandManager()
																													.handleCommand(new CommandSource(
																															ICommandSource.DUMMY,
																															new Vector3d(x, y, z),
																															Vector2f.ZERO,
																															(ServerWorld) world, 4,
																															"",
																															new StringTextComponent(
																																	""),
																															((World) world)
																																	.getServer(),
																															null).withFeedbackDisabled(),
																															"say @p \u00E0 obtenue un marteau rare !");
																										}
																									} else {
																										if (Math.random() < 0.1) {
																											if (entity instanceof PlayerEntity) {
																												ItemStack _setstack = new ItemStack(
																														SandwarriorarmorItem.body);
																												_setstack.setCount((int) 1);
																												ItemHandlerHelper.giveItemToPlayer(
																														((PlayerEntity) entity),
																														_setstack);
																											}
																											if (world instanceof ServerWorld) {
																												((World) world).getServer()
																														.getCommandManager()
																														.handleCommand(
																																new CommandSource(
																																		ICommandSource.DUMMY,
																																		new Vector3d(
																																				x, y,
																																				z),
																																		Vector2f.ZERO,
																																		(ServerWorld) world,
																																		4, "",
																																		new StringTextComponent(
																																				""),
																																		((World) world)
																																				.getServer(),
																																		null).withFeedbackDisabled(),
																																"say @p \u00E0 obtenue une armure des sables (plastron) !");
																											}
																										} else {
																											if (Math.random() < 0.1) {
																												if (entity instanceof PlayerEntity) {
																													ItemStack _setstack = new ItemStack(
																															SandwarriorarmorItem.legs);
																													_setstack.setCount((int) 1);
																													ItemHandlerHelper
																															.giveItemToPlayer(
																																	((PlayerEntity) entity),
																																	_setstack);
																												}
																												if (world instanceof ServerWorld) {
																													((World) world).getServer()
																															.getCommandManager()
																															.handleCommand(
																																	new CommandSource(
																																			ICommandSource.DUMMY,
																																			new Vector3d(
																																					x,
																																					y,
																																					z),
																																			Vector2f.ZERO,
																																			(ServerWorld) world,
																																			4, "",
																																			new StringTextComponent(
																																					""),
																																			((World) world)
																																					.getServer(),
																																			null).withFeedbackDisabled(),
																																	"say @p \u00E0 obtenue une armure des sables (pentalon) !");
																												}
																											} else {
																												if (Math.random() < 0.1) {
																													if (entity instanceof PlayerEntity) {
																														ItemStack _setstack = new ItemStack(
																																SandwarriorarmorItem.boots);
																														_setstack.setCount((int) 1);
																														ItemHandlerHelper
																																.giveItemToPlayer(
																																		((PlayerEntity) entity),
																																		_setstack);
																													}
																													if (world instanceof ServerWorld) {
																														((World) world).getServer()
																																.getCommandManager()
																																.handleCommand(
																																		new CommandSource(
																																				ICommandSource.DUMMY,
																																				new Vector3d(
																																						x,
																																						y,
																																						z),
																																				Vector2f.ZERO,
																																				(ServerWorld) world,
																																				4, "",
																																				new StringTextComponent(
																																						""),
																																				((World) world)
																																						.getServer(),
																																				null).withFeedbackDisabled(),
																																		"say @p \u00E0 obtenue une armure des sables (bottes) !");
																													}
																												} else {
																													if (Math.random() < 0.1) {
																														if (entity instanceof PlayerEntity) {
																															ItemStack _setstack = new ItemStack(
																																	MagmaswordItem.block);
																															_setstack.setCount(
																																	(int) 1);
																															ItemHandlerHelper
																																	.giveItemToPlayer(
																																			((PlayerEntity) entity),
																																			_setstack);
																														}
																														if (world instanceof ServerWorld) {
																															((World) world)
																																	.getServer()
																																	.getCommandManager()
																																	.handleCommand(
																																			new CommandSource(
																																					ICommandSource.DUMMY,
																																					new Vector3d(
																																							x,
																																							y,
																																							z),
																																					Vector2f.ZERO,
																																					(ServerWorld) world,
																																					4,
																																					"",
																																					new StringTextComponent(
																																							""),
																																					((World) world)
																																							.getServer(),
																																					null).withFeedbackDisabled(),
																																			"say @p \u00E0 obtenue une \u00E9p\u00E9e magma !");
																														}
																													} else {
																														if (Math.random() < 0.1) {
																															if (entity instanceof PlayerEntity) {
																																ItemStack _setstack = new ItemStack(
																																		MythrilIngotItem.block);
																																_setstack.setCount(
																																		(int) 20);
																																ItemHandlerHelper
																																		.giveItemToPlayer(
																																				((PlayerEntity) entity),
																																				_setstack);
																															}
																															if (world instanceof ServerWorld) {
																																((World) world)
																																		.getServer()
																																		.getCommandManager()
																																		.handleCommand(
																																				new CommandSource(
																																						ICommandSource.DUMMY,
																																						new Vector3d(
																																								x,
																																								y,
																																								z),
																																						Vector2f.ZERO,
																																						(ServerWorld) world,
																																						4,
																																						"",
																																						new StringTextComponent(
																																								""),
																																						((World) world)
																																								.getServer(),
																																						null).withFeedbackDisabled(),
																																				"say @p \u00E0 obtenue 20 lingots de mithrils !");
																															}
																														} else {
																															if (Math.random() < 0.15) {
																																if (entity instanceof PlayerEntity) {
																																	ItemStack _setstack = new ItemStack(
																																			MythrilIngotItem.block);
																																	_setstack
																																			.setCount(
																																					(int) 10);
																																	ItemHandlerHelper
																																			.giveItemToPlayer(
																																					((PlayerEntity) entity),
																																					_setstack);
																																}
																																if (world instanceof ServerWorld) {
																																	((World) world)
																																			.getServer()
																																			.getCommandManager()
																																			.handleCommand(
																																					new CommandSource(
																																							ICommandSource.DUMMY,
																																							new Vector3d(
																																									x,
																																									y,
																																									z),
																																							Vector2f.ZERO,
																																							(ServerWorld) world,
																																							4,
																																							"",
																																							new StringTextComponent(
																																									""),
																																							((World) world)
																																									.getServer(),
																																							null).withFeedbackDisabled(),
																																					"say @p \u00E0 obtenue 10 lingots de mithrils");
																																}
																															} else {
																																if (Math.random() < 1) {
																																	if (entity instanceof PlayerEntity) {
																																		ItemStack _setstack = new ItemStack(
																																				MythrilIngotItem.block);
																																		_setstack
																																				.setCount(
																																						(int) 5);
																																		ItemHandlerHelper
																																				.giveItemToPlayer(
																																						((PlayerEntity) entity),
																																						_setstack);
																																	}
																																	if (world instanceof ServerWorld) {
																																		((World) world)
																																				.getServer()
																																				.getCommandManager()
																																				.handleCommand(
																																						new CommandSource(
																																								ICommandSource.DUMMY,
																																								new Vector3d(
																																										x,
																																										y,
																																										z),
																																								Vector2f.ZERO,
																																								(ServerWorld) world,
																																								4,
																																								"",
																																								new StringTextComponent(
																																										""),
																																								((World) world)
																																										.getServer(),
																																								null).withFeedbackDisabled(),
																																						"say @p \u00E0 obtenue 5 lingots de mithrils...");
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
}
