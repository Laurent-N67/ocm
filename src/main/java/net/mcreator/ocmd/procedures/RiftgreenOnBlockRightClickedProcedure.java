package net.mcreator.ocmd.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.ocmd.item.RiftkeygoblinItem;
import net.mcreator.ocmd.block.RiftgreenBlock;
import net.mcreator.ocmd.OcmMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

public class RiftgreenOnBlockRightClickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OcmMod.LOGGER.warn("Failed to load dependency world for procedure RiftgreenOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OcmMod.LOGGER.warn("Failed to load dependency x for procedure RiftgreenOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OcmMod.LOGGER.warn("Failed to load dependency y for procedure RiftgreenOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OcmMod.LOGGER.warn("Failed to load dependency z for procedure RiftgreenOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure RiftgreenOnBlockRightClicked!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == RiftkeygoblinItem.block) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(RiftkeygoblinItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			RedardriftProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
					(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ocm:abs")), SoundCategory.NEUTRAL,
						(float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ocm:abs")), SoundCategory.NEUTRAL,
						(float) 1, (float) 1, false);
			}
			if (world instanceof ServerWorld) {
				LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
				_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) x, (int) (y + 5), (int) z)));
				_ent.setEffectOnly(false);
				((World) world).addEntity(_ent);
			}
			if (world instanceof World && !((World) world).isRemote) {
				((World) world).createExplosion(null, (int) x, (int) (y + 5), (int) z, (float) 4, Explosion.Mode.BREAK);
			}
			if (world instanceof World && !((World) world).isRemote) {
				((World) world).createExplosion(null, (int) x, (int) (y + 5), (int) z, (float) 4, Explosion.Mode.BREAK);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 0)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z + 0)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 2)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z + 0)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 4), (int) (y + 5), (int) (z + 0)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 4), (int) (y + 5), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 5), (int) (y + 0), (int) (z + 0)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 5), (int) (y + 0), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 6), (int) (y + 0), (int) (z + 0)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 6), (int) (y + 0), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 7), (int) (y + 0), (int) (z + 0)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 7), (int) (y + 0), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z + 0)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z + 0)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 4), (int) (y + 0), (int) (z + 0)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 4), (int) (y + 0), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 5), (int) (y + 0), (int) (z + 0)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 5), (int) (y + 5), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 6), (int) (y + 5), (int) (z + 0)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 6), (int) (y + 0), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 7), (int) (y + 0), (int) (z + 0)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 7), (int) (y + 0), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z + 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z + 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 4), (int) (y + 0), (int) (z + 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 4), (int) (y + 0), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 5), (int) (y + 5), (int) (z + 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 5), (int) (y + 5), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 6), (int) (y + 0), (int) (z + 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 6), (int) (y + 0), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z + 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z + 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 4), (int) (y + 0), (int) (z + 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 4), (int) (y + 0), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 5), (int) (y + 0), (int) (z + 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 5), (int) (y + 5), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 6), (int) (y + 5), (int) (z + 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 6), (int) (y + 0), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z - 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z - 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 4), (int) (y + 0), (int) (z - 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 4), (int) (y + 0), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 5), (int) (y + 0), (int) (z - 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 5), (int) (y + 0), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 6), (int) (y + 0), (int) (z - 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 6), (int) (y + 0), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z - 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z - 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 4), (int) (y + 0), (int) (z - 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 4), (int) (y + 0), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 5), (int) (y + 0), (int) (z - 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 5), (int) (y + 0), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 6), (int) (y + 0), (int) (z - 1)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 6), (int) (y + 0), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 2)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 2)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z - 2)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z - 2)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 2)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z - 2)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z - 2)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 2)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 2)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z + 2)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z + 2)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 2)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z + 2)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z + 2)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z - 3)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z - 3)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z - 3)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z - 3)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 3)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 3)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 3)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 3)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 3)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 3)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z - 3)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z - 3)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z - 3)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z - 3)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 4)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 4)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z + 3)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z + 3)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z + 3)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z + 3)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 3)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 3)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 3)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 3)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 3)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 3)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z + 3)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z + 3)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z + 3)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z + 3)), Blocks.AIR.getDefaultState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z + 4)))).getBlock() == RiftgreenBlock.block) {
				world.setBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z + 4)), Blocks.AIR.getDefaultState(), 3);
			}
		}
	}
}
