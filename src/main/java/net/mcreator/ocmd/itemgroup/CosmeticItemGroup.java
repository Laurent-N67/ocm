
package net.mcreator.ocmd.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.ocmd.item.Espos1Item;
import net.mcreator.ocmd.OcmModElements;

@OcmModElements.ModElement.Tag
public class CosmeticItemGroup extends OcmModElements.ModElement {
	public CosmeticItemGroup(OcmModElements instance) {
		super(instance, 1388);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcosmetic") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Espos1Item.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
