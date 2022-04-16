
package net.mcreator.ocmd;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.ItemStack;

import net.mcreator.ocmd.item.BlackslimeballItem;
import net.mcreator.ocmd.item.BeerItem;
import net.mcreator.ocmd.item.BannedbeerItem;

@OcmModElements.ModElement.Tag
public class Specialbeer7BrewingRecipe extends OcmModElements.ModElement {
	public Specialbeer7BrewingRecipe(OcmModElements instance) {
		super(instance, 1897);
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
			return ingredient.getItem() == BlackslimeballItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(BannedbeerItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
