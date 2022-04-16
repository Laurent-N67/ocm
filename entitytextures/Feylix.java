// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Feylix extends ModelBase {
	private final ModelRenderer torso;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer leg1;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer leg2;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer arm1;
	private final ModelRenderer bone10;
	private final ModelRenderer bone9;
	private final ModelRenderer arm2;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer head;

	public Feylix() {
		textureWidth = 64;
		textureHeight = 64;

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, 24.0F, 2.0F);
		setRotationAngle(torso, 0.0873F, 0.0F, 0.0F);
		torso.cubeList.add(new ModelBox(torso, 0, 0, -3.0F, -18.0F, -1.0F, 5, 10, 4, 0.0F, false));
		torso.cubeList.add(new ModelBox(torso, 0, 14, -2.0F, -20.9886F, 0.2615F, 3, 7, 2, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.2615F, 2.9886F);
		torso.addChild(bone);
		setRotationAngle(bone, 0.3054F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 23, 19, -1.0F, -10.161F, 2.9299F, 1, 1, 2, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-0.1F, -2.5228F, -3.5938F);
		torso.addChild(bone2);
		setRotationAngle(bone2, -0.7418F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 18, 13, -1.0F, -11.7081F, 0.4581F, 1, 1, 4, 0.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(1.5F, 16.1F, 2.2F);
		setRotationAngle(leg1, -0.2182F, 0.0F, 0.0F);
		leg1.cubeList.add(new ModelBox(leg1, 20, 23, -1.6F, -1.4002F, -1.0901F, 2, 6, 2, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-2.0F, 3.2627F, -4.0908F);
		leg1.addChild(bone3);
		setRotationAngle(bone3, -0.829F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 0, 23, 0.5F, -3.3554F, 3.0074F, 2, 2, 4, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(1.4F, 0.934F, 3.6177F);
		bone3.addChild(bone4);
		setRotationAngle(bone4, -0.5236F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 28, 11, -1.0F, -6.0F, 0.7321F, 2, 5, 2, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-2.3F, 16.1F, 2.2F);
		setRotationAngle(leg2, -0.2182F, 0.0F, 0.0F);
		leg2.cubeList.add(new ModelBox(leg2, 12, 23, -0.6F, -1.4002F, -1.0901F, 2, 6, 2, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-1.0F, 3.2627F, -4.0908F);
		leg2.addChild(bone6);
		setRotationAngle(bone6, -0.829F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 18, 7, 0.3F, -3.3554F, 3.0074F, 2, 2, 4, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(1.4F, 0.934F, 3.6177F);
		bone6.addChild(bone7);
		setRotationAngle(bone7, -0.5236F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 28, 28, -1.2F, -6.0F, 0.7321F, 2, 5, 2, 0.0F, false));

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(2.0F, 7.0F, 2.0F);
		arm1.cubeList.add(new ModelBox(arm1, 6, 29, 0.0F, -0.6F, -1.4F, 1, 6, 2, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-1.9F, 16.3F, -3.9F);
		arm1.addChild(bone10);
		setRotationAngle(bone10, -0.2182F, 0.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 18, 31, 2.0F, -12.0F, 0.0F, 1, 5, 2, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-2.0F, 16.0F, 1.5F);
		arm1.addChild(bone9);
		setRotationAngle(bone9, 0.48F, 0.0F, 0.0F);
		

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(-3.0F, 7.0F, 1.0F);
		arm2.cubeList.add(new ModelBox(arm2, 0, 29, -1.0F, -0.6F, -0.4F, 1, 6, 2, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-2.9F, 16.3F, -2.9F);
		arm2.addChild(bone12);
		setRotationAngle(bone12, -0.2182F, 0.0F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 12, 31, 1.8F, -12.0F, 0.0F, 1, 5, 2, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-3.0F, 16.0F, 2.5F);
		arm2.addChild(bone13);
		setRotationAngle(bone13, 0.48F, 0.0F, 0.0F);
		

		head = new ModelRenderer(this);
		head.setRotationPoint(-1.0F, 6.0F, 2.0F);
		head.cubeList.add(new ModelBox(head, 13, 13, -2.0F, -5.2F, -3.4F, 5, 5, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 18, 0, -2.5F, -4.4F, -2.4F, 6, 4, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 10, 14, -1.0F, -2.5F, -4.4F, 3, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 8, 23, -2.0F, -6.2F, -1.4F, 2, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 2, -1.5F, -7.2F, -1.4F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, 1.5F, -7.2F, -1.4F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 14, 0, 1.0F, -6.2F, -1.4F, 2, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		torso.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		arm1.render(f5);
		arm2.render(f5);
		head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}