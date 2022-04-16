// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

public static class Modeltiger extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer bone;
	private final ModelRenderer pattes1;
	private final ModelRenderer pattes2;
	private final ModelRenderer pattes3;
	private final ModelRenderer pattes4;
	private final ModelRenderer bb_main;

	public Modeltiger() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 8.0F, -11.0F);
		head.cubeList.add(new ModelBox(head, 30, 30, -5.0F, -4.0F, -5.0F, 9, 8, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 18, 30, -6.0F, -2.0F, -4.0F, 1, 5, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 30, 4.0F, -2.0F, -4.0F, 1, 5, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 38, 13, -5.0F, -6.0F, -4.0F, 3, 2, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 13, 1.0F, -6.0F, -4.0F, 3, 2, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 45, -3.0F, 0.0F, -9.0F, 5, 4, 4, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.0F, 9.0F, 9.0F);
		setRotationAngle(bone, -0.3927F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 30, -1.0F, -0.5943F, -0.9302F, 3, 3, 12, 0.0F, false));

		pattes1 = new ModelRenderer(this);
		pattes1.setRotationPoint(-3.0F, 15.0F, 6.0F);
		pattes1.cubeList.add(new ModelBox(pattes1, 0, 0, -2.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F, false));

		pattes2 = new ModelRenderer(this);
		pattes2.setRotationPoint(-4.0F, 15.0F, -8.0F);
		pattes2.cubeList.add(new ModelBox(pattes2, 42, 43, -1.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F, false));

		pattes3 = new ModelRenderer(this);
		pattes3.setRotationPoint(4.0F, 15.0F, -8.0F);
		pattes3.cubeList.add(new ModelBox(pattes3, 26, 43, -4.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F, false));

		pattes4 = new ModelRenderer(this);
		pattes4.setRotationPoint(2.0F, 15.0F, 6.0F);
		pattes4.cubeList.add(new ModelBox(pattes4, 38, 0, -2.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F, false));

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -5.0F, -19.0F, -11.0F, 9, 10, 20, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		bone.render(f5);
		pattes1.render(f5);
		pattes2.render(f5);
		pattes3.render(f5);
		pattes4.render(f5);
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
		this.pattes1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.pattes2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.pattes3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.pattes4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}