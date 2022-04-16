
package net.mcreator.ocmd.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.ocmd.item.SaphirGemItem;
import net.mcreator.ocmd.OcmModElements;

@OcmModElements.ModElement.Tag
public class OdysseecrafttabItemGroup extends OcmModElements.ModElement {
	public OdysseecrafttabItemGroup(OcmModElements instance) {
		super(instance, 1361);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabodysseecrafttab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SaphirGemItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
