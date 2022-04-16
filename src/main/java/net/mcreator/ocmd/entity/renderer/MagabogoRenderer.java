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

import net.mcreator.ocmd.entity.MagabogoEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MagabogoRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MagabogoEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelMagaBogo(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ocm:textures/magabogo.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelMagaBogo extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer bone2;
		private final ModelRenderer bone3;
		private final ModelRenderer bone4;
		private final ModelRenderer head;
		private final ModelRenderer leg1;
		private final ModelRenderer leg2;
		private final ModelRenderer leg3;
		private final ModelRenderer leg4;

		public ModelMagaBogo() {
			textureWidth = 512;
			textureHeight = 512;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 23.0F, 0.0F);
			addBoxHelper(body, 142, 40, -7.0F, -27.0F, -18.0F, 14, 27, 25, 0.0F, false);
			addBoxHelper(body, 90, 117, -1.0F, -31.0F, -10.0F, 2, 8, 7, 0.0F, false);
			addBoxHelper(body, 0, 184, -1.0F, -31.0F, 1.0F, 2, 8, 5, 0.0F, false);
			addBoxHelper(body, 166, 92, -1.0F, -28.0F, 7.0F, 2, 8, 5, 0.0F, false);
			addBoxHelper(body, 55, 136, -1.0F, -25.0F, 16.0F, 2, 9, 5, 0.0F, false);
			addBoxHelper(body, 65, 55, -1.0F, -23.0F, 25.4F, 2, 9, 5, 0.0F, false);
			addBoxHelper(body, 65, 41, -1.0F, -21.0F, 34.0F, 2, 9, 5, 0.0F, false);
			addBoxHelper(body, 162, 162, -6.0F, -24.0F, -8.0F, 12, 23, 25, 0.0F, false);
			addBoxHelper(body, 196, 16, -5.0F, -20.1F, 7.0F, 10, 19, 22, 0.0F, false);
			addBoxHelper(body, 0, 218, -4.0F, -17.0F, 20.0F, 8, 16, 19, 0.0F, false);
			addBoxHelper(body, 82, 154, -10.0F, -24.0F, -14.0F, 20, 22, 20, 0.0F, false);
			addBoxHelper(body, 79, 14, -8.0F, -25.0F, -19.0F, 16, 24, 27, 0.0F, false);
			addBoxHelper(body, 0, 136, -7.0F, -22.2F, -9.0F, 14, 21, 27, 0.0F, false);
			addBoxHelper(body, 156, 92, -6.0F, -18.0F, 6.0F, 12, 16, 24, 0.0F, false);
			addBoxHelper(body, 208, 214, -5.0F, -15.0F, 19.0F, 10, 13, 21, 0.0F, false);
			addBoxHelper(body, 90, 111, -11.0F, -22.0F, -15.0F, 22, 21, 22, 0.0F, false);
			addBoxHelper(body, 0, 41, -9.0F, -23.0F, -20.0F, 18, 20, 29, 0.0F, false);
			addBoxHelper(body, 0, 184, -10.0F, -22.0F, -21.0F, 20, 18, 16, 0.0F, false);
			addBoxHelper(body, 0, 90, -8.0F, -20.0F, -10.0F, 16, 17, 29, 0.0F, false);
			addBoxHelper(body, 138, 0, -7.0F, -16.0F, 5.0F, 14, 12, 26, 0.0F, false);
			addBoxHelper(body, 107, 199, -6.0F, -13.0F, 18.0F, 12, 9, 23, 0.0F, false);
			addBoxHelper(body, 70, 70, -12.0F, -20.0F, -16.0F, 24, 17, 24, 0.0F, false);
			addBoxHelper(body, 0, 0, -13.0F, -18.0F, -17.0F, 26, 14, 27, 0.0F, false);
			addBoxHelper(body, 43, 250, -6.0F, -29.0F, -21.0F, 12, 11, 11, 0.0F, false);
			addBoxHelper(body, 211, 248, -4.0F, -30.0F, -27.0F, 8, 15, 13, 0.0F, false);
			addBoxHelper(body, 247, 61, -5.0F, -26.0F, -26.0F, 10, 15, 12, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, -4.0F, 43.0F);
			body.addChild(bone2);
			setRotationAngle(bone2, 0.1745F, 0.0F, 0.0F);
			addBoxHelper(bone2, 91, 231, -3.0F, -14.0F, -15.0F, 6, 15, 19, 0.0F, false);
			addBoxHelper(bone2, 216, 111, -4.0F, -12.0F, -16.0F, 8, 12, 21, 0.0F, false);
			addBoxHelper(bone2, 204, 69, -5.0F, -10.0F, -17.0F, 10, 8, 23, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, -8.0F, 52.0F);
			body.addChild(bone3);
			setRotationAngle(bone3, 0.48F, 0.0F, 0.0F);
			addBoxHelper(bone3, 171, 247, -1.0F, -13.0F, -15.0F, 2, 13, 18, 0.0F, false);
			addBoxHelper(bone3, 141, 235, -2.0F, -11.0F, -16.0F, 4, 10, 20, 0.0F, false);
			addBoxHelper(bone3, 54, 222, -3.0F, -9.0F, -17.0F, 6, 6, 22, 0.0F, false);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(0.0F, -19.0F, 65.0F);
			body.addChild(bone4);
			setRotationAngle(bone4, 0.7854F, 0.0F, 0.0F);
			addBoxHelper(bone4, 0, 0, 0.0F, -13.0F, -15.0F, 0, 11, 11, 0.0F, false);
			addBoxHelper(bone4, 0, 253, -1.0F, -11.0F, -16.0F, 2, 8, 13, 0.0F, false);
			addBoxHelper(bone4, 55, 139, -2.0F, -9.0F, -17.0F, 4, 4, 15, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -4.0F, -24.0F);
			addBoxHelper(head, 218, 193, -7.0F, 0.4F, -16.0F, 14, 1, 18, 0.0F, false);
			addBoxHelper(head, 157, 211, -8.0F, -3.6F, -18.0F, 16, 4, 20, 0.0F, false);
			addBoxHelper(head, 157, 211, -6.6F, 1.4F, -12.0F, 13, 4, 20, 0.0F, false);
			addBoxHelper(head, 157, 211, -5.6F, 5.4F, -9.0F, 11, 4, 20, 0.0F, false);
			addBoxHelper(head, 157, 211, -4.6F, 9.4F, -7.0F, 9, 4, 20, 0.0F, false);
			addBoxHelper(head, 156, 132, -10.0F, -7.6F, -20.0F, 19, 5, 22, 0.0F, false);
			addBoxHelper(head, 61, 111, -9.0F, -7.6F, -23.0F, 18, 3, 3, 0.0F, false);
			addBoxHelper(head, 78, 145, -10.0F, -9.6F, -21.0F, 3, 6, 3, 0.0F, false);
			addBoxHelper(head, 78, 136, 7.0F, -9.6F, -21.0F, 3, 6, 3, 0.0F, false);
			addBoxHelper(head, 142, 162, 9.0F, -9.6F, -15.0F, 3, 5, 3, 0.0F, false);
			addBoxHelper(head, 142, 154, -13.0F, -9.6F, -15.0F, 3, 5, 3, 0.0F, false);
			addBoxHelper(head, 79, 0, -1.6F, -9.6F, -24.0F, 3, 6, 3, 0.0F, false);
			addBoxHelper(head, 238, 35, 9.0F, -7.6F, -20.0F, 2, 4, 22, 0.0F, false);
			addBoxHelper(head, 238, 0, -12.0F, -7.6F, -20.0F, 2, 4, 22, 0.0F, false);
			addBoxHelper(head, 192, 0, -10.0F, -10.0F, -10.0F, 19, 4, 12, 0.0F, false);
			addBoxHelper(head, 249, 212, -10.0F, -15.0F, 2.0F, 19, 19, 4, 0.0F, false);
			addBoxHelper(head, 253, 253, -11.0F, -11.0F, 6.0F, 20, 15, 4, 0.0F, false);
			addBoxHelper(head, 35, 222, -8.0F, -8.0F, 10.0F, 15, 8, 4, 0.0F, false);
			addBoxHelper(head, 0, 63, -7.0F, -7.0F, 13.8F, 13, 6, 1, 0.0F, false);
			addBoxHelper(head, 52, 198, -10.0F, -14.0F, -18.0F, 19, 4, 20, 0.0F, false);
			addBoxHelper(head, 0, 22, -4.0F, -13.0F, -20.0F, 8, 3, 2, 0.0F, false);
			addBoxHelper(head, 211, 159, -10.0F, -17.0F, -16.0F, 19, 3, 18, 0.0F, false);
			addBoxHelper(head, 79, 0, -10.0F, -18.0F, -10.0F, 19, 1, 12, 0.0F, false);
			addBoxHelper(head, 204, 100, -8.0F, -19.0F, -8.0F, 15, 1, 8, 0.0F, false);
			addBoxHelper(head, 142, 159, -4.4F, -20.0F, -13.0F, 8, 1, 12, 0.0F, false);
			addBoxHelper(head, 129, 0, -6.0F, -19.0F, -14.0F, 11, 2, 6, 0.0F, false);
			addBoxHelper(head, 0, 184, -1.0F, -23.1F, -12.5F, 2, 8, 5, 0.0F, false);
			addBoxHelper(head, 0, 184, -1.0F, -22.3F, -3.6F, 2, 8, 5, 0.0F, false);
			addBoxHelper(head, 0, 184, -1.0F, -17.3F, 2.9F, 2, 8, 5, 0.0F, false);
			addBoxHelper(head, 0, 184, -1.0F, -13.0F, 9.3F, 2, 8, 5, 0.0F, false);
			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(10.0F, 10.0F, -17.0F);
			addBoxHelper(leg1, 20, 44, 1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false);
			addBoxHelper(leg1, 123, 65, 0.0F, 0.0F, -2.0F, 4, 1, 4, 0.0F, false);
			addBoxHelper(leg1, 56, 184, 0.0F, 1.0F, -3.0F, 4, 2, 6, 0.0F, false);
			addBoxHelper(leg1, 0, 52, 0.0F, 3.0F, -4.0F, 6, 3, 8, 0.0F, false);
			addBoxHelper(leg1, 0, 145, 0.0F, 6.0F, -3.0F, 6, 3, 6, 0.0F, false);
			addBoxHelper(leg1, 0, 101, 0.0F, 9.0F, -3.0F, 7, 5, 6, 0.0F, false);
			addBoxHelper(leg1, 162, 179, 0.0F, 11.0F, -7.0F, 7, 3, 4, 0.0F, false);
			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(13.0F, 10.0F, 6.0F);
			addBoxHelper(leg2, 0, 44, 1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false);
			addBoxHelper(leg2, 107, 65, 0.0F, 0.0F, -2.0F, 4, 1, 4, 0.0F, false);
			addBoxHelper(leg2, 82, 166, 0.0F, 1.0F, -3.0F, 4, 2, 6, 0.0F, false);
			addBoxHelper(leg2, 0, 41, 0.0F, 3.0F, -4.0F, 6, 3, 8, 0.0F, false);
			addBoxHelper(leg2, 138, 17, 0.0F, 6.0F, -3.0F, 6, 3, 6, 0.0F, false);
			addBoxHelper(leg2, 0, 90, 0.0F, 9.0F, -3.0F, 7, 5, 6, 0.0F, false);
			addBoxHelper(leg2, 162, 172, 0.0F, 11.0F, -7.0F, 7, 3, 4, 0.0F, false);
			leg3 = new ModelRenderer(this);
			leg3.setRotationPoint(-13.0F, 10.0F, 6.0F);
			addBoxHelper(leg3, 20, 41, -2.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false);
			addBoxHelper(leg3, 91, 65, -4.0F, 0.0F, -2.0F, 4, 1, 4, 0.0F, false);
			addBoxHelper(leg3, 160, 105, -4.0F, 1.0F, -3.0F, 4, 2, 6, 0.0F, false);
			addBoxHelper(leg3, 169, 235, -7.0F, 3.0F, -4.0F, 7, 3, 8, 0.0F, false);
			addBoxHelper(leg3, 138, 8, -6.0F, 6.0F, -3.0F, 6, 3, 6, 0.0F, false);
			addBoxHelper(leg3, 79, 13, -7.0F, 9.0F, -3.0F, 7, 5, 6, 0.0F, false);
			addBoxHelper(leg3, 0, 154, -7.0F, 11.0F, -7.0F, 7, 3, 4, 0.0F, false);
			leg4 = new ModelRenderer(this);
			leg4.setRotationPoint(-11.0F, 9.0F, -17.0F);
			addBoxHelper(leg4, 0, 41, -1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F, false);
			addBoxHelper(leg4, 75, 65, -3.0F, 1.0F, -2.0F, 4, 1, 4, 0.0F, false);
			addBoxHelper(leg4, 82, 158, -3.0F, 2.0F, -3.0F, 4, 2, 6, 0.0F, false);
			addBoxHelper(leg4, 122, 231, -6.0F, 4.0F, -4.0F, 7, 3, 8, 0.0F, false);
			addBoxHelper(leg4, 0, 136, -4.0F, 7.0F, -3.0F, 6, 3, 6, 0.0F, false);
			addBoxHelper(leg4, 0, 0, -5.0F, 10.0F, -3.0F, 7, 5, 6, 0.0F, false);
			addBoxHelper(leg4, 0, 112, -5.0F, 12.0F, -7.0F, 7, 3, 4, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			body.render(ms, vb, i1, i2, f1, f2, f3, f4);
			head.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leg1.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leg2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leg3.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leg4.render(ms, vb, i1, i2, f1, f2, f3, f4);
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
			this.leg4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
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
