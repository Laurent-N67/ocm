// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

public static class Modelcyclop extends ModelBase {
	private final ModelRenderer armb;
	private final ModelRenderer arma;
	private final ModelRenderer lega;
	private final ModelRenderer legb;
	private final ModelRenderer head;
	private final ModelRenderer bb_main;

	public Modelcyclop() {
		textureWidth = 128;
		textureHeight = 128;

		armb = new ModelRenderer(this);
		armb.setRotationPoint(8.0F, -23.0F, 0.0F);
		armb.cubeList.add(new ModelBox(armb, 0, 61, 0.0F, -3.0F, -4.0F, 7, 25, 8, 0.0F, false));

		arma = new ModelRenderer(this);
		arma.setRotationPoint(-9.0F, -23.0F, 0.0F);
		arma.cubeList.add(new ModelBox(arma, 72, 73, -6.0F, -3.0F, -4.0F, 7, 25, 8, 0.0F, false));

		lega = new ModelRenderer(this);
		lega.setRotationPoint(-4.0F, 0.0F, 0.0F);
		lega.cubeList.add(new ModelBox(lega, 56, 0, -4.0F, -1.0F, -4.0F, 8, 25, 8, 0.0F, false));

		legb = new ModelRenderer(this);
		legb.setRotationPoint(3.0F, 0.0F, 0.0F);
		legb.cubeList.add(new ModelBox(legb, 48, 48, -3.0F, -1.0F, -4.0F, 8, 25, 8, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(-1.0F, -24.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -6.0F, -16.0F, -7.0F, 14, 14, 14, 0.0F, false));

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, -11.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 28, -8.0F, -15.0F, -4.0F, 16, 25, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		armb.render(f5);
		arma.render(f5);
		lega.render(f5);
		legb.render(f5);
		head.render(f5);
		bb_main.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.lega.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.legb.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.arma.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.armb.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}