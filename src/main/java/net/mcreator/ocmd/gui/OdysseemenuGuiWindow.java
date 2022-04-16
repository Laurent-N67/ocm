
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

import net.mcreator.ocmd.OcmModVariables;
import net.mcreator.ocmd.OcmMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class OdysseemenuGuiWindow extends ContainerScreen<OdysseemenuGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = OdysseemenuGui.guistate;

	public OdysseemenuGuiWindow(OdysseemenuGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 252;
		this.ySize = 166;
	}

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

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("ocm:textures/odyseemenubook.png"));
		this.blit(ms, this.guiLeft + 0, this.guiTop + 0, 0, 0, 252, 166, 252, 166);

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
		this.font.drawString(ms, "Nom : "
				+ ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OcmModVariables.PlayerVariables())).playername)
				+ "", 17, 34, -16777216);
		this.font.drawString(ms, "Lvl " + (int) ((entity.getCapability(OcmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new OcmModVariables.PlayerVariables())).Aventurelevel) + "", 17, 52, -12829636);
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
		this.addButton(new Button(this.guiLeft + 19, this.guiTop + 137, 45, 20, new StringTextComponent("Suicide"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new OdysseemenuGui.ButtonPressedMessage(0, x, y, z));
				OdysseemenuGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 64, this.guiTop + 137, 50, 20, new StringTextComponent("Spawn"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new OdysseemenuGui.ButtonPressedMessage(1, x, y, z));
				OdysseemenuGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 13, this.guiTop + 9, 30, 20, new StringTextComponent("<"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new OdysseemenuGui.ButtonPressedMessage(2, x, y, z));
				OdysseemenuGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 209, this.guiTop + 9, 30, 20, new StringTextComponent(">"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new OdysseemenuGui.ButtonPressedMessage(3, x, y, z));
				OdysseemenuGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 134, this.guiTop + 137, 56, 20, new StringTextComponent("set home"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new OdysseemenuGui.ButtonPressedMessage(4, x, y, z));
				OdysseemenuGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 190, this.guiTop + 137, 46, 20, new StringTextComponent("home"), e -> {
			if (true) {
				OcmMod.PACKET_HANDLER.sendToServer(new OdysseemenuGui.ButtonPressedMessage(5, x, y, z));
				OdysseemenuGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
	}
}
