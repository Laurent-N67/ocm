
package net.mcreator.ocmd;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.ItemStack;

import net.mcreator.ocmd.item.PurpleslimeballItem;
import net.mcreator.ocmd.item.EvilbeerItem;
import net.mcreator.ocmd.item.BeerItem;

@OcmModElements.ModElement.Tag
public class Specialbeer4BrewingRecipe extends OcmModElements.ModElement {
	public Specialbeer4BrewingRecipe(OcmModElements instance) {
		super(instance, 1894);
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
			return ingredient.getItem() == PurpleslimeballItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(EvilbeerItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
