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

import net.mcreator.ocmd.entity.PlainbirdEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PlainbirdRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PlainbirdEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelPlainbird(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ocm:textures/plainbird.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelPlainbird extends EntityModel<Entity> {
		private final ModelRenderer leg1;
		private final ModelRenderer bone;
		private final ModelRenderer bone2;
		private final ModelRenderer leg2;
		private final ModelRenderer bone3;
		private final ModelRenderer bone4;
		private final ModelRenderer bb_main;
		private final ModelRenderer bone5;
		private final ModelRenderer bone6;
		private final ModelRenderer bone7;

		public ModelPlainbird() {
			textureWidth = 128;
			textureHeight = 128;
			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(4.0F, 8.0F, 1.0F);
			addBoxHelper(leg1, 31, 36, 0.0F, 14.0F, -7.0F, 3, 2, 9, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(-4.0F, 14.0F, -9.0F);
			leg1.addChild(bone);
			setRotationAngle(bone, -0.3054F, 0.0F, 0.0F);
			addBoxHelper(bone, 0, 45, 4.0F, -18.0F, 2.0F, 3, 12, 5, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(2.0F, -3.0F, -1.0F);
			leg1.addChild(bone2);
			setRotationAngle(bone2, 0.2618F, 0.0F, 0.0F);
			addBoxHelper(bone2, 52, 52, -1.5F, 9.5F, -6.2F, 2, 8, 4, 0.0F, false);
			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(-5.0F, 6.0F, 0.0F);
			addBoxHelper(leg2, 35, 0, -3.0F, 16.0F, -6.0F, 3, 2, 9, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(-7.0F, 16.0F, -8.0F);
			leg2.addChild(bone3);
			setRotationAngle(bone3, -0.3054F, 0.0F, 0.0F);
			addBoxHelper(bone3, 0, 0, 4.0F, -18.9537F, 1.6993F, 3, 12, 5, 0.0F, false);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(-1.0F, -1.0F, 0.0F);
			leg2.addChild(bone4);
			setRotationAngle(bone4, 0.2618F, 0.0F, 0.0F);
			addBoxHelper(bone4, 0, 23, -1.5F, 9.5F, -6.2F, 2, 8, 4, 0.0F, false);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(bb_main, 0, 23, -4.0F, -21.0F, -6.0F, 7, 9, 13, 0.0F, false);
			addBoxHelper(bb_main, 0, 0, -5.0F, -19.0F, -8.0F, 9, 6, 17, 0.0F, false);
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(0.0F, 23.0F, -15.0F);
			setRotationAngle(bone5, -1.0472F, 0.0F, 0.0F);
			addBoxHelper(bone5, 16, 47, -3.0F, -18.4019F, -16.2321F, 5, 4, 6, 0.0F, false);
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(0.6F, 4.6962F, -3.866F);
			bone5.addChild(bone6);
			setRotationAngle(bone6, -0.2618F, 0.0F, 0.0F);
			addBoxHelper(bone6, 46, 36, -3.5F, -19.3122F, -21.3407F, 5, 4, 5, 0.0F, false);
			bone7 = new ModelRenderer(this);
			bone7.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(bone7, 27, 23, -4.0F, -33.0F, -13.3F, 7, 7, 6, 0.0F, false);
			addBoxHelper(bone7, 38, 47, -2.0F, -29.0F, -17.3F, 3, 2, 6, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			leg1.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leg2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			bb_main.render(ms, vb, i1, i2, f1, f2, f3, f4);
			bone5.render(ms, vb, i1, i2, f1, f2, f3, f4);
			bone7.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.bone7.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.bone7.rotateAngleX = f4 / (180F / (float) Math.PI);
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
