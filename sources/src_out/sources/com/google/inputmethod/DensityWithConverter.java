package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.l43, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\t*\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/google/android/l43;", "Lcom/google/android/f43;", "", "density", "fontScale", "Lcom/google/android/em4;", "converter", "<init>", "(FFLcom/google/android/em4;)V", "Lcom/google/android/ff3;", "Lcom/google/android/b0d;", "s1", "(F)J", "U", "(J)F", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getDensity", "()F", "b", "w2", "c", "Lcom/google/android/em4;", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class DensityWithConverter implements f43 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final float density;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float fontScale;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final em4 converter;

    public DensityWithConverter(float f, float f2, em4 em4Var) {
        this.density = f;
        this.fontScale = f2;
        this.converter = em4Var;
    }

    @Override // com.google.inputmethod.hm4
    public float U(long j) {
        if (d0d.g(b0d.g(j), d0d.INSTANCE.b())) {
            return ff3.i(this.converter.b(b0d.h(j)));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DensityWithConverter)) {
            return false;
        }
        DensityWithConverter densityWithConverter = (DensityWithConverter) other;
        return Float.compare(this.density, densityWithConverter.density) == 0 && Float.compare(this.fontScale, densityWithConverter.fontScale) == 0 && Intrinsics.e(this.converter, densityWithConverter.converter);
    }

    @Override // com.google.inputmethod.f43
    public float getDensity() {
        return this.density;
    }

    public int hashCode() {
        return (((Float.hashCode(this.density) * 31) + Float.hashCode(this.fontScale)) * 31) + this.converter.hashCode();
    }

    @Override // com.google.inputmethod.hm4
    public long s1(float f) {
        return c0d.h(this.converter.a(f));
    }

    public String toString() {
        return "DensityWithConverter(density=" + this.density + ", fontScale=" + this.fontScale + ", converter=" + this.converter + ')';
    }

    @Override // com.google.inputmethod.hm4
    /* JADX INFO: renamed from: w2, reason: from getter */
    public float getFontScale() {
        return this.fontScale;
    }
}
