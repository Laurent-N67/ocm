// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class salamanderbossmcp extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer brasgauche;
	private final ModelRenderer jambedroit;
	private final ModelRenderer jambegauche;
	private final ModelRenderer brasdroit;

	public salamanderbossmcp() {
		textureWidth = 200;
		textureHeight = 200;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -24.0F, 1.0F);
		head.setTextureOffset(0, 0).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);
		head.setTextureOffset(39, 18).addBox(-8.0F, -16.0F, -10.0F, 8.0F, 8.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(39, 18).addBox(0.0F, -16.0F, -10.0F, 8.0F, 6.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(39, 18).addBox(2.0F, -10.0F, -10.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(39, 18).addBox(-8.0F, -8.0F, -10.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(39, 18).addBox(-6.0F, -2.0F, -10.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(39, 18).addBox(4.0F, -2.0F, -10.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(39, 18).addBox(6.0F, -8.0F, -10.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(64, 0).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(32, 32).addBox(-8.0F, -48.0F, -3.0F, 16.0F, 24.0F, 8.0F, 0.0F, false);

		brasgauche = new ModelRenderer(this);
		brasgauche.setRotationPoint(-8.0F, -22.0F, 0.0F);
		brasgauche.setTextureOffset(80, 32).addBox(-8.0F, -2.0F, -3.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

		jambedroit = new ModelRenderer(this);
		jambedroit.setRotationPoint(5.0F, 0.0F, 1.0F);
		jambedroit.setTextureOffset(80, 32).addBox(-5.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

		jambegauche = new ModelRenderer(this);
		jambegauche.setRotationPoint(-4.0F, 0.0F, 1.0F);
		jambegauche.setTextureOffset(80, 32).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

		brasdroit = new ModelRenderer(this);
		brasdroit.setRotationPoint(8.0F, -22.0F, 0.0F);
		brasdroit.setTextureOffset(80, 32).addBox(0.0F, -2.0F, -3.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		brasgauche.render(matrixStack, buffer, packedLight, packedOverlay);
		jambedroit.render(matrixStack, buffer, packedLight, packedOverlay);
		jambegauche.render(matrixStack, buffer, packedLight, packedOverlay);
		brasdroit.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}