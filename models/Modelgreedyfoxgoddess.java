// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelgreedyfoxgoddess extends EntityModel<Entity> {
	private final ModelRenderer Main;
	private final ModelRenderer head;
	private final ModelRenderer bone14;
	private final ModelRenderer body;
	private final ModelRenderer bone13;
	private final ModelRenderer bone19;
	private final ModelRenderer bone12;
	private final ModelRenderer bone11;
	private final ModelRenderer bone18;
	private final ModelRenderer bone10;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer tail;
	private final ModelRenderer bone;
	private final ModelRenderer bone31;
	private final ModelRenderer bone30;
	private final ModelRenderer bone29;
	private final ModelRenderer bone2;
	private final ModelRenderer bone32;
	private final ModelRenderer bone33;
	private final ModelRenderer bone34;
	private final ModelRenderer bone3;
	private final ModelRenderer bone35;
	private final ModelRenderer bone36;
	private final ModelRenderer bone37;
	private final ModelRenderer bone4;
	private final ModelRenderer bone38;
	private final ModelRenderer bone39;
	private final ModelRenderer bone40;
	private final ModelRenderer bone5;
	private final ModelRenderer bone41;
	private final ModelRenderer bone42;
	private final ModelRenderer bone43;
	private final ModelRenderer bone6;
	private final ModelRenderer bone44;
	private final ModelRenderer bone45;
	private final ModelRenderer bone46;
	private final ModelRenderer bone7;
	private final ModelRenderer bone47;
	private final ModelRenderer bone48;
	private final ModelRenderer bone49;
	private final ModelRenderer bone8;
	private final ModelRenderer bone50;
	private final ModelRenderer bone51;
	private final ModelRenderer bone52;
	private final ModelRenderer bone9;
	private final ModelRenderer bone53;
	private final ModelRenderer bone54;
	private final ModelRenderer bone55;
	private final ModelRenderer support;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer bone25;
	private final ModelRenderer bone26;
	private final ModelRenderer bone27;
	private final ModelRenderer bone28;

	public Modelgreedyfoxgoddess() {
		textureWidth = 200;
		textureHeight = 200;

		Main = new ModelRenderer(this);
		Main.setRotationPoint(-5.6F, 23.0F, 1.5F);
		setRotationAngle(Main, 0.0385F, -0.1303F, 0.0046F);

		head = new ModelRenderer(this);
		head.setRotationPoint(5.6F, -23.1F, -2.5F);
		Main.addChild(head);
		setRotationAngle(head, -0.2182F, 0.0F, 0.0F);

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.1F, -0.7F, 0.0F);
		head.addChild(bone14);
		setRotationAngle(bone14, 0.256F, 0.2969F, 0.0462F);
		bone14.setTextureOffset(42, 7).addBox(-1.9293F, -4.9991F, -4.4539F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(23, 9).addBox(-0.9293F, -4.9991F, -4.4539F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(23, 8).addBox(0.0707F, -4.9991F, -4.4539F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(24, 9).addBox(-3.9293F, -4.9991F, -4.4539F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(23, 9).addBox(3.0707F, -3.9991F, -4.4539F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(43, 9).addBox(-3.9293F, -0.9991F, -4.4539F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(43, 9).addBox(3.0707F, -4.9991F, -4.4539F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(43, 9).addBox(2.0707F, -4.9991F, -4.4539F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(44, 10).addBox(1.0707F, -4.9991F, -4.4539F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(14, 8).addBox(-3.9293F, -7.9991F, -4.4539F, 8.0F, 3.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(7, 8).addBox(-3.9293F, -9.9991F, -2.3539F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(8, 8).addBox(2.0707F, -9.9991F, -2.3539F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(8, 7).addBox(2.0707F, -10.9991F, -2.3539F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(12, 7).addBox(-3.9293F, -10.9991F, -2.3539F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(12, 7).addBox(-2.9293F, -11.9991F, -2.3539F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(12, 7).addBox(2.0707F, -11.9991F, -2.3539F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(68, 6).addBox(4.0707F, -5.9991F, -3.4539F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		bone14.setTextureOffset(68, 6).addBox(4.0707F, -5.9991F, 0.5461F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		bone14.setTextureOffset(68, 6).addBox(-4.9293F, -5.9991F, -3.4539F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		bone14.setTextureOffset(68, 6).addBox(-4.9293F, -6.9991F, -4.4539F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(68, 6).addBox(4.0707F, -6.9991F, -4.4539F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(68, 6).addBox(-4.9293F, -5.9991F, 0.5461F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		bone14.setTextureOffset(68, 6).addBox(0.0707F, -5.9991F, 4.5461F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(68, 6).addBox(2.0707F, -5.9991F, -5.4539F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(68, 6).addBox(-4.9293F, -5.9991F, -5.4539F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(68, 6).addBox(-4.9293F, -5.9991F, 4.5461F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(0, 0).addBox(-3.9293F, -7.9991F, -3.4539F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		bone14.setTextureOffset(32, 0).addBox(-3.9293F, -7.9991F, -3.4539F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Main.addChild(body);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(3.0F, -2.6F, 2.0F);
		body.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.1745F, 0.0F);

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-3.0F, 2.6F, -2.0F);
		bone13.addChild(bone19);
		setRotationAngle(bone19, -0.2182F, 0.0F, 0.0F);
		bone19.setTextureOffset(16, 16).addBox(2.6021F, -23.0F, -9.4612F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(3.2F, -2.1F, 2.0F);
		body.addChild(bone12);
		setRotationAngle(bone12, 0.0872F, 0.3054F, 0.0F);
		bone12.setTextureOffset(23, 20).addBox(0.6021F, -11.6F, -8.8612F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		bone12.setTextureOffset(160, 24).addBox(0.4682F, -10.6372F, -4.9811F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		bone12.setTextureOffset(22, 20).addBox(0.6021F, -11.6F, -12.8612F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		bone12.setTextureOffset(29, 53).addBox(0.6021F, -7.6F, -12.8612F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		bone12.setTextureOffset(16, 56).addBox(0.6021F, -5.6F, -12.8612F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(3.0F, -2.4F, 2.0F);
		body.addChild(bone11);
		setRotationAngle(bone11, 0.2101F, -0.0029F, -0.0092F);

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-3.0F, 2.6F, -2.0F);
		bone11.addChild(bone18);
		setRotationAngle(bone18, -0.1749F, 0.0869F, -0.0076F);
		bone18.setTextureOffset(23, 20).addBox(5.4021F, -13.8F, -8.1612F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		bone18.setTextureOffset(16, 56).addBox(5.4021F, -7.8F, -12.1612F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		bone18.setTextureOffset(30, 53).addBox(5.4021F, -9.8F, -12.1612F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		bone18.setTextureOffset(22, 20).addBox(5.4021F, -13.8F, -12.1612F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(bone10);
		setRotationAngle(bone10, 0.1309F, 0.3054F, 0.0F);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(bone15);
		setRotationAngle(bone15, -0.2618F, 0.0F, 0.0F);
		bone15.setTextureOffset(22, 19).addBox(10.7F, -23.8F, -6.2F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		bone15.setTextureOffset(23, 21).addBox(10.7F, -17.8F, -6.2F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		bone15.setTextureOffset(38, 24).addBox(10.7F, -14.8F, -6.2F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-0.3F, -15.9F, 3.8F);
		bone10.addChild(bone16);
		setRotationAngle(bone16, -0.4422F, 0.158F, -0.0744F);
		bone16.setTextureOffset(30, 57).addBox(-0.0604F, 0.7072F, -6.648F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		bone16.setTextureOffset(30, 56).addBox(-0.0604F, 0.7072F, -10.648F, 4.0F, 3.0F, 4.0F, 0.0F, false);

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(-0.3F, 1.1F, 3.8F);
		bone10.addChild(bone17);
		setRotationAngle(bone17, -0.4367F, 0.0395F, -0.0184F);
		bone17.setTextureOffset(30, 56).addBox(-0.4F, -15.7F, -13.9F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		bone17.setTextureOffset(22, 19).addBox(-0.4F, -21.7F, -13.9F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(6.0F, -20.5F, -0.8F);
		body.addChild(tail);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(bone);
		setRotationAngle(bone, -0.1744F, 0.0062F, -0.0014F);

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone31);
		setRotationAngle(bone31, 0.0F, 0.0F, -3.1416F);
		bone31.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(0.0F, -6.0F, 0.0F);
		bone.addChild(bone30);
		setRotationAngle(bone30, 0.0F, 0.0F, -3.1416F);
		bone30.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 9.0F, 5.0F, 0.0F, false);

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(0.0F, 6.0F, 0.0F);
		bone.addChild(bone29);
		setRotationAngle(bone29, 0.0F, 0.0F, -3.1416F);
		bone29.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-3.0F, 1.1F, 0.0F);
		tail.addChild(bone2);
		setRotationAngle(bone2, -0.1729F, -0.024F, -0.1733F);

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(bone32);
		setRotationAngle(bone32, 0.0F, 0.0F, -3.1416F);
		bone32.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(0.0F, -6.0F, 0.0F);
		bone2.addChild(bone33);
		setRotationAngle(bone33, 0.0F, 0.0F, -3.1416F);
		bone33.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 9.0F, 5.0F, 0.0F, false);

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(0.0F, 6.0F, 0.0F);
		bone2.addChild(bone34);
		setRotationAngle(bone34, 0.0F, 0.0F, -3.1416F);
		bone34.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(2.9F, 0.0F, 0.0F);
		tail.addChild(bone3);
		setRotationAngle(bone3, -0.169F, 0.0436F, 0.2136F);

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(bone35);
		setRotationAngle(bone35, 0.0F, 0.0F, -3.1416F);
		bone35.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(0.0F, -6.0F, 0.0F);
		bone3.addChild(bone36);
		setRotationAngle(bone36, 0.0F, 0.0F, -3.1416F);
		bone36.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 9.0F, 5.0F, 0.0F, false);

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(0.0F, 6.0F, 0.0F);
		bone3.addChild(bone37);
		setRotationAngle(bone37, 0.0F, 0.0F, -3.1416F);
		bone37.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(5.6F, 1.2F, 0.0F);
		tail.addChild(bone4);
		setRotationAngle(bone4, -0.159F, 0.0722F, 0.3861F);

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(bone38);
		setRotationAngle(bone38, 0.0F, 0.0F, -3.1416F);
		bone38.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(0.0F, -6.0F, 0.0F);
		bone4.addChild(bone39);
		setRotationAngle(bone39, 0.0F, 0.0F, -3.1416F);
		bone39.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 9.0F, 5.0F, 0.0F, false);

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(0.0F, 6.0F, 0.0F);
		bone4.addChild(bone40);
		setRotationAngle(bone40, 0.0F, 0.0F, -3.1416F);
		bone40.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-6.3F, 3.1F, 0.0F);
		tail.addChild(bone5);
		setRotationAngle(bone5, -0.1683F, -0.0463F, -0.3024F);

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(bone41);
		setRotationAngle(bone41, 0.0F, 0.0F, -3.1416F);
		bone41.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(0.0F, -6.0F, 0.0F);
		bone5.addChild(bone42);
		setRotationAngle(bone42, 0.0F, 0.0F, -3.1416F);
		bone42.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 9.0F, 5.0F, 0.0F, false);

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(0.0F, 6.0F, 0.0F);
		bone5.addChild(bone43);
		setRotationAngle(bone43, 0.0F, 0.0F, -3.1416F);
		bone43.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-6.8F, 7.7F, 1.0F);
		tail.addChild(bone6);
		setRotationAngle(bone6, -0.5416F, 0.3817F, -0.8598F);

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(bone44);
		setRotationAngle(bone44, 0.0F, 0.0F, -3.1416F);
		bone44.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(0.0F, -6.0F, 0.0F);
		bone6.addChild(bone45);
		setRotationAngle(bone45, 0.0F, 0.0F, -3.1416F);
		bone45.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 9.0F, 5.0F, 0.0F, false);

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(0.0F, 6.0F, 0.0F);
		bone6.addChild(bone46);
		setRotationAngle(bone46, 0.0F, 0.0F, -3.1416F);
		bone46.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-6.8F, 8.6F, 1.0F);
		tail.addChild(bone7);
		setRotationAngle(bone7, -0.6339F, 0.1618F, -1.1985F);

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(bone47);
		setRotationAngle(bone47, 0.0F, 0.0F, -3.1416F);
		bone47.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(0.0F, -6.0F, 0.0F);
		bone7.addChild(bone48);
		setRotationAngle(bone48, 0.0F, 0.0F, -3.1416F);
		bone48.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 9.0F, 5.0F, 0.0F, false);

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(0.0F, 6.0F, 0.0F);
		bone7.addChild(bone49);
		setRotationAngle(bone49, 0.0F, 0.0F, -3.1416F);
		bone49.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(7.8F, 4.9F, -0.6F);
		tail.addChild(bone8);
		setRotationAngle(bone8, -0.3623F, -0.0977F, 0.6999F);

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(bone50);
		setRotationAngle(bone50, 0.0F, 0.0F, -3.1416F);
		bone50.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(0.0F, -6.0F, 0.0F);
		bone8.addChild(bone51);
		setRotationAngle(bone51, 0.0F, 0.0F, -3.1416F);
		bone51.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 9.0F, 5.0F, 0.0F, false);

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(0.0F, 6.0F, 0.0F);
		bone8.addChild(bone52);
		setRotationAngle(bone52, 0.0F, 0.0F, -3.1416F);
		bone52.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(7.8F, 5.6F, -0.9F);
		tail.addChild(bone9);
		setRotationAngle(bone9, -0.4964F, -0.1016F, 1.2616F);

		bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone9.addChild(bone53);
		setRotationAngle(bone53, 0.0F, 0.0F, -3.1416F);
		bone53.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		bone54 = new ModelRenderer(this);
		bone54.setRotationPoint(0.0F, -6.0F, 0.0F);
		bone9.addChild(bone54);
		setRotationAngle(bone54, 0.0F, 0.0F, -3.1416F);
		bone54.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 9.0F, 5.0F, 0.0F, false);

		bone55 = new ModelRenderer(this);
		bone55.setRotationPoint(0.0F, 6.0F, 0.0F);
		bone9.addChild(bone55);
		setRotationAngle(bone55, 0.0F, 0.0F, -3.1416F);
		bone55.setTextureOffset(159, 0).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		support = new ModelRenderer(this);
		support.setRotationPoint(0.0F, 23.0F, 4.0F);
		setRotationAngle(support, 0.3054F, 0.0435F, 0.0038F);
		support.setTextureOffset(81, 23).addBox(-14.4F, 2.6F, -11.2F, 10.0F, 6.0F, 14.0F, 0.0F, false);
		support.setTextureOffset(81, 23).addBox(-4.4F, 0.9F, -10.9F, 10.0F, 4.0F, 14.0F, 0.0F, false);
		support.setTextureOffset(81, 23).addBox(5.6F, 0.9F, -10.9F, 10.0F, 6.0F, 14.0F, 0.0F, false);
		support.setTextureOffset(81, 23).addBox(-13.4F, 0.9F, -11.8F, 10.0F, 6.0F, 14.0F, 0.0F, false);
		support.setTextureOffset(83, 23).addBox(-15.4F, -8.4F, -11.5F, 5.0F, 11.0F, 17.0F, 0.0F, false);
		support.setTextureOffset(83, 23).addBox(11.6F, -8.4F, -11.5F, 5.0F, 11.0F, 17.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 1.0F, -4.0F);
		support.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(87, 16).addBox(-4.217F, -12.5637F, -6.2369F, 10.0F, 10.0F, 5.0F, 0.0F, false);

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, -0.4F, -1.3F);
		support.addChild(bone20);
		setRotationAngle(bone20, -0.2182F, 0.0F, 0.0F);
		bone20.setTextureOffset(83, 23).addBox(-10.4038F, -12.0962F, -11.1131F, 6.0F, 14.0F, 17.0F, 0.0F, false);
		bone20.setTextureOffset(83, 23).addBox(5.5962F, -12.0962F, -11.1131F, 6.0F, 14.0F, 17.0F, 0.0F, false);
		bone20.setTextureOffset(84, 16).addBox(-4.4F, -8.5F, -1.2F, 10.0F, 10.0F, 7.0F, 0.0F, false);

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, 0.0F, 0.0F);
		support.addChild(bone21);
		setRotationAngle(bone21, 0.0F, 0.2182F, 0.0F);
		bone21.setTextureOffset(83, 23).addBox(-3.5F, -2.2F, -6.7F, 6.0F, 12.0F, 9.0F, 0.0F, false);
		bone21.setTextureOffset(83, 23).addBox(-3.2F, -2.0F, -5.7F, 5.0F, 14.0F, 7.0F, 0.0F, false);
		bone21.setTextureOffset(83, 23).addBox(-2.2F, 3.2F, -4.7F, 3.0F, 14.0F, 5.0F, 0.0F, false);

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(0.0F, 0.0F, 0.0F);
		support.addChild(bone22);
		setRotationAngle(bone22, 0.0F, 0.1745F, 0.0F);
		bone22.setTextureOffset(83, 23).addBox(0.9F, -3.7F, -7.8F, 5.0F, 14.0F, 7.0F, 0.0F, false);
		bone22.setTextureOffset(83, 23).addBox(2.0F, 1.6F, -6.8F, 3.0F, 14.0F, 5.0F, 0.0F, false);

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, 0.0F, 0.0F);
		support.addChild(bone23);
		setRotationAngle(bone23, 0.0F, 0.1309F, 0.0F);
		bone23.setTextureOffset(83, 23).addBox(9.1F, -3.5F, -7.5F, 5.0F, 14.0F, 7.0F, 0.0F, false);
		bone23.setTextureOffset(83, 23).addBox(10.1F, 2.5F, -6.5F, 3.0F, 14.0F, 5.0F, 0.0F, false);

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.0F, 0.0F, 0.0F);
		support.addChild(bone24);
		setRotationAngle(bone24, 0.0F, -0.0873F, 0.0F);
		bone24.setTextureOffset(83, 23).addBox(6.1F, 0.2F, -7.5F, 5.0F, 14.0F, 7.0F, 0.0F, false);
		bone24.setTextureOffset(83, 23).addBox(7.1F, 6.2F, -6.5F, 3.0F, 14.0F, 5.0F, 0.0F, false);
		bone24.setTextureOffset(83, 23).addBox(5.6F, -1.3F, -8.5F, 6.0F, 13.0F, 9.0F, 0.0F, false);

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0F, 0.0F, 0.0F);
		support.addChild(bone25);
		setRotationAngle(bone25, 0.0F, 0.2618F, 0.0F);
		bone25.setTextureOffset(83, 23).addBox(-9.3F, 11.7F, -8.8F, 3.0F, 14.0F, 5.0F, 0.0F, false);
		bone25.setTextureOffset(83, 23).addBox(-10.3F, 5.7F, -9.8F, 5.0F, 14.0F, 7.0F, 0.0F, false);
		bone25.setTextureOffset(83, 23).addBox(-11.3F, -1.3F, -10.8F, 7.0F, 15.0F, 9.0F, 0.0F, false);

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.0F, -0.4F, -1.3F);
		support.addChild(bone26);
		setRotationAngle(bone26, -0.4102F, 0.0F, 0.0F);
		bone26.setTextureOffset(84, 16).addBox(-7.4F, -18.5F, 1.9F, 17.0F, 5.0F, 4.0F, 0.0F, false);
		bone26.setTextureOffset(84, 16).addBox(-7.4F, -23.5F, 1.9F, 17.0F, 5.0F, 4.0F, 0.0F, false);

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(0.0F, -0.4F, -1.3F);
		support.addChild(bone27);
		setRotationAngle(bone27, -0.3229F, 0.0F, 0.0F);
		bone27.setTextureOffset(81, 16).addBox(-9.4F, -13.5F, 0.9F, 10.0F, 5.0F, 5.0F, 0.0F, false);
		bone27.setTextureOffset(81, 16).addBox(0.6F, -13.5F, 0.9F, 10.0F, 5.0F, 5.0F, 0.0F, false);

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(0.0F, -0.4F, -1.3F);
		support.addChild(bone28);
		setRotationAngle(bone28, -0.0873F, 0.0F, 0.0F);
		bone28.setTextureOffset(87, 16).addBox(-4.4F, -2.8F, -11.5F, 10.0F, 4.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Main.render(matrixStack, buffer, packedLight, packedOverlay);
		support.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}