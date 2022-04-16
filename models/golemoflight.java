// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

public class golemoflight extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer arm1;
	private final ModelRenderer arm2;
	private final ModelRenderer turn1;
	private final ModelRenderer turn2;
	private final ModelRenderer turn3;
	private final ModelRenderer body;

	public golemoflight() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -4.0F, 0.0F);
		setRotationAngle(head, 0.0F, -1.5708F, 0.0F);
		head.cubeList.add(new ModelBox(head, 34, 0, -3.0F, -6.0F, -3.0F, 6, 6, 6, 0.0F, false));

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(-7.0F, -3.0F, 0.0F);
		setRotationAngle(arm1, 0.0F, -1.5708F, 0.0F);
		arm1.cubeList.add(new ModelBox(arm1, 26, 26, -3.0F, -1.0F, 0.0F, 7, 17, 6, 0.0F, false));

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(7.0F, -2.0F, 0.0F);
		setRotationAngle(arm2, 0.0F, -1.5708F, 0.0F);
		arm2.cubeList.add(new ModelBox(arm2, 0, 25, -3.0F, -2.0F, -6.0F, 7, 17, 6, 0.0F, false));

		turn1 = new ModelRenderer(this);
		turn1.setRotationPoint(0.0F, 23.0F, 0.0F);
		turn1.cubeList.add(new ModelBox(turn1, 0, 0, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));

		turn2 = new ModelRenderer(this);
		turn2.setRotationPoint(0.0F, 13.0F, 0.0F);
		turn2.cubeList.add(new ModelBox(turn2, 46, 46, -3.0F, -3.0F, -3.0F, 6, 6, 6, 0.0F, false));

		turn3 = new ModelRenderer(this);
		turn3.setRotationPoint(0.0F, 19.0F, 0.0F);
		turn3.cubeList.add(new ModelBox(turn3, 46, 12, -2.0F, -2.0F, -2.0F, 4, 4, 4, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 9.0F, 0.0F);
		setRotationAngle(body, 0.0F, -1.5708F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, -13.0F, -6.0F, 11, 13, 12, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		arm1.render(f5);
		arm2.render(f5);
		turn1.render(f5);
		turn2.render(f5);
		turn3.render(f5);
		body.render(f5);
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
		this.turn2.rotateAngleX = f2 / 20.f;
		this.turn1.rotateAngleX = f2 / 20.f;
		this.turn3.rotateAngleX = f2;
	}
}