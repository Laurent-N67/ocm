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

import net.mcreator.ocmd.entity.OtterEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class OtterRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(OtterEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelotter(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ocm:textures/otter.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modelotter extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer bone2;
		private final ModelRenderer pattes1;
		private final ModelRenderer pattes2;
		private final ModelRenderer pattes3;
		private final ModelRenderer pattes4;
		private final ModelRenderer tete;
		private final ModelRenderer bb_main;

		public Modelotter() {
			textureWidth = 64;
			textureHeight = 64;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.1F, 23.0F, 13.0F);
			setRotationAngle(bone, -0.1745F, 0.0F, 0.0F);
			addBoxHelper(bone, 18, 24, -2.15F, -3.5F, -7.0F, 4, 3, 6, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.6F, 23.2F, 17.6F);
			setRotationAngle(bone2, -0.1745F, 0.0F, 0.0F);
			addBoxHelper(bone2, 0, 30, -2.15F, -2.5F, -7.0F, 3, 2, 6, 0.0F, false);
			pattes1 = new ModelRenderer(this);
			pattes1.setRotationPoint(-2.0F, 22.0F, -5.0F);
			addBoxHelper(pattes1, 18, 19, -1.8F, 0.0F, -1.3F, 2, 2, 2, 0.0F, false);
			pattes2 = new ModelRenderer(this);
			pattes2.setRotationPoint(2.0F, 22.0F, -5.0F);
			addBoxHelper(pattes2, 0, 9, -0.4F, 0.0F, -1.3F, 2, 2, 2, 0.0F, false);
			pattes3 = new ModelRenderer(this);
			pattes3.setRotationPoint(2.0F, 22.0F, 5.0F);
			addBoxHelper(pattes3, 6, 7, -0.4F, 0.0F, -1.3F, 2, 2, 2, 0.0F, false);
			pattes4 = new ModelRenderer(this);
			pattes4.setRotationPoint(-2.0F, 22.0F, 5.0F);
			addBoxHelper(pattes4, 0, 5, -1.8F, 0.0F, -1.3F, 2, 2, 2, 0.0F, false);
			tete = new ModelRenderer(this);
			tete.setRotationPoint(0.0F, 20.0F, -10.0F);
			addBoxHelper(tete, 0, 19, -3.0F, -6.0F, -1.0F, 6, 5, 6, 0.0F, false);
			addBoxHelper(tete, 0, 0, -2.0F, -4.0F, -3.0F, 4, 3, 2, 0.0F, false);
			addBoxHelper(tete, 23, 2, -3.6F, -3.5F, -0.8F, 2, 1, 2, 0.0F, false);
			addBoxHelper(tete, 23, 2, 1.6F, -3.5F, -0.8F, 2, 1, 2, 0.0F, false);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(bb_main, 0, 0, -4.0F, -7.0F, -7.0F, 8, 5, 14, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			bone.render(ms, vb, i1, i2, f1, f2, f3, f4);
			bone2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			pattes1.render(ms, vb, i1, i2, f1, f2, f3, f4);
			pattes2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			pattes3.render(ms, vb, i1, i2, f1, f2, f3, f4);
			pattes4.render(ms, vb, i1, i2, f1, f2, f3, f4);
			tete.render(ms, vb, i1, i2, f1, f2, f3, f4);
			bb_main.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.tete.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.tete.rotateAngleX = f4 / (180F / (float) Math.PI);
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
