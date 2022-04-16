
package net.mcreator.ocmd.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.ocmd.OcmModElements;

@OcmModElements.ModElement.Tag
public class OrangeberryItem extends OcmModElements.ModElement {
	@ObjectHolder("ocm:orangeberry")
	public static final Item block = null;

	public OrangeberryItem(OcmModElements instance) {
		super(instance, 1248);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(1).saturation(0.3f)

							.build()));
			setRegistryName("orangeberry");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 12;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
