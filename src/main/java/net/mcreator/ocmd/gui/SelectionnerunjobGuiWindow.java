
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
public class SelectionnerunjobGuiWindow extends ContainerScreen<SelectionnerunjobGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = SelectionnerunjobGui.guistate;

	public SelectionnerunjobGuiWindow(SelectionnerunjobGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 280;
		this.ySize = 196;
	}

	private static final ResourceLocation texture = new ResourceLocation("ocm:textures/selectionnerunjob.png");

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
		this.addButton(new Button(this.guiLeft + 4, this.guiTop + 4, 30, 20, new StringTextComponent("<"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new SelectionnerunjobGui.ButtonPressedMessage(0, x, y, z));
				SelectionnerunjobGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 244, this.guiTop + 4, 30, 20, new StringTextComponent(">"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new SelectionnerunjobGui.ButtonPressedMessage(1, x, y, z));
				SelectionnerunjobGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 4, this.guiTop + 40, 60, 20, new StringTextComponent("Fermier"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new SelectionnerunjobGui.ButtonPressedMessage(2, x, y, z));
				SelectionnerunjobGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 65, this.guiTop + 40, 65, 20, new StringTextComponent("Forgeron"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new SelectionnerunjobGui.ButtonPressedMessage(3, x, y, z));
				SelectionnerunjobGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 131, this.guiTop + 40, 80, 20, new StringTextComponent("Charpentier"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new SelectionnerunjobGui.ButtonPressedMessage(4, x, y, z));
				SelectionnerunjobGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 212, this.guiTop + 40, 60, 20, new StringTextComponent("Pécheur"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new SelectionnerunjobGui.ButtonPressedMessage(5, x, y, z));
				SelectionnerunjobGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 9, this.guiTop + 63, 45, 20, new StringTextComponent("Mage"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new SelectionnerunjobGui.ButtonPressedMessage(6, x, y, z));
				SelectionnerunjobGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 55, this.guiTop + 63, 75, 20, new StringTextComponent("Alchimiste"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new SelectionnerunjobGui.ButtonPressedMessage(7, x, y, z));
				SelectionnerunjobGui.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 131, this.guiTop + 63, 70, 20, new StringTextComponent("Ingénieur"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new SelectionnerunjobGui.ButtonPressedMessage(8, x, y, z));
				SelectionnerunjobGui.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 202, this.guiTop + 63, 60, 20, new StringTextComponent("Tisseur"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new SelectionnerunjobGui.ButtonPressedMessage(9, x, y, z));
				SelectionnerunjobGui.handleButtonAction(entity, 9, x, y, z);
			}
		}));
	}
}
