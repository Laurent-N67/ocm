
package net.mcreator.ocmd;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.ocmd.item.HealthybeerItem;
import net.mcreator.ocmd.item.BeerItem;

@OcmModElements.ModElement.Tag
public class Specialbeer9BrewingRecipe extends OcmModElements.ModElement {
	public Specialbeer9BrewingRecipe(OcmModElements instance) {
		super(instance, 1899);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}

	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == BeerItem.block;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == Items.SLIME_BALL;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(HealthybeerItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
