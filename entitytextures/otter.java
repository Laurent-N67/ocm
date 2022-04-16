// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class otter extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer pattes1;
	private final ModelRenderer pattes2;
	private final ModelRenderer pattes3;
	private final ModelRenderer pattes4;
	private final ModelRenderer tete;
	private final ModelRenderer bb_main;

	public otter() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.1F, 23.0F, 13.0F);
		setRotationAngle(bone, -0.1745F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 18, 24, -2.15F, -3.5F, -7.0F, 4, 3, 6, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.6F, 23.2F, 17.6F);
		setRotationAngle(bone2, -0.1745F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 30, -2.15F, -2.5F, -7.0F, 3, 2, 6, 0.0F, false));

		pattes1 = new ModelRenderer(this);
		pattes1.setRotationPoint(-2.0F, 22.0F, -5.0F);
		pattes1.cubeList.add(new ModelBox(pattes1, 18, 19, -1.8F, 0.0F, -1.3F, 2, 2, 2, 0.0F, false));

		pattes2 = new ModelRenderer(this);
		pattes2.setRotationPoint(2.0F, 22.0F, -5.0F);
		pattes2.cubeList.add(new ModelBox(pattes2, 0, 9, -0.4F, 0.0F, -1.3F, 2, 2, 2, 0.0F, false));

		pattes3 = new ModelRenderer(this);
		pattes3.setRotationPoint(2.0F, 22.0F, 5.0F);
		pattes3.cubeList.add(new ModelBox(pattes3, 6, 7, -0.4F, 0.0F, -1.3F, 2, 2, 2, 0.0F, false));

		pattes4 = new ModelRenderer(this);
		pattes4.setRotationPoint(-2.0F, 22.0F, 5.0F);
		pattes4.cubeList.add(new ModelBox(pattes4, 0, 5, -1.8F, 0.0F, -1.3F, 2, 2, 2, 0.0F, false));

		tete = new ModelRenderer(this);
		tete.setRotationPoint(0.0F, 20.0F, -10.0F);
		tete.cubeList.add(new ModelBox(tete, 0, 19, -3.0F, -6.0F, -1.0F, 6, 5, 6, 0.0F, false));
		tete.cubeList.add(new ModelBox(tete, 0, 0, -2.0F, -4.0F, -3.0F, 4, 3, 2, 0.0F, false));
		tete.cubeList.add(new ModelBox(tete, 23, 2, -3.6F, -3.5F, -0.8F, 2, 1, 2, 0.0F, false));
		tete.cubeList.add(new ModelBox(tete, 23, 2, 1.6F, -3.5F, -0.8F, 2, 1, 2, 0.0F, false));

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -4.0F, -7.0F, -7.0F, 8, 5, 14, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
		bone2.render(f5);
		pattes1.render(f5);
		pattes2.render(f5);
		pattes3.render(f5);
		pattes4.render(f5);
		tete.render(f5);
		bb_main.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}