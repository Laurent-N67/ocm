
package net.mcreator.ocmd.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.ocmd.OcmModElements;

@OcmModElements.ModElement.Tag
public class EmeraldspearItem extends OcmModElements.ModElement {
	@ObjectHolder("ocm:emeraldspear")
	public static final Item block = null;

	public EmeraldspearItem(OcmModElements instance) {
		super(instance, 341);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 360;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 12f;
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
		}, 3, -3.5f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("emeraldspear"));
	}
}