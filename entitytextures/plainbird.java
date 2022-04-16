// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Plainbird extends ModelBase {
	private final ModelRenderer leg1;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer leg2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bb_main;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;

	public Plainbird() {
		textureWidth = 128;
		textureHeight = 128;

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(4.0F, 8.0F, 1.0F);
		leg1.cubeList.add(new ModelBox(leg1, 31, 36, 0.0F, 14.0F, -7.0F, 3, 2, 9, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-4.0F, 14.0F, -9.0F);
		leg1.addChild(bone);
		setRotationAngle(bone, -0.3054F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 45, 4.0F, -18.0F, 2.0F, 3, 12, 5, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(2.0F, -3.0F, -1.0F);
		leg1.addChild(bone2);
		setRotationAngle(bone2, 0.2618F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 52, 52, -1.5F, 9.5F, -6.2F, 2, 8, 4, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-5.0F, 6.0F, 0.0F);
		leg2.cubeList.add(new ModelBox(leg2, 35, 0, -3.0F, 16.0F, -6.0F, 3, 2, 9, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-7.0F, 16.0F, -8.0F);
		leg2.addChild(bone3);
		setRotationAngle(bone3, -0.3054F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, 4.0F, -18.9537F, 1.6993F, 3, 12, 5, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.0F, -1.0F, 0.0F);
		leg2.addChild(bone4);
		setRotationAngle(bone4, 0.2618F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 0, 23, -1.5F, 9.5F, -6.2F, 2, 8, 4, 0.0F, false));

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 23, -4.0F, -21.0F, -6.0F, 7, 9, 13, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -5.0F, -19.0F, -8.0F, 9, 6, 17, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 23.0F, -15.0F);
		setRotationAngle(bone5, -1.0472F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 16, 47, -3.0F, -18.4019F, -16.2321F, 5, 4, 6, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.6F, 4.6962F, -3.866F);
		bone5.addChild(bone6);
		setRotationAngle(bone6, -0.2618F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 46, 36, -3.5F, -19.3122F, -21.3407F, 5, 4, 5, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 27, 23, -4.0F, -33.0F, -13.3F, 7, 7, 6, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 38, 47, -2.0F, -29.0F, -17.3F, 3, 2, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		leg1.render(f5);
		leg2.render(f5);
		bb_main.render(f5);
		bone5.render(f5);
		bone7.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}