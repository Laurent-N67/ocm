// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Deer extends ModelBase {
	private final ModelRenderer corps;
	private final ModelRenderer bone;
	private final ModelRenderer pates1;
	private final ModelRenderer pates2;
	private final ModelRenderer pates3;
	private final ModelRenderer pates4;
	private final ModelRenderer tte;

	public Deer() {
		textureWidth = 128;
		textureHeight = 128;

		corps = new ModelRenderer(this);
		corps.setRotationPoint(0.0F, 24.0F, 0.0F);
		corps.cubeList.add(new ModelBox(corps, 0, 0, -5.0F, -23.0F, -10.0F, 10, 12, 24, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 11.5F, -7.0F);
		setRotationAngle(bone, 0.6981F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, -14.9215F, 1.3371F, 4, 12, 5, 0.0F, false));

		pates1 = new ModelRenderer(this);
		pates1.setRotationPoint(-4.0F, 13.0F, -6.0F);
		pates1.cubeList.add(new ModelBox(pates1, 0, 51, -1.0F, 0.0F, -2.0F, 4, 11, 4, 0.0F, false));

		pates2 = new ModelRenderer(this);
		pates2.setRotationPoint(-3.0F, 13.0F, 11.0F);
		pates2.cubeList.add(new ModelBox(pates2, 44, 0, -2.0F, 0.0F, -1.6F, 4, 11, 4, 0.0F, false));

		pates3 = new ModelRenderer(this);
		pates3.setRotationPoint(3.0F, 13.0F, 11.0F);
		pates3.cubeList.add(new ModelBox(pates3, 26, 47, -2.0F, 0.0F, -1.6F, 4, 11, 4, 0.0F, false));

		pates4 = new ModelRenderer(this);
		pates4.setRotationPoint(3.0F, 13.0F, -7.0F);
		pates4.cubeList.add(new ModelBox(pates4, 42, 47, -2.0F, 0.0F, -1.0F, 4, 11, 4, 0.0F, false));

		tte = new ModelRenderer(this);
		tte.setRotationPoint(0.0F, -4.0F, -13.6F);
		tte.cubeList.add(new ModelBox(tte, 0, 36, -4.0F, -4.0F, -5.0F, 8, 8, 7, 0.0F, false));
		tte.cubeList.add(new ModelBox(tte, 18, 9, -8.0F, -11.0F, 2.0F, 1, 2, 2, 0.0F, false));
		tte.cubeList.add(new ModelBox(tte, 18, 5, 7.0F, -11.0F, 2.0F, 1, 2, 2, 0.0F, false));
		tte.cubeList.add(new ModelBox(tte, 54, 43, -8.0F, -9.0F, 0.0F, 1, 1, 5, 0.0F, false));
		tte.cubeList.add(new ModelBox(tte, 23, 36, 7.0F, -9.0F, 0.0F, 1, 1, 5, 0.0F, false));
		tte.cubeList.add(new ModelBox(tte, 52, 37, -8.0F, -12.0F, -3.0F, 1, 1, 5, 0.0F, false));
		tte.cubeList.add(new ModelBox(tte, 12, 17, 7.0F, -12.0F, -3.0F, 1, 1, 5, 0.0F, false));
		tte.cubeList.add(new ModelBox(tte, 51, 16, -8.0F, -13.0F, -6.0F, 1, 1, 5, 0.0F, false));
		tte.cubeList.add(new ModelBox(tte, 0, 17, 7.0F, -13.0F, -6.0F, 1, 1, 5, 0.0F, false));
		tte.cubeList.add(new ModelBox(tte, 19, 17, -9.0F, -16.0F, -6.0F, 1, 3, 1, 0.0F, false));
		tte.cubeList.add(new ModelBox(tte, 0, 0, 6.0F, -16.0F, -6.0F, 1, 3, 1, 0.0F, false));
		tte.cubeList.add(new ModelBox(tte, 19, 0, -9.0F, -16.0F, -3.0F, 1, 3, 1, 0.0F, false));
		tte.cubeList.add(new ModelBox(tte, 13, 0, 6.0F, -16.0F, -3.0F, 1, 3, 1, 0.0F, false));
		tte.cubeList.add(new ModelBox(tte, 18, 13, -7.0F, -15.0F, 0.0F, 1, 3, 1, 0.0F, false));
		tte.cubeList.add(new ModelBox(tte, 0, 17, 8.0F, -15.0F, 0.0F, 1, 3, 1, 0.0F, false));
		tte.cubeList.add(new ModelBox(tte, 13, 17, -8.0F, -14.0F, 3.6F, 1, 3, 1, 0.0F, false));
		tte.cubeList.add(new ModelBox(tte, 7, 17, 7.0F, -14.0F, 3.6F, 1, 3, 1, 0.0F, false));
		tte.cubeList.add(new ModelBox(tte, 7, 17, -8.0F, -8.0F, 1.0F, 1, 1, 4, 0.0F, false));
		tte.cubeList.add(new ModelBox(tte, 13, 0, 7.0F, -8.0F, 1.0F, 1, 1, 4, 0.0F, false));
		tte.cubeList.add(new ModelBox(tte, 16, 57, -7.0F, -7.0F, -1.0F, 1, 2, 4, 0.0F, false));
		tte.cubeList.add(new ModelBox(tte, 16, 51, 6.0F, -7.0F, -1.0F, 1, 2, 4, 0.0F, false));
		tte.cubeList.add(new ModelBox(tte, 30, 36, -2.0F, -0.3F, -10.9F, 4, 4, 7, 0.0F, false));
		tte.cubeList.add(new ModelBox(tte, 45, 36, -6.0F, -6.0F, -2.0F, 2, 2, 4, 0.0F, false));
		tte.cubeList.add(new ModelBox(tte, 44, 15, 4.0F, -6.0F, -2.0F, 2, 2, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		corps.render(f5);
		bone.render(f5);
		pates1.render(f5);
		pates2.render(f5);
		pates3.render(f5);
		pates4.render(f5);
		tte.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}