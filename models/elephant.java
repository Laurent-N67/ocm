// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class elephant extends ModelBase {
	private final ModelRenderer foot2;
	private final ModelRenderer foot1;
	private final ModelRenderer foot3;
	private final ModelRenderer foot4;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer hear1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer hear2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer nose1;
	private final ModelRenderer nose2;
	private final ModelRenderer horn;
	private final ModelRenderer cube_r3;
	private final ModelRenderer horn2;
	private final ModelRenderer cube_r4;

	public elephant() {
		textureWidth = 256;
		textureHeight = 256;

		foot2 = new ModelRenderer(this);
		foot2.setRotationPoint(9.0F, 24.0F, 17.0F);
		foot2.cubeList.add(new ModelBox(foot2, 80, 80, -20.0F, -23.0F, -6.0F, 9, 23, 9, 0.0F, false));

		foot1 = new ModelRenderer(this);
		foot1.setRotationPoint(9.0F, 24.0F, 17.0F);
		foot1.cubeList.add(new ModelBox(foot1, 0, 107, -7.0F, -23.0F, -6.0F, 9, 23, 9, 0.0F, false));

		foot3 = new ModelRenderer(this);
		foot3.setRotationPoint(-4.0F, 24.0F, 17.0F);
		foot3.cubeList.add(new ModelBox(foot3, 91, 0, 6.0F, -23.0F, -36.0F, 9, 23, 9, 0.0F, false));

		foot4 = new ModelRenderer(this);
		foot4.setRotationPoint(-4.0F, 24.0F, 17.0F);
		foot4.cubeList.add(new ModelBox(foot4, 0, 0, -7.0F, -23.0F, -36.0F, 9, 23, 9, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -12.0F, -47.0F, -21.0F, 24, 24, 43, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 111, 111, -3.0F, -44.0F, -42.0F, 6, 21, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 107, 67, -5.0F, -47.0F, -38.0F, 10, 11, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 124, 29, 5.0F, -46.0F, -36.0F, 3, 10, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 116, 96, -8.0F, -46.0F, -36.0F, 3, 10, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 67, -10.0F, -56.0F, -33.0F, 20, 20, 20, 0.0F, false));

		hear1 = new ModelRenderer(this);
		hear1.setRotationPoint(14.0F, -29.0F, 0.0F);
		head.addChild(hear1);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-12.0F, -5.0F, 0.0F);
		hear1.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.5236F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 64, 112, -4.0F, -22.0F, -25.0F, 11, 20, 3, 0.0F, false));

		hear2 = new ModelRenderer(this);
		hear2.setRotationPoint(14.0F, -29.0F, 0.0F);
		head.addChild(hear2);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-19.0F, -5.0F, 0.0F);
		hear2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.5236F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 36, 107, -4.0F, -22.0F, -25.0F, 11, 20, 3, 0.0F, false));

		nose1 = new ModelRenderer(this);
		nose1.setRotationPoint(0.0F, -4.0F, 3.0F);
		head.addChild(nose1);
		setRotationAngle(nose1, 0.1309F, 0.0F, 0.0F);
		nose1.cubeList.add(new ModelBox(nose1, 0, 67, -2.0F, -33.9572F, -40.3474F, 4, 17, 3, 0.0F, false));

		nose2 = new ModelRenderer(this);
		nose2.setRotationPoint(0.6F, -8.6F, 6.0F);
		head.addChild(nose2);
		setRotationAngle(nose2, 0.3054F, 0.0F, 0.0F);
		nose2.cubeList.add(new ModelBox(nose2, 60, 67, -2.0F, -28.8114F, -40.1491F, 3, 13, 3, 0.0F, false));

		horn = new ModelRenderer(this);
		horn.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(horn);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(3.7F, -23.0F, -24.0F);
		horn.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 84, 67, 1.0F, -12.0F, -14.0F, 3, 10, 3, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 116, 83, -11.4F, -12.0F, -14.0F, 3, 10, 3, 0.0F, false));

		horn2 = new ModelRenderer(this);
		horn2.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(horn2);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(3.6F, -10.8F, -35.3F);
		horn2.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 72, 72, 1.0F, -12.0F, -14.0F, 3, 11, 3, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 92, 112, -11.2F, -12.0F, -14.0F, 3, 11, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		foot2.render(f5);
		foot1.render(f5);
		foot3.render(f5);
		foot4.render(f5);
		body.render(f5);
		head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}