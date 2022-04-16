
package net.mcreator.ocmd.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.ocmd.item.TeramifanItem;
import net.mcreator.ocmd.OcmModElements;

@OcmModElements.ModElement.Tag
public class OmdrpitemtabItemGroup extends OcmModElements.ModElement {
	public OmdrpitemtabItemGroup(OcmModElements instance) {
		super(instance, 1368);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabomdrpitemtab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TeramifanItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
