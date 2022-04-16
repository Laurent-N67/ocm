
package net.mcreator.ocmd.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.ocmd.OcmModElements;

@OcmModElements.ModElement.Tag
public class CookingknifItem extends OcmModElements.ModElement {
	@ObjectHolder("ocm:cookingknif")
	public static final Item block = null;

	public CookingknifItem(OcmModElements instance) {
		super(instance, 303);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 45;
			}

			public float getEfficiency() {
				return 1f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, 4f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("cookingknif"));
	}
}
