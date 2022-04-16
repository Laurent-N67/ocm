// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class minotaur extends EntityModel<Entity> {
	private final ModelRenderer leg1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer leg2;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer body;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer arm1;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer arm2;
	private final ModelRenderer cube_r12;
	private final ModelRenderer head;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;

	public minotaur() {
		textureWidth = 128;
		textureHeight = 128;

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(2.0F, 24.0F, 0.0F);
		leg1.setTextureOffset(36, 28).addBox(-6.5F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		leg1.setTextureOffset(60, 42).addBox(-7.0F, -2.0F, 0.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.5F, -10.8F, 1.1F);
		leg1.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 62).addBox(-4.0F, -6.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.5F, -7.8F, 1.3F);
		leg1.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(58, 58).addBox(-4.0F, -3.0F, -3.0F, 3.0F, 3.0F, 7.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.5F, -2.0F, 0.0F);
		leg1.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(24, 62).addBox(-4.0F, -6.0F, 1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(8.0F, 24.0F, 0.0F);
		leg2.setTextureOffset(26, 34).addBox(-6.5F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		leg2.setTextureOffset(60, 13).addBox(-7.0F, -2.0F, 0.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.5F, -10.8F, 1.1F);
		leg2.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(36, 19).addBox(-4.0F, -6.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.5F, -7.8F, 1.3F);
		leg2.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(56, 3).addBox(-4.0F, -3.0F, -3.0F, 3.0F, 3.0F, 7.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.5F, -2.0F, 0.0F);
		leg2.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.2618F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(44, 61).addBox(-4.0F, -6.0F, 1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 23.0F, 0.0F);
		body.setTextureOffset(32, 0).addBox(-5.0F, -20.0F, -1.0F, 10.0F, 5.0F, 5.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.5F, -21.0F, -0.7F);
		body.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(11, 51).addBox(-2.0F, -10.0F, 0.0F, 5.0F, 11.0F, 3.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.5F, -20.0F, 0.0F);
		body.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.1309F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(0, 16).addBox(-5.0F, -10.0F, -1.0F, 11.0F, 11.0F, 5.0F, 0.0F, false);

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(-5.1F, 2.6F, 1.4F);
		arm1.setTextureOffset(29, 48).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 9.0F, 5.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.6F, 6.0F, -15.0F);
		arm1.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.2618F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(0, 32).addBox(-1.0F, -11.0F, -6.0F, 1.0F, 16.0F, 6.0F, 0.0F, false);
		cube_r9.setTextureOffset(14, 34).addBox(-1.4F, -7.0F, -7.0F, 2.0F, 8.0F, 8.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.0F, 7.0F, -3.0F);
		arm1.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.2618F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(20, 20).addBox(-1.0F, -2.0F, -11.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.1F, -7.6F, -1.4F);
		arm1.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.2182F, 0.0F, 0.0F);
		cube_r11.setTextureOffset(48, 19).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 9.0F, 5.0F, 0.0F, false);

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(8.9F, 2.6F, 1.4F);
		arm2.setTextureOffset(34, 34).addBox(-3.8F, -1.0F, -2.0F, 4.0F, 9.0F, 5.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.1F, -7.6F, -1.4F);
		arm2.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.2182F, 0.0F, 0.0F);
		cube_r12.setTextureOffset(47, 47).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 9.0F, 5.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -7.8F, 0.0F);
		head.setTextureOffset(57, 0).addBox(-3.0F, -7.0F, -6.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(32, 10).addBox(-5.0F, -7.7F, -3.0F, 10.0F, 5.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(52, 33).addBox(-3.0F, -4.0F, -10.0F, 6.0F, 4.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(27, 16).addBox(-2.0F, -1.0F, -11.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(1.0F, -1.0F, -11.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(24, 6).addBox(-1.0F, 1.0F, -11.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 6).addBox(-1.0F, -2.0F, -11.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(2.3F, -5.9F, -0.1F);
		head.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.8727F, -0.2618F, -0.5672F);
		cube_r13.setTextureOffset(0, 32).addBox(1.0F, -9.0F, -5.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-6.8F, -7.8F, 0.8F);
		head.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.7418F, 0.0F, 0.4363F);
		cube_r14.setTextureOffset(32, 0).addBox(1.0F, -9.0F, -5.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(1.3F, -5.6F, 1.7F);
		head.addChild(cube_r15);
		setRotationAngle(cube_r15, 1.0908F, -0.2618F, -0.5672F);
		cube_r15.setTextureOffset(0, 0).addBox(1.0F, -9.0F, -5.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-6.9F, -7.2F, 2.6F);
		head.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.9599F, 0.0F, 0.0873F);
		cube_r16.setTextureOffset(24, 0).addBox(1.0F, -9.0F, -5.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-8.2F, -4.2F, 5.0F);
		head.addChild(cube_r17);
		setRotationAngle(cube_r17, 1.0908F, -0.2618F, -0.4363F);
		cube_r17.setTextureOffset(8, 32).addBox(1.0F, -9.0F, -5.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, -3.4F, 5.0F);
		head.addChild(cube_r18);
		setRotationAngle(cube_r18, 1.0908F, -0.2618F, -0.4363F);
		cube_r18.setTextureOffset(0, 54).addBox(1.0F, -9.0F, -5.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(1.0F, -4.4F, 3.0F);
		head.addChild(cube_r19);
		setRotationAngle(cube_r19, 1.0908F, -0.2618F, -0.4363F);
		cube_r19.setTextureOffset(12, 65).addBox(1.0F, -9.0F, -5.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-7.0F, -5.0F, 4.0F);
		head.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.9599F, 0.0F, -0.1745F);
		cube_r20.setTextureOffset(65, 48).addBox(1.0F, -9.0F, -5.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
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