// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class raccon extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer head;
	private final ModelRenderer pattes1;
	private final ModelRenderer pattes2;
	private final ModelRenderer pattes3;
	private final ModelRenderer pattes4;
	private final ModelRenderer bb_main;

	public raccon() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 20.0F, 16.0F);
		setRotationAngle(bone, -0.1745F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 25, -3.0F, -4.0F, -9.0F, 6, 4, 11, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.4F, 17.0F, -7.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -1.6F, -11.0F, 5, 3, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 30, -5.0F, -8.0F, -5.0F, 3, 3, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 25, 1.0F, -8.0F, -5.0F, 3, 3, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 26, 32, -5.0F, -5.0F, -7.0F, 9, 7, 8, 0.0F, false));

		pattes1 = new ModelRenderer(this);
		pattes1.setRotationPoint(2.8F, 20.0F, -6.5F);
		pattes1.cubeList.add(new ModelBox(pattes1, 38, 0, -2.0F, 0.0F, -2.0F, 3, 4, 3, 0.0F, false));

		pattes2 = new ModelRenderer(this);
		pattes2.setRotationPoint(2.8F, 20.0F, 6.5F);
		pattes2.cubeList.add(new ModelBox(pattes2, 0, 7, -2.0F, 0.0F, -1.0F, 3, 4, 3, 0.0F, false));

		pattes3 = new ModelRenderer(this);
		pattes3.setRotationPoint(-2.2F, 20.0F, -7.5F);
		pattes3.cubeList.add(new ModelBox(pattes3, 35, 25, -1.6F, 0.0F, -1.0F, 3, 4, 3, 0.0F, false));

		pattes4 = new ModelRenderer(this);
		pattes4.setRotationPoint(-2.2F, 20.0F, 7.5F);
		pattes4.cubeList.add(new ModelBox(pattes4, 23, 25, -1.6F, 0.0F, -2.0F, 3, 4, 3, 0.0F, false));

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -4.0F, -11.0F, -9.0F, 8, 7, 18, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
		head.render(f5);
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
}