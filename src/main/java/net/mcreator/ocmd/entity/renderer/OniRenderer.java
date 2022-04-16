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

import net.mcreator.ocmd.entity.OniEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class OniRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(OniEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modeloni(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ocm:textures/oni.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.7.5
	// Exported for Minecraft version 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modeloni extends EntityModel<Entity> {
		private final ModelRenderer leg1;
		private final ModelRenderer leg2;
		private final ModelRenderer arm1;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer arm2;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer head;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer bb_main;

		public Modeloni() {
			textureWidth = 128;
			textureHeight = 128;
			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(3.0F, 5.0F, 0.0F);
			addBoxHelper(leg1, 68, 0, -3.0F, -1.0F, -4.0F, 7, 20, 8, 0.0F, false);
			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(-4.0F, 6.0F, 0.0F);
			addBoxHelper(leg2, 0, 71, -3.0F, -2.0F, -4.0F, 7, 20, 8, 0.0F, false);
			arm1 = new ModelRenderer(this);
			arm1.setRotationPoint(-7.0F, -14.0F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-2.5F, 20.1F, -23.0F);
			arm1.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
			addBoxHelper(cube_r1, 42, 14, -4.0F, -8.0F, -13.0F, 6, 7, 14, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-2.0F, 24.3F, -10.0F);
			arm1.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
			addBoxHelper(cube_r2, 0, 51, -4.0F, -7.0F, -13.0F, 5, 6, 14, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-2.0F, 24.0F, -4.0F);
			arm1.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.3491F, 0.0F, 0.0F);
			addBoxHelper(cube_r3, 42, 0, -3.0F, -3.0F, -6.0F, 3, 3, 7, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-4.5F, 23.0F, -4.0F);
			arm1.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.3054F, 0.0F, 0.0F);
			addBoxHelper(cube_r4, 56, 71, -2.0F, -18.0F, -3.0F, 6, 16, 7, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-5.0F, 15.0F, 3.0F);
			arm1.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
			addBoxHelper(cube_r5, 82, 82, -2.0F, -18.0F, -3.0F, 7, 13, 7, 0.0F, false);
			arm2 = new ModelRenderer(this);
			arm2.setRotationPoint(6.0F, -14.0F, -1.0F);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(3.5F, 23.0F, -3.0F);
			arm2.addChild(cube_r6);
			setRotationAngle(cube_r6, -0.3054F, 0.0F, 0.0F);
			addBoxHelper(cube_r6, 30, 71, -2.0F, -18.0F, -3.0F, 6, 16, 7, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(3.0F, 15.0F, 4.0F);
			arm2.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
			addBoxHelper(cube_r7, 78, 28, -2.0F, -18.0F, -3.0F, 7, 13, 7, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -18.0F, 0.0F);
			addBoxHelper(head, 0, 0, -7.0F, -13.0F, -7.0F, 14, 14, 14, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(5.0F, -12.0F, -5.0F);
			head.addChild(cube_r8);
			setRotationAngle(cube_r8, -0.2182F, 0.0F, 0.3927F);
			addBoxHelper(cube_r8, 0, 0, -2.0F, -8.0F, -1.0F, 3, 8, 3, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(-4.0F, -12.0F, -5.0F);
			head.addChild(cube_r9);
			setRotationAngle(cube_r9, -0.2182F, 0.0F, -0.3927F);
			addBoxHelper(cube_r9, 0, 51, -2.0F, -8.0F, -1.0F, 3, 8, 3, 0.0F, false);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(bb_main, 42, 43, -7.0F, -41.0F, -4.0F, 14, 20, 8, 0.0F, false);
			addBoxHelper(bb_main, 0, 28, -7.5F, -32.0F, -5.0F, 15, 13, 10, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			leg1.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leg2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			arm1.render(ms, vb, i1, i2, f1, f2, f3, f4);
			arm2.render(ms, vb, i1, i2, f1, f2, f3, f4);
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
			this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.arm1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.arm2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
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
