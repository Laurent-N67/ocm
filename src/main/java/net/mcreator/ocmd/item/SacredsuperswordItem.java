
package net.mcreator.ocmd.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.ocmd.OcmModElements;

@OcmModElements.ModElement.Tag
public class SacredsuperswordItem extends OcmModElements.ModElement {
	@ObjectHolder("ocm:sacredsupersword")
	public static final Item block = null;

	public SacredsuperswordItem(OcmModElements instance) {
		super(instance, 2529);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 50000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 10f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PrismingotItem.block));
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("sacredsupersword"));
	}
}
