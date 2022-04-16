
package net.mcreator.ocmd.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.mcreator.ocmd.OcmModElements;

@OcmModElements.ModElement.Tag
public class DungeonblockongletItemGroup extends OcmModElements.ModElement {
	public DungeonblockongletItemGroup(OcmModElements instance) {
		super(instance, 1603);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdungeonblockonglet") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.POLISHED_BLACKSTONE_BRICKS);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
