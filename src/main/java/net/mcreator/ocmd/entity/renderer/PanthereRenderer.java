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

import net.mcreator.ocmd.entity.PanthereEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PanthereRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PanthereEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelpanthere(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ocm:textures/panthere.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.7.5
	// Exported for Minecraft version 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modelpanthere extends EntityModel<Entity> {
		private final ModelRenderer leg1;
		private final ModelRenderer leg2;
		private final ModelRenderer leg3;
		private final ModelRenderer leg4;
		private final ModelRenderer head;
		private final ModelRenderer bb_main;
		private final ModelRenderer cube_r1;

		public Modelpanthere() {
			textureWidth = 64;
			textureHeight = 64;
			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(-3.0F, 17.0F, 10.0F);
			addBoxHelper(leg1, 0, 47, -2.0F, -2.0F, -3.0F, 4, 9, 4, 0.0F, false);
			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(4.0F, 15.0F, 9.0F);
			addBoxHelper(leg2, 46, 46, -3.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F, false);
			leg3 = new ModelRenderer(this);
			leg3.setRotationPoint(4.0F, 16.0F, -9.0F);
			addBoxHelper(leg3, 42, 0, -3.0F, -1.0F, -2.0F, 4, 9, 4, 0.0F, false);
			leg4 = new ModelRenderer(this);
			leg4.setRotationPoint(-4.0F, 15.0F, -9.0F);
			addBoxHelper(leg4, 34, 34, -1.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 9.0F, -10.0F);
			addBoxHelper(head, 0, 30, -4.6F, -8.0F, -6.0F, 9, 9, 8, 0.0F, false);
			addBoxHelper(head, 0, 10, -2.6F, -4.0F, -7.7F, 5, 4, 2, 0.0F, false);
			addBoxHelper(head, 0, 4, 2.4F, -10.0F, -3.7F, 2, 2, 2, 0.0F, false);
			addBoxHelper(head, 0, 0, -4.6F, -10.0F, -3.7F, 2, 2, 2, 0.0F, false);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(bb_main, 0, 0, -5.0F, -17.0F, -11.0F, 10, 8, 22, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, -5.0F, 15.0F);
			bb_main.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.4363F, 0.0F, 0.0F);
			addBoxHelper(cube_r1, 0, 0, -1.0F, -8.0F, -9.0F, 2, 2, 8, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			leg1.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leg2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leg3.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leg4.render(ms, vb, i1, i2, f1, f2, f3, f4);
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
			this.leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.leg4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leg2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.leg3.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
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
