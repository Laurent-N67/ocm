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

import net.mcreator.ocmd.entity.ElephantEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ElephantRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ElephantEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelelephant(), 0.7999999999999999f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ocm:textures/elephant.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modelelephant extends EntityModel<Entity> {
		private final ModelRenderer foot2;
		private final ModelRenderer foot1;
		private final ModelRenderer foot3;
		private final ModelRenderer foot4;
		private final ModelRenderer body;
		private final ModelRenderer head;
		private final ModelRenderer hear1;
		private final ModelRenderer cube_r1;
		private final ModelRenderer hear2;
		private final ModelRenderer cube_r2;
		private final ModelRenderer nose1;
		private final ModelRenderer nose2;
		private final ModelRenderer horn;
		private final ModelRenderer cube_r3;
		private final ModelRenderer horn2;
		private final ModelRenderer cube_r4;

		public Modelelephant() {
			textureWidth = 256;
			textureHeight = 256;
			foot2 = new ModelRenderer(this);
			foot2.setRotationPoint(9.0F, 24.0F, 17.0F);
			addBoxHelper(foot2, 80, 80, -20.0F, -23.0F, -6.0F, 9, 23, 9, 0.0F, false);
			foot1 = new ModelRenderer(this);
			foot1.setRotationPoint(9.0F, 24.0F, 17.0F);
			addBoxHelper(foot1, 0, 107, -7.0F, -23.0F, -6.0F, 9, 23, 9, 0.0F, false);
			foot3 = new ModelRenderer(this);
			foot3.setRotationPoint(-4.0F, 24.0F, 17.0F);
			addBoxHelper(foot3, 91, 0, 6.0F, -23.0F, -36.0F, 9, 23, 9, 0.0F, false);
			foot4 = new ModelRenderer(this);
			foot4.setRotationPoint(-4.0F, 24.0F, 17.0F);
			addBoxHelper(foot4, 0, 0, -7.0F, -23.0F, -36.0F, 9, 23, 9, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(body, 0, 0, -12.0F, -47.0F, -21.0F, 24, 24, 43, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(head, 111, 111, -3.0F, -44.0F, -42.0F, 6, 21, 5, 0.0F, false);
			addBoxHelper(head, 107, 67, -5.0F, -47.0F, -38.0F, 10, 11, 5, 0.0F, false);
			addBoxHelper(head, 124, 29, 5.0F, -46.0F, -36.0F, 3, 10, 3, 0.0F, false);
			addBoxHelper(head, 116, 96, -8.0F, -46.0F, -36.0F, 3, 10, 3, 0.0F, false);
			addBoxHelper(head, 0, 67, -10.0F, -56.0F, -33.0F, 20, 20, 20, 0.0F, false);
			hear1 = new ModelRenderer(this);
			hear1.setRotationPoint(14.0F, -29.0F, 0.0F);
			head.addChild(hear1);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-12.0F, -5.0F, 0.0F);
			hear1.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, -0.5236F, 0.0F);
			addBoxHelper(cube_r1, 64, 112, -4.0F, -22.0F, -25.0F, 11, 20, 3, 0.0F, false);
			hear2 = new ModelRenderer(this);
			hear2.setRotationPoint(14.0F, -29.0F, 0.0F);
			head.addChild(hear2);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-19.0F, -5.0F, 0.0F);
			hear2.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.5236F, 0.0F);
			addBoxHelper(cube_r2, 36, 107, -4.0F, -22.0F, -25.0F, 11, 20, 3, 0.0F, false);
			nose1 = new ModelRenderer(this);
			nose1.setRotationPoint(0.0F, -4.0F, 3.0F);
			head.addChild(nose1);
			setRotationAngle(nose1, 0.1309F, 0.0F, 0.0F);
			addBoxHelper(nose1, 0, 67, -2.0F, -33.9572F, -40.3474F, 4, 17, 3, 0.0F, false);
			nose2 = new ModelRenderer(this);
			nose2.setRotationPoint(0.6F, -8.6F, 6.0F);
			head.addChild(nose2);
			setRotationAngle(nose2, 0.3054F, 0.0F, 0.0F);
			addBoxHelper(nose2, 60, 67, -2.0F, -28.8114F, -40.1491F, 3, 13, 3, 0.0F, false);
			horn = new ModelRenderer(this);
			horn.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.addChild(horn);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(3.7F, -23.0F, -24.0F);
			horn.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
			addBoxHelper(cube_r3, 84, 67, 1.0F, -12.0F, -14.0F, 3, 10, 3, 0.0F, false);
			addBoxHelper(cube_r3, 116, 83, -11.4F, -12.0F, -14.0F, 3, 10, 3, 0.0F, false);
			horn2 = new ModelRenderer(this);
			horn2.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.addChild(horn2);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(3.6F, -10.8F, -35.3F);
			horn2.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
			addBoxHelper(cube_r4, 72, 72, 1.0F, -12.0F, -14.0F, 3, 11, 3, 0.0F, false);
			addBoxHelper(cube_r4, 92, 112, -11.2F, -12.0F, -14.0F, 3, 11, 3, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			foot2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			foot1.render(ms, vb, i1, i2, f1, f2, f3, f4);
			foot3.render(ms, vb, i1, i2, f1, f2, f3, f4);
			foot4.render(ms, vb, i1, i2, f1, f2, f3, f4);
			body.render(ms, vb, i1, i2, f1, f2, f3, f4);
			head.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.foot1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.foot3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.foot2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.foot4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
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
