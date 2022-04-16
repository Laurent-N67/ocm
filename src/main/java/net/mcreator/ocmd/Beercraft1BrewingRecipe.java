
package net.mcreator.ocmd;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.ocmd.item.UnrefinedbeerItem;
import net.mcreator.ocmd.item.HoublonflowerItem;

@OcmModElements.ModElement.Tag
public class Beercraft1BrewingRecipe extends OcmModElements.ModElement {
	public Beercraft1BrewingRecipe(OcmModElements instance) {
		super(instance, 1889);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}

	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == Items.POTION;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == HoublonflowerItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(UnrefinedbeerItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
