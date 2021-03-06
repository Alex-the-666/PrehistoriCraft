package net.andrewplayz.prehistoricraft.client.model.entities.pachyrhinosauruslakustai;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.entity.Entity;

public class PachyrhinosaurusLakustaiMale extends AdvancedModelBase {
    public AdvancedModelRenderer Frontbody;
    public AdvancedModelRenderer Shoulderleft;
    public AdvancedModelRenderer Shoulderright;
    public AdvancedModelRenderer Thighleft;
    public AdvancedModelRenderer Thighright;
    public AdvancedModelRenderer Bellyfront;
    public AdvancedModelRenderer Backbody;
    public AdvancedModelRenderer Neckbase;
    public AdvancedModelRenderer Bellyback;
    public AdvancedModelRenderer Tailfront;
    public AdvancedModelRenderer Tailmidfront;
    public AdvancedModelRenderer Tailmidback;
    public AdvancedModelRenderer Tailend;
    public AdvancedModelRenderer Neck2;
    public AdvancedModelRenderer Head1;
    public AdvancedModelRenderer Head2;
    public AdvancedModelRenderer Frill;
    public AdvancedModelRenderer Sidefacehornright;
    public AdvancedModelRenderer Sidefacehornright_1;
    public AdvancedModelRenderer Snout;
    public AdvancedModelRenderer Lowerjaw;
    public AdvancedModelRenderer Nasalbump;
    public AdvancedModelRenderer Frillleft;
    public AdvancedModelRenderer Frillright;
    public AdvancedModelRenderer Horncenter;
    public AdvancedModelRenderer Hornfront;
    public AdvancedModelRenderer Hornback;
    public AdvancedModelRenderer Frillmiddlehornleft;
    public AdvancedModelRenderer Frillmiddlehornright;
    public AdvancedModelRenderer shape19;
    public AdvancedModelRenderer Leftfrillsidehorn;
    public AdvancedModelRenderer shape20;
    public AdvancedModelRenderer Rightfrillsidehorn;
    public AdvancedModelRenderer Frontlegleft;
    public AdvancedModelRenderer Frontfootleft;
    public AdvancedModelRenderer Fronttoerightleft;
    public AdvancedModelRenderer Fronttoemiddleleft;
    public AdvancedModelRenderer Fronttoeleftleft;
    public AdvancedModelRenderer Frontsidetoe1left;
    public AdvancedModelRenderer Frontsidetoe2left;
    public AdvancedModelRenderer Frontlegright;
    public AdvancedModelRenderer Frontfootright;
    public AdvancedModelRenderer Fronttoeleftright;
    public AdvancedModelRenderer Fronttoemiddleright;
    public AdvancedModelRenderer Fronttoerightright;
    public AdvancedModelRenderer Frontsidetoe1right;
    public AdvancedModelRenderer Frontsidetoe2right;
    public AdvancedModelRenderer Backlegleft;
    public AdvancedModelRenderer Backfootleft;
    public AdvancedModelRenderer Backtoemiddleleftleft;
    public AdvancedModelRenderer Backtoeleftleft;
    public AdvancedModelRenderer Backtoemiddlerightleft;
    public AdvancedModelRenderer Backtoerightleft;
    public AdvancedModelRenderer Backtoesideleft;
    public AdvancedModelRenderer Backlegright;
    public AdvancedModelRenderer Backfootright;
    public AdvancedModelRenderer Backtoemiddlerightright;
    public AdvancedModelRenderer Backtoerightright;
    public AdvancedModelRenderer Backtoemiddleleftright;
    public AdvancedModelRenderer Backtoeleftright;
    public AdvancedModelRenderer Backtoesideright;

    public PachyrhinosaurusLakustaiMale() {
        this.textureWidth = 512;
        this.textureHeight = 256;
        this.Backtoesideleft = new AdvancedModelRenderer(this, 430, 160);
        this.Backtoesideleft.setRotationPoint(-3.0F, 4.0F, 3.0F);
        this.Backtoesideleft.addBox(0.0F, 0.0F, 0.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(Backtoesideleft, -0.136659280431156F, 0.0F, 0.27314402793711257F);
        this.Leftfrillsidehorn = new AdvancedModelRenderer(this, 240, 210);
        this.Leftfrillsidehorn.setRotationPoint(0.0F, 0.1F, 15.0F);
        this.Leftfrillsidehorn.addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(Leftfrillsidehorn, 0.0F, 0.6829473363053812F, 0.0F);
        this.Frillmiddlehornleft = new AdvancedModelRenderer(this, 240, 200);
        this.Frillmiddlehornleft.setRotationPoint(1.5F, 0.0F, 15.0F);
        this.Frillmiddlehornleft.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Frillmiddlehornleft, -0.091106186954104F, -0.31869712141416456F, 0.0F);
        this.Neck2 = new AdvancedModelRenderer(this, 175, 190);
        this.Neck2.setRotationPoint(0.0F, 1.0F, -7.0F);
        this.Neck2.addBox(-4.0F, 0.0F, -7.0F, 8, 12, 7, 0.0F);
        this.setRotateAngle(Neck2, -0.136659280431156F, 0.0F, 0.0F);
        this.Backtoerightleft = new AdvancedModelRenderer(this, 415, 160);
        this.Backtoerightleft.setRotationPoint(-1.5F, 5.0F, 1.0F);
        this.Backtoerightleft.addBox(-2.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(Backtoerightleft, -1.0471975511965976F, 0.5918411493512771F, 0.0F);
        this.Backtoemiddlerightright = new AdvancedModelRenderer(this, 460, 160);
        this.Backtoemiddlerightright.setRotationPoint(0.3F, 5.0F, 1.0F);
        this.Backtoemiddlerightright.addBox(-2.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(Backtoemiddlerightright, -1.0471975511965976F, 0.27314402793711257F, 0.0F);
        this.Thighright = new AdvancedModelRenderer(this, 460, 220);
        this.Thighright.setRotationPoint(-6.5F, -10.0F, 14.5F);
        this.Thighright.addBox(-7.0F, 0.0F, 0.0F, 7, 18, 11, 0.0F);
        this.setRotateAngle(Thighright, -0.27314402793711257F, 0.0F, 0.0F);
        this.Snout = new AdvancedModelRenderer(this, 175, 110);
        this.Snout.setRotationPoint(0.0F, 0.6F, -5.0F);
        this.Snout.addBox(-3.0F, 0.0F, -9.0F, 6, 7, 9, 0.0F);
        this.setRotateAngle(Snout, -0.091106186954104F, 0.0F, 0.0F);
        this.Frontsidetoe2left = new AdvancedModelRenderer(this, 340, 170);
        this.Frontsidetoe2left.setRotationPoint(-2.5F, 1.5F, 3.5F);
        this.Frontsidetoe2left.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(Frontsidetoe2left, -0.136659280431156F, 0.0F, 0.22759093446006054F);
        this.Frontfootright = new AdvancedModelRenderer(this, 365, 180);
        this.Frontfootright.setRotationPoint(-2.49F, 15.0F, 0.0F);
        this.Frontfootright.addBox(-2.5F, 0.0F, 0.0F, 5, 6, 7, 0.0F);
        this.setRotateAngle(Frontfootright, 0.31869712141416456F, 0.0F, 0.0F);
        this.Backtoemiddleleftleft = new AdvancedModelRenderer(this, 415, 160);
        this.Backtoemiddleleftleft.setRotationPoint(-0.3F, 5.0F, 1.0F);
        this.Backtoemiddleleftleft.addBox(0.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(Backtoemiddleleftleft, -1.0471975511965976F, -0.27314402793711257F, 0.0F);
        this.Fronttoeleftleft = new AdvancedModelRenderer(this, 325, 170);
        this.Fronttoeleftleft.setRotationPoint(0.7F, 2.7F, 1.5F);
        this.Fronttoeleftleft.addBox(0.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(Fronttoeleftleft, -1.0471975511965976F, -0.36425021489121656F, 0.0F);
        this.Lowerjaw = new AdvancedModelRenderer(this, 175, 85);
        this.Lowerjaw.setRotationPoint(0.0F, 7.5F, -2.0F);
        this.Lowerjaw.addBox(-2.0F, 0.0F, -12.0F, 4, 2, 13, 0.0F);
        this.setRotateAngle(Lowerjaw, -0.136659280431156F, 0.0F, 0.0F);
        this.Sidefacehornright = new AdvancedModelRenderer(this, 295, 155);
        this.Sidefacehornright.setRotationPoint(2.5F, 7.0F, -8.0F);
        this.Sidefacehornright.addBox(0.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Sidefacehornright, 0.4553564018453205F, 0.18203784098300857F, -0.27314402793711257F);
        this.Tailmidback = new AdvancedModelRenderer(this, 5, 65);
        this.Tailmidback.setRotationPoint(0.0F, 1.0F, 12.0F);
        this.Tailmidback.addBox(-4.0F, 0.0F, 0.0F, 8, 9, 11, 0.0F);
        this.setRotateAngle(Tailmidback, 0.091106186954104F, 0.0F, 0.0F);
        this.Fronttoerightleft = new AdvancedModelRenderer(this, 325, 170);
        this.Fronttoerightleft.setRotationPoint(-1.5F, 3.0F, 1.0F);
        this.Fronttoerightleft.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(Fronttoerightleft, -1.0471975511965976F, 0.27314402793711257F, 0.0F);
        this.Nasalbump = new AdvancedModelRenderer(this, 225, 230);
        this.Nasalbump.setRotationPoint(0.0F, -3.0F, -8.0F);
        this.Nasalbump.addBox(-2.5F, 0.0F, 0.0F, 5, 5, 9, 0.0F);
        this.setRotateAngle(Nasalbump, -0.136659280431156F, 0.0F, 0.0F);
        this.Frontfootleft = new AdvancedModelRenderer(this, 325, 180);
        this.Frontfootleft.setRotationPoint(2.49F, 14.8F, 0.0F);
        this.Frontfootleft.addBox(-2.5F, 0.0F, 0.0F, 5, 6, 7, 0.0F);
        this.setRotateAngle(Frontfootleft, 0.31869712141416456F, 0.0F, 0.0F);
        this.Hornfront = new AdvancedModelRenderer(this, 225, 200);
        this.Hornfront.setRotationPoint(0.0F, 0.0F, 0.6F);
        this.Hornfront.addBox(-0.5F, -4.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(Hornfront, 0.045553093477052F, 0.0F, 0.0F);
        this.Fronttoeleftright = new AdvancedModelRenderer(this, 365, 170);
        this.Fronttoeleftright.setRotationPoint(1.5F, 3.0F, 1.0F);
        this.Fronttoeleftright.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(Fronttoeleftright, -1.0471975511965976F, -0.27314402793711257F, 0.0F);
        this.shape20 = new AdvancedModelRenderer(this, 280, 170);
        this.shape20.setRotationPoint(2.0F, 0.1F, -2.9F);
        this.shape20.addBox(-6.0F, 0.0F, 0.0F, 6, 1, 7, 0.0F);
        this.setRotateAngle(shape20, 0.0F, -0.5462880558742251F, 0.0F);
        this.Horncenter = new AdvancedModelRenderer(this, 225, 215);
        this.Horncenter.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Horncenter.addBox(-1.0F, -6.0F, 0.0F, 2, 6, 3, 0.0F);
        this.setRotateAngle(Horncenter, -0.18203784098300857F, 0.0F, 0.0F);
        this.Backtoeleftleft = new AdvancedModelRenderer(this, 415, 160);
        this.Backtoeleftleft.setRotationPoint(1.5F, 5.0F, 1.0F);
        this.Backtoeleftleft.addBox(0.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(Backtoeleftleft, -1.0471975511965976F, -0.5918411493512771F, 0.0F);
        this.Shoulderleft = new AdvancedModelRenderer(this, 325, 225);
        this.Shoulderleft.setRotationPoint(8.0F, -3.0F, -12.0F);
        this.Shoulderleft.addBox(0.0F, 0.0F, 0.0F, 6, 15, 10, 0.0F);
        this.setRotateAngle(Shoulderleft, 0.36425021489121656F, 0.0F, 0.0F);
        this.Hornback = new AdvancedModelRenderer(this, 225, 200);
        this.Hornback.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Hornback.addBox(-0.5F, -4.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(Hornback, -0.40980330836826856F, 0.0F, 0.0F);
        this.Backfootright = new AdvancedModelRenderer(this, 460, 170);
        this.Backfootright.setRotationPoint(0.01F, 11.0F, 0.9F);
        this.Backfootright.addBox(-3.0F, 0.0F, 0.0F, 6, 8, 8, 0.0F);
        this.setRotateAngle(Backfootright, -0.5009094953223726F, 0.0F, 0.0F);
        this.Tailfront = new AdvancedModelRenderer(this, 5, 120);
        this.Tailfront.setRotationPoint(0.0F, 0.0F, 25.0F);
        this.Tailfront.addBox(-6.5F, 0.0F, 0.0F, 13, 15, 14, 0.0F);
        this.setRotateAngle(Tailfront, -0.36425021489121656F, 0.0F, 0.0F);
        this.Fronttoemiddleright = new AdvancedModelRenderer(this, 365, 170);
        this.Fronttoemiddleright.setRotationPoint(-0.2F, 3.0F, 1.0F);
        this.Fronttoemiddleright.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(Fronttoemiddleright, -1.0471975511965976F, 0.0F, 0.0F);
        this.Backtoeleftright = new AdvancedModelRenderer(this, 460, 160);
        this.Backtoeleftright.setRotationPoint(1.5F, 5.0F, 1.0F);
        this.Backtoeleftright.addBox(0.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(Backtoeleftright, -1.0471975511965976F, -0.7285004297824331F, 0.0F);
        this.Frillmiddlehornright = new AdvancedModelRenderer(this, 240, 200);
        this.Frillmiddlehornright.setRotationPoint(-1.5F, 0.0F, 15.0F);
        this.Frillmiddlehornright.addBox(-2.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Frillmiddlehornright, -0.091106186954104F, 0.31869712141416456F, 0.0F);
        this.Frillright = new AdvancedModelRenderer(this, 225, 135);
        this.Frillright.setRotationPoint(-3.6F, 0.0F, 0.1F);
        this.Frillright.addBox(-7.0F, 0.0F, 0.0F, 7, 1, 15, 0.0F);
        this.setRotateAngle(Frillright, 0.0F, 0.0F, -0.9105382707654417F);
        this.Frill = new AdvancedModelRenderer(this, 225, 175);
        this.Frill.setRotationPoint(0.0F, 0.6F, -1.0F);
        this.Frill.addBox(-3.5F, 0.0F, 0.0F, 7, 2, 16, 0.0F);
        this.setRotateAngle(Frill, 0.40980330836826856F, 0.0F, 0.0F);
        this.Backtoerightright = new AdvancedModelRenderer(this, 460, 160);
        this.Backtoerightright.setRotationPoint(-1.5F, 5.0F, 1.0F);
        this.Backtoerightright.addBox(-2.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(Backtoerightright, -1.0471975511965976F, 0.7285004297824331F, 0.0F);
        this.Backfootleft = new AdvancedModelRenderer(this, 415, 170);
        this.Backfootleft.setRotationPoint(0.01F, 11.0F, 0.9F);
        this.Backfootleft.addBox(-3.0F, 0.0F, 0.0F, 6, 8, 8, 0.0F);
        this.setRotateAngle(Backfootleft, -0.5009094953223726F, 0.0F, 0.0F);
        this.Rightfrillsidehorn = new AdvancedModelRenderer(this, 240, 210);
        this.Rightfrillsidehorn.setRotationPoint(0.0F, 0.1F, 15.0F);
        this.Rightfrillsidehorn.addBox(-2.0F, 0.0F, 0.1F, 2, 2, 6, 0.0F);
        this.setRotateAngle(Rightfrillsidehorn, 0.0F, -0.6829473363053812F, 0.0F);
        this.Fronttoemiddleleft = new AdvancedModelRenderer(this, 325, 170);
        this.Fronttoemiddleleft.setRotationPoint(0.2F, 3.0F, 1.0F);
        this.Fronttoemiddleleft.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(Fronttoemiddleleft, -1.0471975511965976F, 0.0F, 0.0F);
        this.Backlegleft = new AdvancedModelRenderer(this, 415, 190);
        this.Backlegleft.setRotationPoint(3.5F, 18.0F, 0.1F);
        this.Backlegleft.addBox(-3.0F, 0.0F, 0.0F, 6, 15, 8, 0.0F);
        this.setRotateAngle(Backlegleft, 0.7740535232594852F, 0.0F, 0.0F);
        this.Backlegright = new AdvancedModelRenderer(this, 460, 190);
        this.Backlegright.setRotationPoint(-3.5F, 18.0F, 0.1F);
        this.Backlegright.addBox(-3.0F, 0.0F, 0.0F, 6, 15, 8, 0.0F);
        this.setRotateAngle(Backlegright, 0.7740535232594852F, 0.0F, 0.0F);
        this.Frontbody = new AdvancedModelRenderer(this, 5, 200);
        this.Frontbody.setRotationPoint(0.0F, -8.0F, -17.0F);
        this.Frontbody.addBox(-9.5F, 0.0F, 0.0F, 19, 21, 22, 0.0F);
        this.setRotateAngle(Frontbody, 0.31869712141416456F, 0.0F, 0.0F);
        this.Sidefacehornright_1 = new AdvancedModelRenderer(this, 280, 155);
        this.Sidefacehornright_1.setRotationPoint(-2.5F, 7.0F, -8.0F);
        this.Sidefacehornright_1.addBox(-2.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Sidefacehornright_1, 0.4553564018453205F, -0.18203784098300857F, 0.27314402793711257F);
        this.Backtoesideright = new AdvancedModelRenderer(this, 475, 161);
        this.Backtoesideright.setRotationPoint(3.0F, 4.0F, 3.0F);
        this.Backtoesideright.addBox(-3.0F, 0.0F, 0.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(Backtoesideright, -0.136659280431156F, 0.0F, -0.27314402793711257F);
        this.Thighleft = new AdvancedModelRenderer(this, 415, 220);
        this.Thighleft.setRotationPoint(6.5F, -10.0F, 14.5F);
        this.Thighleft.addBox(0.0F, 0.0F, 0.0F, 7, 18, 11, 0.0F);
        this.setRotateAngle(Thighleft, -0.27314402793711257F, 0.0F, 0.0F);
        this.Head1 = new AdvancedModelRenderer(this, 175, 155);
        this.Head1.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.Head1.addBox(-4.5F, 0.0F, -11.0F, 9, 12, 11, 0.0F);
        this.setRotateAngle(Head1, 0.5462880558742251F, 0.0F, 0.0F);
        this.Backtoemiddlerightleft = new AdvancedModelRenderer(this, 415, 160);
        this.Backtoemiddlerightleft.setRotationPoint(0.0F, 5.0F, 1.0F);
        this.Backtoemiddlerightleft.addBox(-2.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(Backtoemiddlerightleft, -1.0471975511965976F, 0.18203784098300857F, 0.0F);
        this.Head2 = new AdvancedModelRenderer(this, 175, 135);
        this.Head2.setRotationPoint(0.0F, 0.5F, -9.0F);
        this.Head2.addBox(-3.5F, 0.0F, -7.0F, 7, 10, 7, 0.0F);
        this.setRotateAngle(Head2, -0.091106186954104F, 0.0F, 0.0F);
        this.Backbody = new AdvancedModelRenderer(this, 5, 150);
        this.Backbody.setRotationPoint(0.0F, 0.0F, 22.0F);
        this.Backbody.addBox(-8.0F, 0.0F, 0.0F, 16, 19, 25, 0.0F);
        this.setRotateAngle(Backbody, -0.40980330836826856F, 0.0F, 0.0F);
        this.Neckbase = new AdvancedModelRenderer(this, 175, 220);
        this.Neckbase.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.Neckbase.addBox(-6.0F, 0.0F, -9.0F, 12, 16, 9, 0.0F);
        this.setRotateAngle(Neckbase, 0.045553093477052F, 0.0F, 0.0F);
        this.Tailmidfront = new AdvancedModelRenderer(this, 5, 90);
        this.Tailmidfront.setRotationPoint(0.0F, 0.2F, 10.0F);
        this.Tailmidfront.addBox(-5.5F, 0.0F, 0.0F, 11, 11, 14, 0.0F);
        this.setRotateAngle(Tailmidfront, -0.18203784098300857F, 0.0F, 0.0F);
        this.Shoulderright = new AdvancedModelRenderer(this, 365, 225);
        this.Shoulderright.setRotationPoint(-8.0F, -3.0F, -12.0F);
        this.Shoulderright.addBox(-6.0F, 0.0F, 0.0F, 6, 15, 10, 0.0F);
        this.setRotateAngle(Shoulderright, 0.36425021489121656F, 0.0F, 0.0F);
        this.Tailend = new AdvancedModelRenderer(this, 5, 40);
        this.Tailend.setRotationPoint(0.0F, 1.5F, 8.0F);
        this.Tailend.addBox(-2.5F, 0.0F, 0.0F, 5, 7, 12, 0.0F);
        this.setRotateAngle(Tailend, 0.136659280431156F, 0.0F, 0.0F);
        this.Bellyfront = new AdvancedModelRenderer(this, 90, 215);
        this.Bellyfront.setRotationPoint(0.0F, 9.9F, 6.2F);
        this.Bellyfront.addBox(-8.0F, 0.0F, 0.0F, 16, 12, 16, 0.0F);
        this.setRotateAngle(Bellyfront, -0.40980330836826856F, 0.0F, 0.0F);
        this.shape19 = new AdvancedModelRenderer(this, 280, 185);
        this.shape19.setRotationPoint(-2.0F, 0.1F, -2.9F);
        this.shape19.addBox(0.0F, 0.0F, 0.0F, 6, 1, 7, 0.0F);
        this.setRotateAngle(shape19, 0.0F, 0.5462880558742251F, 0.0F);
        this.Frontsidetoe1left = new AdvancedModelRenderer(this, 340, 170);
        this.Frontsidetoe1left.setRotationPoint(-2.5F, 2.0F, 2.0F);
        this.Frontsidetoe1left.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(Frontsidetoe1left, -0.136659280431156F, 0.0F, 0.22759093446006054F);
        this.Frontsidetoe2right = new AdvancedModelRenderer(this, 380, 170);
        this.Frontsidetoe2right.setRotationPoint(2.5F, 1.5F, 3.5F);
        this.Frontsidetoe2right.addBox(-1.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(Frontsidetoe2right, -0.136659280431156F, 0.0F, -0.22759093446006054F);
        this.Backtoemiddleleftright = new AdvancedModelRenderer(this, 460, 160);
        this.Backtoemiddleleftright.setRotationPoint(0.0F, 5.0F, 1.0F);
        this.Backtoemiddleleftright.addBox(0.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(Backtoemiddleleftright, -1.0471975511965976F, -0.27314402793711257F, 0.0F);
        this.Frontlegright = new AdvancedModelRenderer(this, 365, 200);
        this.Frontlegright.setRotationPoint(-0.5F, 10.0F, 4.5F);
        this.Frontlegright.addBox(-5.0F, 0.0F, 0.0F, 5, 15, 7, 0.0F);
        this.setRotateAngle(Frontlegright, -0.6829473363053812F, 0.0F, 0.0F);
        this.Frillleft = new AdvancedModelRenderer(this, 225, 155);
        this.Frillleft.setRotationPoint(3.6F, 0.0F, 0.1F);
        this.Frillleft.addBox(0.0F, 0.0F, 0.0F, 7, 1, 15, 0.0F);
        this.setRotateAngle(Frillleft, 0.0F, 0.0F, 0.9105382707654417F);
        this.Frontsidetoe1right = new AdvancedModelRenderer(this, 380, 170);
        this.Frontsidetoe1right.setRotationPoint(2.5F, 2.0F, 2.0F);
        this.Frontsidetoe1right.addBox(-1.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(Frontsidetoe1right, -0.136659280431156F, 0.0F, -0.22759093446006054F);
        this.Frontlegleft = new AdvancedModelRenderer(this, 325, 200);
        this.Frontlegleft.setRotationPoint(0.5F, 10.0F, 4.5F);
        this.Frontlegleft.addBox(0.0F, 0.0F, 0.0F, 5, 15, 7, 0.0F);
        this.setRotateAngle(Frontlegleft, -0.6829473363053812F, 0.0F, 0.0F);
        this.Bellyback = new AdvancedModelRenderer(this, 90, 165);
        this.Bellyback.setRotationPoint(0.0F, 2.0F, 11.4F);
        this.Bellyback.addBox(-7.5F, 0.0F, 0.0F, 15, 11, 21, 0.0F);
        this.setRotateAngle(Bellyback, 0.40980330836826856F, 0.0F, 0.0F);
        this.Fronttoerightright = new AdvancedModelRenderer(this, 365, 170);
        this.Fronttoerightright.setRotationPoint(-0.7F, 2.7F, 1.5F);
        this.Fronttoerightright.addBox(-2.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(Fronttoerightright, -1.0471975511965976F, 0.36425021489121656F, 0.0F);
        this.Backfootleft.addChild(this.Backtoesideleft);
        this.Frillleft.addChild(this.Leftfrillsidehorn);
        this.Frill.addChild(this.Frillmiddlehornleft);
        this.Neckbase.addChild(this.Neck2);
        this.Backfootleft.addChild(this.Backtoerightleft);
        this.Backfootright.addChild(this.Backtoemiddlerightright);
        this.Head2.addChild(this.Snout);
        this.Frontfootleft.addChild(this.Frontsidetoe2left);
        this.Frontlegright.addChild(this.Frontfootright);
        this.Backfootleft.addChild(this.Backtoemiddleleftleft);
        this.Frontfootleft.addChild(this.Fronttoeleftleft);
        this.Head2.addChild(this.Lowerjaw);
        this.Head1.addChild(this.Sidefacehornright);
        this.Tailmidfront.addChild(this.Tailmidback);
        this.Frontfootleft.addChild(this.Fronttoerightleft);
        this.Snout.addChild(this.Nasalbump);
        this.Frontlegleft.addChild(this.Frontfootleft);
        this.Frill.addChild(this.Hornfront);
        this.Frontfootright.addChild(this.Fronttoeleftright);
        this.Frillright.addChild(this.shape20);
        this.Frill.addChild(this.Horncenter);
        this.Backfootleft.addChild(this.Backtoeleftleft);
        this.Frill.addChild(this.Hornback);
        this.Backlegright.addChild(this.Backfootright);
        this.Backbody.addChild(this.Tailfront);
        this.Frontfootright.addChild(this.Fronttoemiddleright);
        this.Backfootright.addChild(this.Backtoeleftright);
        this.Frill.addChild(this.Frillmiddlehornright);
        this.Frill.addChild(this.Frillright);
        this.Head1.addChild(this.Frill);
        this.Backfootright.addChild(this.Backtoerightright);
        this.Backlegleft.addChild(this.Backfootleft);
        this.Frillright.addChild(this.Rightfrillsidehorn);
        this.Frontfootleft.addChild(this.Fronttoemiddleleft);
        this.Thighleft.addChild(this.Backlegleft);
        this.Thighright.addChild(this.Backlegright);
        this.Head1.addChild(this.Sidefacehornright_1);
        this.Backfootright.addChild(this.Backtoesideright);
        this.Neck2.addChild(this.Head1);
        this.Backfootleft.addChild(this.Backtoemiddlerightleft);
        this.Head1.addChild(this.Head2);
        this.Frontbody.addChild(this.Backbody);
        this.Frontbody.addChild(this.Neckbase);
        this.Tailfront.addChild(this.Tailmidfront);
        this.Tailmidback.addChild(this.Tailend);
        this.Frontbody.addChild(this.Bellyfront);
        this.Frillleft.addChild(this.shape19);
        this.Frontfootleft.addChild(this.Frontsidetoe1left);
        this.Frontfootright.addChild(this.Frontsidetoe2right);
        this.Backfootright.addChild(this.Backtoemiddleleftright);
        this.Shoulderright.addChild(this.Frontlegright);
        this.Frill.addChild(this.Frillleft);
        this.Frontfootright.addChild(this.Frontsidetoe1right);
        this.Shoulderleft.addChild(this.Frontlegleft);
        this.Bellyfront.addChild(this.Bellyback);
        this.Frontfootright.addChild(this.Fronttoerightright);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Thighright.render(f5);
        this.Shoulderleft.render(f5);
        this.Frontbody.render(f5);
        this.Thighleft.render(f5);
        this.Shoulderright.render(f5);
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }
}
