package net.mcreator.ocmd.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.ocmd.entity.CyclopEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CyclopRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(CyclopEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcyclop(), 0.9f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ocm:textures/cyclop.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.7.5
	// Exported for Minecraft version 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modelcyclop extends EntityModel<Entity> {
		private final ModelRenderer armb;
		private final ModelRenderer arma;
		private final ModelRenderer lega;
		private final ModelRenderer legb;
		private final ModelRenderer head;
		private final ModelRenderer bb_main;

		public Modelcyclop() {
			textureWidth = 128;
			textureHeight = 128;
			armb = new ModelRenderer(this);
			armb.setRotationPoint(8.0F, -23.0F, 0.0F);
			addBoxHelper(armb, 0, 61, 0.0F, -3.0F, -4.0F, 7, 25, 8, 0.0F, false);
			arma = new ModelRenderer(this);
			arma.setRotationPoint(-9.0F, -23.0F, 0.0F);
			addBoxHelper(arma, 72, 73, -6.0F, -3.0F, -4.0F, 7, 25, 8, 0.0F, false);
			lega = new ModelRenderer(this);
			lega.setRotationPoint(-4.0F, 0.0F, 0.0F);
			addBoxHelper(lega, 56, 0, -4.0F, -1.0F, -4.0F, 8, 25, 8, 0.0F, false);
			legb = new ModelRenderer(this);
			legb.setRotationPoint(3.0F, 0.0F, 0.0F);
			addBoxHelper(legb, 48, 48, -3.0F, -1.0F, -4.0F, 8, 25, 8, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(-1.0F, -24.0F, 0.0F);
			addBoxHelper(head, 0, 0, -6.0F, -16.0F, -7.0F, 14, 14, 14, 0.0F, false);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, -11.0F, 0.0F);
			addBoxHelper(bb_main, 0, 28, -8.0F, -15.0F, -4.0F, 16, 25, 8, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			armb.render(ms, vb, i1, i2, f1, f2, f3, f4);
			arma.render(ms, vb, i1, i2, f1, f2, f3, f4);
			lega.render(ms, vb, i1, i2, f1, f2, f3, f4);
			legb.render(ms, vb, i1, i2, f1, f2, f3, f4);
			head.render(ms, vb, i1, i2, f1, f2, f3, f4);
			bb_main.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.lega.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.legb.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.arma.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.armb.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static void addBoxHelper(ModelRenderer renderer, int texU, int texV, float x, float y, float z, int dx, int dy, int dz, float delta) {
		addBoxHelper(renderer, texU, texV, x, y, z, dx, dy, dz, delta, renderer.mirror);
	}

	@OnlyIn(Dist.CLIENT)
	public static void addBoxHelper(ModelRenderer renderer, int texU, int texV, float x, float y, float z, int dx, int dy, int dz, float delta,
			boolean mirror) {
		renderer.mirror = mirror;
		renderer.addBox("", x, y, z, dx, dy, dz, delta, texU, texV);
	}
}
