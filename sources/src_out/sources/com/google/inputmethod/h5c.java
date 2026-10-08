package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001c\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001a\u0010\u0012\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0014\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0013\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u001a\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u001a\u0010\u001c\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001b\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u001f\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u0018\u0010\b¨\u0006 "}, d2 = {"Lcom/google/android/h5c;", "", "<init>", "()V", "", "b", "F", "c", "()F", "SpringDefaultSpatialDamping", "d", "SpringDefaultSpatialStiffness", "a", "SpringDefaultEffectsDamping", "e", "SpringDefaultEffectsStiffness", "f", "g", "SpringFastSpatialDamping", "h", "SpringFastSpatialStiffness", "SpringFastEffectsDamping", "i", "SpringFastEffectsStiffness", "j", "k", "SpringSlowSpatialDamping", "l", "SpringSlowSpatialStiffness", "SpringSlowEffectsDamping", "m", "SpringSlowEffectsStiffness", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h5c {
    public static final h5c a = new h5c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float SpringDefaultSpatialDamping = 0.9f;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final float SpringDefaultSpatialStiffness = 700.0f;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float SpringDefaultEffectsDamping = 1.0f;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final float SpringDefaultEffectsStiffness = 1600.0f;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final float SpringFastSpatialDamping = 0.9f;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final float SpringFastSpatialStiffness = 1400.0f;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final float SpringFastEffectsDamping = 1.0f;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final float SpringFastEffectsStiffness = 3800.0f;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final float SpringSlowSpatialDamping = 0.9f;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final float SpringSlowSpatialStiffness = 300.0f;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final float SpringSlowEffectsDamping = 1.0f;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final float SpringSlowEffectsStiffness = 800.0f;

    private h5c() {
    }

    public final float a() {
        return SpringDefaultEffectsDamping;
    }

    public final float b() {
        return SpringDefaultEffectsStiffness;
    }

    public final float c() {
        return SpringDefaultSpatialDamping;
    }

    public final float d() {
        return SpringDefaultSpatialStiffness;
    }

    public final float e() {
        return SpringFastEffectsDamping;
    }

    public final float f() {
        return SpringFastEffectsStiffness;
    }

    public final float g() {
        return SpringFastSpatialDamping;
    }

    public final float h() {
        return SpringFastSpatialStiffness;
    }

    public final float i() {
        return SpringSlowEffectsDamping;
    }

    public final float j() {
        return SpringSlowEffectsStiffness;
    }

    public final float k() {
        return SpringSlowSpatialDamping;
    }

    public final float l() {
        return SpringSlowSpatialStiffness;
    }
}
