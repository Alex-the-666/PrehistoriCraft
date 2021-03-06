package net.andrewplayz.prehistoricraft.client.model.entities.anodontosaurus;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.entity.Entity;

public class AnodontosaurusMale extends AdvancedModelBase {
    public AdvancedModelRenderer Bodyfront;
    public AdvancedModelRenderer Lhip;
    public AdvancedModelRenderer Rhip;
    public AdvancedModelRenderer Lshoulder;
    public AdvancedModelRenderer Rshoulder;
    public AdvancedModelRenderer Bodyback;
    public AdvancedModelRenderer Neck1;
    public AdvancedModelRenderer Rspikeback1;
    public AdvancedModelRenderer Lspikeback1;
    public AdvancedModelRenderer Rspikeback2;
    public AdvancedModelRenderer Lspikeback2;
    public AdvancedModelRenderer Rspikeback3;
    public AdvancedModelRenderer Lspikeback3;
    public AdvancedModelRenderer Lsidespike1;
    public AdvancedModelRenderer Rsidespike1;
    public AdvancedModelRenderer Lsidespike2;
    public AdvancedModelRenderer Lsidespike3;
    public AdvancedModelRenderer Rsidespike2;
    public AdvancedModelRenderer Rsidespike3;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer Lspikeback4;
    public AdvancedModelRenderer Rspikeback4;
    public AdvancedModelRenderer Lspikeback5;
    public AdvancedModelRenderer Rspikeback5;
    public AdvancedModelRenderer Lspikeback6;
    public AdvancedModelRenderer Rspikeback6;
    public AdvancedModelRenderer Lsidespike4;
    public AdvancedModelRenderer Rsidespike4;
    public AdvancedModelRenderer Lsidespike5;
    public AdvancedModelRenderer Rsidespike5;
    public AdvancedModelRenderer Lspikeback7;
    public AdvancedModelRenderer Rspikeback7;
    public AdvancedModelRenderer Lsidespike6;
    public AdvancedModelRenderer Rsidespike6;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer Tail4;
    public AdvancedModelRenderer TailclubL;
    public AdvancedModelRenderer TailclubR;
    public AdvancedModelRenderer Neck2;
    public AdvancedModelRenderer Neck3;
    public AdvancedModelRenderer Head1;
    public AdvancedModelRenderer Headsnout;
    public AdvancedModelRenderer Lowerjaw;
    public AdvancedModelRenderer Llowerfacehorn;
    public AdvancedModelRenderer Rlowerfacehorn;
    public AdvancedModelRenderer Rupperfacehorn;
    public AdvancedModelRenderer Lupperfacehorn;
    public AdvancedModelRenderer LBleg;
    public AdvancedModelRenderer LBfoot;
    public AdvancedModelRenderer LBtoesole3;
    public AdvancedModelRenderer LBtoesole1;
    public AdvancedModelRenderer LBtoesole4;
    public AdvancedModelRenderer LBtoesole2;
    public AdvancedModelRenderer LBtoemid3;
    public AdvancedModelRenderer LBtoetop3;
    public AdvancedModelRenderer LBtoemid1;
    public AdvancedModelRenderer LBtoetop1;
    public AdvancedModelRenderer LBtoemid4;
    public AdvancedModelRenderer LBtoetop4;
    public AdvancedModelRenderer LBtoemid2;
    public AdvancedModelRenderer LBtoetop2;
    public AdvancedModelRenderer RBleg;
    public AdvancedModelRenderer RBfoot;
    public AdvancedModelRenderer RBtoesole3;
    public AdvancedModelRenderer RBtoesole1;
    public AdvancedModelRenderer RBtoesole4;
    public AdvancedModelRenderer RBtoesole2;
    public AdvancedModelRenderer RBtoemid3;
    public AdvancedModelRenderer RBtoetop3;
    public AdvancedModelRenderer RBtoemid1;
    public AdvancedModelRenderer RBtoetop1;
    public AdvancedModelRenderer RBtoemid4;
    public AdvancedModelRenderer RBtoetop4;
    public AdvancedModelRenderer RBtoemid2;
    public AdvancedModelRenderer Rbtoemid2;
    public AdvancedModelRenderer LFleg;
    public AdvancedModelRenderer LFfoot;
    public AdvancedModelRenderer LFtoesole3;
    public AdvancedModelRenderer LFtoesole2;
    public AdvancedModelRenderer LFtoesole1;
    public AdvancedModelRenderer LFtoesole4;
    public AdvancedModelRenderer LFtoesole5;
    public AdvancedModelRenderer LFtoetop3;
    public AdvancedModelRenderer LFtoetop2;
    public AdvancedModelRenderer LFtoetop1;
    public AdvancedModelRenderer LFtoetop4;
    public AdvancedModelRenderer LFtoetop5;
    public AdvancedModelRenderer RFleg;
    public AdvancedModelRenderer RFfoot;
    public AdvancedModelRenderer RFtoesole4;
    public AdvancedModelRenderer RFtoesole3;
    public AdvancedModelRenderer RFtoesole2;
    public AdvancedModelRenderer RFtoesole1;
    public AdvancedModelRenderer RFtoesole5;
    public AdvancedModelRenderer RFtoetop4;
    public AdvancedModelRenderer RFtoetop3;
    public AdvancedModelRenderer RFtoetop2;
    public AdvancedModelRenderer RFtoetop1;
    public AdvancedModelRenderer RFtoetop5;

    public AnodontosaurusMale() {
        this.textureWidth = 512;
        this.textureHeight = 256;
        this.Lshoulder = new AdvancedModelRenderer(this, 200, 220);
        this.Lshoulder.mirror = true;
        this.Lshoulder.setRotationPoint(10.0F, 3.5F, -15.0F);
        this.Lshoulder.addBox(-6.0F, 0.0F, 0.0F, 6, 11, 7, 0.0F);
        this.setRotateAngle(Lshoulder, 0.40980330836826856F, 0.0F, -0.136659280431156F);
        this.RBtoesole1 = new AdvancedModelRenderer(this, 460, 30);
        this.RBtoesole1.setRotationPoint(-2.0F, 5.01F, 2.0F);
        this.RBtoesole1.addBox(0.0F, 0.0F, -5.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(RBtoesole1, 0.0F, 0.31869712141416456F, 0.0F);
        this.Lspikeback1 = new AdvancedModelRenderer(this, 435, 5);
        this.Lspikeback1.setRotationPoint(2.7F, 0.1F, 1.0F);
        this.Lspikeback1.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(Lspikeback1, 0.8196066167365371F, 0.091106186954104F, 0.136659280431156F);
        this.Rsidespike5 = new AdvancedModelRenderer(this, 420, 25);
        this.Rsidespike5.setRotationPoint(-7.0F, 1.3F, 7.0F);
        this.Rsidespike5.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Rsidespike5, 0.0F, -0.31869712141416456F, 0.0F);
        this.Lspikeback7 = new AdvancedModelRenderer(this, 345, 5);
        this.Lspikeback7.setRotationPoint(0.4F, 0.9F, 13.5F);
        this.Lspikeback7.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Lspikeback7, 0.7285004297824331F, 0.0F, 0.18203784098300857F);
        this.Tail1 = new AdvancedModelRenderer(this, 5, 150);
        this.Tail1.setRotationPoint(0.0F, 0.5F, 16.0F);
        this.Tail1.addBox(-5.0F, 0.0F, 0.0F, 10, 11, 13, 0.0F);
        this.setRotateAngle(Tail1, -0.045553093477052F, 0.0F, 0.0F);
        this.LBtoetop3 = new AdvancedModelRenderer(this, 460, 60);
        this.LBtoetop3.setRotationPoint(-1.0F, -3.1F, 2.1F);
        this.LBtoetop3.addBox(0.0F, 0.0F, -4.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(LBtoetop3, 0.6373942428283291F, 0.0F, 0.0F);
        this.Rbtoemid2 = new AdvancedModelRenderer(this, 460, 60);
        this.Rbtoemid2.setRotationPoint(0.0F, -2.1F, 2.1F);
        this.Rbtoemid2.addBox(-1.0F, 0.0F, -4.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(Rbtoemid2, 0.6373942428283291F, 0.0F, 0.0F);
        this.RFtoetop3 = new AdvancedModelRenderer(this, 480, 5);
        this.RFtoetop3.setRotationPoint(0.01F, -2.7F, 1.36F);
        this.RFtoetop3.addBox(-0.5F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(RFtoetop3, 0.4553564018453205F, 0.0F, 0.0F);
        this.RBtoesole2 = new AdvancedModelRenderer(this, 460, 30);
        this.RBtoesole2.setRotationPoint(0.0F, 5.0F, 0.5F);
        this.RBtoesole2.addBox(-1.0F, 0.0F, -4.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(RBtoesole2, 0.0F, 0.18203784098300857F, 0.0F);
        this.LFtoetop2 = new AdvancedModelRenderer(this, 480, 5);
        this.LFtoetop2.setRotationPoint(-0.01F, -2.7F, 1.34F);
        this.LFtoetop2.addBox(-0.5F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(LFtoetop2, 0.46949356878647464F, 0.0F, 0.0F);
        this.Lsidespike3 = new AdvancedModelRenderer(this, 420, 15);
        this.Lsidespike3.setRotationPoint(8.0F, 1.8F, 12.0F);
        this.Lsidespike3.addBox(-2.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Lsidespike3, -0.045553093477052F, 0.31869712141416456F, 0.0F);
        this.Rsidespike1 = new AdvancedModelRenderer(this, 420, 25);
        this.Rsidespike1.setRotationPoint(-8.0F, 2.5F, 0.0F);
        this.Rsidespike1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Rsidespike1, 0.22759093446006054F, -0.31869712141416456F, 0.0F);
        this.RFtoesole3 = new AdvancedModelRenderer(this, 460, 5);
        this.RFtoesole3.setRotationPoint(0.0F, 4.01F, 1.5F);
        this.RFtoesole3.addBox(-0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F);
        this.Lspikeback2 = new AdvancedModelRenderer(this, 420, 5);
        this.Lspikeback2.setRotationPoint(2.8F, 0.1F, 7.0F);
        this.Lspikeback2.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Lspikeback2, 0.9105382707654417F, 0.0F, 0.136659280431156F);
        this.RBtoesole4 = new AdvancedModelRenderer(this, 460, 30);
        this.RBtoesole4.setRotationPoint(2.0F, 5.01F, 2.0F);
        this.RBtoesole4.addBox(-1.0F, 0.0F, -5.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(RBtoesole4, 0.0F, -0.31869712141416456F, 0.0F);
        this.LFtoesole2 = new AdvancedModelRenderer(this, 460, 5);
        this.LFtoesole2.setRotationPoint(0.7F, 4.01F, 1.8F);
        this.LFtoesole2.addBox(-0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(LFtoesole2, 0.0F, -0.18203784098300857F, 0.0F);
        this.Rspikeback5 = new AdvancedModelRenderer(this, 375, 5);
        this.Rspikeback5.setRotationPoint(-1.9F, 0.5F, 4.5F);
        this.Rspikeback5.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Rspikeback5, 0.7740535232594852F, 0.0F, -0.136659280431156F);
        this.Rspikeback2 = new AdvancedModelRenderer(this, 420, 5);
        this.Rspikeback2.setRotationPoint(-2.8F, 0.1F, 7.0F);
        this.Rspikeback2.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Rspikeback2, 0.9105382707654417F, 0.0F, -0.136659280431156F);
        this.Lsidespike5 = new AdvancedModelRenderer(this, 420, 15);
        this.Lsidespike5.setRotationPoint(7.0F, 1.3F, 7.0F);
        this.Lsidespike5.addBox(-2.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Lsidespike5, 0.0F, 0.31869712141416456F, 0.0F);
        this.Rhip = new AdvancedModelRenderer(this, 260, 220);
        this.Rhip.setRotationPoint(-9.0F, -1.0F, 5.0F);
        this.Rhip.addBox(0.0F, 0.0F, 0.0F, 6, 11, 7, 0.0F);
        this.setRotateAngle(Rhip, -0.22759093446006054F, 0.0F, 0.18203784098300857F);
        this.Rspikeback7 = new AdvancedModelRenderer(this, 345, 5);
        this.Rspikeback7.setRotationPoint(-0.4F, 0.9F, 13.5F);
        this.Rspikeback7.addBox(-2.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Rspikeback7, 0.7285004297824331F, 0.0F, -0.136659280431156F);
        this.Bodyfront = new AdvancedModelRenderer(this, 5, 220);
        this.Bodyfront.setRotationPoint(0.0F, -1.0F, -19.0F);
        this.Bodyfront.addBox(-8.0F, 0.0F, 0.0F, 16, 16, 18, 0.0F);
        this.setRotateAngle(Bodyfront, 0.27314402793711257F, 0.0F, 0.0F);
        this.Rsidespike4 = new AdvancedModelRenderer(this, 420, 25);
        this.Rsidespike4.setRotationPoint(-7.0F, 2.5F, 1.0F);
        this.Rsidespike4.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Rsidespike4, 0.22759093446006054F, -0.31869712141416456F, 0.0F);
        this.Rspikeback6 = new AdvancedModelRenderer(this, 360, 5);
        this.Rspikeback6.setRotationPoint(-1.7F, 0.7F, 9.0F);
        this.Rspikeback6.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Rspikeback6, 0.7740535232594852F, 0.0F, -0.136659280431156F);
        this.RFtoetop2 = new AdvancedModelRenderer(this, 480, 5);
        this.RFtoetop2.setRotationPoint(0.01F, -2.7F, 1.36F);
        this.RFtoetop2.addBox(-0.5F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(RFtoetop2, 0.4553564018453205F, 0.0F, 0.0F);
        this.Rsidespike6 = new AdvancedModelRenderer(this, 420, 25);
        this.Rsidespike6.setRotationPoint(-7.0F, 1.7F, 12.7F);
        this.Rsidespike6.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Rsidespike6, -0.045553093477052F, -0.27314402793711257F, 0.0F);
        this.Neck2 = new AdvancedModelRenderer(this, 85, 210);
        this.Neck2.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.Neck2.addBox(-3.0F, 0.0F, -5.0F, 6, 8, 5, 0.0F);
        this.setRotateAngle(Neck2, -0.136659280431156F, 0.0F, 0.0F);
        this.RFtoetop1 = new AdvancedModelRenderer(this, 480, 5);
        this.RFtoetop1.setRotationPoint(0.01F, -2.7F, 1.36F);
        this.RFtoetop1.addBox(0.0F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(RFtoetop1, 0.4553564018453205F, 0.0F, 0.0F);
        this.RFleg = new AdvancedModelRenderer(this, 200, 190);
        this.RFleg.setRotationPoint(2.7F, 6.7F, 3.3F);
        this.RFleg.addBox(-2.5F, 0.0F, 0.0F, 5, 11, 5, 0.0F);
        this.setRotateAngle(RFleg, -0.7740535232594852F, 0.0F, -0.136659280431156F);
        this.Lspikeback4 = new AdvancedModelRenderer(this, 390, 5);
        this.Lspikeback4.setRotationPoint(2.1F, 0.5F, -0.5F);
        this.Lspikeback4.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Lspikeback4, 0.7740535232594852F, 0.0F, 0.136659280431156F);
        this.Rshoulder = new AdvancedModelRenderer(this, 200, 220);
        this.Rshoulder.setRotationPoint(-10.0F, 3.5F, -15.0F);
        this.Rshoulder.addBox(0.0F, 0.0F, 0.0F, 6, 11, 7, 0.0F);
        this.setRotateAngle(Rshoulder, 0.40980330836826856F, 0.0F, 0.136659280431156F);
        this.Lsidespike1 = new AdvancedModelRenderer(this, 420, 15);
        this.Lsidespike1.setRotationPoint(8.0F, 2.5F, 1.0F);
        this.Lsidespike1.addBox(-2.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Lsidespike1, 0.22759093446006054F, 0.31869712141416456F, 0.0F);
        this.Lspikeback5 = new AdvancedModelRenderer(this, 375, 5);
        this.Lspikeback5.setRotationPoint(1.9F, 0.5F, 4.5F);
        this.Lspikeback5.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Lspikeback5, 0.7740535232594852F, 0.0F, 0.136659280431156F);
        this.Neck3 = new AdvancedModelRenderer(this, 85, 190);
        this.Neck3.setRotationPoint(0.0F, 1.2F, -3.0F);
        this.Neck3.addBox(-2.0F, 0.0F, -5.0F, 4, 6, 5, 0.0F);
        this.setRotateAngle(Neck3, 0.045553093477052F, 0.0F, 0.0F);
        this.LBtoemid2 = new AdvancedModelRenderer(this, 460, 45);
        this.LBtoemid2.setRotationPoint(-0.01F, -1.4F, -1.35F);
        this.LBtoemid2.addBox(0.0F, 0.0F, -3.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(LBtoemid2, 0.4553564018453205F, 0.0F, 0.0F);
        this.RBtoemid4 = new AdvancedModelRenderer(this, 460, 45);
        this.RBtoemid4.setRotationPoint(0.01F, -0.4F, -1.85F);
        this.RBtoemid4.addBox(-1.0F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(RBtoemid4, 0.4553564018453205F, 0.0F, 0.0F);
        this.Tail4 = new AdvancedModelRenderer(this, 5, 60);
        this.Tail4.setRotationPoint(0.0F, 1.0F, 14.0F);
        this.Tail4.addBox(-1.5F, 0.0F, 0.0F, 3, 5, 19, 0.0F);
        this.setRotateAngle(Tail4, 0.091106186954104F, 0.0F, 0.0F);
        this.LFfoot = new AdvancedModelRenderer(this, 200, 170);
        this.LFfoot.mirror = true;
        this.LFfoot.setRotationPoint(0.01F, 11.0F, 0.0F);
        this.LFfoot.addBox(-2.5F, 0.0F, 0.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(LFfoot, 0.36425021489121656F, 0.0F, 0.0F);
        this.LBleg = new AdvancedModelRenderer(this, 260, 190);
        this.LBleg.mirror = true;
        this.LBleg.setRotationPoint(-3.4F, 10.5F, 0.0F);
        this.LBleg.addBox(-2.5F, 0.0F, 0.0F, 5, 11, 5, 0.0F);
        this.setRotateAngle(LBleg, 0.6829473363053812F, 0.0F, 0.18203784098300857F);
        this.RBfoot = new AdvancedModelRenderer(this, 260, 170);
        this.RBfoot.setRotationPoint(-0.01F, 8.8F, 0.5F);
        this.RBfoot.addBox(-2.5F, 0.0F, 0.0F, 5, 7, 5, 0.0F);
        this.setRotateAngle(RBfoot, -0.4553564018453205F, 0.0F, 0.011868238913561441F);
        this.RBtoemid3 = new AdvancedModelRenderer(this, 460, 45);
        this.RBtoemid3.setRotationPoint(0.01F, -0.4F, -1.85F);
        this.RBtoemid3.addBox(-1.0F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(RBtoemid3, 0.4553564018453205F, 0.0F, 0.0F);
        this.Lhip = new AdvancedModelRenderer(this, 260, 220);
        this.Lhip.mirror = true;
        this.Lhip.setRotationPoint(9.0F, -1.0F, 5.0F);
        this.Lhip.addBox(-6.0F, 0.0F, 0.0F, 6, 11, 7, 0.0F);
        this.setRotateAngle(Lhip, -0.22759093446006054F, 0.0F, -0.18203784098300857F);
        this.Lupperfacehorn = new AdvancedModelRenderer(this, 405, 15);
        this.Lupperfacehorn.setRotationPoint(0.6F, 0.0F, -0.3F);
        this.Lupperfacehorn.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Lupperfacehorn, 0.27314402793711257F, 0.36425021489121656F, 0.091106186954104F);
        this.RFtoesole4 = new AdvancedModelRenderer(this, 460, 5);
        this.RFtoesole4.setRotationPoint(0.8F, 4.01F, 1.7F);
        this.RFtoesole4.addBox(-0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(RFtoesole4, 0.0F, -0.18203784098300857F, 0.0F);
        this.LBtoesole4 = new AdvancedModelRenderer(this, 460, 30);
        this.LBtoesole4.setRotationPoint(-2.0F, 5.01F, 2.0F);
        this.LBtoesole4.addBox(0.0F, 0.0F, -5.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(LBtoesole4, 0.0F, 0.31869712141416456F, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 5, 120);
        this.Tail2.setRotationPoint(0.0F, 0.2F, 12.0F);
        this.Tail2.addBox(-3.5F, 0.0F, 0.0F, 7, 9, 15, 0.0F);
        this.setRotateAngle(Tail2, 0.091106186954104F, 0.0F, 0.0F);
        this.LBtoetop1 = new AdvancedModelRenderer(this, 460, 60);
        this.LBtoetop1.setRotationPoint(0.0F, -2.1F, 2.1F);
        this.LBtoetop1.addBox(-1.0F, 0.0F, -4.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(LBtoetop1, 0.6373942428283291F, 0.0F, 0.0F);
        this.LFtoetop1 = new AdvancedModelRenderer(this, 480, 5);
        this.LFtoetop1.setRotationPoint(-0.01F, -2.7F, 1.36F);
        this.LFtoetop1.addBox(-1.0F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(LFtoetop1, 0.4553564018453205F, 0.0F, 0.0F);
        this.Rspikeback3 = new AdvancedModelRenderer(this, 405, 5);
        this.Rspikeback3.setRotationPoint(-2.2F, 0.5F, 12.0F);
        this.Rspikeback3.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Rspikeback3, 0.8651597102135892F, 0.0F, -0.136659280431156F);
        this.LFtoesole3 = new AdvancedModelRenderer(this, 460, 5);
        this.LFtoesole3.setRotationPoint(0.0F, 4.01F, 1.5F);
        this.LFtoesole3.addBox(-0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F);
        this.LBtoemid4 = new AdvancedModelRenderer(this, 460, 45);
        this.LBtoemid4.setRotationPoint(0.99F, -0.4F, -1.85F);
        this.LBtoemid4.addBox(-1.0F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(LBtoemid4, 0.4553564018453205F, 0.0F, 0.0F);
        this.Lspikeback3 = new AdvancedModelRenderer(this, 405, 5);
        this.Lspikeback3.setRotationPoint(2.3F, 0.5F, 12.0F);
        this.Lspikeback3.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Lspikeback3, 0.8651597102135892F, 0.0F, 0.136659280431156F);
        this.RFfoot = new AdvancedModelRenderer(this, 200, 170);
        this.RFfoot.setRotationPoint(-0.01F, 11.0F, 0.0F);
        this.RFfoot.addBox(-2.5F, 0.0F, 0.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(RFfoot, 0.36425021489121656F, 0.0F, 0.0F);
        this.RFtoetop4 = new AdvancedModelRenderer(this, 480, 5);
        this.RFtoetop4.setRotationPoint(0.01F, -2.7F, 1.36F);
        this.RFtoetop4.addBox(-0.5F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(RFtoetop4, 0.4553564018453205F, 0.0F, 0.0F);
        this.LFtoesole4 = new AdvancedModelRenderer(this, 460, 5);
        this.LFtoesole4.setRotationPoint(-0.8F, 4.01F, 1.7F);
        this.LFtoesole4.addBox(-0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(LFtoesole4, 0.0F, 0.18203784098300857F, 0.0F);
        this.RFtoesole2 = new AdvancedModelRenderer(this, 460, 5);
        this.RFtoesole2.setRotationPoint(-0.7F, 4.01F, 1.8F);
        this.RFtoesole2.addBox(-0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(RFtoesole2, 0.0F, 0.18203784098300857F, 0.0F);
        this.Rspikeback1 = new AdvancedModelRenderer(this, 435, 5);
        this.Rspikeback1.setRotationPoint(-2.7F, 0.1F, 1.0F);
        this.Rspikeback1.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(Rspikeback1, 0.8196066167365371F, -0.091106186954104F, -0.136659280431156F);
        this.Rupperfacehorn = new AdvancedModelRenderer(this, 405, 25);
        this.Rupperfacehorn.setRotationPoint(-0.6F, 0.0F, -0.3F);
        this.Rupperfacehorn.addBox(-2.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Rupperfacehorn, 0.27314402793711257F, -0.36425021489121656F, -0.091106186954104F);
        this.LBtoesole2 = new AdvancedModelRenderer(this, 460, 30);
        this.LBtoesole2.setRotationPoint(0.0F, 5.0F, 0.5F);
        this.LBtoesole2.addBox(0.0F, 0.0F, -4.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(LBtoesole2, 0.0F, -0.18203784098300857F, 0.0F);
        this.TailclubL = new AdvancedModelRenderer(this, 40, 45);
        this.TailclubL.setRotationPoint(0.3F, -0.5F, 10.0F);
        this.TailclubL.addBox(0.0F, 0.0F, 0.0F, 5, 6, 8, 0.0F);
        this.LFtoesole5 = new AdvancedModelRenderer(this, 460, 5);
        this.LFtoesole5.setRotationPoint(-0.8F, 4.01F, 2.3F);
        this.LFtoesole5.addBox(-1.0F, 0.0F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(LFtoesole5, 0.0F, 0.36425021489121656F, 0.0F);
        this.Rlowerfacehorn = new AdvancedModelRenderer(this, 395, 25);
        this.Rlowerfacehorn.setRotationPoint(-2.5F, 3.3F, -2.0F);
        this.Rlowerfacehorn.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(Rlowerfacehorn, 0.22759093446006054F, -0.091106186954104F, 0.31869712141416456F);
        this.RBtoetop3 = new AdvancedModelRenderer(this, 460, 60);
        this.RBtoetop3.setRotationPoint(-1.0F, -3.1F, 2.1F);
        this.RBtoetop3.addBox(0.0F, 0.0F, -4.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(RBtoetop3, 0.6373942428283291F, 0.0F, 0.0F);
        this.LFtoesole1 = new AdvancedModelRenderer(this, 460, 5);
        this.LFtoesole1.setRotationPoint(1.7F, 4.01F, 2.5F);
        this.LFtoesole1.addBox(-1.0F, 0.0F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(LFtoesole1, 0.0F, -0.36425021489121656F, 0.0F);
        this.RBtoetop4 = new AdvancedModelRenderer(this, 460, 60);
        this.RBtoetop4.setRotationPoint(0.0F, -3.1F, 2.1F);
        this.RBtoetop4.addBox(-1.0F, 0.0F, -4.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(RBtoetop4, 0.6373942428283291F, 0.0F, 0.0F);
        this.LFtoetop5 = new AdvancedModelRenderer(this, 480, 5);
        this.LFtoetop5.setRotationPoint(-0.01F, -2.7F, 1.36F);
        this.LFtoetop5.addBox(-1.0F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(LFtoetop5, 0.4553564018453205F, 0.0F, 0.0F);
        this.RFtoesole5 = new AdvancedModelRenderer(this, 460, 5);
        this.RFtoesole5.setRotationPoint(0.8F, 4.01F, 2.3F);
        this.RFtoesole5.addBox(0.0F, 0.0F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(RFtoesole5, 0.0F, -0.36425021489121656F, 0.0F);
        this.Rsidespike2 = new AdvancedModelRenderer(this, 420, 25);
        this.Rsidespike2.setRotationPoint(-8.0F, 2.0F, 6.5F);
        this.Rsidespike2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Rsidespike2, 0.091106186954104F, -0.27314402793711257F, 0.0F);
        this.LBtoesole3 = new AdvancedModelRenderer(this, 460, 30);
        this.LBtoesole3.setRotationPoint(-0.5F, 5.01F, 1.5F);
        this.LBtoesole3.addBox(-1.0F, 0.0F, -5.0F, 1, 2, 5, 0.0F);
        this.LBfoot = new AdvancedModelRenderer(this, 260, 170);
        this.LBfoot.mirror = true;
        this.LBfoot.setRotationPoint(0.01F, 8.8F, 0.5F);
        this.LBfoot.addBox(-2.5F, 0.0F, 0.0F, 5, 7, 5, 0.0F);
        this.setRotateAngle(LBfoot, -0.4553564018453205F, 0.0F, 0.0F);
        this.LBtoemid3 = new AdvancedModelRenderer(this, 460, 45);
        this.LBtoemid3.setRotationPoint(-0.01F, -0.4F, -1.85F);
        this.LBtoemid3.addBox(-1.0F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(LBtoemid3, 0.4553564018453205F, 0.0F, 0.0F);
        this.Tail3 = new AdvancedModelRenderer(this, 5, 90);
        this.Tail3.setRotationPoint(0.0F, 0.5F, 13.0F);
        this.Tail3.addBox(-2.5F, 0.0F, 0.0F, 5, 7, 16, 0.0F);
        this.setRotateAngle(Tail3, 0.091106186954104F, -0.015009831567151233F, 0.0F);
        this.Lsidespike4 = new AdvancedModelRenderer(this, 420, 15);
        this.Lsidespike4.setRotationPoint(7.0F, 2.4F, 1.0F);
        this.Lsidespike4.addBox(-2.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Lsidespike4, 0.22759093446006054F, 0.31869712141416456F, 0.0F);
        this.LBtoetop4 = new AdvancedModelRenderer(this, 460, 60);
        this.LBtoetop4.setRotationPoint(0.0F, -3.1F, 2.1F);
        this.LBtoetop4.addBox(-1.0F, 0.0F, -4.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(LBtoetop4, 0.6373942428283291F, 0.0F, 0.0F);
        this.Bodyback = new AdvancedModelRenderer(this, 5, 180);
        this.Bodyback.setRotationPoint(0.0F, 0.1F, 18.0F);
        this.Bodyback.addBox(-7.0F, 0.0F, 0.0F, 14, 15, 19, 0.0F);
        this.setRotateAngle(Bodyback, -0.36425021489121656F, 0.0F, 0.0F);
        this.Neck1 = new AdvancedModelRenderer(this, 85, 235);
        this.Neck1.setRotationPoint(0.0F, 1.5F, 3.0F);
        this.Neck1.addBox(-4.5F, 0.0F, -6.0F, 9, 11, 6, 0.0F);
        this.setRotateAngle(Neck1, -0.136659280431156F, 0.0F, 0.0F);
        this.Headsnout = new AdvancedModelRenderer(this, 80, 150);
        this.Headsnout.setRotationPoint(0.0F, 0.1F, -4.5F);
        this.Headsnout.addBox(-2.0F, 0.0F, -6.0F, 4, 4, 6, 0.0F);
        this.setRotateAngle(Headsnout, 0.045553093477052F, 0.0F, 0.0F);
        this.RBtoesole3 = new AdvancedModelRenderer(this, 460, 30);
        this.RBtoesole3.setRotationPoint(1.2F, 5.01F, 1.5F);
        this.RBtoesole3.addBox(-1.0F, 0.0F, -5.0F, 1, 2, 5, 0.0F);
        this.RFtoesole1 = new AdvancedModelRenderer(this, 460, 5);
        this.RFtoesole1.setRotationPoint(-1.7F, 4.01F, 2.5F);
        this.RFtoesole1.addBox(0.0F, 0.0F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(RFtoesole1, 0.0F, 0.36425021489121656F, 0.0F);
        this.LBtoetop2 = new AdvancedModelRenderer(this, 460, 60);
        this.LBtoetop2.setRotationPoint(0.0F, -2.1F, 2.1F);
        this.LBtoetop2.addBox(0.0F, 0.0F, -4.0F, 1, 2, 4, 0.0F);
        this.setRotateAngle(LBtoetop2, 0.6373942428283291F, 0.0F, 0.0F);
        this.Lspikeback6 = new AdvancedModelRenderer(this, 360, 5);
        this.Lspikeback6.setRotationPoint(1.7F, 0.7F, 9.0F);
        this.Lspikeback6.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Lspikeback6, 0.7740535232594852F, 0.0F, 0.136659280431156F);
        this.Rspikeback4 = new AdvancedModelRenderer(this, 390, 5);
        this.Rspikeback4.setRotationPoint(-2.1F, 0.5F, -0.5F);
        this.Rspikeback4.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Rspikeback4, 0.7740535232594852F, 0.0F, -0.136659280431156F);
        this.LBtoemid1 = new AdvancedModelRenderer(this, 460, 45);
        this.LBtoemid1.setRotationPoint(-0.01F, -1.4F, -2.35F);
        this.LBtoemid1.addBox(-1.0F, 0.0F, -3.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(LBtoemid1, 0.4553564018453205F, 0.0F, 0.0F);
        this.Lsidespike2 = new AdvancedModelRenderer(this, 420, 15);
        this.Lsidespike2.setRotationPoint(8.0F, 2.0F, 6.5F);
        this.Lsidespike2.addBox(-2.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Lsidespike2, 0.091106186954104F, 0.27314402793711257F, 0.0F);
        this.RBtoemid1 = new AdvancedModelRenderer(this, 460, 45);
        this.RBtoemid1.setRotationPoint(1.01F, -0.4F, -1.85F);
        this.RBtoemid1.addBox(-1.0F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(RBtoemid1, 0.4553564018453205F, 0.0F, 0.0F);
        this.TailclubR = new AdvancedModelRenderer(this, 5, 45);
        this.TailclubR.setRotationPoint(-0.3F, -0.5F, 10.0F);
        this.TailclubR.addBox(-5.0F, 0.0F, 0.0F, 5, 6, 8, 0.0F);
        this.Lowerjaw = new AdvancedModelRenderer(this, 85, 135);
        this.Lowerjaw.setRotationPoint(0.0F, 3.9F, -4.0F);
        this.Lowerjaw.addBox(-1.5F, 0.0F, -6.0F, 3, 2, 6, 0.0F);
        this.setRotateAngle(Lowerjaw, -0.045553093477052F, 0.0F, 0.0F);
        this.RBtoemid2 = new AdvancedModelRenderer(this, 460, 45);
        this.RBtoemid2.setRotationPoint(0.01F, -1.4F, -1.35F);
        this.RBtoemid2.addBox(-1.0F, 0.0F, -3.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(RBtoemid2, 0.4553564018453205F, 0.0F, 0.0F);
        this.LFtoetop3 = new AdvancedModelRenderer(this, 480, 5);
        this.LFtoetop3.setRotationPoint(-0.01F, -2.7F, 1.36F);
        this.LFtoetop3.addBox(-0.5F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(LFtoetop3, 0.4553564018453205F, 0.0F, 0.0F);
        this.RFtoetop5 = new AdvancedModelRenderer(this, 480, 5);
        this.RFtoetop5.setRotationPoint(0.01F, -2.7F, 1.36F);
        this.RFtoetop5.addBox(0.0F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(RFtoetop5, 0.4553564018453205F, 0.0F, 0.0F);
        this.RBleg = new AdvancedModelRenderer(this, 260, 190);
        this.RBleg.setRotationPoint(3.4F, 10.5F, 0.0F);
        this.RBleg.addBox(-2.5F, 0.0F, 0.0F, 5, 11, 5, 0.0F);
        this.setRotateAngle(RBleg, 0.6829473363053812F, 0.0F, -0.18203784098300857F);
        this.Lsidespike6 = new AdvancedModelRenderer(this, 420, 15);
        this.Lsidespike6.setRotationPoint(7.0F, 1.7F, 12.7F);
        this.Lsidespike6.addBox(-2.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Lsidespike6, -0.045553093477052F, 0.27314402793711257F, 0.0F);
        this.LFtoetop4 = new AdvancedModelRenderer(this, 480, 5);
        this.LFtoetop4.setRotationPoint(-0.01F, -2.7F, 1.36F);
        this.LFtoetop4.addBox(-0.5F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(LFtoetop4, 0.4553564018453205F, 0.0F, 0.0F);
        this.LBtoesole1 = new AdvancedModelRenderer(this, 460, 30);
        this.LBtoesole1.setRotationPoint(2.0F, 5.01F, 2.0F);
        this.LBtoesole1.addBox(-1.0F, 0.0F, -5.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(LBtoesole1, 0.0F, -0.31869712141416456F, 0.0F);
        this.RBtoetop1 = new AdvancedModelRenderer(this, 460, 60);
        this.RBtoetop1.setRotationPoint(0.0F, -3.1F, 2.1F);
        this.RBtoetop1.addBox(-1.0F, 0.0F, -4.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(RBtoetop1, 0.6373942428283291F, 0.0F, 0.0F);
        this.Head1 = new AdvancedModelRenderer(this, 85, 170);
        this.Head1.setRotationPoint(0.0F, -0.2F, -4.0F);
        this.Head1.addBox(-2.5F, 0.0F, -5.0F, 5, 6, 5, 0.0F);
        this.setRotateAngle(Head1, 0.18203784098300857F, 0.0F, 0.0F);
        this.Llowerfacehorn = new AdvancedModelRenderer(this, 395, 15);
        this.Llowerfacehorn.setRotationPoint(2.5F, 3.3F, -2.0F);
        this.Llowerfacehorn.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(Llowerfacehorn, 0.22759093446006054F, -0.091106186954104F, -0.31869712141416456F);
        this.Rsidespike3 = new AdvancedModelRenderer(this, 420, 25);
        this.Rsidespike3.setRotationPoint(-8.0F, 1.8F, 12.0F);
        this.Rsidespike3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Rsidespike3, -0.045553093477052F, -0.31869712141416456F, 0.0F);
        this.LFleg = new AdvancedModelRenderer(this, 200, 190);
        this.LFleg.mirror = true;
        this.LFleg.setRotationPoint(-2.7F, 6.7F, 3.3F);
        this.LFleg.addBox(-2.5F, 0.0F, 0.0F, 5, 11, 5, 0.0F);
        this.setRotateAngle(LFleg, -0.7740535232594852F, 0.0F, 0.136659280431156F);
        this.RBfoot.addChild(this.RBtoesole1);
        this.Bodyfront.addChild(this.Lspikeback1);
        this.Bodyback.addChild(this.Rsidespike5);
        this.Bodyback.addChild(this.Lspikeback7);
        this.Bodyback.addChild(this.Tail1);
        this.LBtoemid3.addChild(this.LBtoetop3);
        this.RBtoemid2.addChild(this.Rbtoemid2);
        this.RFtoesole3.addChild(this.RFtoetop3);
        this.RBfoot.addChild(this.RBtoesole2);
        this.LFtoesole2.addChild(this.LFtoetop2);
        this.Bodyfront.addChild(this.Lsidespike3);
        this.Bodyfront.addChild(this.Rsidespike1);
        this.RFfoot.addChild(this.RFtoesole3);
        this.Bodyfront.addChild(this.Lspikeback2);
        this.RBfoot.addChild(this.RBtoesole4);
        this.LFfoot.addChild(this.LFtoesole2);
        this.Bodyback.addChild(this.Rspikeback5);
        this.Bodyfront.addChild(this.Rspikeback2);
        this.Bodyback.addChild(this.Lsidespike5);
        this.Bodyback.addChild(this.Rspikeback7);
        this.Bodyback.addChild(this.Rsidespike4);
        this.Bodyback.addChild(this.Rspikeback6);
        this.RFtoesole2.addChild(this.RFtoetop2);
        this.Bodyback.addChild(this.Rsidespike6);
        this.Neck1.addChild(this.Neck2);
        this.RFtoesole1.addChild(this.RFtoetop1);
        this.Rshoulder.addChild(this.RFleg);
        this.Bodyback.addChild(this.Lspikeback4);
        this.Bodyfront.addChild(this.Lsidespike1);
        this.Bodyback.addChild(this.Lspikeback5);
        this.Neck2.addChild(this.Neck3);
        this.LBtoesole2.addChild(this.LBtoemid2);
        this.RBtoesole4.addChild(this.RBtoemid4);
        this.Tail3.addChild(this.Tail4);
        this.LFleg.addChild(this.LFfoot);
        this.Lhip.addChild(this.LBleg);
        this.RBleg.addChild(this.RBfoot);
        this.RBtoesole3.addChild(this.RBtoemid3);
        this.Head1.addChild(this.Lupperfacehorn);
        this.RFfoot.addChild(this.RFtoesole4);
        this.LBfoot.addChild(this.LBtoesole4);
        this.Tail1.addChild(this.Tail2);
        this.LBtoemid1.addChild(this.LBtoetop1);
        this.LFtoesole1.addChild(this.LFtoetop1);
        this.Bodyfront.addChild(this.Rspikeback3);
        this.LFfoot.addChild(this.LFtoesole3);
        this.LBtoesole4.addChild(this.LBtoemid4);
        this.Bodyfront.addChild(this.Lspikeback3);
        this.RFleg.addChild(this.RFfoot);
        this.RFtoesole4.addChild(this.RFtoetop4);
        this.LFfoot.addChild(this.LFtoesole4);
        this.RFfoot.addChild(this.RFtoesole2);
        this.Bodyfront.addChild(this.Rspikeback1);
        this.Head1.addChild(this.Rupperfacehorn);
        this.LBfoot.addChild(this.LBtoesole2);
        this.Tail4.addChild(this.TailclubL);
        this.LFfoot.addChild(this.LFtoesole5);
        this.Head1.addChild(this.Rlowerfacehorn);
        this.RBtoemid3.addChild(this.RBtoetop3);
        this.LFfoot.addChild(this.LFtoesole1);
        this.RBtoemid4.addChild(this.RBtoetop4);
        this.LFtoesole5.addChild(this.LFtoetop5);
        this.RFfoot.addChild(this.RFtoesole5);
        this.Bodyfront.addChild(this.Rsidespike2);
        this.LBfoot.addChild(this.LBtoesole3);
        this.LBleg.addChild(this.LBfoot);
        this.LBtoesole3.addChild(this.LBtoemid3);
        this.Tail2.addChild(this.Tail3);
        this.Bodyback.addChild(this.Lsidespike4);
        this.LBtoemid4.addChild(this.LBtoetop4);
        this.Bodyfront.addChild(this.Bodyback);
        this.Bodyfront.addChild(this.Neck1);
        this.Head1.addChild(this.Headsnout);
        this.RBfoot.addChild(this.RBtoesole3);
        this.RFfoot.addChild(this.RFtoesole1);
        this.LBtoemid2.addChild(this.LBtoetop2);
        this.Bodyback.addChild(this.Lspikeback6);
        this.Bodyback.addChild(this.Rspikeback4);
        this.LBtoesole1.addChild(this.LBtoemid1);
        this.Bodyfront.addChild(this.Lsidespike2);
        this.RBtoesole1.addChild(this.RBtoemid1);
        this.Tail4.addChild(this.TailclubR);
        this.Head1.addChild(this.Lowerjaw);
        this.RBtoesole2.addChild(this.RBtoemid2);
        this.LFtoesole3.addChild(this.LFtoetop3);
        this.RFtoesole5.addChild(this.RFtoetop5);
        this.Rhip.addChild(this.RBleg);
        this.Bodyback.addChild(this.Lsidespike6);
        this.LFtoesole4.addChild(this.LFtoetop4);
        this.LBfoot.addChild(this.LBtoesole1);
        this.RBtoemid1.addChild(this.RBtoetop1);
        this.Neck3.addChild(this.Head1);
        this.Head1.addChild(this.Llowerfacehorn);
        this.Bodyfront.addChild(this.Rsidespike3);
        this.Lshoulder.addChild(this.LFleg);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Lshoulder.render(f5);
        this.Rhip.render(f5);
        this.Bodyfront.render(f5);
        this.Rshoulder.render(f5);
        this.Lhip.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }
}
