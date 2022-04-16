// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class goblinsword extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer arm1;
	private final ModelRenderer sword;
	private final ModelRenderer arm2;
	private final ModelRenderer head;

	public goblinsword() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 17.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(14, 16).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-1.0F, 20.0F, 0.0F);
		leg1.setTextureOffset(20, 22).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(1.0F, 20.0F, 0.0F);
		leg2.setTextureOffset(8, 22).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(-2.0F, 15.0F, 0.0F);
		arm1.setTextureOffset(16, 8).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		sword = new ModelRenderer(this);
		sword.setRotationPoint(-0.5F, 4.5F, -1.8F);
		arm1.addChild(sword);
		setRotationAngle(sword, -0.6545F, 0.0F, 0.0F);
		sword.setTextureOffset(22, 6).addBox(-1.0F, -1.024F, -0.6402F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		sword.setTextureOffset(0, 18).addBox(-1.0F, -0.991F, -5.6401F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		sword.setTextureOffset(6, 18).addBox(-2.0F, -1.002F, -1.6401F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(2.0F, 15.0F, 0.0F);
		arm2.setTextureOffset(16, 0).addBox(0.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 14.0F, 0.0F);
		head.setTextureOffset(0, 10).addBox(-2.0F, -4.3F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(0, 10).addBox(2.0F, -4.3F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-3.0F, -4.3F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(12, 10).addBox(3.0F, -4.3F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(12, 0).addBox(-4.0F, -4.3F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(10, 20).addBox(4.0F, -4.3F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(6, 20).addBox(-5.0F, -4.3F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 18).addBox(-0.5F, -2.2F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		arm1.render(matrixStack, buffer, packedLight, packedOverlay);
		arm2.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}