package net.mcreator.ocmd.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.ocmd.entity.CreeperqueenEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CreeperqueenRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(CreeperqueenEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcreeperqueenmcp(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ocm:textures/creeperqueeen.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcreeperqueenmcp extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer support;

		public Modelcreeperqueenmcp() {
			textureWidth = 200;
			textureHeight = 200;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, -1.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.setTextureOffset(16, 16).addBox(-4.0F, -26.0F, -3.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-5.0F, -24.0F, -1.0F);
			body.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.5236F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(4.0F, -24.0F, -1.0F);
			body.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(40, 16).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, -12.0F, 0.0F);
			body.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(16, 54).addBox(-4.0F, 4.0F, -3.2F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			cube_r3.setTextureOffset(16, 48).addBox(-4.0F, -2.0F, -3.2F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, -12.0F, 0.0F);
			body.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(16, 54).addBox(0.0F, 3.5F, -2.6F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			cube_r4.setTextureOffset(16, 48).addBox(0.0F, -2.5F, -2.6F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-6.0F, -14.0F, -12.0F);
			body.addChild(cube_r5);
			setRotationAngle(cube_r5, -3.1416F, 1.4399F, 3.1416F);
			cube_r5.setTextureOffset(145, 0).addBox(-8.2269F, -1.8F, -4.9823F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			support = new ModelRenderer(this);
			support.setRotationPoint(0.0F, 24.0F, 0.0F);
			support.setTextureOffset(99, 20).addBox(-9.0F, -2.0F, -7.0F, 9.0F, 6.0F, 8.0F, 0.0F, false);
			support.setTextureOffset(99, 20).addBox(-7.0F, 0.0F, -10.0F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			support.setTextureOffset(98, 24).addBox(0.0F, -1.0F, -10.0F, 9.0F, 4.0F, 8.0F, 0.0F, false);
			support.setTextureOffset(99, 18).addBox(0.0F, -2.0F, -2.0F, 9.0F, 6.0F, 8.0F, 0.0F, false);
			support.setTextureOffset(99, 18).addBox(-7.0F, -2.0F, 1.0F, 7.0F, 6.0F, 5.0F, 0.0F, false);
			support.setTextureOffset(99, 18).addBox(-3.0F, -1.0F, 6.0F, 7.0F, 4.0F, 5.0F, 0.0F, false);
			support.setTextureOffset(99, 18).addBox(-3.0F, -1.0F, -15.0F, 7.0F, 4.0F, 5.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			support.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

}
