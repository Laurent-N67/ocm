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

import net.mcreator.ocmd.entity.GolemofdarknessEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GolemofdarknessRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GolemofdarknessEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelgolemofdarkness(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ocm:textures/elementaldark.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.7.5
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelgolemofdarkness extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer arm1;
		private final ModelRenderer arm2;
		private final ModelRenderer turn1;
		private final ModelRenderer turn2;
		private final ModelRenderer turn3;
		private final ModelRenderer body;

		public Modelgolemofdarkness() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -4.0F, 0.0F);
			setRotationAngle(head, 0.0F, -1.5708F, 0.0F);
			head.setTextureOffset(34, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			arm1 = new ModelRenderer(this);
			arm1.setRotationPoint(-7.0F, -3.0F, 0.0F);
			setRotationAngle(arm1, 0.0F, -1.5708F, 0.0F);
			arm1.setTextureOffset(26, 26).addBox(-3.0F, -1.0F, 0.0F, 7.0F, 17.0F, 6.0F, 0.0F, false);
			arm2 = new ModelRenderer(this);
			arm2.setRotationPoint(7.0F, -2.0F, 0.0F);
			setRotationAngle(arm2, 0.0F, -1.5708F, 0.0F);
			arm2.setTextureOffset(0, 25).addBox(-3.0F, -2.0F, -6.0F, 7.0F, 17.0F, 6.0F, 0.0F, false);
			turn1 = new ModelRenderer(this);
			turn1.setRotationPoint(0.0F, 23.0F, 0.0F);
			turn1.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			turn2 = new ModelRenderer(this);
			turn2.setRotationPoint(0.0F, 13.0F, 0.0F);
			turn2.setTextureOffset(46, 46).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			turn3 = new ModelRenderer(this);
			turn3.setRotationPoint(0.0F, 19.0F, 0.0F);
			turn3.setTextureOffset(46, 12).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 9.0F, 0.0F);
			setRotationAngle(body, 0.0F, -1.5708F, 0.0F);
			body.setTextureOffset(0, 0).addBox(-5.0F, -13.0F, -6.0F, 11.0F, 13.0F, 12.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			arm1.render(matrixStack, buffer, packedLight, packedOverlay);
			arm2.render(matrixStack, buffer, packedLight, packedOverlay);
			turn1.render(matrixStack, buffer, packedLight, packedOverlay);
			turn2.render(matrixStack, buffer, packedLight, packedOverlay);
			turn3.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.turn2.rotateAngleZ = f2 / 20.f;
			this.turn1.rotateAngleZ = f2;
			this.turn3.rotateAngleZ = f2;
		}
	}

}
