package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u00020\t*\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a1\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0007\u001a'\u0010\u0011\u001a\u00020\u0005*\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0013\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0007\u001a?\u0010\u001a\u001a\u00020\u0019*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/google/android/hv5;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lcom/google/android/fv5;", "primaryDirectionalMotionAxis", "Lcom/google/android/rn8;", "i", "(Lcom/google/android/hv5;Landroidx/compose/foundation/gestures/Orientation;Lcom/google/android/fv5;)J", "j", "", "h", "(Lcom/google/android/hv5;)Z", "g", "ignoreConsumed", "k", "(Lcom/google/android/hv5;Landroidx/compose/foundation/gestures/Orientation;Lcom/google/android/fv5;Z)J", "l", "m", "(JLandroidx/compose/foundation/gestures/Orientation;Lcom/google/android/fv5;)J", "n", "Lcom/google/android/w3e;", "event", "Lcom/google/android/lv5;", "smoother", "nodeOffset", "", "f", "(Lcom/google/android/w3e;Lcom/google/android/hv5;Landroidx/compose/foundation/gestures/Orientation;Lcom/google/android/fv5;Lcom/google/android/lv5;J)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class iv5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(w3e w3eVar, IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, fv5 fv5Var, lv5 lv5Var, long j) {
        w3eVar.a(indirectPointerInputChange.getUptimeMillis(), rn8.q(m(lv5Var.c(indirectPointerInputChange), orientation, fv5Var), j));
    }

    public static final boolean g(IndirectPointerInputChange indirectPointerInputChange) {
        return !indirectPointerInputChange.getPreviousPressed() && indirectPointerInputChange.getPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(IndirectPointerInputChange indirectPointerInputChange) {
        return indirectPointerInputChange.getPreviousPressed() && !indirectPointerInputChange.getPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, fv5 fv5Var) {
        return k(indirectPointerInputChange, orientation, fv5Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, fv5 fv5Var) {
        return k(indirectPointerInputChange, orientation, fv5Var, true);
    }

    private static final long k(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, fv5 fv5Var, boolean z) {
        return (z || !indirectPointerInputChange.getIsConsumed()) ? rn8.p(l(indirectPointerInputChange, orientation, fv5Var), n(indirectPointerInputChange, orientation, fv5Var)) : rn8.INSTANCE.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, fv5 fv5Var) {
        float fIntBitsToFloat;
        if (orientation == null) {
            return indirectPointerInputChange.getPosition();
        }
        fv5.Companion companion = fv5.INSTANCE;
        if (fv5Var == null ? false : fv5.g(fv5Var.getValue(), companion.b())) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.getPosition() >> 32));
        } else {
            if (!(fv5Var != null ? fv5.g(fv5Var.getValue(), companion.c()) : false)) {
                return indirectPointerInputChange.getPosition();
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.getPosition() & 4294967295L));
        }
        if (orientation == Orientation.Horizontal) {
            return rn8.e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
        }
        return rn8.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
    }

    private static final long m(long j, Orientation orientation, fv5 fv5Var) {
        float fIntBitsToFloat;
        if (orientation == null) {
            return j;
        }
        fv5.Companion companion = fv5.INSTANCE;
        if (fv5Var == null ? false : fv5.g(fv5Var.getValue(), companion.b())) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        } else {
            if (!(fv5Var != null ? fv5.g(fv5Var.getValue(), companion.c()) : false)) {
                return j;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        if (orientation == Orientation.Horizontal) {
            return rn8.e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
        }
        return rn8.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
    }

    private static final long n(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, fv5 fv5Var) {
        float fIntBitsToFloat;
        if (orientation == null) {
            return indirectPointerInputChange.getPreviousPosition();
        }
        fv5.Companion companion = fv5.INSTANCE;
        if (fv5Var == null ? false : fv5.g(fv5Var.getValue(), companion.b())) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.getPreviousPosition() >> 32));
        } else {
            if (!(fv5Var != null ? fv5.g(fv5Var.getValue(), companion.c()) : false)) {
                return indirectPointerInputChange.getPreviousPosition();
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.getPreviousPosition() & 4294967295L));
        }
        if (orientation == Orientation.Horizontal) {
            return rn8.e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
        }
        return rn8.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
    }
}
