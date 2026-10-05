package com.scp096port.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.scp096port.entity.Scp096Entity;
import com.scp096port.entity.Scp096State;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/**
 * One instance per pose. Geometry is the exact 1.12.2 geometry (Scp096Layers).
 * The 1.12.2 keyframe animation system was NOT ported; the motion below is new, simple procedural animation.
 */
public class Scp096Model extends EntityModel<Scp096Entity> {
    private final ModelPart root;
    private final Scp096State pose;
    private final Map<String, ModelPart> parts = new HashMap<>();
    private final Map<ModelPart, float[]> base = new IdentityHashMap<>();

    public Scp096Model(ModelPart root, Scp096State pose) {
        this.root = root;
        this.pose = pose;
        for (String[] path : Scp096Layers.paths(pose)) {
            ModelPart p = root;
            for (String s : path) p = p.getChild(s);
            parts.put(path[path.length - 1], p);
            base.put(p, new float[] {p.x, p.y, p.z, p.xRot, p.yRot, p.zRot});
        }
    }

    private void reset() {
        base.forEach((p, b) -> { p.x = b[0]; p.y = b[1]; p.z = b[2]; p.xRot = b[3]; p.yRot = b[4]; p.zRot = b[5]; });
    }

    private void add(String name, float dx, float dy, float dz) {
        ModelPart p = parts.get(name);
        if (p == null) return;
        p.xRot += dx; p.yRot += dy; p.zRot += dz;
    }

    @Override
    public void setupAnim(Scp096Entity e, float limbSwing, float limbSwingAmount, float age, float headYaw, float headPitch) {
        reset();
        switch (pose) {
            case SITTING -> {                       // slow breathing
                add("upperbody", Mth.sin(age * 0.05F) * 0.015F, 0, 0);
                add("neck", Mth.sin(age * 0.04F + 1F) * 0.02F, 0, 0);
            }
            case CRYING -> {                        // sobbing / shaking
                add("upperbody", Mth.sin(age * 0.35F) * 0.03F, 0, Mth.sin(age * 1.7F) * 0.02F);
                add("neck", Mth.sin(age * 0.3F) * 0.05F, 0, 0);
                add("upperleftarm", Mth.sin(age * 0.5F) * 0.04F, 0, 0);
                add("upperrightarm", Mth.sin(age * 0.5F + 0.6F) * 0.04F, 0, 0);
            }
            case WALKING -> {
                float s = Mth.cos(limbSwing * 0.6662F) * 0.9F * limbSwingAmount;
                add("upperleftleg", s, 0, 0);
                add("upperrightleg", -s, 0, 0);
                add("lowerleftleg", Math.max(0F, -s) * 0.9F, 0, 0);
                add("lowerrightleg", Math.max(0F, s) * 0.9F, 0, 0);
                add("upperleftarm", -s * 0.5F, 0, 0);
                add("upperrightarm", s * 0.5F, 0, 0);
                add("upperbody", Mth.sin(age * 0.05F) * 0.015F, 0, 0);
            }
            case RUNNING -> {                       // hunting: fast stride, flailing arms, head shake
                float s = Mth.cos(limbSwing * 0.9F) * 1.2F * Math.max(limbSwingAmount, 0.5F);
                add("upperleftleg", s, 0, 0);
                add("upperrightleg", -s, 0, 0);
                add("lowerleftleg", Math.max(0F, -s) * 1.1F, 0, 0);
                add("lowerrightleg", Math.max(0F, s) * 1.1F, 0, 0);
                add("upperleftarm", -s * 0.8F, 0, 0);
                add("upperrightarm", s * 0.8F, 0, 0);
                add("upperbody", 0.12F, 0, 0);
                add("neck", 0, 0, Mth.sin(age * 0.9F) * 0.06F);
            }
        }
    }

    @Override
    public void renderToBuffer(PoseStack ps, VertexConsumer vc, int light, int overlay, float r, float g, float b, float a) {
        root.render(ps, vc, light, overlay, r, g, b, a);
    }
}
