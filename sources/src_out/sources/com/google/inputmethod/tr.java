package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0090\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R*\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R*\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R\u001a\u0010-\u001a\u00020\u000e8\u0010X\u0090D¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b$\u0010\u001e¨\u0006."}, d2 = {"Lcom/google/android/tr;", "Lcom/google/android/ur;", "", "v1", "v2", "v3", "v4", "<init>", "(FFFF)V", "", "d", "()V", "j", "()Lcom/google/android/tr;", "", "index", "a", "(I)F", "value", "e", "(IF)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "F", "f", "()F", "setV1$animation_core", "(F)V", "b", "g", "setV2$animation_core", "c", "h", "setV3$animation_core", "i", "setV4$animation_core", "I", "size", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class tr extends ur {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private float v1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float v2;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float v3;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float v4;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int size;

    public tr(float f, float f2, float f3, float f4) {
        super(null);
        this.v1 = f;
        this.v2 = f2;
        this.v3 = f3;
        this.v4 = f4;
        this.size = 4;
    }

    @Override // com.google.inputmethod.ur
    public float a(int index) {
        if (index == 0) {
            return this.v1;
        }
        if (index == 1) {
            return this.v2;
        }
        if (index == 2) {
            return this.v3;
        }
        if (index != 3) {
            return 0.0f;
        }
        return this.v4;
    }

    @Override // com.google.inputmethod.ur
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // com.google.inputmethod.ur
    public void d() {
        this.v1 = 0.0f;
        this.v2 = 0.0f;
        this.v3 = 0.0f;
        this.v4 = 0.0f;
    }

    @Override // com.google.inputmethod.ur
    public void e(int index, float value) {
        if (index == 0) {
            this.v1 = value;
            return;
        }
        if (index == 1) {
            this.v2 = value;
        } else if (index == 2) {
            this.v3 = value;
        } else {
            if (index != 3) {
                return;
            }
            this.v4 = value;
        }
    }

    public boolean equals(Object other) {
        if (!(other instanceof tr)) {
            return false;
        }
        tr trVar = (tr) other;
        return trVar.v1 == this.v1 && trVar.v2 == this.v2 && trVar.v3 == this.v3 && trVar.v4 == this.v4;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getV1() {
        return this.v1;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getV2() {
        return this.v2;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getV3() {
        return this.v3;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.v1) * 31) + Float.hashCode(this.v2)) * 31) + Float.hashCode(this.v3)) * 31) + Float.hashCode(this.v4);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getV4() {
        return this.v4;
    }

    @Override // com.google.inputmethod.ur
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public tr c() {
        return new tr(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.v1 + ", v2 = " + this.v2 + ", v3 = " + this.v3 + ", v4 = " + this.v4;
    }
}
