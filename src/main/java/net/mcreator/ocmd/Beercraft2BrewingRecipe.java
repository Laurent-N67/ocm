
package net.mcreator.ocmd;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.ItemStack;

import net.mcreator.ocmd.item.YeastItem;
import net.mcreator.ocmd.item.UnrefinedbeerItem;
import net.mcreator.ocmd.item.BeerItem;

@OcmModElements.ModElement.Tag
public class Beercraft2BrewingRecipe extends OcmModElements.ModElement {
	public Beercraft2BrewingRecipe(OcmModElements instance) {
		super(instance, 1890);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}

	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == UnrefinedbeerItem.block;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == YeastItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(BeerItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
