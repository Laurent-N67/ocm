
package net.mcreator.ocmd.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.ocmd.OcmModElements;

@OcmModElements.ModElement.Tag
public class TntdiscItem extends OcmModElements.ModElement {
	@ObjectHolder("ocm:tntdisc")
	public static final Item block = null;

	public TntdiscItem(OcmModElements instance) {
		super(instance, 39);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, OcmModElements.sounds.get(new ResourceLocation("ocm:tntminecraftparody")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("tntdisc");
		}
	}
}
