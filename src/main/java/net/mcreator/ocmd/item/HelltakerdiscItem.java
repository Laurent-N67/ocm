
package net.mcreator.ocmd.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.ocmd.OcmModElements;

@OcmModElements.ModElement.Tag
public class HelltakerdiscItem extends OcmModElements.ModElement {
	@ObjectHolder("ocm:helltakerdisc")
	public static final Item block = null;

	public HelltakerdiscItem(OcmModElements instance) {
		super(instance, 36);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, OcmModElements.sounds.get(new ResourceLocation("ocm:saymaxwellhelltaker")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("helltakerdisc");
		}
	}
}
