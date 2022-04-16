
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
public class WarpmenuGuiWindow extends ContainerScreen<WarpmenuGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = WarpmenuGui.guistate;

	public WarpmenuGuiWindow(WarpmenuGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 269;
		this.ySize = 202;
	}

	private static final ResourceLocation texture = new ResourceLocation("ocm:textures/warpmenu.png");

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

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("ocm:textures/warpmainmenu1.png"));
		this.blit(ms, this.guiLeft + 0, this.guiTop + 0, 0, 0, 269, 202, 269, 202);

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
		this.font.drawString(ms, "Menu des warps", 96, 5, -12829636);
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
		this.addButton(new Button(this.guiLeft + 12, this.guiTop + 179, 46, 20, new StringTextComponent("   warp   "), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new WarpmenuGui.ButtonPressedMessage(0, x, y, z));
				WarpmenuGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 12, this.guiTop + 96, 46, 20, new StringTextComponent("warp"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new WarpmenuGui.ButtonPressedMessage(1, x, y, z));
				WarpmenuGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 78, this.guiTop + 96, 46, 20, new StringTextComponent("warp"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new WarpmenuGui.ButtonPressedMessage(2, x, y, z));
				WarpmenuGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 144, this.guiTop + 96, 46, 20, new StringTextComponent("warp"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new WarpmenuGui.ButtonPressedMessage(3, x, y, z));
				WarpmenuGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 210, this.guiTop + 96, 46, 20, new StringTextComponent("warp"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new WarpmenuGui.ButtonPressedMessage(4, x, y, z));
				WarpmenuGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 78, this.guiTop + 179, 46, 20, new StringTextComponent("warp"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new WarpmenuGui.ButtonPressedMessage(5, x, y, z));
				WarpmenuGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 144, this.guiTop + 179, 46, 20, new StringTextComponent("warp"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new WarpmenuGui.ButtonPressedMessage(6, x, y, z));
				WarpmenuGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 210, this.guiTop + 179, 46, 20, new StringTextComponent("warp"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new WarpmenuGui.ButtonPressedMessage(7, x, y, z));
				WarpmenuGui.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 235, this.guiTop + 3, 30, 20, new StringTextComponent(">"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new WarpmenuGui.ButtonPressedMessage(8, x, y, z));
				WarpmenuGui.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 3, this.guiTop + 3, 30, 20, new StringTextComponent("<"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new WarpmenuGui.ButtonPressedMessage(9, x, y, z));
				WarpmenuGui.handleButtonAction(entity, 9, x, y, z);
			}
		}));
	}
}
