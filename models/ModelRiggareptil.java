// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

public static class ModelRiggareptil extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer bone10;
	private final ModelRenderer leg1;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer leg2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer tail;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer arm1;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone18;
	private final ModelRenderer arm2;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bb_main;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;

	public ModelRiggareptil() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(-0.5F, -0.6741F, -13.8779F);
		head.cubeList.add(new ModelBox(head, 34, 0, -3.0F, -7.5393F, -4.0863F, 6, 8, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 69, 59, 3.0F, -6.0F, 1.0F, 4, 4, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 20, 43, 3.0F, -2.0F, 1.0F, 3, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 69, 0, -7.0F, -6.0F, 1.0F, 4, 4, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 20, 45, -6.0F, -2.0F, 1.0F, 3, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 9, 0, -4.0F, -10.0F, 1.0F, 1, 4, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, 3.0F, -10.0F, 1.0F, 1, 4, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 11, 11, -5.0F, -9.0F, 1.0F, 1, 3, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 10, 4.0F, -9.0F, 1.0F, 1, 3, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 8, 22, -6.0F, -8.0F, 1.0F, 1, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 22, 5.0F, -8.0F, 1.0F, 1, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 38, 48, -3.0F, -11.0F, 1.0F, 6, 6, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 48, 26, -2.0F, -12.0F, 1.0F, 4, 1, 1, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-4.3F, -6.5F, 24.4F);
		head.addChild(bone10);
		setRotationAngle(bone10, 0.0873F, 0.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 48, 15, 1.8F, 0.0607F, -35.4863F, 5, 4, 7, 0.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(4.0F, 8.0F, 4.0F);
		leg1.cubeList.add(new ModelBox(leg1, 0, 54, 0.0F, 14.0F, -7.0F, 3, 2, 9, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-4.0F, 14.0F, -9.0F);
		leg1.addChild(bone);
		setRotationAngle(bone, -0.3054F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 40, 60, 4.0F, -18.0F, 2.0F, 3, 12, 5, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(2.0F, -3.0F, -1.0F);
		leg1.addChild(bone2);
		setRotationAngle(bone2, 0.2618F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 65, -1.5F, 9.5F, -6.2F, 2, 8, 4, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-5.0F, 6.0F, 3.0F);
		leg2.cubeList.add(new ModelBox(leg2, 50, 26, -3.0F, 16.0F, -6.0F, 3, 2, 9, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-7.0F, 16.0F, -8.0F);
		leg2.addChild(bone3);
		setRotationAngle(bone3, -0.3054F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 24, 58, 4.0F, -18.9537F, 1.6993F, 3, 12, 5, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.0F, -1.0F, 0.0F);
		leg2.addChild(bone4);
		setRotationAngle(bone4, 0.2618F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 0, 22, -1.5F, 9.5F, -6.2F, 2, 8, 4, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 7.0F, 7.0F);
		setRotationAngle(tail, -0.3491F, 0.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 26, 22, -4.0F, -1.1429F, -0.2016F, 7, 4, 8, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, -1.5861F, -1.0909F);
		tail.addChild(bone7);
		setRotationAngle(bone7, -0.2618F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 0, 43, -3.4F, -1.3699F, 7.0401F, 6, 3, 8, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, -3.2766F, -2.2943F);
		bone7.addChild(bone8);
		setRotationAngle(bone8, -0.1745F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 20, 48, -3.0F, -0.5105F, 14.992F, 5, 2, 8, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 0, 10, -2.0F, -0.2222F, 21.991F, 3, 1, 5, 0.0F, false));

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(-5.0F, 8.0F, -6.0F);
		arm1.cubeList.add(new ModelBox(arm1, 60, 0, -2.0F, -3.0F, -2.0F, 2, 5, 5, 0.0F, false));
		arm1.cubeList.add(new ModelBox(arm1, 12, 65, -4.0F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-2.0F, -2.0F, 2.0F);
		arm1.addChild(bone12);
		setRotationAngle(bone12, 0.7854F, 0.0F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 56, 60, -1.5F, -1.0F, -9.0F, 3, 3, 7, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone12.addChild(bone13);
		bone13.cubeList.add(new ModelBox(bone13, 65, 10, -1.0F, -6.0104F, -13.253F, 2, 2, 4, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 0, 43, -1.0F, -4.0F, -10.8995F, 2, 6, 2, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, -1.1314F, 0.5657F);
		bone13.addChild(bone18);
		setRotationAngle(bone18, 0.1309F, 0.0F, 0.0F);
		bone18.cubeList.add(new ModelBox(bone18, 65, 16, 1.0F, -5.6569F, -15.7279F, 1, 1, 4, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 51, 60, -0.5F, -6.8141F, -15.8398F, 1, 1, 4, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 65, 26, -2.0F, -5.6569F, -15.7279F, 1, 1, 4, 0.0F, false));

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(4.0F, 6.0F, -5.0F);
		arm2.cubeList.add(new ModelBox(arm2, 0, 0, 0.0F, -1.0F, -3.0F, 2, 5, 5, 0.0F, false));
		arm2.cubeList.add(new ModelBox(arm2, 63, 47, 2.0F, 0.0F, -3.0F, 2, 4, 4, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(2.0F, 0.0F, 1.0F);
		arm2.addChild(bone15);
		setRotationAngle(bone15, 0.7854F, 0.0F, 0.0F);
		bone15.cubeList.add(new ModelBox(bone15, 59, 37, -1.5F, -1.0F, -9.0F, 3, 3, 7, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone15.addChild(bone16);
		bone16.cubeList.add(new ModelBox(bone16, 50, 37, -1.0F, -5.7276F, -12.8288F, 2, 2, 4, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 26, 22, -1.0F, -4.0F, -10.8995F, 2, 6, 2, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, -1.4849F, 1.0607F);
		bone16.addChild(bone17);
		setRotationAngle(bone17, 0.1309F, 0.0F, 0.0F);
		bone17.cubeList.add(new ModelBox(bone17, 15, 58, 1.0F, -5.6569F, -15.7279F, 1, 1, 4, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 35, 58, -2.0F, -5.6569F, -15.7279F, 1, 1, 4, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 53, 0, -0.5F, -6.5761F, -15.6572F, 1, 1, 4, 0.0F, false));

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 22, -4.0F, -21.0F, -6.0F, 7, 9, 12, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -5.0F, -19.0F, -8.0F, 9, 6, 16, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-5.5F, 9.0F, 5.0F);
		setRotationAngle(bone5, -0.4363F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 29, 34, 2.0F, 0.0F, -19.0F, 6, 5, 9, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 12.9277F, -1.6954F);
		bone5.addChild(bone6);
		setRotationAngle(bone6, -0.6981F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 46, 48, 2.6F, -0.1851F, -25.3696F, 5, 5, 7, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		tail.render(f5);
		arm1.render(f5);
		arm2.render(f5);
		bb_main.render(f5);
		bone5.render(f5);
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
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.arm1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.arm2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}