package net.mcreator.ocmd.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.ocmd.OcmModVariables;
import net.mcreator.ocmd.OcmMod;

import java.util.Map;

public class ExpsyshtemProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure Expsyshtem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(
				new OcmModVariables.PlayerVariables())).experiencelevel >= (entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).experienceleveltonext) {
			{
				double _setval = 0;
				entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.experiencelevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).experienceleveltonext * 1.5);
				entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.experienceleveltonext = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = Math.round((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).experienceleveltonext);
				entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.experienceleveltonext = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OcmModVariables.PlayerVariables())).Aventurelevel + 1);
				entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Aventurelevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new OcmModVariables.PlayerVariables())).experienceleveltonext == 10000000) {
				{
					double _setval = 10000000;
					entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.experienceleveltonext = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
