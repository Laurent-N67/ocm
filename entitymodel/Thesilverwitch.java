// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Thesilverwitch extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer body;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public Thesilverwitch() {
		texWidth = 200;
		texHeight = 200;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 24.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(3.0F, -2.6F, 2.0F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.256F, 0.2969F, 0.0462F);
		cube_r1.texOffs(42, 7).addBox(1.7339F, -28.5493F, -6.8595F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.texOffs(42, 7).addBox(2.7339F, -28.5493F, -6.8595F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.texOffs(42, 7).addBox(3.7339F, -28.5493F, -6.8595F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.texOffs(42, 7).addBox(0.7339F, -28.5493F, -6.8595F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.texOffs(42, 7).addBox(-0.2661F, -28.5493F, -6.8595F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		cube_r1.texOffs(42, 7).addBox(6.7339F, -27.5493F, -6.8595F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		cube_r1.texOffs(43, 9).addBox(-0.2661F, -24.5493F, -6.8595F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.texOffs(43, 9).addBox(6.7339F, -28.5493F, -6.8595F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.texOffs(43, 9).addBox(5.7339F, -28.5493F, -6.8595F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.texOffs(44, 10).addBox(5.7339F, -27.5493F, -6.8595F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.texOffs(44, 10).addBox(4.7339F, -28.5493F, -6.8595F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.texOffs(14, 8).addBox(-0.2661F, -31.5493F, -6.8595F, 8.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.texOffs(0, 0).addBox(-0.2661F, -31.5493F, -5.8595F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		cube_r1.texOffs(32, 0).addBox(-0.2661F, -31.5493F, -5.8595F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, 24.0F, 0.0F);
		body.texOffs(65, 22).addBox(-13.0F, -9.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(-19.0F, -10.1F, -6.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(-19.0F, -10.1F, -3.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(-13.0F, -10.1F, -6.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(-13.0F, -11.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(-13.0F, -10.1F, -3.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(-7.0F, -10.1F, -3.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(-1.0F, -10.1F, -3.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(5.0F, -10.1F, -3.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(17.0F, -10.1F, -3.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(11.0F, -10.1F, -3.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(-7.0F, -9.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(-1.0F, -9.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(5.0F, -9.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(11.0F, -9.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(17.0F, -9.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(-7.0F, -10.1F, -6.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(5.0F, -10.1F, -6.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(-1.0F, -10.1F, -6.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(11.0F, -10.1F, -6.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.texOffs(65, 2).addBox(35.0F, -9.1F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.texOffs(65, 2).addBox(35.0F, -9.1F, -8.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.texOffs(65, 2).addBox(35.0F, -13.1F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.texOffs(65, 2).addBox(31.0F, -13.1F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.texOffs(65, 2).addBox(27.0F, -9.1F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.texOffs(65, 2).addBox(27.0F, -13.1F, -8.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.texOffs(65, 2).addBox(27.0F, -13.1F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.texOffs(65, 2).addBox(27.0F, -9.1F, -8.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.texOffs(65, 2).addBox(39.0F, -9.1F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.texOffs(65, 2).addBox(39.0F, -13.1F, -8.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.texOffs(65, 2).addBox(39.0F, -13.1F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.texOffs(65, 2).addBox(39.0F, -9.1F, -8.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.texOffs(65, 2).addBox(35.0F, -13.1F, -8.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(-25.0F, -10.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(-19.0F, -10.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(17.0F, -11.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(17.0F, -10.1F, -6.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		body.texOffs(65, 6).addBox(23.0F, -11.1F, -6.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.texOffs(65, 2).addBox(31.0F, -9.1F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.texOffs(65, 2).addBox(31.0F, -9.1F, -8.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.texOffs(65, 2).addBox(31.0F, -13.1F, -8.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(-7.0F, -11.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(11.0F, -11.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(5.0F, -11.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.texOffs(65, 22).addBox(-1.0F, -11.1F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(3.0F, -2.6F, 2.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.1745F, 0.0F);
		cube_r2.texOffs(16, 16).addBox(-0.3979F, -22.2F, -9.8612F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(3.0F, -2.6F, 2.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.1745F, 0.3054F, 0.0F);
		cube_r3.texOffs(32, 52).addBox(0.6021F, -11.6F, -8.8612F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r3.texOffs(32, 52).addBox(0.6021F, -11.6F, -12.8612F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r3.texOffs(32, 52).addBox(0.6021F, -7.6F, -12.8612F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		cube_r3.texOffs(16, 56).addBox(0.6021F, -5.6F, -12.8612F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(3.0F, -2.6F, 2.0F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.2537F, -0.0029F, -0.0092F);
		cube_r4.texOffs(32, 52).addBox(1.8021F, -12.4F, -12.0612F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r4.texOffs(32, 52).addBox(1.8021F, -8.4F, -12.0612F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		cube_r4.texOffs(16, 56).addBox(1.8021F, -6.4F, -12.0612F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r4.texOffs(32, 52).addBox(1.8021F, -12.4F, -8.0612F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.1309F, 0.3054F, 0.0F);
		cube_r5.texOffs(40, 16).addBox(-0.8F, -24.9F, -3.8F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		cube_r5.texOffs(40, 16).addBox(-0.8F, -18.9F, -3.8F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		cube_r5.texOffs(17, 55).addBox(-0.8F, -15.9F, -3.8F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r5.texOffs(17, 55).addBox(11.2F, -15.9F, -3.8F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r5.texOffs(40, 16).addBox(11.2F, -18.9F, -3.8F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		cube_r5.texOffs(40, 16).addBox(11.2F, -24.9F, -3.8F, 4.0F, 6.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}