
package net.mcreator.ocmd.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.ocmd.item.TitaneHoeItem;
import net.mcreator.ocmd.item.SilverHoeItem;
import net.mcreator.ocmd.item.SaphirHoeItem;
import net.mcreator.ocmd.item.RubyHoeItem;
import net.mcreator.ocmd.item.ObsidienHoeItem;
import net.mcreator.ocmd.item.MythrilHoeItem;
import net.mcreator.ocmd.item.EmeraldHoeItem;
import net.mcreator.ocmd.item.CitrineHoeItem;
import net.mcreator.ocmd.OcmModElements;

@OcmModElements.ModElement.Tag
public class BonemealingEnchantment extends OcmModElements.ModElement {
	@ObjectHolder("ocm:bonemealing")
	public static final Enchantment enchantment = null;

	public BonemealingEnchantment(OcmModElements instance) {
		super(instance, 1836);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("bonemealing"));
	}

	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.COMMON, EnchantmentType.BREAKABLE, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 1;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == Items.STONE_HOE)
				return true;
			if (stack.getItem() == Items.IRON_HOE)
				return true;
			if (stack.getItem() == Items.GOLDEN_HOE)
				return true;
			if (stack.getItem() == Items.DIAMOND_HOE)
				return true;
			if (stack.getItem() == Items.NETHERITE_HOE)
				return true;
			if (stack.getItem() == SaphirHoeItem.block)
				return true;
			if (stack.getItem() == RubyHoeItem.block)
				return true;
			if (stack.getItem() == EmeraldHoeItem.block)
				return true;
			if (stack.getItem() == CitrineHoeItem.block)
				return true;
			if (stack.getItem() == ObsidienHoeItem.block)
				return true;
			if (stack.getItem() == TitaneHoeItem.block)
				return true;
			if (stack.getItem() == MythrilHoeItem.block)
				return true;
			if (stack.getItem() == SilverHoeItem.block)
				return true;
			if (stack.getItem() == Items.WOODEN_HOE)
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}

		@Override
		public boolean canGenerateInLoot() {
			return true;
		}

		@Override
		public boolean canVillagerTrade() {
			return true;
		}
	}
}
