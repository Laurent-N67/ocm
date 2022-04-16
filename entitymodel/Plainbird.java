// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class Plainbird extends EntityModel<Entity> {
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

	public Plainbird() {
		textureWidth = 128;
		textureHeight = 128;

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(4.0F, 8.0F, 1.0F);
		leg1.setTextureOffset(31, 36).addBox(0.0F, 14.0F, -7.0F, 3.0F, 2.0F, 9.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-4.0F, 14.0F, -9.0F);
		leg1.addChild(bone);
		setRotationAngle(bone, -0.3054F, 0.0F, 0.0F);
		bone.setTextureOffset(0, 45).addBox(4.0F, -18.0F, 2.0F, 3.0F, 12.0F, 5.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(2.0F, -3.0F, -1.0F);
		leg1.addChild(bone2);
		setRotationAngle(bone2, 0.2618F, 0.0F, 0.0F);
		bone2.setTextureOffset(52, 52).addBox(-1.5F, 9.5F, -6.2F, 2.0F, 8.0F, 4.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-5.0F, 6.0F, 0.0F);
		leg2.setTextureOffset(35, 0).addBox(-3.0F, 16.0F, -6.0F, 3.0F, 2.0F, 9.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-7.0F, 16.0F, -8.0F);
		leg2.addChild(bone3);
		setRotationAngle(bone3, -0.3054F, 0.0F, 0.0F);
		bone3.setTextureOffset(0, 0).addBox(4.0F, -18.9537F, 1.6993F, 3.0F, 12.0F, 5.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.0F, -1.0F, 0.0F);
		leg2.addChild(bone4);
		setRotationAngle(bone4, 0.2618F, 0.0F, 0.0F);
		bone4.setTextureOffset(0, 23).addBox(-1.5F, 9.5F, -6.2F, 2.0F, 8.0F, 4.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 23).addBox(-4.0F, -21.0F, -6.0F, 7.0F, 9.0F, 13.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-5.0F, -19.0F, -8.0F, 9.0F, 6.0F, 17.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 23.0F, -15.0F);
		setRotationAngle(bone5, -1.0472F, 0.0F, 0.0F);
		bone5.setTextureOffset(16, 47).addBox(-3.0F, -18.4019F, -16.2321F, 5.0F, 4.0F, 6.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.6F, 4.6962F, -3.866F);
		bone5.addChild(bone6);
		setRotationAngle(bone6, -0.2618F, 0.0F, 0.0F);
		bone6.setTextureOffset(46, 36).addBox(-3.5F, -19.3122F, -21.3407F, 5.0F, 4.0F, 5.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone7.setTextureOffset(27, 23).addBox(-4.0F, -33.0F, -13.3F, 7.0F, 7.0F, 6.0F, 0.0F, false);
		bone7.setTextureOffset(38, 47).addBox(-2.0F, -29.0F, -17.3F, 3.0F, 2.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		bone5.render(matrixStack, buffer, packedLight, packedOverlay);
		bone7.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}