/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package net.mcreator.ocmd;

import net.minecraftforge.forgespi.language.ModFileScanData;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.block.Block;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class OcmModElements {
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<EntityType<?>>> entities = new ArrayList<>();
	public final List<Supplier<Enchantment>> enchantments = new ArrayList<>();
	public static Map<ResourceLocation, net.minecraft.util.SoundEvent> sounds = new HashMap<>();

	public OcmModElements() {
		sounds.put(new ResourceLocation("ocm", "platinium_disco"), new net.minecraft.util.SoundEvent(new ResourceLocation("ocm", "platinium_disco")));
		sounds.put(new ResourceLocation("ocm", "shootmusket"), new net.minecraft.util.SoundEvent(new ResourceLocation("ocm", "shootmusket")));
		sounds.put(new ResourceLocation("ocm", "chikaphonkversion"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("ocm", "chikaphonkversion")));
		sounds.put(new ResourceLocation("ocm", "saymaxwellhelltaker"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("ocm", "saymaxwellhelltaker")));
		sounds.put(new ResourceLocation("ocm", "revengeminecraftparody"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("ocm", "revengeminecraftparody")));
		sounds.put(new ResourceLocation("ocm", "tntminecraftparody"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("ocm", "tntminecraftparody")));
		sounds.put(new ResourceLocation("ocm", "argueforandagainst"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("ocm", "argueforandagainst")));
		sounds.put(new ResourceLocation("ocm", "start_lifting_dumbbells"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("ocm", "start_lifting_dumbbells")));
		sounds.put(new ResourceLocation("ocm", "unl_reimu_lotus"), new net.minecraft.util.SoundEvent(new ResourceLocation("ocm", "unl_reimu_lotus")));
		sounds.put(new ResourceLocation("ocm", "ambiantmusic1"), new net.minecraft.util.SoundEvent(new ResourceLocation("ocm", "ambiantmusic1")));
		sounds.put(new ResourceLocation("ocm", "ambiantmusic2"), new net.minecraft.util.SoundEvent(new ResourceLocation("ocm", "ambiantmusic2")));
		sounds.put(new ResourceLocation("ocm", "abs"), new net.minecraft.util.SoundEvent(new ResourceLocation("ocm", "abs")));
		sounds.put(new ResourceLocation("ocm", "corridorsoftimefromchronotrigger"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("ocm", "corridorsoftimefromchronotrigger")));
		sounds.put(new ResourceLocation("ocm", "peritunematerialsakuya1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("ocm", "peritunematerialsakuya1")));
		sounds.put(new ResourceLocation("ocm", "gnoll_live"), new net.minecraft.util.SoundEvent(new ResourceLocation("ocm", "gnoll_live")));
		sounds.put(new ResourceLocation("ocm", "gnoll_die"), new net.minecraft.util.SoundEvent(new ResourceLocation("ocm", "gnoll_die")));
		sounds.put(new ResourceLocation("ocm", "animegirlgiggle"), new net.minecraft.util.SoundEvent(new ResourceLocation("ocm", "animegirlgiggle")));
		sounds.put(new ResourceLocation("ocm", "popeffect"), new net.minecraft.util.SoundEvent(new ResourceLocation("ocm", "popeffect")));
		try {
			ModFileScanData modFileInfo = ModList.get().getModFileById("ocm").getFile().getScanResult();
			Set<ModFileScanData.AnnotationData> annotations = modFileInfo.getAnnotations();
			for (ModFileScanData.AnnotationData annotationData : annotations) {
				if (annotationData.getAnnotationType().getClassName().equals(ModElement.Tag.class.getName())) {
					Class<?> clazz = Class.forName(annotationData.getClassType().getClassName());
					if (clazz.getSuperclass() == OcmModElements.ModElement.class)
						elements.add((OcmModElements.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(OcmModElements.ModElement::initElements);
		MinecraftForge.EVENT_BUS.register(new OcmModVariables(this));
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}

	private int messageID = 0;

	public <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, PacketBuffer> encoder, Function<PacketBuffer, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		OcmMod.PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<EntityType<?>>> getEntities() {
		return entities;
	}

	public List<Supplier<Enchantment>> getEnchantments() {
		return enchantments;
	}

	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}

		protected final OcmModElements elements;
		protected final int sortid;

		public ModElement(OcmModElements elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLCommonSetupEvent event) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		@OnlyIn(Dist.CLIENT)
		public void clientLoad(FMLClientSetupEvent event) {
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}