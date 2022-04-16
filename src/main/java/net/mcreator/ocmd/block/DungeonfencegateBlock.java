
package net.mcreator.ocmd.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.ocmd.itemgroup.DungeonblockongletItemGroup;
import net.mcreator.ocmd.OcmModElements;

import java.util.List;
import java.util.Collections;

@OcmModElements.ModElement.Tag
public class DungeonfencegateBlock extends OcmModElements.ModElement {
	@ObjectHolder("ocm:dungeonfencegate")
	public static final Block block = null;

	public DungeonfencegateBlock(OcmModElements instance) {
		super(instance, 1360);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(
				() -> new BlockItem(block, new Item.Properties().group(DungeonblockongletItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends DoorBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(-1, 3600000).setLightLevel(s -> 0));
			setRegistryName("dungeonfencegate");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			if (state.get(BlockStateProperties.DOUBLE_BLOCK_HALF) != DoubleBlockHalf.LOWER)
				return Collections.emptyList();
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 0));
		}
	}
}
