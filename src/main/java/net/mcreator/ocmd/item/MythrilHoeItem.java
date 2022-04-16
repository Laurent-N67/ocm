
package net.mcreator.ocmd.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.ocmd.OcmModElements;

@OcmModElements.ModElement.Tag
public class MythrilHoeItem extends OcmModElements.ModElement {
	@ObjectHolder("ocm:mythril_hoe")
	public static final Item block = null;

	public MythrilHoeItem(OcmModElements instance) {
		super(instance, 278);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 20950;
			}

			public float getEfficiency() {
				return 22f;
			}

			public float getAttackDamage() {
				return 15f;
			}

			public int getHarvestLevel() {
				return 50;
			}

			public int getEnchantability() {
				return 122;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 0, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("mythril_hoe"));
	}
}
