
package net.mcreator.ocmd.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.ocmd.itemgroup.CosmeticItemGroup;
import net.mcreator.ocmd.OcmModElements;

@OcmModElements.ModElement.Tag
public class Espos4Item extends OcmModElements.ModElement {
	@ObjectHolder("ocm:espos_4")
	public static final Item block = null;

	public Espos4Item(OcmModElements instance) {
		super(instance, 1286);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CosmeticItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("espos_4");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
