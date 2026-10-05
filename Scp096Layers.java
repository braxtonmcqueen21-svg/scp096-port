package com.scp096port.client.model;

import com.scp096port.Scp096Mod;
import com.scp096port.entity.Scp096State;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

/** GENERATED from the SCP: Lockdown 1.12.2 SCP096{Sitting,Walking,Crying,Hunting} model classes (box data, pivots, rotations, hierarchy). Texture sheet is 110x37. */
public final class Scp096Layers {
    private Scp096Layers() {}

    public static ModelLayerLocation layer(Scp096State s) {
        return new ModelLayerLocation(new ResourceLocation(Scp096Mod.MODID, "scp096_" + s.name().toLowerCase()), "main");
    }

    public static LayerDefinition definition(Scp096State s) {
        switch (s) {
            case SITTING: return sitting();
            case WALKING: return walking();
            case CRYING:  return crying();
            default:      return running();
        }
    }

    private static LayerDefinition sitting() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition p_upperbody = root.addOrReplaceChild("upperbody", CubeListBuilder.create().texOffs(0, 0).addBox(-4F, -8F, -2F, 8F, 8F, 4F), PartPose.offsetAndRotation(0F, 16.4F, 8.4F, 0.045553F, 0F, 0F));
        PartDefinition p_neck = p_upperbody.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(27, 31).addBox(-2F, -2F, -3F, 4F, 2F, 3F), PartPose.offsetAndRotation(0F, -8F, 1.5F, 0.227591F, 0F, 0F));
        PartDefinition p_head = p_neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(44, 0).addBox(-3F, -5F, -4.1F, 6F, 6F, 6F), PartPose.offsetAndRotation(0F, -2F, 0F, 0.045553F, 0F, 0F));
        PartDefinition p_upperleftarm = p_upperbody.addOrReplaceChild("upperleftarm", CubeListBuilder.create().texOffs(69, 0).addBox(0F, -1F, -1.5F, 3F, 5F, 3F), PartPose.offsetAndRotation(4F, -7F, 0F, -0.136659F, -0.227591F, 0F));
        PartDefinition p_shape13 = p_upperleftarm.addOrReplaceChild("shape13", CubeListBuilder.create().texOffs(70, 9).addBox(-1F, 0F, -1F, 2F, 8F, 2F), PartPose.offsetAndRotation(1.5F, 4F, 0F, 0F, 0F, 0F));
        PartDefinition p_lowerleftarm = p_shape13.addOrReplaceChild("lowerleftarm", CubeListBuilder.create().texOffs(69, 20).addBox(-1F, 0F, -2F, 2F, 12F, 2F), PartPose.offsetAndRotation(0F, 8F, 1F, -1.320342F, 0F, 0F));
        PartDefinition p_lefthand = p_lowerleftarm.addOrReplaceChild("lefthand", CubeListBuilder.create().texOffs(79, 8).addBox(-0.5F, 0F, -1.5F, 1F, 2F, 3F), PartPose.offsetAndRotation(0F, 12F, -1F, 0F, 1.548107F, 0F));
        PartDefinition p_shape32 = p_lefthand.addOrReplaceChild("shape32", CubeListBuilder.create().texOffs(82, 1).addBox(-1F, 0F, 0F, 1F, 2F, 1F), PartPose.offsetAndRotation(0.5F, 2F, 0F, 0.045553F, 0F, 0.045553F));
        PartDefinition p_shape33 = p_shape32.addOrReplaceChild("shape33", CubeListBuilder.create().texOffs(84, 5).addBox(-1F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, 0F, 0F, 0F, 0.273144F));
        PartDefinition p_shape34 = p_lefthand.addOrReplaceChild("shape34", CubeListBuilder.create().texOffs(80, 15).addBox(-1F, 0F, -1F, 1F, 2F, 1F), PartPose.offsetAndRotation(0.5F, 2F, 0F, -0.045553F, 0F, 0F));
        PartDefinition p_shape35 = p_shape34.addOrReplaceChild("shape35", CubeListBuilder.create().texOffs(85, 15).addBox(-1F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, -1F, 0F, 0F, 0.182038F));
        PartDefinition p_shape36 = p_lefthand.addOrReplaceChild("shape36", CubeListBuilder.create().texOffs(79, 19).addBox(-1F, 0F, 0F, 1F, 2F, 1F), PartPose.offsetAndRotation(0.4F, 1.7F, -1.5F, -0.182038F, 0F, 0.136659F));
        PartDefinition p_shape37 = p_shape36.addOrReplaceChild("shape37", CubeListBuilder.create().texOffs(84, 19).addBox(-1F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, 0F, 0F, 0F, 0.227591F));
        PartDefinition p_shape38 = p_lefthand.addOrReplaceChild("shape38", CubeListBuilder.create().texOffs(78, 23).addBox(-1F, 0F, -1F, 1F, 2F, 1F), PartPose.offsetAndRotation(0.4F, 1.7F, 1.5F, 0.273144F, 0F, 0.182038F));
        PartDefinition p_shape39 = p_shape38.addOrReplaceChild("shape39", CubeListBuilder.create().texOffs(83, 22).addBox(-1F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, -1F, 0F, 0F, 0.36425F));
        PartDefinition p_shape40 = p_lefthand.addOrReplaceChild("shape40", CubeListBuilder.create().texOffs(83, 25).addBox(-1F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 0F, -1.5F, 0F, -0.409803F, -0.50091F));
        PartDefinition p_shape41 = p_shape40.addOrReplaceChild("shape41", CubeListBuilder.create().texOffs(78, 28).addBox(-2F, 0F, 0F, 2F, 1F, 1F), PartPose.offsetAndRotation(-1F, 0F, 0F, 0F, 0F, -0.591841F));
        PartDefinition p_lowerbody = p_upperbody.addOrReplaceChild("lowerbody", CubeListBuilder.create().texOffs(25, 0).addBox(-3F, 0F, -3F, 6F, 7F, 3F), PartPose.offsetAndRotation(0F, 0F, 1.5F, -0.36425F, 0F, 0F));
        PartDefinition p_upperrightleg = p_lowerbody.addOrReplaceChild("upperrightleg", CubeListBuilder.create().texOffs(40, 14).addBox(-1.5F, 0F, -1.5F, 3F, 9F, 3F), PartPose.offsetAndRotation(-2F, 8F, -1.5F, -2.003289F, 0.227591F, 0F));
        PartDefinition p_lowerrightleg = p_upperrightleg.addOrReplaceChild("lowerrightleg", CubeListBuilder.create().texOffs(54, 14).addBox(-1.5F, 0F, 0F, 3F, 9F, 3F), PartPose.offsetAndRotation(0F, 9F, -1.5F, 1.411448F, 0F, 0.045553F));
        PartDefinition p_rightfoot = p_lowerrightleg.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(49, 27).addBox(-1.5F, 0F, -3.4F, 3F, 1F, 5F), PartPose.offsetAndRotation(0F, 9F, 1.5F, 0.910538F, -0.136659F, -0.045553F));
        PartDefinition p_shape3 = p_lowerbody.addOrReplaceChild("shape3", CubeListBuilder.create().texOffs(0, 13).addBox(-3.5F, 0F, -2F, 7F, 1F, 4F), PartPose.offsetAndRotation(0F, 7F, -1.5F, 0F, 0F, 0F));
        PartDefinition p_shape4 = p_shape3.addOrReplaceChild("shape4", CubeListBuilder.create().texOffs(0, 19).addBox(-1.1F, 0F, -2F, 2F, 2F, 4F), PartPose.offsetAndRotation(2.5F, -2F, 0F, 0F, 0F, 0F));
        PartDefinition p_shape5 = p_shape3.addOrReplaceChild("shape5", CubeListBuilder.create().texOffs(0, 26).addBox(0.1F, 0F, -2F, 2F, 2F, 4F), PartPose.offsetAndRotation(-3.5F, -2F, 0F, 0F, 0F, 0F));
        PartDefinition p_upperleftleg = p_lowerbody.addOrReplaceChild("upperleftleg", CubeListBuilder.create().texOffs(14, 20).addBox(-1.5F, 0F, -1.5F, 3F, 9F, 3F), PartPose.offsetAndRotation(2F, 8F, -1.5F, -2.003289F, -0.227591F, 0F));
        PartDefinition p_lowerleftleg = p_upperleftleg.addOrReplaceChild("lowerleftleg", CubeListBuilder.create().texOffs(27, 11).addBox(-1.5F, 0F, 0F, 3F, 9F, 3F), PartPose.offsetAndRotation(0F, 9F, -1.5F, 1.411448F, 0F, -0.045553F));
        PartDefinition p_leftfoot = p_lowerleftleg.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(27, 24).addBox(-1.5F, 0F, -3.4F, 3F, 1F, 5F), PartPose.offsetAndRotation(0F, 9F, 1.5F, 0.910538F, 0.136659F, 0.045553F));
        PartDefinition p_upperrightarm = p_upperbody.addOrReplaceChild("upperrightarm", CubeListBuilder.create().texOffs(90, 0).addBox(-3F, -1F, -1.5F, 3F, 5F, 3F), PartPose.offsetAndRotation(-4F, -7F, 0F, -0.136659F, 0.227591F, 0F));
        PartDefinition p_shape17 = p_upperrightarm.addOrReplaceChild("shape17", CubeListBuilder.create().texOffs(91, 9).addBox(-1F, 0F, -1F, 2F, 8F, 2F), PartPose.offsetAndRotation(-1.5F, 4F, 0F, 0F, 0F, 0F));
        PartDefinition p_lowerrightarm = p_shape17.addOrReplaceChild("lowerrightarm", CubeListBuilder.create().texOffs(89, 21).addBox(-1F, 0F, -2F, 2F, 12F, 2F), PartPose.offsetAndRotation(0F, 8F, 1F, -1.320342F, 0F, 0F));
        PartDefinition p_righthand = p_lowerrightarm.addOrReplaceChild("righthand", CubeListBuilder.create().texOffs(101, 8).addBox(-0.5F, 0F, -1.5F, 1F, 2F, 3F), PartPose.offsetAndRotation(0F, 12F, -1F, 0F, -1.548107F, 0F));
        PartDefinition p_shape23 = p_righthand.addOrReplaceChild("shape23", CubeListBuilder.create().texOffs(100, 14).addBox(0F, 0F, -1F, 1F, 2F, 1F), PartPose.offsetAndRotation(-0.5F, 2F, 0F, -0.045553F, 0F, 0F));
        PartDefinition p_shape25 = p_shape23.addOrReplaceChild("shape25", CubeListBuilder.create().texOffs(105, 15).addBox(0F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, -1F, 0F, 0F, -0.182038F));
        PartDefinition p_shape26 = p_righthand.addOrReplaceChild("shape26", CubeListBuilder.create().texOffs(99, 19).addBox(0F, 0F, -1F, 1F, 2F, 1F), PartPose.offsetAndRotation(-0.4F, 1.7F, 1.5F, 0.273144F, 0F, -0.182038F));
        PartDefinition p_shape27 = p_shape26.addOrReplaceChild("shape27", CubeListBuilder.create().texOffs(104, 19).addBox(0F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, -1F, 0F, 0F, -0.36425F));
        PartDefinition p_shape28 = p_righthand.addOrReplaceChild("shape28", CubeListBuilder.create().texOffs(98, 23).addBox(0F, 0F, 0F, 1F, 2F, 1F), PartPose.offsetAndRotation(-0.4F, 1.7F, -1.5F, -0.182038F, 0F, -0.136659F));
        PartDefinition p_shape29 = p_shape28.addOrReplaceChild("shape29", CubeListBuilder.create().texOffs(103, 23).addBox(0F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, 0F, 0F, 0F, -0.227591F));
        PartDefinition p_shape22 = p_righthand.addOrReplaceChild("shape22", CubeListBuilder.create().texOffs(103, 0).addBox(0F, 0F, 0F, 1F, 2F, 1F), PartPose.offsetAndRotation(-0.5F, 2F, 0F, 0.045553F, 0F, -0.045553F));
        PartDefinition p_shape24 = p_shape22.addOrReplaceChild("shape24", CubeListBuilder.create().texOffs(103, 5).addBox(0F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, 0F, 0F, 0F, -0.273144F));
        PartDefinition p_shape30 = p_righthand.addOrReplaceChild("shape30", CubeListBuilder.create().texOffs(98, 28).addBox(0F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 0F, -1.5F, 0F, 0.409803F, 0.50091F));
        PartDefinition p_shape31 = p_shape30.addOrReplaceChild("shape31", CubeListBuilder.create().texOffs(103, 27).addBox(0F, 0F, 0F, 2F, 1F, 1F), PartPose.offsetAndRotation(1F, 0F, 0F, 0F, 0F, 0.591841F));
        return LayerDefinition.create(mesh, 110, 37);
    }

    private static LayerDefinition walking() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition p_upperbody = root.addOrReplaceChild("upperbody", CubeListBuilder.create().texOffs(0, 0).addBox(-4F, -8F, -2F, 8F, 8F, 4F), PartPose.offsetAndRotation(0F, 0.2F, 0F, 0.7285F, 0F, 0F));
        PartDefinition p_upperleftarm = p_upperbody.addOrReplaceChild("upperleftarm", CubeListBuilder.create().texOffs(69, 0).addBox(0F, -1F, -1.5F, 3F, 5F, 3F), PartPose.offsetAndRotation(4F, -7F, 0F, -0.682947F, 0F, 0F));
        PartDefinition p_shape13 = p_upperleftarm.addOrReplaceChild("shape13", CubeListBuilder.create().texOffs(70, 9).addBox(-1F, 0F, -1F, 2F, 8F, 2F), PartPose.offsetAndRotation(1.5F, 4F, 0F, 0F, 0F, 0F));
        PartDefinition p_lowerleftarm = p_shape13.addOrReplaceChild("lowerleftarm", CubeListBuilder.create().texOffs(69, 20).addBox(-1F, 0F, -2F, 2F, 12F, 2F), PartPose.offsetAndRotation(0F, 8F, 1F, -0.136659F, 0F, 0F));
        PartDefinition p_lefthand = p_lowerleftarm.addOrReplaceChild("lefthand", CubeListBuilder.create().texOffs(79, 8).addBox(-0.5F, 0F, -1.5F, 1F, 2F, 3F), PartPose.offsetAndRotation(0F, 12F, -1F, 0.091106F, 1.047198F, 0F));
        PartDefinition p_shape40 = p_lefthand.addOrReplaceChild("shape40", CubeListBuilder.create().texOffs(83, 25).addBox(-1F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 0F, -1.5F, 0F, -0.409803F, -0.50091F));
        PartDefinition p_shape41 = p_shape40.addOrReplaceChild("shape41", CubeListBuilder.create().texOffs(78, 28).addBox(-2F, 0F, 0F, 2F, 1F, 1F), PartPose.offsetAndRotation(-1F, 0F, 0F, 0F, 0F, -0.591841F));
        PartDefinition p_shape32 = p_lefthand.addOrReplaceChild("shape32", CubeListBuilder.create().texOffs(82, 1).addBox(-1F, 0F, 0F, 1F, 2F, 1F), PartPose.offsetAndRotation(0.5F, 2F, 0F, 0.045553F, 0F, 0.045553F));
        PartDefinition p_shape33 = p_shape32.addOrReplaceChild("shape33", CubeListBuilder.create().texOffs(84, 5).addBox(-1F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, 0F, 0F, 0F, 0.273144F));
        PartDefinition p_shape38 = p_lefthand.addOrReplaceChild("shape38", CubeListBuilder.create().texOffs(78, 23).addBox(-1F, 0F, -1F, 1F, 2F, 1F), PartPose.offsetAndRotation(0.4F, 1.7F, 1.5F, 0.273144F, 0F, 0.182038F));
        PartDefinition p_shape39 = p_shape38.addOrReplaceChild("shape39", CubeListBuilder.create().texOffs(83, 22).addBox(-1F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, -1F, 0F, 0F, 0.36425F));
        PartDefinition p_shape34 = p_lefthand.addOrReplaceChild("shape34", CubeListBuilder.create().texOffs(80, 15).addBox(-1F, 0F, -1F, 1F, 2F, 1F), PartPose.offsetAndRotation(0.5F, 2F, 0F, -0.045553F, 0F, 0F));
        PartDefinition p_shape35 = p_shape34.addOrReplaceChild("shape35", CubeListBuilder.create().texOffs(85, 15).addBox(-1F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, -1F, 0F, 0F, 0.182038F));
        PartDefinition p_shape36 = p_lefthand.addOrReplaceChild("shape36", CubeListBuilder.create().texOffs(79, 19).addBox(-1F, 0F, 0F, 1F, 2F, 1F), PartPose.offsetAndRotation(0.4F, 1.7F, -1.5F, -0.182038F, 0F, 0.136659F));
        PartDefinition p_shape37 = p_shape36.addOrReplaceChild("shape37", CubeListBuilder.create().texOffs(84, 19).addBox(-1F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, 0F, 0F, 0F, 0.227591F));
        PartDefinition p_lowerbody = p_upperbody.addOrReplaceChild("lowerbody", CubeListBuilder.create().texOffs(25, 0).addBox(-3F, 0F, -3F, 6F, 7F, 3F), PartPose.offsetAndRotation(0F, 0F, 1.5F, -0.591841F, 0F, 0F));
        PartDefinition p_upperleftleg = p_lowerbody.addOrReplaceChild("upperleftleg", CubeListBuilder.create().texOffs(14, 20).addBox(-1.5F, 0F, -1.5F, 3F, 9F, 3F), PartPose.offsetAndRotation(2F, 8F, -1.5F, -0.546288F, 0F, 0F));
        PartDefinition p_lowerleftleg = p_upperleftleg.addOrReplaceChild("lowerleftleg", CubeListBuilder.create().texOffs(27, 11).addBox(-1.5F, 0F, 0F, 3F, 9F, 3F), PartPose.offsetAndRotation(0F, 9F, -1.5F, 0.7285F, 0F, -0.045553F));
        PartDefinition p_leftfoot = p_lowerleftleg.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(27, 24).addBox(-1.5F, 0F, -3.4F, 3F, 1F, 5F), PartPose.offsetAndRotation(0F, 9F, 1.5F, -0.318697F, 0F, 0.045553F));
        PartDefinition p_shape3 = p_lowerbody.addOrReplaceChild("shape3", CubeListBuilder.create().texOffs(0, 13).addBox(-3.5F, 0F, -2F, 7F, 1F, 4F), PartPose.offsetAndRotation(0F, 7F, -1.5F, 0F, 0F, 0F));
        PartDefinition p_shape4 = p_shape3.addOrReplaceChild("shape4", CubeListBuilder.create().texOffs(0, 19).addBox(-1.1F, 0F, -2F, 2F, 2F, 4F), PartPose.offsetAndRotation(2.5F, -2F, 0F, 0F, 0F, 0F));
        PartDefinition p_shape5 = p_shape3.addOrReplaceChild("shape5", CubeListBuilder.create().texOffs(0, 26).addBox(0.1F, 0F, -2F, 2F, 2F, 4F), PartPose.offsetAndRotation(-3.5F, -2F, 0F, 0F, 0F, 0F));
        PartDefinition p_upperrightleg = p_lowerbody.addOrReplaceChild("upperrightleg", CubeListBuilder.create().texOffs(40, 14).addBox(-1.5F, 0F, -1.5F, 3F, 9F, 3F), PartPose.offsetAndRotation(-2F, 8F, -1.5F, -0.546288F, 0F, 0F));
        PartDefinition p_lowerrightleg = p_upperrightleg.addOrReplaceChild("lowerrightleg", CubeListBuilder.create().texOffs(54, 14).addBox(-1.5F, 0F, 0F, 3F, 9F, 3F), PartPose.offsetAndRotation(0F, 9F, -1.5F, 0.7285F, 0F, 0.045553F));
        PartDefinition p_rightfoot = p_lowerrightleg.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(49, 27).addBox(-1.5F, 0F, -3.4F, 3F, 1F, 5F), PartPose.offsetAndRotation(0F, 9F, 1.5F, -0.318697F, 0F, -0.045553F));
        PartDefinition p_neck = p_upperbody.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(27, 31).addBox(-2F, -2F, -3F, 4F, 2F, 3F), PartPose.offsetAndRotation(0F, -8F, 1.5F, -0.091106F, 0F, 0F));
        PartDefinition p_head = p_neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(44, 0).addBox(-3F, -5F, -4.1F, 6F, 6F, 6F), PartPose.offsetAndRotation(0F, -2F, 0F, -0.36425F, 0F, 0F));
        PartDefinition p_upperrightarm = p_upperbody.addOrReplaceChild("upperrightarm", CubeListBuilder.create().texOffs(90, 0).addBox(-3F, -1F, -1.5F, 3F, 5F, 3F), PartPose.offsetAndRotation(-4F, -7F, 0F, -0.682947F, 0F, 0F));
        PartDefinition p_shape17 = p_upperrightarm.addOrReplaceChild("shape17", CubeListBuilder.create().texOffs(91, 9).addBox(-1F, 0F, -1F, 2F, 8F, 2F), PartPose.offsetAndRotation(-1.5F, 4F, 0F, 0F, 0F, 0F));
        PartDefinition p_lowerrightarm = p_shape17.addOrReplaceChild("lowerrightarm", CubeListBuilder.create().texOffs(89, 21).addBox(-1F, 0F, -2F, 2F, 12F, 2F), PartPose.offsetAndRotation(0F, 8F, 1F, -0.136659F, 0F, 0F));
        PartDefinition p_righthand = p_lowerrightarm.addOrReplaceChild("righthand", CubeListBuilder.create().texOffs(101, 8).addBox(-0.5F, 0F, -1.5F, 1F, 2F, 3F), PartPose.offsetAndRotation(0F, 12F, -1F, 0.091106F, -1.047198F, 0F));
        PartDefinition p_shape26 = p_righthand.addOrReplaceChild("shape26", CubeListBuilder.create().texOffs(99, 19).addBox(0F, 0F, -1F, 1F, 2F, 1F), PartPose.offsetAndRotation(-0.4F, 1.7F, 1.5F, 0.273144F, 0F, -0.182038F));
        PartDefinition p_shape27 = p_shape26.addOrReplaceChild("shape27", CubeListBuilder.create().texOffs(104, 19).addBox(0F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, -1F, 0F, 0F, -0.36425F));
        PartDefinition p_shape22 = p_righthand.addOrReplaceChild("shape22", CubeListBuilder.create().texOffs(103, 0).addBox(0F, 0F, 0F, 1F, 2F, 1F), PartPose.offsetAndRotation(-0.5F, 2F, 0F, 0.045553F, 0F, -0.045553F));
        PartDefinition p_shape24 = p_shape22.addOrReplaceChild("shape24", CubeListBuilder.create().texOffs(103, 5).addBox(0F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, 0F, 0F, 0F, -0.273144F));
        PartDefinition p_shape23 = p_righthand.addOrReplaceChild("shape23", CubeListBuilder.create().texOffs(100, 14).addBox(0F, 0F, -1F, 1F, 2F, 1F), PartPose.offsetAndRotation(-0.5F, 2F, 0F, -0.045553F, 0F, 0F));
        PartDefinition p_shape25 = p_shape23.addOrReplaceChild("shape25", CubeListBuilder.create().texOffs(105, 15).addBox(0F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, -1F, 0F, 0F, -0.182038F));
        PartDefinition p_shape28 = p_righthand.addOrReplaceChild("shape28", CubeListBuilder.create().texOffs(98, 23).addBox(0F, 0F, 0F, 1F, 2F, 1F), PartPose.offsetAndRotation(-0.4F, 1.7F, -1.5F, -0.182038F, 0F, -0.136659F));
        PartDefinition p_shape29 = p_shape28.addOrReplaceChild("shape29", CubeListBuilder.create().texOffs(103, 23).addBox(0F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, 0F, 0F, 0F, -0.227591F));
        PartDefinition p_shape30 = p_righthand.addOrReplaceChild("shape30", CubeListBuilder.create().texOffs(98, 28).addBox(0F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 0F, -1.5F, 0F, 0.409803F, 0.50091F));
        PartDefinition p_shape31 = p_shape30.addOrReplaceChild("shape31", CubeListBuilder.create().texOffs(103, 27).addBox(0F, 0F, 0F, 2F, 1F, 1F), PartPose.offsetAndRotation(1F, 0F, 0F, 0F, 0F, 0.591841F));
        return LayerDefinition.create(mesh, 110, 37);
    }

    private static LayerDefinition crying() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition p_upperbody = root.addOrReplaceChild("upperbody", CubeListBuilder.create().texOffs(0, 0).addBox(-4F, -8F, -2F, 8F, 8F, 4F), PartPose.offsetAndRotation(0F, 3.1F, 0F, 1.183857F, 0F, 0F));
        PartDefinition p_upperleftarm = p_upperbody.addOrReplaceChild("upperleftarm", CubeListBuilder.create().texOffs(69, 0).addBox(0F, -1F, -1.5F, 3F, 5F, 3F), PartPose.offsetAndRotation(4F, -7F, 0F, -1.229235F, 0F, -0.36425F));
        PartDefinition p_shape13 = p_upperleftarm.addOrReplaceChild("shape13", CubeListBuilder.create().texOffs(70, 9).addBox(-1F, 0F, -1F, 2F, 8F, 2F), PartPose.offsetAndRotation(1.5F, 4F, 0F, 0F, 0F, 0F));
        PartDefinition p_lowerleftarm = p_shape13.addOrReplaceChild("lowerleftarm", CubeListBuilder.create().texOffs(69, 20).addBox(-1F, 0F, -2F, 2F, 12F, 2F), PartPose.offsetAndRotation(0F, 8F, -1F, -2.504198F, 0F, 0F));
        PartDefinition p_lefthand = p_lowerleftarm.addOrReplaceChild("lefthand", CubeListBuilder.create().texOffs(79, 8).addBox(-0.5F, 0F, -1.5F, 1F, 2F, 3F), PartPose.offsetAndRotation(0F, 12F, -1F, 0.091106F, -1.229235F, 0.182038F));
        PartDefinition p_shape34 = p_lefthand.addOrReplaceChild("shape34", CubeListBuilder.create().texOffs(80, 15).addBox(-1F, 0F, -1F, 1F, 2F, 1F), PartPose.offsetAndRotation(0.5F, 2F, 0F, -0.045553F, 0F, 0F));
        PartDefinition p_shape35 = p_shape34.addOrReplaceChild("shape35", CubeListBuilder.create().texOffs(85, 15).addBox(-1F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, -1F, 0F, 0F, 0.774053F));
        PartDefinition p_shape32 = p_lefthand.addOrReplaceChild("shape32", CubeListBuilder.create().texOffs(82, 1).addBox(-1F, 0F, 0F, 1F, 2F, 1F), PartPose.offsetAndRotation(0.5F, 2F, 0F, 0.045553F, 0F, 0.045553F));
        PartDefinition p_shape33 = p_shape32.addOrReplaceChild("shape33", CubeListBuilder.create().texOffs(84, 5).addBox(-1F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, 0F, 0F, 0F, 0.819607F));
        PartDefinition p_shape40 = p_lefthand.addOrReplaceChild("shape40", CubeListBuilder.create().texOffs(83, 25).addBox(-1F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 0F, -1.5F, 0F, -0.409803F, -0.50091F));
        PartDefinition p_shape41 = p_shape40.addOrReplaceChild("shape41", CubeListBuilder.create().texOffs(78, 28).addBox(-2F, 0F, 0F, 2F, 1F, 1F), PartPose.offsetAndRotation(-1F, 0F, 0F, 0F, 0F, -0.591841F));
        PartDefinition p_shape38 = p_lefthand.addOrReplaceChild("shape38", CubeListBuilder.create().texOffs(78, 23).addBox(-1F, 0F, -1F, 1F, 2F, 1F), PartPose.offsetAndRotation(0.4F, 1.7F, 1.5F, 0.273144F, 0F, 0.045553F));
        PartDefinition p_shape39 = p_shape38.addOrReplaceChild("shape39", CubeListBuilder.create().texOffs(83, 22).addBox(-1F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, -1F, 0F, 0F, 0.36425F));
        PartDefinition p_shape36 = p_lefthand.addOrReplaceChild("shape36", CubeListBuilder.create().texOffs(79, 19).addBox(-1F, 0F, 0F, 1F, 2F, 1F), PartPose.offsetAndRotation(0.4F, 1.7F, -1.5F, -0.182038F, 0F, 0.136659F));
        PartDefinition p_shape37 = p_shape36.addOrReplaceChild("shape37", CubeListBuilder.create().texOffs(84, 19).addBox(-1F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, 0F, 0F, 0F, 0.637394F));
        PartDefinition p_lowerbody = p_upperbody.addOrReplaceChild("lowerbody", CubeListBuilder.create().texOffs(25, 0).addBox(-3F, 0F, -3F, 6F, 7F, 3F), PartPose.offsetAndRotation(0F, 0F, 1.5F, -0.956091F, 0F, 0F));
        PartDefinition p_upperrightleg = p_lowerbody.addOrReplaceChild("upperrightleg", CubeListBuilder.create().texOffs(40, 14).addBox(-1.5F, 0F, -1.5F, 3F, 9F, 3F), PartPose.offsetAndRotation(-2F, 8F, -1.5F, -0.956091F, 0.7285F, 0F));
        PartDefinition p_lowerrightleg = p_upperrightleg.addOrReplaceChild("lowerrightleg", CubeListBuilder.create().texOffs(54, 14).addBox(-1.5F, 0F, 0F, 3F, 9F, 3F), PartPose.offsetAndRotation(0F, 9F, -1.5F, 1.092751F, 0F, 0.045553F));
        PartDefinition p_rightfoot = p_lowerrightleg.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(49, 27).addBox(-1.5F, 0F, -3.4F, 3F, 1F, 5F), PartPose.offsetAndRotation(0F, 9F, 1.5F, -0.273144F, 0F, -0.182038F));
        PartDefinition p_upperleftleg = p_lowerbody.addOrReplaceChild("upperleftleg", CubeListBuilder.create().texOffs(14, 20).addBox(-1.5F, 0F, -1.5F, 3F, 9F, 3F), PartPose.offsetAndRotation(2F, 8F, -1.5F, -0.956091F, -0.7285F, 0F));
        PartDefinition p_lowerleftleg = p_upperleftleg.addOrReplaceChild("lowerleftleg", CubeListBuilder.create().texOffs(27, 11).addBox(-1.5F, 0F, 0F, 3F, 9F, 3F), PartPose.offsetAndRotation(0F, 9F, -1.5F, 1.092751F, 0F, -0.045553F));
        PartDefinition p_leftfoot = p_lowerleftleg.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(27, 24).addBox(-1.5F, 0F, -3.4F, 3F, 1F, 5F), PartPose.offsetAndRotation(0F, 9F, 1.5F, -0.273144F, 0F, 0.182038F));
        PartDefinition p_shape3 = p_lowerbody.addOrReplaceChild("shape3", CubeListBuilder.create().texOffs(0, 13).addBox(-3.5F, 0F, -2F, 7F, 1F, 4F), PartPose.offsetAndRotation(0F, 7F, -1.5F, 0F, 0F, 0F));
        PartDefinition p_shape4 = p_shape3.addOrReplaceChild("shape4", CubeListBuilder.create().texOffs(0, 19).addBox(-1.1F, 0F, -2F, 2F, 2F, 4F), PartPose.offsetAndRotation(2.5F, -2F, 0F, 0F, 0F, 0F));
        PartDefinition p_shape5 = p_shape3.addOrReplaceChild("shape5", CubeListBuilder.create().texOffs(0, 26).addBox(0.1F, 0F, -2F, 2F, 2F, 4F), PartPose.offsetAndRotation(-3.5F, -2F, 0F, 0F, 0F, 0F));
        PartDefinition p_upperrightarm = p_upperbody.addOrReplaceChild("upperrightarm", CubeListBuilder.create().texOffs(90, 0).addBox(-3F, -1F, -1.5F, 3F, 5F, 3F), PartPose.offsetAndRotation(-4F, -7F, 0F, -1.229235F, 0F, 0.36425F));
        PartDefinition p_shape17 = p_upperrightarm.addOrReplaceChild("shape17", CubeListBuilder.create().texOffs(91, 9).addBox(-1F, 0F, -1F, 2F, 8F, 2F), PartPose.offsetAndRotation(-1.5F, 4F, 0F, 0F, 0F, 0F));
        PartDefinition p_lowerrightarm = p_shape17.addOrReplaceChild("lowerrightarm", CubeListBuilder.create().texOffs(89, 21).addBox(-1F, 0F, -2F, 2F, 12F, 2F), PartPose.offsetAndRotation(0F, 8F, -1F, -2.504198F, 0F, 0F));
        PartDefinition p_righthand = p_lowerrightarm.addOrReplaceChild("righthand", CubeListBuilder.create().texOffs(101, 8).addBox(-0.5F, 0F, -1.5F, 1F, 2F, 3F), PartPose.offsetAndRotation(0F, 12F, -1F, 0.091106F, 1.229235F, -0.182038F));
        PartDefinition p_shape23 = p_righthand.addOrReplaceChild("shape23", CubeListBuilder.create().texOffs(100, 14).addBox(0F, 0F, -1F, 1F, 2F, 1F), PartPose.offsetAndRotation(-0.5F, 2F, 0F, -0.045553F, 0F, 0F));
        PartDefinition p_shape25 = p_shape23.addOrReplaceChild("shape25", CubeListBuilder.create().texOffs(105, 15).addBox(0F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, -1F, 0F, 0F, -0.774053F));
        PartDefinition p_shape28 = p_righthand.addOrReplaceChild("shape28", CubeListBuilder.create().texOffs(98, 23).addBox(0F, 0F, 0F, 1F, 2F, 1F), PartPose.offsetAndRotation(-0.4F, 1.7F, -1.5F, -0.182038F, 0F, -0.136659F));
        PartDefinition p_shape29 = p_shape28.addOrReplaceChild("shape29", CubeListBuilder.create().texOffs(103, 23).addBox(0F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, 0F, 0F, 0F, -0.637394F));
        PartDefinition p_shape26 = p_righthand.addOrReplaceChild("shape26", CubeListBuilder.create().texOffs(99, 19).addBox(0F, 0F, -1F, 1F, 2F, 1F), PartPose.offsetAndRotation(-0.4F, 1.7F, 1.5F, 0.273144F, 0F, -0.045553F));
        PartDefinition p_shape27 = p_shape26.addOrReplaceChild("shape27", CubeListBuilder.create().texOffs(104, 19).addBox(0F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, -1F, 0F, 0F, -0.36425F));
        PartDefinition p_shape22 = p_righthand.addOrReplaceChild("shape22", CubeListBuilder.create().texOffs(103, 0).addBox(0F, 0F, 0F, 1F, 2F, 1F), PartPose.offsetAndRotation(-0.5F, 2F, 0F, 0.045553F, 0F, -0.045553F));
        PartDefinition p_shape24 = p_shape22.addOrReplaceChild("shape24", CubeListBuilder.create().texOffs(103, 5).addBox(0F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, 0F, 0F, 0F, -0.819607F));
        PartDefinition p_shape30 = p_righthand.addOrReplaceChild("shape30", CubeListBuilder.create().texOffs(98, 28).addBox(0F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 0F, -1.5F, 0F, 0.409803F, 0.50091F));
        PartDefinition p_shape31 = p_shape30.addOrReplaceChild("shape31", CubeListBuilder.create().texOffs(103, 27).addBox(0F, 0F, 0F, 2F, 1F, 1F), PartPose.offsetAndRotation(1F, 0F, 0F, 0F, 0F, 0.591841F));
        PartDefinition p_neck = p_upperbody.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(27, 31).addBox(-2F, -2F, -3F, 4F, 2F, 3F), PartPose.offsetAndRotation(0F, -8F, 1.5F, -0.091106F, 0F, 0F));
        PartDefinition p_head = p_neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(44, 0).addBox(-3F, -5F, -4.1F, 6F, 6F, 6F), PartPose.offsetAndRotation(0F, -2F, -1.2F, -0.045553F, 0F, 0F));
        return LayerDefinition.create(mesh, 110, 37);
    }

    private static LayerDefinition running() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition p_upperbody = root.addOrReplaceChild("upperbody", CubeListBuilder.create().texOffs(0, 0).addBox(-4F, -8F, -2F, 8F, 8F, 4F), PartPose.offsetAndRotation(0F, -0.9F, 4.5F, 0.546288F, 0F, 0F));
        PartDefinition p_upperrightarm = p_upperbody.addOrReplaceChild("upperrightarm", CubeListBuilder.create().texOffs(90, 0).addBox(-3F, -1F, -1.5F, 3F, 5F, 3F), PartPose.offsetAndRotation(-4F, -7F, 0F, -1.365895F, 0.227591F, 0F));
        PartDefinition p_shape17 = p_upperrightarm.addOrReplaceChild("shape17", CubeListBuilder.create().texOffs(91, 9).addBox(-1F, 0F, -1F, 2F, 8F, 2F), PartPose.offsetAndRotation(-1.5F, 4F, 0F, 0F, 0F, 0F));
        PartDefinition p_lowerrightarm = p_shape17.addOrReplaceChild("lowerrightarm", CubeListBuilder.create().texOffs(89, 21).addBox(-1F, 0F, -2F, 2F, 12F, 2F), PartPose.offsetAndRotation(0F, 8F, 1F, -0.682947F, 0F, 0F));
        PartDefinition p_righthand = p_lowerrightarm.addOrReplaceChild("righthand", CubeListBuilder.create().texOffs(101, 8).addBox(-0.5F, 0F, -1.5F, 1F, 2F, 3F), PartPose.offsetAndRotation(0F, 12F, -1F, -0.591841F, -0.546288F, 0.682947F));
        PartDefinition p_shape23 = p_righthand.addOrReplaceChild("shape23", CubeListBuilder.create().texOffs(100, 14).addBox(0F, 0F, -1F, 1F, 2F, 1F), PartPose.offsetAndRotation(-0.5F, 2F, 0F, -0.136659F, 0F, 0F));
        PartDefinition p_shape25 = p_shape23.addOrReplaceChild("shape25", CubeListBuilder.create().texOffs(105, 15).addBox(0F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, -1F, 0F, 0F, -0.774053F));
        PartDefinition p_shape28 = p_righthand.addOrReplaceChild("shape28", CubeListBuilder.create().texOffs(98, 23).addBox(0F, 0F, 0F, 1F, 2F, 1F), PartPose.offsetAndRotation(-0.4F, 1.7F, -1.5F, -0.591841F, 0F, -0.136659F));
        PartDefinition p_shape29 = p_shape28.addOrReplaceChild("shape29", CubeListBuilder.create().texOffs(103, 23).addBox(0F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, 0F, 0F, 0F, -0.7285F));
        PartDefinition p_shape26 = p_righthand.addOrReplaceChild("shape26", CubeListBuilder.create().texOffs(99, 19).addBox(0F, 0F, -1F, 1F, 2F, 1F), PartPose.offsetAndRotation(-0.4F, 1.7F, 1.5F, 0.637394F, 0F, -0.182038F));
        PartDefinition p_shape27 = p_shape26.addOrReplaceChild("shape27", CubeListBuilder.create().texOffs(104, 19).addBox(0F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, -1F, 0F, 0F, -0.7285F));
        PartDefinition p_shape22 = p_righthand.addOrReplaceChild("shape22", CubeListBuilder.create().texOffs(103, 0).addBox(0F, 0F, 0F, 1F, 2F, 1F), PartPose.offsetAndRotation(-0.5F, 2F, 0F, 0.182038F, 0F, -0.045553F));
        PartDefinition p_shape24 = p_shape22.addOrReplaceChild("shape24", CubeListBuilder.create().texOffs(103, 5).addBox(0F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, 0F, 0F, 0F, -0.682947F));
        PartDefinition p_shape30 = p_righthand.addOrReplaceChild("shape30", CubeListBuilder.create().texOffs(98, 28).addBox(0F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 0F, -1.5F, 0F, 0.409803F, -0.546288F));
        PartDefinition p_shape31 = p_shape30.addOrReplaceChild("shape31", CubeListBuilder.create().texOffs(103, 27).addBox(0F, 0F, 0F, 2F, 1F, 1F), PartPose.offsetAndRotation(1F, 0F, 0F, 0F, 0F, 0.591841F));
        PartDefinition p_neck = p_upperbody.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(27, 31).addBox(-2F, -2F, -3F, 4F, 2F, 3F), PartPose.offsetAndRotation(0F, -8F, 1.5F, 0F, 0F, 0F));
        PartDefinition p_head = p_neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(44, 0).addBox(-3F, -5F, -4.1F, 6F, 6F, 6F), PartPose.offsetAndRotation(0F, -2F, 0F, -0.50091F, 0F, 0F));
        PartDefinition p_shape1 = p_head.addOrReplaceChild("shape1", CubeListBuilder.create().texOffs(0, 33).addBox(-2.5F, 0F, 0F, 5F, 2F, 2F), PartPose.offsetAndRotation(0F, 1F, -4.1F, 0F, 0F, 0F));
        PartDefinition p_upperleftarm = p_upperbody.addOrReplaceChild("upperleftarm", CubeListBuilder.create().texOffs(69, 0).addBox(0F, -1F, -1.5F, 3F, 5F, 3F), PartPose.offsetAndRotation(4F, -7F, 0F, -1.365895F, -0.227591F, 0F));
        PartDefinition p_shape13 = p_upperleftarm.addOrReplaceChild("shape13", CubeListBuilder.create().texOffs(70, 9).addBox(-1F, 0F, -1F, 2F, 8F, 2F), PartPose.offsetAndRotation(1.5F, 4F, 0F, 0F, 0F, 0F));
        PartDefinition p_lowerleftarm = p_shape13.addOrReplaceChild("lowerleftarm", CubeListBuilder.create().texOffs(69, 20).addBox(-1F, 0F, -2F, 2F, 12F, 2F), PartPose.offsetAndRotation(0F, 8F, 1F, -0.682947F, 0F, 0F));
        PartDefinition p_lefthand = p_lowerleftarm.addOrReplaceChild("lefthand", CubeListBuilder.create().texOffs(79, 8).addBox(-0.5F, 0F, -1.5F, 1F, 2F, 3F), PartPose.offsetAndRotation(0F, 12F, -1F, -0.591841F, 0.546288F, -0.682947F));
        PartDefinition p_shape38 = p_lefthand.addOrReplaceChild("shape38", CubeListBuilder.create().texOffs(78, 23).addBox(-1F, 0F, -1F, 1F, 2F, 1F), PartPose.offsetAndRotation(0.4F, 1.7F, 1.5F, 0.637394F, 0F, 0.182038F));
        PartDefinition p_shape39 = p_shape38.addOrReplaceChild("shape39", CubeListBuilder.create().texOffs(83, 22).addBox(-1F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, -1F, 0F, 0F, 0.7285F));
        PartDefinition p_shape40 = p_lefthand.addOrReplaceChild("shape40", CubeListBuilder.create().texOffs(83, 25).addBox(-1F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 0F, -1.5F, 0F, -0.409803F, 0.546288F));
        PartDefinition p_shape41 = p_shape40.addOrReplaceChild("shape41", CubeListBuilder.create().texOffs(78, 28).addBox(-2F, 0F, 0F, 2F, 1F, 1F), PartPose.offsetAndRotation(-1F, 0F, 0F, 0F, 0F, -0.591841F));
        PartDefinition p_shape32 = p_lefthand.addOrReplaceChild("shape32", CubeListBuilder.create().texOffs(82, 1).addBox(-1F, 0F, 0F, 1F, 2F, 1F), PartPose.offsetAndRotation(0.5F, 2F, 0F, 0.182038F, 0F, 0.045553F));
        PartDefinition p_shape33 = p_shape32.addOrReplaceChild("shape33", CubeListBuilder.create().texOffs(84, 5).addBox(-1F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, 0F, 0F, 0F, 0.682947F));
        PartDefinition p_shape34 = p_lefthand.addOrReplaceChild("shape34", CubeListBuilder.create().texOffs(80, 15).addBox(-1F, 0F, -1F, 1F, 2F, 1F), PartPose.offsetAndRotation(0.5F, 2F, 0F, -0.136659F, 0F, 0F));
        PartDefinition p_shape35 = p_shape34.addOrReplaceChild("shape35", CubeListBuilder.create().texOffs(85, 15).addBox(-1F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, -1F, 0F, 0F, 0.774053F));
        PartDefinition p_shape36 = p_lefthand.addOrReplaceChild("shape36", CubeListBuilder.create().texOffs(79, 19).addBox(-1F, 0F, 0F, 1F, 2F, 1F), PartPose.offsetAndRotation(0.4F, 1.7F, -1.5F, -0.591841F, 0F, 0.136659F));
        PartDefinition p_shape37 = p_shape36.addOrReplaceChild("shape37", CubeListBuilder.create().texOffs(84, 19).addBox(-1F, 0F, 0F, 1F, 1F, 1F), PartPose.offsetAndRotation(0F, 2F, 0F, 0F, 0F, 0.7285F));
        PartDefinition p_lowerbody = p_upperbody.addOrReplaceChild("lowerbody", CubeListBuilder.create().texOffs(25, 0).addBox(-3F, 0F, -3F, 6F, 7F, 3F), PartPose.offsetAndRotation(0F, 0F, 1.5F, -0.50091F, 0F, 0F));
        PartDefinition p_upperrightleg = p_lowerbody.addOrReplaceChild("upperrightleg", CubeListBuilder.create().texOffs(40, 14).addBox(-1.5F, 0F, -1.5F, 3F, 9F, 3F), PartPose.offsetAndRotation(-2F, 8F, -1.5F, -0.409803F, 0F, 0.045553F));
        PartDefinition p_lowerrightleg = p_upperrightleg.addOrReplaceChild("lowerrightleg", CubeListBuilder.create().texOffs(54, 14).addBox(-1.5F, 0F, 0F, 3F, 9F, 3F), PartPose.offsetAndRotation(0F, 9F, -1.5F, 0.455356F, 0F, 0.045553F));
        PartDefinition p_rightfoot = p_lowerrightleg.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(49, 27).addBox(-1.5F, 0F, -3.4F, 3F, 1F, 5F), PartPose.offsetAndRotation(0F, 9F, 1.5F, -0.091106F, 0F, -0.091106F));
        PartDefinition p_upperleftleg = p_lowerbody.addOrReplaceChild("upperleftleg", CubeListBuilder.create().texOffs(14, 20).addBox(-1.5F, 0F, -1.5F, 3F, 9F, 3F), PartPose.offsetAndRotation(2F, 8F, -1.5F, -0.409803F, 0F, -0.045553F));
        PartDefinition p_lowerleftleg = p_upperleftleg.addOrReplaceChild("lowerleftleg", CubeListBuilder.create().texOffs(27, 11).addBox(-1.5F, 0F, 0F, 3F, 9F, 3F), PartPose.offsetAndRotation(0F, 9F, -1.5F, 0.455356F, 0F, -0.045553F));
        PartDefinition p_leftfoot = p_lowerleftleg.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(27, 24).addBox(-1.5F, 0F, -3.4F, 3F, 1F, 5F), PartPose.offsetAndRotation(0F, 9F, 1.5F, -0.091106F, 0F, 0.091106F));
        PartDefinition p_shape3 = p_lowerbody.addOrReplaceChild("shape3", CubeListBuilder.create().texOffs(0, 13).addBox(-3.5F, 0F, -2F, 7F, 1F, 4F), PartPose.offsetAndRotation(0F, 7F, -1.5F, 0F, 0F, 0F));
        PartDefinition p_shape5 = p_shape3.addOrReplaceChild("shape5", CubeListBuilder.create().texOffs(0, 26).addBox(0.1F, 0F, -2F, 2F, 2F, 4F), PartPose.offsetAndRotation(-3.5F, -2F, 0F, 0F, 0F, 0F));
        PartDefinition p_shape4 = p_shape3.addOrReplaceChild("shape4", CubeListBuilder.create().texOffs(0, 19).addBox(-1.1F, 0F, -2F, 2F, 2F, 4F), PartPose.offsetAndRotation(2.5F, -2F, 0F, 0F, 0F, 0F));
        return LayerDefinition.create(mesh, 110, 37);
    }

    /** Part paths per pose (used by the model to find parts by name). */
    public static String[][] paths(Scp096State s) {
        switch (s) {
            case SITTING: return new String[][] {
                {"upperbody"},
                {"upperbody", "neck"},
                {"upperbody", "neck", "head"},
                {"upperbody", "upperleftarm"},
                {"upperbody", "upperleftarm", "shape13"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape32"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape32", "shape33"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape34"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape34", "shape35"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape36"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape36", "shape37"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape38"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape38", "shape39"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape40"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape40", "shape41"},
                {"upperbody", "lowerbody"},
                {"upperbody", "lowerbody", "upperrightleg"},
                {"upperbody", "lowerbody", "upperrightleg", "lowerrightleg"},
                {"upperbody", "lowerbody", "upperrightleg", "lowerrightleg", "rightfoot"},
                {"upperbody", "lowerbody", "shape3"},
                {"upperbody", "lowerbody", "shape3", "shape4"},
                {"upperbody", "lowerbody", "shape3", "shape5"},
                {"upperbody", "lowerbody", "upperleftleg"},
                {"upperbody", "lowerbody", "upperleftleg", "lowerleftleg"},
                {"upperbody", "lowerbody", "upperleftleg", "lowerleftleg", "leftfoot"},
                {"upperbody", "upperrightarm"},
                {"upperbody", "upperrightarm", "shape17"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape23"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape23", "shape25"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape26"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape26", "shape27"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape28"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape28", "shape29"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape22"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape22", "shape24"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape30"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape30", "shape31"} };
            case WALKING: return new String[][] {
                {"upperbody"},
                {"upperbody", "upperleftarm"},
                {"upperbody", "upperleftarm", "shape13"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape40"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape40", "shape41"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape32"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape32", "shape33"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape38"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape38", "shape39"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape34"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape34", "shape35"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape36"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape36", "shape37"},
                {"upperbody", "lowerbody"},
                {"upperbody", "lowerbody", "upperleftleg"},
                {"upperbody", "lowerbody", "upperleftleg", "lowerleftleg"},
                {"upperbody", "lowerbody", "upperleftleg", "lowerleftleg", "leftfoot"},
                {"upperbody", "lowerbody", "shape3"},
                {"upperbody", "lowerbody", "shape3", "shape4"},
                {"upperbody", "lowerbody", "shape3", "shape5"},
                {"upperbody", "lowerbody", "upperrightleg"},
                {"upperbody", "lowerbody", "upperrightleg", "lowerrightleg"},
                {"upperbody", "lowerbody", "upperrightleg", "lowerrightleg", "rightfoot"},
                {"upperbody", "neck"},
                {"upperbody", "neck", "head"},
                {"upperbody", "upperrightarm"},
                {"upperbody", "upperrightarm", "shape17"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape26"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape26", "shape27"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape22"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape22", "shape24"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape23"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape23", "shape25"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape28"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape28", "shape29"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape30"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape30", "shape31"} };
            case CRYING: return new String[][] {
                {"upperbody"},
                {"upperbody", "upperleftarm"},
                {"upperbody", "upperleftarm", "shape13"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape34"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape34", "shape35"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape32"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape32", "shape33"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape40"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape40", "shape41"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape38"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape38", "shape39"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape36"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape36", "shape37"},
                {"upperbody", "lowerbody"},
                {"upperbody", "lowerbody", "upperrightleg"},
                {"upperbody", "lowerbody", "upperrightleg", "lowerrightleg"},
                {"upperbody", "lowerbody", "upperrightleg", "lowerrightleg", "rightfoot"},
                {"upperbody", "lowerbody", "upperleftleg"},
                {"upperbody", "lowerbody", "upperleftleg", "lowerleftleg"},
                {"upperbody", "lowerbody", "upperleftleg", "lowerleftleg", "leftfoot"},
                {"upperbody", "lowerbody", "shape3"},
                {"upperbody", "lowerbody", "shape3", "shape4"},
                {"upperbody", "lowerbody", "shape3", "shape5"},
                {"upperbody", "upperrightarm"},
                {"upperbody", "upperrightarm", "shape17"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape23"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape23", "shape25"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape28"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape28", "shape29"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape26"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape26", "shape27"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape22"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape22", "shape24"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape30"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape30", "shape31"},
                {"upperbody", "neck"},
                {"upperbody", "neck", "head"} };
            case RUNNING: return new String[][] {
                {"upperbody"},
                {"upperbody", "upperrightarm"},
                {"upperbody", "upperrightarm", "shape17"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape23"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape23", "shape25"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape28"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape28", "shape29"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape26"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape26", "shape27"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape22"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape22", "shape24"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape30"},
                {"upperbody", "upperrightarm", "shape17", "lowerrightarm", "righthand", "shape30", "shape31"},
                {"upperbody", "neck"},
                {"upperbody", "neck", "head"},
                {"upperbody", "neck", "head", "shape1"},
                {"upperbody", "upperleftarm"},
                {"upperbody", "upperleftarm", "shape13"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape38"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape38", "shape39"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape40"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape40", "shape41"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape32"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape32", "shape33"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape34"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape34", "shape35"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape36"},
                {"upperbody", "upperleftarm", "shape13", "lowerleftarm", "lefthand", "shape36", "shape37"},
                {"upperbody", "lowerbody"},
                {"upperbody", "lowerbody", "upperrightleg"},
                {"upperbody", "lowerbody", "upperrightleg", "lowerrightleg"},
                {"upperbody", "lowerbody", "upperrightleg", "lowerrightleg", "rightfoot"},
                {"upperbody", "lowerbody", "upperleftleg"},
                {"upperbody", "lowerbody", "upperleftleg", "lowerleftleg"},
                {"upperbody", "lowerbody", "upperleftleg", "lowerleftleg", "leftfoot"},
                {"upperbody", "lowerbody", "shape3"},
                {"upperbody", "lowerbody", "shape3", "shape5"},
                {"upperbody", "lowerbody", "shape3", "shape4"} };
            default: return new String[0][];
        }
    }
}
