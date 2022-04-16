// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class MagaBogo extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer head;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;

	public MagaBogo() {
		textureWidth = 512;
		textureHeight = 512;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 23.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 142, 40, -7.0F, -27.0F, -18.0F, 14, 27, 25, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 90, 117, -1.0F, -31.0F, -10.0F, 2, 8, 7, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 184, -1.0F, -31.0F, 1.0F, 2, 8, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 166, 92, -1.0F, -28.0F, 7.0F, 2, 8, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 55, 136, -1.0F, -25.0F, 16.0F, 2, 9, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 65, 55, -1.0F, -23.0F, 25.4F, 2, 9, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 65, 41, -1.0F, -21.0F, 34.0F, 2, 9, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 162, 162, -6.0F, -24.0F, -8.0F, 12, 23, 25, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 196, 16, -5.0F, -20.1F, 7.0F, 10, 19, 22, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 218, -4.0F, -17.0F, 20.0F, 8, 16, 19, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 82, 154, -10.0F, -24.0F, -14.0F, 20, 22, 20, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 79, 14, -8.0F, -25.0F, -19.0F, 16, 24, 27, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 136, -7.0F, -22.2F, -9.0F, 14, 21, 27, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 156, 92, -6.0F, -18.0F, 6.0F, 12, 16, 24, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 208, 214, -5.0F, -15.0F, 19.0F, 10, 13, 21, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 90, 111, -11.0F, -22.0F, -15.0F, 22, 21, 22, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 41, -9.0F, -23.0F, -20.0F, 18, 20, 29, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 184, -10.0F, -22.0F, -21.0F, 20, 18, 16, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 90, -8.0F, -20.0F, -10.0F, 16, 17, 29, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 138, 0, -7.0F, -16.0F, 5.0F, 14, 12, 26, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 107, 199, -6.0F, -13.0F, 18.0F, 12, 9, 23, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 70, 70, -12.0F, -20.0F, -16.0F, 24, 17, 24, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -13.0F, -18.0F, -17.0F, 26, 14, 27, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 43, 250, -6.0F, -29.0F, -21.0F, 12, 11, 11, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 211, 248, -4.0F, -30.0F, -27.0F, 8, 15, 13, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 247, 61, -5.0F, -26.0F, -26.0F, 10, 15, 12, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -4.0F, 43.0F);
		body.addChild(bone2);
		setRotationAngle(bone2, 0.1745F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 91, 231, -3.0F, -14.0F, -15.0F, 6, 15, 19, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 216, 111, -4.0F, -12.0F, -16.0F, 8, 12, 21, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 204, 69, -5.0F, -10.0F, -17.0F, 10, 8, 23, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -8.0F, 52.0F);
		body.addChild(bone3);
		setRotationAngle(bone3, 0.48F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 171, 247, -1.0F, -13.0F, -15.0F, 2, 13, 18, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 141, 235, -2.0F, -11.0F, -16.0F, 4, 10, 20, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 54, 222, -3.0F, -9.0F, -17.0F, 6, 6, 22, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -19.0F, 65.0F);
		body.addChild(bone4);
		setRotationAngle(bone4, 0.7854F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 0, 0, 0.0F, -13.0F, -15.0F, 0, 11, 11, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 253, -1.0F, -11.0F, -16.0F, 2, 8, 13, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 55, 139, -2.0F, -9.0F, -17.0F, 4, 4, 15, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -4.0F, -24.0F);
		head.cubeList.add(new ModelBox(head, 218, 193, -7.0F, 0.4F, -16.0F, 14, 1, 18, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 157, 211, -8.0F, -3.6F, -18.0F, 16, 4, 20, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 157, 211, -6.6F, 1.4F, -12.0F, 13, 4, 20, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 157, 211, -5.6F, 5.4F, -9.0F, 11, 4, 20, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 157, 211, -4.6F, 9.4F, -7.0F, 9, 4, 20, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 156, 132, -10.0F, -7.6F, -20.0F, 19, 5, 22, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 61, 111, -9.0F, -7.6F, -23.0F, 18, 3, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 78, 145, -10.0F, -9.6F, -21.0F, 3, 6, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 78, 136, 7.0F, -9.6F, -21.0F, 3, 6, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 142, 162, 9.0F, -9.6F, -15.0F, 3, 5, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 142, 154, -13.0F, -9.6F, -15.0F, 3, 5, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 79, 0, -1.6F, -9.6F, -24.0F, 3, 6, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 238, 35, 9.0F, -7.6F, -20.0F, 2, 4, 22, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 238, 0, -12.0F, -7.6F, -20.0F, 2, 4, 22, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 192, 0, -10.0F, -10.0F, -10.0F, 19, 4, 12, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 249, 212, -10.0F, -15.0F, 2.0F, 19, 19, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 253, 253, -11.0F, -11.0F, 6.0F, 20, 15, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 35, 222, -8.0F, -8.0F, 10.0F, 15, 8, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 63, -7.0F, -7.0F, 13.8F, 13, 6, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 52, 198, -10.0F, -14.0F, -18.0F, 19, 4, 20, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 22, -4.0F, -13.0F, -20.0F, 8, 3, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 211, 159, -10.0F, -17.0F, -16.0F, 19, 3, 18, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 79, 0, -10.0F, -18.0F, -10.0F, 19, 1, 12, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 204, 100, -8.0F, -19.0F, -8.0F, 15, 1, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 142, 159, -4.4F, -20.0F, -13.0F, 8, 1, 12, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 129, 0, -6.0F, -19.0F, -14.0F, 11, 2, 6, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 184, -1.0F, -23.1F, -12.5F, 2, 8, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 184, -1.0F, -22.3F, -3.6F, 2, 8, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 184, -1.0F, -17.3F, 2.9F, 2, 8, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 184, -1.0F, -13.0F, 9.3F, 2, 8, 5, 0.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(10.0F, 10.0F, -17.0F);
		leg1.cubeList.add(new ModelBox(leg1, 20, 44, 1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 123, 65, 0.0F, 0.0F, -2.0F, 4, 1, 4, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 56, 184, 0.0F, 1.0F, -3.0F, 4, 2, 6, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 0, 52, 0.0F, 3.0F, -4.0F, 6, 3, 8, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 0, 145, 0.0F, 6.0F, -3.0F, 6, 3, 6, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 0, 101, 0.0F, 9.0F, -3.0F, 7, 5, 6, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 162, 179, 0.0F, 11.0F, -7.0F, 7, 3, 4, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(13.0F, 10.0F, 6.0F);
		leg2.cubeList.add(new ModelBox(leg2, 0, 44, 1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 107, 65, 0.0F, 0.0F, -2.0F, 4, 1, 4, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 82, 166, 0.0F, 1.0F, -3.0F, 4, 2, 6, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 0, 41, 0.0F, 3.0F, -4.0F, 6, 3, 8, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 138, 17, 0.0F, 6.0F, -3.0F, 6, 3, 6, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 0, 90, 0.0F, 9.0F, -3.0F, 7, 5, 6, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 162, 172, 0.0F, 11.0F, -7.0F, 7, 3, 4, 0.0F, false));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(-13.0F, 10.0F, 6.0F);
		leg3.cubeList.add(new ModelBox(leg3, 20, 41, -2.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));
		leg3.cubeList.add(new ModelBox(leg3, 91, 65, -4.0F, 0.0F, -2.0F, 4, 1, 4, 0.0F, false));
		leg3.cubeList.add(new ModelBox(leg3, 160, 105, -4.0F, 1.0F, -3.0F, 4, 2, 6, 0.0F, false));
		leg3.cubeList.add(new ModelBox(leg3, 169, 235, -7.0F, 3.0F, -4.0F, 7, 3, 8, 0.0F, false));
		leg3.cubeList.add(new ModelBox(leg3, 138, 8, -6.0F, 6.0F, -3.0F, 6, 3, 6, 0.0F, false));
		leg3.cubeList.add(new ModelBox(leg3, 79, 13, -7.0F, 9.0F, -3.0F, 7, 5, 6, 0.0F, false));
		leg3.cubeList.add(new ModelBox(leg3, 0, 154, -7.0F, 11.0F, -7.0F, 7, 3, 4, 0.0F, false));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(-11.0F, 9.0F, -17.0F);
		leg4.cubeList.add(new ModelBox(leg4, 0, 41, -1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F, false));
		leg4.cubeList.add(new ModelBox(leg4, 75, 65, -3.0F, 1.0F, -2.0F, 4, 1, 4, 0.0F, false));
		leg4.cubeList.add(new ModelBox(leg4, 82, 158, -3.0F, 2.0F, -3.0F, 4, 2, 6, 0.0F, false));
		leg4.cubeList.add(new ModelBox(leg4, 122, 231, -6.0F, 4.0F, -4.0F, 7, 3, 8, 0.0F, false));
		leg4.cubeList.add(new ModelBox(leg4, 0, 136, -4.0F, 7.0F, -3.0F, 6, 3, 6, 0.0F, false));
		leg4.cubeList.add(new ModelBox(leg4, 0, 0, -5.0F, 10.0F, -3.0F, 7, 5, 6, 0.0F, false));
		leg4.cubeList.add(new ModelBox(leg4, 0, 112, -5.0F, 12.0F, -7.0F, 7, 3, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		head.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
		leg4.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}