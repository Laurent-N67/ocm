
package net.mcreator.ocmd.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.ocmd.OcmModElements;

import java.util.List;

@OcmModElements.ModElement.Tag
public class CorridorsoftimefromchronotriggerItem extends OcmModElements.ModElement {
	@ObjectHolder("ocm:corridorsoftimefromchronotrigger")
	public static final Item block = null;

	public CorridorsoftimefromchronotriggerItem(OcmModElements instance) {
		super(instance, 151);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, OcmModElements.sounds.get(new ResourceLocation("ocm:corridorsoftimefromchronotrigger")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("corridorsoftimefromchronotrigger");
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("\u201CCorridors of Time\u201D from Chrono Trigger"));
		}
	}
}
