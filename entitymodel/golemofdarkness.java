// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class golemofdarkness extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer arm1;
	private final ModelRenderer arm2;
	private final ModelRenderer turn1;
	private final ModelRenderer turn2;
	private final ModelRenderer turn3;
	private final ModelRenderer body;

	public golemofdarkness() {
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
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
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
}