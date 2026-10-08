package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0090\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R*\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\u001a\u0010*\u001a\u00020\r8\u0010X\u0090D¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b#\u0010\u001d¨\u0006+"}, d2 = {"Lcom/google/android/sr;", "Lcom/google/android/ur;", "", "v1", "v2", "v3", "<init>", "(FFF)V", "", "d", "()V", "f", "()Lcom/google/android/sr;", "", "index", "a", "(I)F", "value", "e", "(IF)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "F", "getV1", "()F", "setV1$animation_core", "(F)V", "b", "getV2", "setV2$animation_core", "c", "getV3", "setV3$animation_core", "I", "size", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class sr extends ur {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private float v1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float v2;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float v3;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int size;

    public sr(float f, float f2, float f3) {
        super(null);
        this.v1 = f;
        this.v2 = f2;
        this.v3 = f3;
        this.size = 3;
    }

    @Override // com.google.inputmethod.ur
    public float a(int index) {
        if (index == 0) {
            return this.v1;
        }
        if (index == 1) {
            return this.v2;
        }
        if (index != 2) {
            return 0.0f;
        }
        return this.v3;
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
    }

    @Override // com.google.inputmethod.ur
    public void e(int index, float value) {
        if (index == 0) {
            this.v1 = value;
        } else if (index == 1) {
            this.v2 = value;
        } else {
            if (index != 2) {
                return;
            }
            this.v3 = value;
        }
    }

    public boolean equals(Object other) {
        if (!(other instanceof sr)) {
            return false;
        }
        sr srVar = (sr) other;
        return srVar.v1 == this.v1 && srVar.v2 == this.v2 && srVar.v3 == this.v3;
    }

    @Override // com.google.inputmethod.ur
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public sr c() {
        return new sr(0.0f, 0.0f, 0.0f);
    }

    public int hashCode() {
        return (((Float.hashCode(this.v1) * 31) + Float.hashCode(this.v2)) * 31) + Float.hashCode(this.v3);
    }

    public String toString() {
        return "AnimationVector3D: v1 = " + this.v1 + ", v2 = " + this.v2 + ", v3 = " + this.v3;
    }
}
