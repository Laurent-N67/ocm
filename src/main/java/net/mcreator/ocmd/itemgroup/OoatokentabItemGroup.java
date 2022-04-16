
package net.mcreator.ocmd.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.ocmd.item.TokenlegItem;
import net.mcreator.ocmd.OcmModElements;

@OcmModElements.ModElement.Tag
public class OoatokentabItemGroup extends OcmModElements.ModElement {
	public OoatokentabItemGroup(OcmModElements instance) {
		super(instance, 1369);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabooatokentab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TokenlegItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
