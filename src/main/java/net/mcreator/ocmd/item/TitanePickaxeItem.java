
package net.mcreator.ocmd.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.ocmd.OcmModElements;

@OcmModElements.ModElement.Tag
public class TitanePickaxeItem extends OcmModElements.ModElement {
	@ObjectHolder("ocm:titane_pickaxe")
	public static final Item block = null;

	public TitanePickaxeItem(OcmModElements instance) {
		super(instance, 271);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 7500;
			}

			public float getEfficiency() {
				return 25f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 20;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("titane_pickaxe"));
	}
}
