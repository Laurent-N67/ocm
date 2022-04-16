
package net.mcreator.ocmd.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.ocmd.itemgroup.DungeonblockongletItemGroup;
import net.mcreator.ocmd.OcmModElements;

import java.util.List;
import java.util.Collections;

@OcmModElements.ModElement.Tag
public class DungeonblockstairsBlock extends OcmModElements.ModElement {
	@ObjectHolder("ocm:dungeonblockstairs")
	public static final Block block = null;

	public DungeonblockstairsBlock(OcmModElements instance) {
		super(instance, 1290);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(
				() -> new BlockItem(block, new Item.Properties().group(DungeonblockongletItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends StairsBlock {
		public CustomBlock() {
			super(() -> new Block(
					Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(25000f, 50000f).setLightLevel(s -> 0))
							.getDefaultState(),
					Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(25000f, 50000f).setLightLevel(s -> 0));
			setRegistryName("dungeonblockstairs");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
