
package net.mcreator.ocmd.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.ocmd.itemgroup.OoatokentabItemGroup;
import net.mcreator.ocmd.OcmModElements;

@OcmModElements.ModElement.Tag
public class PvptokenItem extends OcmModElements.ModElement {
	@ObjectHolder("ocm:pvptoken")
	public static final Item block = null;

	public PvptokenItem(OcmModElements instance) {
		super(instance, 1275);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(OoatokentabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("pvptoken");
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
