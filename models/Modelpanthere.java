// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

public static class Modelpanthere extends ModelBase {
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer head;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;

	public Modelpanthere() {
		textureWidth = 64;
		textureHeight = 64;

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-3.0F, 17.0F, 10.0F);
		leg1.cubeList.add(new ModelBox(leg1, 0, 47, -2.0F, -2.0F, -3.0F, 4, 9, 4, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(4.0F, 15.0F, 9.0F);
		leg2.cubeList.add(new ModelBox(leg2, 46, 46, -3.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F, false));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(4.0F, 16.0F, -9.0F);
		leg3.cubeList.add(new ModelBox(leg3, 42, 0, -3.0F, -1.0F, -2.0F, 4, 9, 4, 0.0F, false));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(-4.0F, 15.0F, -9.0F);
		leg4.cubeList.add(new ModelBox(leg4, 34, 34, -1.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 9.0F, -10.0F);
		head.cubeList.add(new ModelBox(head, 0, 30, -4.6F, -8.0F, -6.0F, 9, 9, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 10, -2.6F, -4.0F, -7.7F, 5, 4, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 4, 2.4F, -10.0F, -3.7F, 2, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -4.6F, -10.0F, -3.7F, 2, 2, 2, 0.0F, false));

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -5.0F, -17.0F, -11.0F, 10, 8, 22, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -5.0F, 15.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.4363F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, -8.0F, -9.0F, 2, 2, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
		leg4.render(f5);
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
		this.leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.leg4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.leg3.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}