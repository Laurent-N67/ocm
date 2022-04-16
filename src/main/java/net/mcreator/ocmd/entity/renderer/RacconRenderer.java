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

import net.mcreator.ocmd.entity.RacconEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class RacconRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(RacconEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelraccon(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ocm:textures/raccon.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modelraccon extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer head;
		private final ModelRenderer pattes1;
		private final ModelRenderer pattes2;
		private final ModelRenderer pattes3;
		private final ModelRenderer pattes4;
		private final ModelRenderer bb_main;

		public Modelraccon() {
			textureWidth = 64;
			textureHeight = 64;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 20.0F, 16.0F);
			setRotationAngle(bone, -0.1745F, 0.0F, 0.0F);
			addBoxHelper(bone, 0, 25, -3.0F, -4.0F, -9.0F, 6, 4, 11, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.4F, 17.0F, -7.0F);
			addBoxHelper(head, 0, 0, -3.0F, -1.6F, -11.0F, 5, 3, 4, 0.0F, false);
			addBoxHelper(head, 0, 30, -5.0F, -8.0F, -5.0F, 3, 3, 2, 0.0F, false);
			addBoxHelper(head, 0, 25, 1.0F, -8.0F, -5.0F, 3, 3, 2, 0.0F, false);
			addBoxHelper(head, 26, 32, -5.0F, -5.0F, -7.0F, 9, 7, 8, 0.0F, false);
			pattes1 = new ModelRenderer(this);
			pattes1.setRotationPoint(2.8F, 20.0F, -6.5F);
			addBoxHelper(pattes1, 38, 0, -2.0F, 0.0F, -2.0F, 3, 4, 3, 0.0F, false);
			pattes2 = new ModelRenderer(this);
			pattes2.setRotationPoint(2.8F, 20.0F, 6.5F);
			addBoxHelper(pattes2, 0, 7, -2.0F, 0.0F, -1.0F, 3, 4, 3, 0.0F, false);
			pattes3 = new ModelRenderer(this);
			pattes3.setRotationPoint(-2.2F, 20.0F, -7.5F);
			addBoxHelper(pattes3, 35, 25, -1.6F, 0.0F, -1.0F, 3, 4, 3, 0.0F, false);
			pattes4 = new ModelRenderer(this);
			pattes4.setRotationPoint(-2.2F, 20.0F, 7.5F);
			addBoxHelper(pattes4, 23, 25, -1.6F, 0.0F, -2.0F, 3, 4, 3, 0.0F, false);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(bb_main, 0, 0, -4.0F, -11.0F, -9.0F, 8, 7, 18, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			bone.render(ms, vb, i1, i2, f1, f2, f3, f4);
			head.render(ms, vb, i1, i2, f1, f2, f3, f4);
			pattes1.render(ms, vb, i1, i2, f1, f2, f3, f4);
			pattes2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			pattes3.render(ms, vb, i1, i2, f1, f2, f3, f4);
			pattes4.render(ms, vb, i1, i2, f1, f2, f3, f4);
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
			this.pattes1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.pattes2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.pattes3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.pattes4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
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
