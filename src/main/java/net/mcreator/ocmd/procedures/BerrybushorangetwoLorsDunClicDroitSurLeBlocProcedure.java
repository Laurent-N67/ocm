package net.mcreator.ocmd.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ocmd.item.OrangeberryItem;
import net.mcreator.ocmd.block.BerrybushoorangeoneBlock;
import net.mcreator.ocmd.OcmMod;

import java.util.Map;

public class BerrybushorangetwoLorsDunClicDroitSurLeBlocProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OcmMod.LOGGER.warn("Failed to load dependency world for procedure BerrybushorangetwoLorsDunClicDroitSurLeBloc!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OcmMod.LOGGER.warn("Failed to load dependency x for procedure BerrybushorangetwoLorsDunClicDroitSurLeBloc!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OcmMod.LOGGER.warn("Failed to load dependency y for procedure BerrybushorangetwoLorsDunClicDroitSurLeBloc!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OcmMod.LOGGER.warn("Failed to load dependency z for procedure BerrybushorangetwoLorsDunClicDroitSurLeBloc!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure BerrybushorangetwoLorsDunClicDroitSurLeBloc!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BerrybushoorangeoneBlock.block.getDefaultState(), 3);
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(OrangeberryItem.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
