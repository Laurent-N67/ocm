// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class oni extends ModelBase {
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer arm1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer arm2;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer head;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer bb_main;

	public oni() {
		textureWidth = 128;
		textureHeight = 128;

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(3.0F, 5.0F, 0.0F);
		leg1.cubeList.add(new ModelBox(leg1, 68, 0, -3.0F, -1.0F, -4.0F, 7, 20, 8, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-4.0F, 6.0F, 0.0F);
		leg2.cubeList.add(new ModelBox(leg2, 0, 71, -3.0F, -2.0F, -4.0F, 7, 20, 8, 0.0F, false));

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(-7.0F, -14.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.5F, 20.1F, -23.0F);
		arm1.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 42, 14, -4.0F, -8.0F, -13.0F, 6, 7, 14, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.0F, 24.3F, -10.0F);
		arm1.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 51, -4.0F, -7.0F, -13.0F, 5, 6, 14, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.0F, 24.0F, -4.0F);
		arm1.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3491F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 0, -3.0F, -3.0F, -6.0F, 3, 3, 7, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-4.5F, 23.0F, -4.0F);
		arm1.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3054F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 56, 71, -2.0F, -18.0F, -3.0F, 6, 16, 7, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-5.0F, 15.0F, 3.0F);
		arm1.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 82, 82, -2.0F, -18.0F, -3.0F, 7, 13, 7, 0.0F, false));

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(6.0F, -14.0F, -1.0F);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(3.5F, 23.0F, -3.0F);
		arm2.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3054F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 71, -2.0F, -18.0F, -3.0F, 6, 16, 7, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(3.0F, 15.0F, 4.0F);
		arm2.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 78, 28, -2.0F, -18.0F, -3.0F, 7, 13, 7, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -18.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -7.0F, -13.0F, -7.0F, 14, 14, 14, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(5.0F, -12.0F, -5.0F);
		head.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.2182F, 0.0F, 0.3927F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -2.0F, -8.0F, -1.0F, 3, 8, 3, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-4.0F, -12.0F, -5.0F);
		head.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.2182F, 0.0F, -0.3927F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 51, -2.0F, -8.0F, -1.0F, 3, 8, 3, 0.0F, false));

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 42, 43, -7.0F, -41.0F, -4.0F, 14, 20, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 28, -7.5F, -32.0F, -5.0F, 15, 13, 10, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		leg1.render(f5);
		leg2.render(f5);
		arm1.render(f5);
		arm2.render(f5);
		head.render(f5);
		bb_main.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}