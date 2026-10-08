package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Lcom/google/android/wg0;", "", "", "multiplier", "c", "(F)F", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getMultiplier", "()F", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class wg0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float c = c(0.5f);
    private static final float d = c(-0.5f);
    private static final float e = c(0.0f);
    private static final float f = c(Float.NaN);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float multiplier;

    /* JADX INFO: renamed from: com.google.android.wg0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/google/android/wg0$a;", "", "<init>", "()V", "Lcom/google/android/wg0;", "None", "F", "a", "()F", "getNone-y9eOQZs$annotations", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return wg0.e;
        }

        private Companion() {
        }
    }

    private /* synthetic */ wg0(float f2) {
        this.multiplier = f2;
    }

    public static final /* synthetic */ wg0 b(float f2) {
        return new wg0(f2);
    }

    public static float c(float f2) {
        return f2;
    }

    public static boolean d(float f2, Object obj) {
        return (obj instanceof wg0) && Float.compare(f2, ((wg0) obj).getMultiplier()) == 0;
    }

    public static final boolean e(float f2, float f3) {
        return Float.compare(f2, f3) == 0;
    }

    public static int f(float f2) {
        return Float.hashCode(f2);
    }

    public static String g(float f2) {
        return "BaselineShift(multiplier=" + f2 + ')';
    }

    public boolean equals(Object other) {
        return d(this.multiplier, other);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final /* synthetic */ float getMultiplier() {
        return this.multiplier;
    }

    public int hashCode() {
        return f(this.multiplier);
    }

    public String toString() {
        return g(this.multiplier);
    }
}
