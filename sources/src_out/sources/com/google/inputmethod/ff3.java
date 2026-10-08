package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0097\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0018"}, d2 = {"Lcom/google/android/ff3;", "", "", "value", "i", "(F)F", "other", "", "h", "(FF)I", "", "m", "(F)Ljava/lang/String;", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getValue", "()F", "b", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ff3 implements Comparable<ff3> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float c = i(0.0f);
    private static final float d = i(Float.POSITIVE_INFINITY);
    private static final float e = i(Float.NaN);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float value;

    /* JADX INFO: renamed from: com.google.android.ff3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/google/android/ff3$a;", "", "<init>", "()V", "Lcom/google/android/ff3;", "Hairline", "F", "a", "()F", "getHairline-D9Ej5fM$annotations", "Infinity", "b", "getInfinity-D9Ej5fM$annotations", "Unspecified", "c", "getUnspecified-D9Ej5fM$annotations", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return ff3.c;
        }

        public final float b() {
            return ff3.d;
        }

        public final float c() {
            return ff3.e;
        }

        private Companion() {
        }
    }

    private /* synthetic */ ff3(float f) {
        this.value = f;
    }

    public static final /* synthetic */ ff3 e(float f) {
        return new ff3(f);
    }

    public static int h(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static float i(float f) {
        return f;
    }

    public static boolean j(float f, Object obj) {
        return (obj instanceof ff3) && Float.compare(f, ((ff3) obj).getValue()) == 0;
    }

    public static final boolean k(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static int l(float f) {
        return Float.hashCode(f);
    }

    public static String m(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ff3 ff3Var) {
        return g(ff3Var.getValue());
    }

    public boolean equals(Object other) {
        return j(this.value, other);
    }

    public int g(float f) {
        return h(this.value, f);
    }

    public int hashCode() {
        return l(this.value);
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final /* synthetic */ float getValue() {
        return this.value;
    }

    public String toString() {
        return m(this.value);
    }
}
