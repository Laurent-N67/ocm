package net.mcreator.ocmd.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ocmd.item.WineItem;
import net.mcreator.ocmd.item.ThunderstaffItem;
import net.mcreator.ocmd.item.Steak1Item;
import net.mcreator.ocmd.item.SilverIngotItem;
import net.mcreator.ocmd.item.SausageItem;
import net.mcreator.ocmd.item.Sake5Item;
import net.mcreator.ocmd.item.PuregoldDustItem;
import net.mcreator.ocmd.item.Prgd2Item;
import net.mcreator.ocmd.item.PretzelItem;
import net.mcreator.ocmd.item.MythrilIngotItem;
import net.mcreator.ocmd.item.MythrilHoeItem;
import net.mcreator.ocmd.item.MusketgunItem;
import net.mcreator.ocmd.item.ManapureItem;
import net.mcreator.ocmd.item.MagmaswordItem;
import net.mcreator.ocmd.item.KatanaItem;
import net.mcreator.ocmd.item.HealstaffItem;
import net.mcreator.ocmd.item.GreentokenItem;
import net.mcreator.ocmd.item.DarkmanapureItem;
import net.mcreator.ocmd.item.CandyredItem;
import net.mcreator.ocmd.item.CandyblueItem;
import net.mcreator.ocmd.item.BulletItem;
import net.mcreator.ocmd.block.StonbrickghostBlock;
import net.mcreator.ocmd.block.SpikesBlock;
import net.mcreator.ocmd.block.GlsgryellowBlock;
import net.mcreator.ocmd.block.GlsgrredBlock;
import net.mcreator.ocmd.block.GlsgrgreenBlock;
import net.mcreator.ocmd.block.GlsgrblueBlock;
import net.mcreator.ocmd.OcmMod;

import java.util.Map;

public class RedardriftProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OcmMod.LOGGER.warn("Failed to load dependency entity for procedure Redardrift!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (Math.random() < 1) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Prgd2Item.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(MythrilIngotItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			if (Math.random() < 0.02) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(MythrilIngotItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (Math.random() < 0.01) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(MythrilIngotItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
			}
		}
		if (Math.random() < 0.1) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(KatanaItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.2) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(PretzelItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			if (Math.random() < 0.2) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(PretzelItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(ThunderstaffItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.2) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(SausageItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			if (Math.random() < 0.2) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(SausageItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (Math.random() < 0.2) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(SausageItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
					if (Math.random() < 0.2) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(SausageItem.block);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
						if (Math.random() < 0.2) {
							if (entity instanceof PlayerEntity) {
								ItemStack _setstack = new ItemStack(SausageItem.block);
								_setstack.setCount((int) 1);
								ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
							}
						}
					}
				}
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(ManapureItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(DarkmanapureItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.1) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(CandyblueItem.block);
				_setstack.setCount((int) 10);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			if (Math.random() < 0.1) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(CandyblueItem.block);
					_setstack.setCount((int) 10);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
		}
		if (Math.random() < 0.1) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(CandyredItem.block);
				_setstack.setCount((int) 10);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			if (Math.random() < 0.1) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(CandyredItem.block);
					_setstack.setCount((int) 10);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
		}
		if (Math.random() < 0.1) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(WineItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(SpikesBlock.block);
				_setstack.setCount((int) 5);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(GlsgrblueBlock.block);
				_setstack.setCount((int) 5);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(GlsgrredBlock.block);
				_setstack.setCount((int) 5);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(GlsgrgreenBlock.block);
				_setstack.setCount((int) 5);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(GlsgryellowBlock.block);
				_setstack.setCount((int) 5);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(PuregoldDustItem.block);
				_setstack.setCount((int) 2);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(PuregoldDustItem.block);
				_setstack.setCount((int) 2);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(PuregoldDustItem.block);
				_setstack.setCount((int) 2);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(PuregoldDustItem.block);
				_setstack.setCount((int) 2);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(PuregoldDustItem.block);
				_setstack.setCount((int) 2);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(PuregoldDustItem.block);
				_setstack.setCount((int) 2);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(SilverIngotItem.block);
				_setstack.setCount((int) 2);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(StonbrickghostBlock.block);
				_setstack.setCount((int) 2);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Steak1Item.block);
				_setstack.setCount((int) 2);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Steak1Item.block);
				_setstack.setCount((int) 2);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Sake5Item.block);
				_setstack.setCount((int) 2);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(MagmaswordItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(MusketgunItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(MythrilHoeItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(BulletItem.block);
				_setstack.setCount((int) 20);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(HealstaffItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (Math.random() < 0.5) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(GreentokenItem.block);
				_setstack.setCount((int) 5);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			if (Math.random() < 0.2) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(GreentokenItem.block);
					_setstack.setCount((int) 5);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (Math.random() < 0.1) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(GreentokenItem.block);
						_setstack.setCount((int) 5);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
					if (Math.random() < 0.05) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(GreentokenItem.block);
							_setstack.setCount((int) 5);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					}
				}
			}
		}
	}
}
