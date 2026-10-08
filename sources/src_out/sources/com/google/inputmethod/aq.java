package com.google.inputmethod;

import androidx.compose.p000animation.core.Animatable;
import com.google.android.yg4;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a-\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007\"\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000b\"\u0014\u0010\u001a\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f\"\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013¨\u0006\u001d"}, d2 = {"", "initialValue", "visibilityThreshold", "Landroidx/compose/animation/core/Animatable;", "Lcom/google/android/qr;", "a", "(FF)Landroidx/compose/animation/core/Animatable;", "Lcom/google/android/qr;", "positiveInfinityBounds1D", "Lcom/google/android/rr;", "b", "Lcom/google/android/rr;", "positiveInfinityBounds2D", "Lcom/google/android/sr;", "c", "Lcom/google/android/sr;", "positiveInfinityBounds3D", "Lcom/google/android/tr;", "d", "Lcom/google/android/tr;", "positiveInfinityBounds4D", "e", "negativeInfinityBounds1D", "f", "negativeInfinityBounds2D", "g", "negativeInfinityBounds3D", "h", "negativeInfinityBounds4D", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class aq {
    private static final qr a = vr.a(Float.POSITIVE_INFINITY);
    private static final rr b = vr.b(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final sr c = vr.c(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final tr d = vr.d(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final qr e = vr.a(Float.NEGATIVE_INFINITY);
    private static final rr f = vr.b(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    private static final sr g = vr.c(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    private static final tr h = vr.d(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final Animatable<Float, qr> a(float f2, float f3) {
        return new Animatable<>(Float.valueOf(f2), w2e.N(yg4.a), Float.valueOf(f3), null, 8, null);
    }

    public static /* synthetic */ Animatable b(float f2, float f3, int i, Object obj) {
        if ((i & 2) != 0) {
            f3 = 0.01f;
        }
        return a(f2, f3);
    }
}
