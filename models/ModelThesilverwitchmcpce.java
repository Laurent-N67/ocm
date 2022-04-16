// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelThesilverwitchmcpce extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer body;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public ModelThesilverwitchmcpce() {
		textureWidth = 200;
		textureHeight = 200;

		head = new ModelRenderer(this);
		head.setRotationPoint(5.0F, 0.0F, -7.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.1F, -0.7F, 0.0F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.256F, 0.2969F, 0.0462F);
		cube_r1.setTextureOffset(42, 7).addBox(-1.9293F, -4.9991F, -4.4539F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(42, 7).addBox(-0.9293F, -4.9991F, -4.4539F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(42, 7).addBox(0.0707F, -4.9991F, -4.4539F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(42, 7).addBox(-2.9293F, -4.9991F, -4.4539F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(42, 7).addBox(-3.9293F, -4.9991F, -4.4539F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(42, 7).addBox(3.0707F, -3.9991F, -4.4539F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(43, 9).addBox(-3.9293F, -0.9991F, -4.4539F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(43, 9).addBox(3.0707F, -4.9991F, -4.4539F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(43, 9).addBox(2.0707F, -4.9991F, -4.4539F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(44, 10).addBox(2.0707F, -3.9991F, -4.4539F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(44, 10).addBox(1.0707F, -4.9991F, -4.4539F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(14, 8).addBox(-3.9293F, -7.9991F, -4.4539F, 8.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(-3.9293F, -7.9991F, -3.4539F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		cube_r1.setTextureOffset(32, 0).addBox(-3.9293F, -7.9991F, -3.4539F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(65, 22).addBox(-13.0F, -9.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(-19.0F, -10.1F, -6.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(-19.0F, -10.1F, -3.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(-13.0F, -10.1F, -6.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(-13.0F, -11.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(-13.0F, -10.1F, -3.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(-7.0F, -10.1F, -3.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(-1.0F, -10.1F, -3.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(5.0F, -10.1F, -3.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(17.0F, -10.1F, -3.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(11.0F, -10.1F, -3.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(-7.0F, -9.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(-1.0F, -9.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(5.0F, -9.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(11.0F, -9.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(17.0F, -9.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(-7.0F, -10.1F, -6.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(5.0F, -10.1F, -6.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(-1.0F, -10.1F, -6.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(11.0F, -10.1F, -6.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(65, 2).addBox(35.0F, -9.1F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(65, 2).addBox(35.0F, -9.1F, -8.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(65, 2).addBox(35.0F, -13.1F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(65, 2).addBox(31.0F, -13.1F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(65, 2).addBox(27.0F, -9.1F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(65, 2).addBox(27.0F, -13.1F, -8.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(65, 2).addBox(27.0F, -13.1F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(65, 2).addBox(27.0F, -9.1F, -8.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(65, 2).addBox(39.0F, -9.1F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(65, 2).addBox(39.0F, -13.1F, -8.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(65, 2).addBox(39.0F, -13.1F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(65, 2).addBox(39.0F, -9.1F, -8.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(65, 2).addBox(35.0F, -13.1F, -8.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(-25.0F, -10.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(-19.0F, -10.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(17.0F, -11.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(17.0F, -10.1F, -6.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(65, 6).addBox(23.0F, -11.1F, -6.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(65, 2).addBox(31.0F, -9.1F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(65, 2).addBox(31.0F, -9.1F, -8.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(65, 2).addBox(31.0F, -13.1F, -8.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(-7.0F, -11.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(11.0F, -11.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(5.0F, -11.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(65, 22).addBox(-1.0F, -11.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(3.0F, -2.6F, 2.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.1745F, 0.0F);
		cube_r2.setTextureOffset(16, 16).addBox(-0.3979F, -22.2F, -9.8612F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(3.0F, -2.6F, 2.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.1745F, 0.3054F, 0.0F);
		cube_r3.setTextureOffset(32, 52).addBox(0.6021F, -11.6F, -8.8612F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r3.setTextureOffset(32, 52).addBox(0.6021F, -11.6F, -12.8612F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r3.setTextureOffset(32, 52).addBox(0.6021F, -7.6F, -12.8612F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		cube_r3.setTextureOffset(16, 56).addBox(0.6021F, -5.6F, -12.8612F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(3.0F, -2.6F, 2.0F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.2537F, -0.0029F, -0.0092F);
		cube_r4.setTextureOffset(32, 52).addBox(1.8021F, -12.4F, -12.0612F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r4.setTextureOffset(32, 52).addBox(1.8021F, -8.4F, -12.0612F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		cube_r4.setTextureOffset(16, 56).addBox(1.8021F, -6.4F, -12.0612F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r4.setTextureOffset(32, 52).addBox(1.8021F, -12.4F, -8.0612F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.1309F, 0.3054F, 0.0F);
		cube_r5.setTextureOffset(40, 16).addBox(-0.8F, -24.9F, -3.8F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		cube_r5.setTextureOffset(40, 16).addBox(-0.8F, -18.9F, -3.8F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		cube_r5.setTextureOffset(17, 55).addBox(-0.8F, -15.9F, -3.8F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r5.setTextureOffset(17, 55).addBox(11.2F, -15.9F, -3.8F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r5.setTextureOffset(40, 16).addBox(11.2F, -18.9F, -3.8F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		cube_r5.setTextureOffset(40, 16).addBox(11.2F, -24.9F, -3.8F, 4.0F, 6.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}