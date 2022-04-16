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

import net.mcreator.ocmd.entity.GreenbirdEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GreenbirdRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GreenbirdEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelgreenbird(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ocm:textures/greenbird.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelgreenbird extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer head;
		private final ModelRenderer right_ear;
		private final ModelRenderer right_wing;
		private final ModelRenderer outer_right_wing;
		private final ModelRenderer left_wing;
		private final ModelRenderer outer_left_wing;

		public Modelgreenbird() {
			textureWidth = 64;
			textureHeight = 64;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(0, 16).addBox(-3.0F, 4.0F, -3.0F, 6.0F, 12.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(0, 34).addBox(-5.0F, 16.0F, 0.0F, 10.0F, 16.0F, 1.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 1.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(24, 0).addBox(-4.0F, -6.0F, -2.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);
			right_ear = new ModelRenderer(this);
			right_ear.setRotationPoint(0.0F, 23.0F, 0.0F);
			head.addChild(right_ear);
			right_ear.setTextureOffset(24, 0).addBox(1.0F, -29.0F, -2.0F, 3.0F, 4.0F, 1.0F, 0.0F, true);
			right_wing = new ModelRenderer(this);
			right_wing.setRotationPoint(0.0F, 0.0F, 0.0F);
			right_wing.setTextureOffset(42, 0).addBox(-12.0F, 1.0F, 1.5F, 10.0F, 16.0F, 1.0F, 0.0F, false);
			outer_right_wing = new ModelRenderer(this);
			outer_right_wing.setRotationPoint(12.0F, 1.0F, 1.5F);
			right_wing.addChild(outer_right_wing);
			outer_right_wing.setTextureOffset(24, 16).addBox(-32.0F, 1.0F, 0.0F, 8.0F, 12.0F, 1.0F, 0.0F, false);
			left_wing = new ModelRenderer(this);
			left_wing.setRotationPoint(0.0F, 0.0F, 0.0F);
			left_wing.setTextureOffset(42, 0).addBox(2.0F, 1.0F, 1.5F, 10.0F, 16.0F, 1.0F, 0.0F, true);
			outer_left_wing = new ModelRenderer(this);
			outer_left_wing.setRotationPoint(-12.0F, 1.0F, 1.5F);
			left_wing.addChild(outer_left_wing);
			outer_left_wing.setTextureOffset(24, 16).addBox(24.0F, 1.0F, 0.0F, 8.0F, 12.0F, 1.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			right_wing.render(matrixStack, buffer, packedLight, packedOverlay);
			left_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_wing.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_wing.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
