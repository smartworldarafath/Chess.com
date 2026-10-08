package com.google.inputmethod;

import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0012\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0014\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011\" \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/google/android/rn8;", "position", "a", "(J)J", "", "isStartHandle", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "handlesCrossed", "f", "(ZLandroidx/compose/ui/text/style/ResolvedTextDirection;Z)Z", "areHandlesCrossed", "e", "(Landroidx/compose/ui/text/style/ResolvedTextDirection;Z)Z", "Lcom/google/android/ff3;", "F", "c", "()F", "HandleWidth", "b", "HandleHeight", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lcom/google/android/eeb;", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "d", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "SelectionHandleInfoKey", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class feb {
    private static final float a;
    private static final float b;
    private static final SemanticsPropertyKey<SelectionHandleInfo> c = new SemanticsPropertyKey<>("SelectionHandleInfo", (Function2) null, 2, (DefaultConstructorMarker) null);

    static {
        float f = 25;
        a = ff3.i(f);
        b = ff3.i(f);
    }

    public static final long a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        return rn8.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public static final float b() {
        return b;
    }

    public static final float c() {
        return a;
    }

    public static final SemanticsPropertyKey<SelectionHandleInfo> d() {
        return c;
    }

    public static final boolean e(ResolvedTextDirection resolvedTextDirection, boolean z) {
        if (resolvedTextDirection != ResolvedTextDirection.Ltr || z) {
            return resolvedTextDirection == ResolvedTextDirection.Rtl && z;
        }
        return true;
    }

    public static final boolean f(boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        if (z) {
            return e(resolvedTextDirection, z2);
        }
        return !e(resolvedTextDirection, z2);
    }
}
