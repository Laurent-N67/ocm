
package net.mcreator.ocmd.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.ocmd.OcmMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CommandmenuGuiWindow extends ContainerScreen<CommandmenuGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = CommandmenuGui.guistate;

	public CommandmenuGuiWindow(CommandmenuGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 404;
		this.ySize = 231;
	}

	private static final ResourceLocation texture = new ResourceLocation("ocm:textures/commandmenu.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 144, this.guiTop + 11, 114, 20, new StringTextComponent("Home ville/maison"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new CommandmenuGui.ButtonPressedMessage(0, x, y, z));
				CommandmenuGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 20, this.guiTop + 34, 114, 20, new StringTextComponent("Towny meny"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new CommandmenuGui.ButtonPressedMessage(1, x, y, z));
				CommandmenuGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 20, this.guiTop + 56, 114, 20, new StringTextComponent("Agrandir son claim"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new CommandmenuGui.ButtonPressedMessage(2, x, y, z));
				CommandmenuGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 144, this.guiTop + 56, 114, 20, new StringTextComponent("Regarder son compte"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new CommandmenuGui.ButtonPressedMessage(3, x, y, z));
				CommandmenuGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 144, this.guiTop + 34, 114, 20, new StringTextComponent("Retour au lobby"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new CommandmenuGui.ButtonPressedMessage(4, x, y, z));
				CommandmenuGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 20, this.guiTop + 78, 114, 20, new StringTextComponent("Compte ville/maison"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new CommandmenuGui.ButtonPressedMessage(5, x, y, z));
				CommandmenuGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 20, this.guiTop + 100, 114, 20, new StringTextComponent("Ajouter sur compte"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new CommandmenuGui.ButtonPressedMessage(6, x, y, z));
				CommandmenuGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 20, this.guiTop + 122, 114, 20, new StringTextComponent("Retirer sur compte"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new CommandmenuGui.ButtonPressedMessage(7, x, y, z));
				CommandmenuGui.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 144, this.guiTop + 78, 114, 20, new StringTextComponent("Poser un home"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new CommandmenuGui.ButtonPressedMessage(8, x, y, z));
				CommandmenuGui.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 144, this.guiTop + 100, 114, 20, new StringTextComponent("Retour au home"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new CommandmenuGui.ButtonPressedMessage(9, x, y, z));
				CommandmenuGui.handleButtonAction(entity, 9, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 20, this.guiTop + 144, 114, 20, new StringTextComponent("Acheter du claim"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new CommandmenuGui.ButtonPressedMessage(10, x, y, z));
				CommandmenuGui.handleButtonAction(entity, 10, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 20, this.guiTop + 167, 114, 20, new StringTextComponent("Cr?er avant post"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new CommandmenuGui.ButtonPressedMessage(11, x, y, z));
				CommandmenuGui.handleButtonAction(entity, 11, x, y, z);
			}
		}));
	}
}
