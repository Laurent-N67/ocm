package net.mcreator.ocmd.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ocmd.OcmModVariables;
import net.mcreator.ocmd.OcmMod;

import java.util.Map;
import java.util.HashMap;

public class HealtbonusartifactProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				Entity entity = event.player;
				World world = entity.world;
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OcmMod.LOGGER.warn("Failed to load dependency world for procedure Healtbonusartifact!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure Healtbonusartifact!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private IWorld world;

			public void start(IWorld world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).artefact1 == 9) {
					{
						double _setval = 1;
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.healbonusitem1 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = (true);
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.triggerhealtbonus = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).artefact1 != 9) {
					{
						double _setval = 0;
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.healbonusitem1 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = (false);
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.triggerhealtbonus = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).artefact2 == 9) {
					{
						double _setval = 1;
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.healtbonusitem2 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = (true);
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.triggerhealtbonus = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).artefact2 != 9) {
					{
						double _setval = 0;
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.healtbonusitem2 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = (false);
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.triggerhealtbonus = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).artefact3 == 9) {
					{
						double _setval = 1;
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.healtbonusitem3 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = (true);
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.triggerhealtbonus = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).artefact3 != 9) {
					{
						double _setval = 0;
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.healtbonusitem3 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = (false);
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.triggerhealtbonus = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).artefact4 == 9) {
					{
						double _setval = 1;
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.healtbonusitem4 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = (true);
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.triggerhealtbonus = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).artefact4 != 9) {
					{
						double _setval = 0;
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.healtbonusitem4 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = (false);
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.triggerhealtbonus = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).artefact5 == 9) {
					{
						double _setval = 1;
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.healtbonusitem5 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = (true);
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.triggerhealtbonus = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).artefact5 != 9) {
					{
						double _setval = 0;
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.healtbonusitem5 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = (false);
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.triggerhealtbonus = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				{
					double _setval = ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new OcmModVariables.PlayerVariables())).healbonusitem1
							+ (entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new OcmModVariables.PlayerVariables())).healtbonusitem2
							+ (entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new OcmModVariables.PlayerVariables())).healtbonusitem3
							+ (entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new OcmModVariables.PlayerVariables())).healtbonusitem4
							+ (entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new OcmModVariables.PlayerVariables())).healtbonusitem5
							+ 0 + 0 + 0);
					entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.healtbonustotal = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new OcmModVariables.PlayerVariables())).healtbonustotal - 1);
					entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.healtbonustotal = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).healtbonustotal >= 5) {
					{
						double _setval = 4;
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.healtbonustotal = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).healbonuschange != (entity
								.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new OcmModVariables.PlayerVariables())).healtbonustotal) {
					{
						double _setval = ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new OcmModVariables.PlayerVariables())).healtbonustotal);
						entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.healbonuschange = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private IWorld world;

						public void start(IWorld world, int waitTicks) {
							this.waitTicks = waitTicks;
							MinecraftForge.EVENT_BUS.register(this);
							this.world = world;
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								this.ticks += 1;
								if (this.ticks >= this.waitTicks)
									run();
							}
						}

						private void run() {
							if (entity instanceof LivingEntity) {
								((LivingEntity) entity).removePotionEffect(Effects.HEALTH_BOOST);
							}
							if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new OcmModVariables.PlayerVariables())).healtbonustotal != -1) {
								if (entity instanceof LivingEntity)
									((LivingEntity) entity)
											.addPotionEffect(
													new EffectInstance(Effects.HEALTH_BOOST, (int) 90000000,
															(int) ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																	.orElse(new OcmModVariables.PlayerVariables())).healbonuschange),
															(false), (false)));
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 2);
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 2);
	}
}
