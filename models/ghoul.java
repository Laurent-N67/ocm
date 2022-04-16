// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class ghoul extends EntityModel<Entity> {
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer arm1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer arm2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer torso;

	public ghoul() {
		textureWidth = 64;
		textureHeight = 64;

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(0.0F, 24.0F, 0.0F);
		leg1.setTextureOffset(0, 36).addBox(-4.0F, -10.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(2.0F, 14.0F, 0.0F);
		leg2.setTextureOffset(33, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 1.0F, -1.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 23.0F, 1.0F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.174F, 0.0114F, -0.0865F);
		cube_r1.setTextureOffset(0, 0).addBox(-2.0F, -29.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(-4.0F, 2.0F, 0.0F);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(4.0F, 22.0F, 0.0F);
		arm1.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3054F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(25, 17).addBox(-7.0F, -22.2F, -9.0F, 3.0F, 13.0F, 4.0F, 0.0F, false);

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(4.0F, 2.0F, 0.0F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-4.0F, 22.0F, 0.0F);
		arm2.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3054F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(21, 36).addBox(4.0F, -22.2F, -9.0F, 3.0F, 13.0F, 4.0F, 0.0F, false);

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, 8.0F, 0.0F);
		torso.setTextureOffset(0, 17).addBox(-4.0F, -8.0F, -2.0F, 8.0F, 14.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		arm1.render(matrixStack, buffer, packedLight, packedOverlay);
		arm2.render(matrixStack, buffer, packedLight, packedOverlay);
		torso.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}