
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
public class SilverSwordItem extends OcmModElements.ModElement {
	@ObjectHolder("ocm:silver_sword")
	public static final Item block = null;

	public SilverSwordItem(OcmModElements instance) {
		super(instance, 325);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 350;
			}

			public float getEfficiency() {
				return 17f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 11;
			}

			public int getEnchantability() {
				return 35;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SilverIngotItem.block));
			}
		}, 3, -2.4f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("silver_sword"));
	}
}
