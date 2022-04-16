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

import net.mcreator.ocmd.entity.FairyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class FairyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(FairyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelfairy1(), 0.2f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ocm:textures/fairy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelfairy1 extends EntityModel<Entity> {
		private final ModelRenderer bone4;
		private final ModelRenderer bone5;
		private final ModelRenderer bone6;
		private final ModelRenderer bone;
		private final ModelRenderer bone2;
		private final ModelRenderer bone3;
		private final ModelRenderer arm1;
		private final ModelRenderer arm2;
		private final ModelRenderer head;
		private final ModelRenderer leg1;
		private final ModelRenderer leg2;
		private final ModelRenderer bb_main;

		public Modelfairy1() {
			textureWidth = 64;
			textureHeight = 64;
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(-1.0F, 8.0F, 1.0F);
			setRotationAngle(bone4, 0.0464F, -0.3895F, -0.1414F);
			bone4.setTextureOffset(26, 14).addBox(-0.9534F, 4.07F, 0.6785F, 1.0F, 5.0F, 2.0F, 0.0F, false);
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(0.0F, -3.0F, 1.8F);
			bone4.addChild(bone5);
			setRotationAngle(bone5, -0.3054F, 0.2618F, 0.0F);
			bone5.setTextureOffset(0, 17).addBox(-0.8718F, 0.8326F, 2.8414F, 1.0F, 10.0F, 2.0F, 0.0F, false);
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(-0.2F, -1.0F, 1.8F);
			bone4.addChild(bone6);
			setRotationAngle(bone6, -0.5566F, 0.1879F, 0.0477F);
			bone6.setTextureOffset(0, 8).addBox(-0.5631F, 5.1232F, 4.5223F, 1.0F, 4.0F, 5.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 8.0F, 1.0F);
			setRotationAngle(bone, 0.0F, 0.2618F, 0.0F);
			bone.setTextureOffset(26, 26).addBox(-0.0341F, 4.0F, 1.2588F, 1.0F, 5.0F, 2.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, -3.0F, 1.8F);
			bone.addChild(bone2);
			setRotationAngle(bone2, -0.3054F, 0.2618F, 0.0F);
			bone2.setTextureOffset(6, 17).addBox(-0.134F, 0.5257F, 3.5818F, 1.0F, 10.0F, 2.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(-0.2F, -1.0F, 1.8F);
			bone.addChild(bone3);
			setRotationAngle(bone3, -0.5566F, 0.1879F, 0.0477F);
			bone3.setTextureOffset(11, 3).addBox(0.2273F, 4.6351F, 5.0914F, 1.0F, 4.0F, 5.0F, 0.0F, false);
			arm1 = new ModelRenderer(this);
			arm1.setRotationPoint(2.0F, 13.0F, 1.0F);
			arm1.setTextureOffset(24, 6).addBox(0.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			arm2 = new ModelRenderer(this);
			arm2.setRotationPoint(-2.0F, 13.0F, 1.0F);
			arm2.setTextureOffset(20, 20).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 12.0F, 1.0F);
			head.setTextureOffset(0, 0).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(1.0F, 18.0F, 1.0F);
			leg1.setTextureOffset(12, 20).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(-1.0F, 18.0F, 1.0F);
			leg2.setTextureOffset(18, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(12, 12).addBox(-2.0F, -12.0F, 0.0F, 4.0F, 6.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone4.render(matrixStack, buffer, packedLight, packedOverlay);
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
			arm1.render(matrixStack, buffer, packedLight, packedOverlay);
			arm2.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			leg1.render(matrixStack, buffer, packedLight, packedOverlay);
			leg2.render(matrixStack, buffer, packedLight, packedOverlay);
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.arm1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.arm2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
