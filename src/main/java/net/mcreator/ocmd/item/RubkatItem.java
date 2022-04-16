
package net.mcreator.ocmd.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.ocmd.OcmModElements;

@OcmModElements.ModElement.Tag
public class RubkatItem extends OcmModElements.ModElement {
	@ObjectHolder("ocm:rubkat")
	public static final Item block = null;

	public RubkatItem(OcmModElements instance) {
		super(instance, 359);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 3800;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 12.5f;
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
		}, 3, -2.5f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("rubkat"));
	}
}
